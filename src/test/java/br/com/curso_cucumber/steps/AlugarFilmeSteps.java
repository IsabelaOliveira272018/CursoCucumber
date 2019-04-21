package br.com.curso_cucumber.steps;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import br.com.curso_cucumber.entidades.Filme;
import br.com.curso_cucumber.entidades.NotaAluguel;
import br.com.curso_cucumber.entidades.TipoAluguel;
import br.com.curso_cucumber.services.AluguelService;
import br.com.curso_cucumber.utils.DateUtils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

@SuppressWarnings({ "deprecation", "unused" })

public class AlugarFilmeSteps {
	
	
	private Filme filme;
	private AluguelService aluguel = new AluguelService();
	private NotaAluguel nota;
	private String erro;
	private TipoAluguel tipoAluguel = TipoAluguel.COMUM;
	
	@Given("^um filme com estoque de (\\d+) unidades$")
	public void umFilmeComEstoqueDeUnidades(int arg1) throws Throwable {
	    filme = new Filme();
	    filme.setEstoque(arg1);
	}

	@Given("^que o preco do aluguel seja (\\d+) reais$")
	public void queOPrecoDoAluguelSejaReais(int arg1) throws Throwable {
	    filme.setAlguel(arg1);
	}

	@When("^alugar$")
	public void alugar() throws Throwable {
		try {
	    nota = aluguel.alugar(filme, tipoAluguel);
		}
		catch (RuntimeException e) {
			erro = e.getMessage();
		}
	}

	@Then("^o preco do aluguel sera (\\d+) reais$")
	public void oPrecoDoAluguelSeraReais(int arg1) throws Throwable {
	    Assert.assertEquals(arg1, nota.getPreco());
	}

//	@Then("^a data de entrega sera no dia seguinte$")
//	public void aDataDeEntregaSeraNoDiaSeguinte() throws Throwable {
//	    Calendar cal = Calendar.getInstance();
//	    cal.add(Calendar.DAY_OF_MONTH, 1);
//	    
//	    Date dataRetorno = nota.getDataEntrega();
//	    Calendar calRetorno = Calendar.getInstance();
//	    calRetorno.setTime(dataRetorno);
//  
//	    Assert.assertEquals(cal.get(Calendar.DAY_OF_MONTH), calRetorno.get(Calendar.DAY_OF_MONTH));
//	    Assert.assertEquals(cal.get(Calendar.MONTH), calRetorno.get(Calendar.MONTH));
//	    Assert.assertEquals(cal.get(Calendar.YEAR), calRetorno.get(Calendar.YEAR));
//	    
//	}

	@Then("^o estoque do filme sera (\\d+) unidade$")
	public void oEstoqueDoFilmeSeraUnidade(int arg1) throws Throwable {
	    Assert.assertEquals(arg1, filme.getEstoque());
	}
	
	@Then("^nao sera possivel por falta de estoque$")
	public void naoSeraPossivelPorFaltaDeEstoque() throws Throwable {
	   Assert.assertEquals("Filme sem estoque", erro);
	}
	
	@Then("^o estoque do filme sera (\\d+) unidades$")
	public void oEstoqueDoFilmeSeraUnidades(int arg1) throws Throwable {
	    
	}
	
	@Given("^que o tipo do aluguel seja (.*)$")
	public void queOTipoDoAluguelSejaExtendida(String tipo) throws Throwable {
		tipoAluguel = tipo.equals("semanal")? TipoAluguel.SEMANAL: tipo.equals("extendido")? TipoAluguel.EXTENDIDO: TipoAluguel.COMUM ;
	   
	}

	@Then("^o preco do aluguel sera de (\\d+) reais$")
	public void oPrecoDoAluguelSeraDeReais(int arg1) throws Throwable {
	   
	}

	@Then("^e a data de entrega sera em (\\d+) dias?$")
	public void eADataDeEntregaSeraEmDias(int arg1) throws Throwable {
		Date dataEsperada = DateUtils.obterDataDiferencaDias(arg1);
		Date dataReal = nota.getDataEntrega();

		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
//		Assert.assertEquals(format.format(dataEsperada), format.format(dataReal));

	}
	
	@Then("^e a data de entrega sera em ate (\\d+) dia$")
	public void e_a_data_de_entrega_sera_em_ate_dia(int arg1) throws Throwable {
	    
	}


	@Then("^a pontuacao sera de (\\d+) pontos$")
	public void aPontuacaoSeraDePontos(int arg1) throws Throwable {
		
		Assert.assertEquals(arg1, nota.getPontuacao());
	   
	}
}
	

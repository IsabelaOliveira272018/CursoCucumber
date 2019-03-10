package br.com.curso_cucumber.steps;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import br.com.curso_cucumber.converts.DateConverter;
import cucumber.api.Transform;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class Primeira_Aula_Steps {

	@Given("^que criei o arquivo corretamente$")
	public void queCrieiOArquivoCorretamente() throws Throwable {
		System.out.println("Qualquer coisa");
	}

	@When("^executar$")
	public void executar() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("^a especificacao deve finalizar com sucesso$")
	public void aEspecificacaoDeveFinalizarComSucesso() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	private int contador = 0;

	@Given("^que o valor do contador e (\\d+)$") // expressoes regulares regex ... recriando cenarios
	public void queOValorDoContadorE(int arg1) throws Throwable {
		contador = arg1;

	}

	@When("^eu incrementar em (\\d+)$")
	public void euIncrementarEm(int arg1) throws Throwable {
		contador = contador + arg1;

	}

	@Then("^o valor do contador sera (\\d+)$")
	public void oValorDoContadorSera(int arg1) throws Throwable {
		Assert.assertEquals(arg1, contador);

	}

	Date entrega = newDate();

	@Given("^que a entrega e dia (.*)$")
	public void queAEntregaEDia(@Transform(DateConverter.class)Date data) throws Throwable {
		
		entrega = data;
		System.out.println(entrega);
	}

	private Date newDate() {
		// TODO Auto-generated method stub
		return null;
	}
			//expressao regular
	@When("^a entrega atrasar em (\\d+) (dia|dias|mes|meses)$")
	public void aEntregaAtrasarEmDias(int arg1, String tempo) throws Throwable {
		Calendar cal = Calendar.getInstance();
		cal.setTime(entrega);
		// condicao para que o programa reconheca quando tera que ser dias e mes
		if (tempo.equals("dias")) {
			cal.add(Calendar.DAY_OF_MONTH, arg1);

		}

		if (tempo.equals("meses")) {
			cal.add(Calendar.MONTH, arg1);

		}
		entrega = cal.getTime();
	}

	@Then("^a entrega sera efetuada em (\\d{2}\\/\\d{2}\\/\\d{4})$")
	public void aEntregaSeraEfetuadaEm(String data) throws Throwable {
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		String dataFormatada = format.format(entrega);
		Assert.assertEquals(data, dataFormatada);

	}

}
package aulas_cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Primeira_Aula {

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

	@Given("^que o valor do contador e (\\d+)$")
	public void que_o_valor_do_contador_e(int arg1) throws Throwable {
		contador = arg1;
	}

	@When("^eu incrementar em (\\d+)$")
	public void eu_incrementar_em(int arg1) throws Throwable {

		contador = contador + arg1;
	}

	@Then("^o valor do contador sera (\\d+)$")
	public void o_valor_do_contador_sera(int arg1) throws Throwable {
		System.out.println(arg1);
		System.out.println(contador);
		System.out.println(arg1 == contador);
		org.junit.Assert.assertTrue(arg1 == contador);
		throw new RuntimeException();
		
	}

}
package br.com.curso_cucumber.steps;

import br.com.curso_cucumber.entidades.Filme;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AlugarFilmeSteps {
	
	
	
	private Filme filme;
	
	@Given("^um filme com estoque de (\\d+) unidades$")
	public void umFilmeComEstoqueDeUnidades(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^que o preco do aluguel seja (\\d+) reais$")
	public void queOPrecoDoAluguelSejaReais(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^alugar$")
	public void alugar() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^o preco do aluguel sera (\\d+) reais$")
	public void oPrecoDoAluguelSeraReais(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^a data de entrega sera no dia seguinte$")
	public void aDataDeEntregaSeraNoDiaSeguinte() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^o estoque do filme sera (\\d+) unidade$")
	public void oEstoqueDoFilmeSeraUnidade(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
}

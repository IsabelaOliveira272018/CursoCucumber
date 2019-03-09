package desafio_cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GerandoCenarios_Desafio {
	
	@Given("^que o ticket ? AF(\\d+)$")
	public void queOTicketAF(int arg1) throws Throwable {
	    
	}

	@Given("^que o valor da passagem ? R\\$ (\\d+),(\\d+)$")
	public void queOValorDaPassagemR$(int arg1, int arg2) throws Throwable {
	   
	}

	@Given("^que o nome do passageiro ? \"([^\"]*)\"$")
	public void queONomeDoPassageiro(String arg1) throws Throwable {
	    
	}

	@Given("^que o telefone do passageiro ? (\\d+)-(\\d+)$")
	public void queOTelefoneDoPassageiro(int arg1, int arg2) throws Throwable {
	   
	}

	@When("^criar os steps$")
	public void criarOsSteps() throws Throwable {
	    
	}

	@Then("^o teste vai funcionar$")
	public void oTesteVaiFuncionar() throws Throwable {
	    
	}

}

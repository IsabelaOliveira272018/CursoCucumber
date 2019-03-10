package desafio_cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GerandoCenarios_Desafio {

	@Given("^que o ticket e AF(\\d+)$")
	public void queOTicketAF(int arg1) throws Throwable {

	}

	@Given("^que o valor da passagem é R\\$ (\\d+),(\\d+)$")
	public void queOValorDaPassagemR$(int arg1, int arg2) throws Throwable {

	}

	@Given("^que o nome do passageiro é \"([^\"]*)\"$")
	public void queONomeDoPassageiro(String arg1) throws Throwable {

	}

	@Given("^que o telefone do passageiro é (\\d+)-(\\d+)$")
	public void queOTelefoneDoPassageiro(int arg1, int arg2) throws Throwable {

	}

	@When("^criar os steps$")
	public void criarOsSteps() throws Throwable {

	}

	@Then("^o teste vai funcionar$")
	public void oTesteVaiFuncionar() throws Throwable {

	}

	// ---------------------- segundo cenário ---------------------------

	@Given("^que o ticket (especial)? e  A.(\\d+)$")
	public void queOTicketEAB(String tipo, int arg1) throws Throwable {

	}

	@Given("^que o ticket e AB(\\d+)$")
	public void queOTicketEAB(int arg1) throws Throwable {

	}

	@Given("^que o valor da passagem e R\\$ (\\d+),(\\d+)$")
	public void queOValorDaPassagemER$(int arg1, int arg2) throws Throwable {

	}

	@Given("^que o nome do passageiro e \"([^\"]*)\"$")
	public void queONomeDoPassageiroE(String arg1) throws Throwable {

	}

	@Given("^que o telefone do passageiro e (\\d+)-(\\d+)$")
	public void queOTelefoneDoPassageiroE(int arg1, int arg2) throws Throwable {

	}

		
}

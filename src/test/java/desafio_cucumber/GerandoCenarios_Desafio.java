package desafio_cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GerandoCenarios_Desafio {

	@Given("^que o ticket (especial) e  (A.\\d{3})")
	public void queOTicketEAF(String tipo, int arg1) throws Throwable {

	}

	@Given("^que o ticket e AF(\\d+)$")
	public void queOTicketEAF(int arg1) throws Throwable {

	}

	@Given("^que o valor da passagem é R\\$ (.*)$")
	public void queOValorDaPassagemR$(Double numero) throws Throwable {
		System.out.println(numero);
	}

	@Given("^que o nome do passageiro ? \"([^\"]*)\"$")
	public void queONomeDoPassageiro(String arg1) throws Throwable {

	}

	@Given("^que o telefone do passageiro é (\\d+)-(\\d+)$")
	public void queOTelefoneDoPassageiroE1(int arg1, int arg2) throws Throwable {

	}

	@When("^criar os steps$")
	public void criarOsSteps() throws Throwable {

	}

	@Then("^o teste vai funcionar$")
	public void oTesteVaiFuncionar() throws Throwable {

	}

	// ---------------------- segundo cenário ---------------------------

	@Given("^que o ticket especial e AB(\\d+)$")
	public void queOTicketEspecialEAB(int arg1) throws Throwable {

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
	public void queOTelefoneDoPassageiroE2(int arg1, int arg2) throws Throwable {

	}

	// --------------------------------- terceiro cenário---------------

	@Given("^que o ticket e CD(\\d+)$")
	public void queOTicketECD(int arg1) throws Throwable {

	}

	@Given("^que o ticket e AG(\\d+)$")
	public void queOTicketEAG(int arg1) throws Throwable {

	}

	@Given("^que o valor da passagem e R\\$ (\\d+)\\.(\\d+),(\\d+)$")
	public void queOValorDaPassagemER$(int arg1, int arg2, int arg3) throws Throwable {

	}

	@Given("^que o nome do passageiro  \"([^\"]*)\"$")
	public void queONomeDoPassageiro1(String arg1) throws Throwable {

	}

	@Given("^que o telefone do passageiro ? (\\d+)-(\\d+)$")
	public void queOTelefoneDoPassageiro(int arg1, int arg2) throws Throwable {
	   
	}

}

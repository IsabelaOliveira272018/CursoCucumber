package aulas_cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
		(
		plugin = "pretty", //para ativar a saida no console
		monochrome = true, //para formatar o texto da saida do console
		snippets = SnippetType.CAMELCASE, // usado para formatar o texto dos metodos
		dryRun = false, //usado para validar os testes
		strict = false // para identificar passos no cenario
		)
public class Runner {

}

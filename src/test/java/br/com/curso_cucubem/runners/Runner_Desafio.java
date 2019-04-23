package br.com.curso_cucubem.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
		(
		features = "src/test/resources/features/desafio_cucumber.feature", //mapeando as features
		glue = "br.com.curso_cucumber.steps", //mapear os passos para que o cucumber os encontre
		// tag usada para ignorar esse cenário e nao executar
		tags = "~@ignore",
		//o target serve pra gerar um relatorio html e json na pasta, ou seja, evidencias ao teste
		plugin = {"pretty", "html:target/report-html", "json:target/report.json"}, //para ativar a saida no console
		monochrome = true, //para formatar o texto da saida do console
		snippets = SnippetType.CAMELCASE, // usado para formatar o texto dos metodos
		dryRun = false, //usado para validar os testes
		strict = false // para identificar passos no cenario
		)
public class Runner_Desafio {

}


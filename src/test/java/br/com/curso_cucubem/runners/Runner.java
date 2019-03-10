package br.com.curso_cucubem.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
		(
		features = "src/test/resources/features/aprender_cucumber.feature", //mapeando as features
		glue = "br.com.curso_cucumber.steps", //mapear os passos para que o cucumber os encontre
		//criando parametro para executar a tag mapeada na feature
		//tags, auxilia a parametrizar os cenários, desta forma dando agilidade a execucao
		tags = {"@tipo1, @tipo2"},
		plugin = "pretty", //para ativar a saida no console
		monochrome = true, //para formatar o texto da saida do console
		snippets = SnippetType.CAMELCASE, // usado para formatar o texto dos metodos
		dryRun = false, //usado para validar os testes
		strict = false // para identificar passos no cenario
		)
public class Runner {

}

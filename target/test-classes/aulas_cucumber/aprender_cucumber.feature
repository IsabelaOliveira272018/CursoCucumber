Feature: Aprender Cucumber

	Como aluno
	Eu quero aprender a utilizar Cucumber
	Para que eu possa automatizar criterios de aceitacao

Scenario:

	Given que criei o arquivo corretamente
	When executar
	Then a especificacao deve finalizar com sucesso
	
	
Scenario: Deve incrementar contador
	
		Given que o valor do contador e 15
		When eu incrementar em 5
		Then o valor do contador sera 18




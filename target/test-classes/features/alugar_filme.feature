Feature: Alugar Filme

	Como um usuario
	Eu quero cadastrar alugueis de filmes
	Para controlar preços e datas de entregas
	#	Estória
	
	Scenario: Deve alugar um filme com sucesso cenário
	Given um filme com estoque de 2 unidades
	And que o preco do aluguel seja 3 reais
	When alugar
	Then o preco do aluguel sera 3 reais
	And a data de entrega sera no dia seguinte
	And o estoque do filme sera 1 unidade
	
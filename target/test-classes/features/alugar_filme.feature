Feature: Alugar Filme

	Como um usuario
	Eu quero cadastrar alugueis de filmes
	Para controlar preços e datas de entregas
		
	Scenario: Deve alugar um filme com sucesso 
	Given um filme com estoque de 2 unidades
	And que o preco do aluguel seja 3 reais
	When alugar
	Then o preco do aluguel sera 3 reais
	And a data de entrega sera em 1 dia
	And o estoque do filme sera 1 unidade
	
	
	Scenario: Nao deve alugar filme sem estoque
	Given um filme com estoque de 0 unidades
	When alugar
	Then nao sera possivel por falta de estoque
	And o estoque do filme sera 0 unidades
	
	Scenario: Deve dar condicoes especiais para categoria comum
	Given um filme com estoque de 2 unidades 
	And que o preco do aluguel seja 4 reais
	And que o tipo do aluguel seja comum
	When alugar
	Then o preco do aluguel sera de 8 reais 
	And e a data de entrega sera em ate 1 dia
	And a pontuacao sera de 1 pontos
	
	Scenario Outline: Deve dar condicoes conforme tipo de aluguel
	Given um filme com estoque de 2 unidades 
	And que o preco do aluguel seja <preco>
	And que o tipo do aluguel seja <tipo>
	When alugar
	Then o preco do aluguel sera de <valor> 
	And e a data de entrega sera em ate <qtdDias> dias
	And a pontuacao sera de <pontuacao> pontos	
	
Examples:

	| preco | tipo 			| valor | qtdDias | pontuacao |
	| 4     | extendido | 8     |   3     |   2       |
	| 4			| comum 		| 4			|   1			|   1				|
	
	
	#Scenario: Deve dar condicoes especiais para categoria comum
	#Given um filme com estoque de 2 unidades 
	#And que o preco do aluguel seja 4 reais
	#And que o tipo do aluguel seja comum
	#When alugar
	#Then o preco do aluguel sera de 8 reais 
	#And e a data de entrega sera em ate 1 dia
	#And a pontuacao sera de 1 pontos
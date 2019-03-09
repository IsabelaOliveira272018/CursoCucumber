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
    Then o valor do contador sera 20

  Scenario: Deve incrementar contador
    Given que o valor do contador e 123
    When eu incrementar em 35
    Then o valor do contador sera 158

    Scenario: Deve calcular atraso no prazo de entrega
    Given que a entrega e dia 05/04/2018
    When a entrega atrasar em 2 dias
    Then a entrega sera efetuada em 07/04/2018
    
    Scenario: Deve calcular atraso no prazo de entrega da China
    Given que a entrega e dia 05/04/2018
    When a entrega atrasar em 2 meses 
    Then a entrega sera efetuada em 05/06/2018
    
    
    
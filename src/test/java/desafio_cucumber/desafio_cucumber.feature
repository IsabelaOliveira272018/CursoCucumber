Feature: Desafio Cucumber

  Scenario: Deve criar steps gen�ricos para estes passos
    Given que o ticket � AF345
    Given que o valor da passagem � R$ 230,45
    Given que o nome do passageiro � "Fulano da Silva"
    Given que o telefone do passageiro � 9999-9999
    When criar os steps
    Then o teste vai funcionar

  #Scenario: Deve reaproveitar os steps "Dado" do cen�rio anterior
    #Given que o ticket � AB167
    #Given que o ticket especial � AB167
    #Given que o valor da passagem � R$ 1120,23
    #Given que o nome do passageiro � "Cicrano de Oliveira"
    #Given que o telefone do passageiro � 9888-8888
#
  #Scenario: Deve negar todos os steps "Dado" dos cen�rios anteriores
    #Given que o ticket � CD123
    #Given que o ticket � AG1234
    #Given que o valor da passagem � R$ 1.1345,56
    #Given que o nome do passageiro � "Beltrano Souza Matos de Alc�ntara Azevedo"
    #Given que o telefone do passageiro � 1234-5678
    #Given que o telefone do passageiro � 999-2223

Feature: Desafio Cucumber

  Scenario: Deve criar steps genéricos para estes passos
    Given que o ticket e AF345
    Given que o valor da passagem e R$ 230,45
    Given que o nome do passageiro e "Fulano da Silva"
    Given que o telefone do passageiro e 9999-9999
    When criar os steps
    Then o teste vai funcionar

  Scenario: Deve reaproveitar os steps "Dado" do cenário anterior
    Given que o ticket e AB167
    Given que o ticket especial e AB167
    Given que o valor da passagem e R$ 1120,23
    Given que o nome do passageiro e "Cicrano de Oliveira"
    Given que o telefone do passageiro e 9888-8888

  Scenario: Deve negar todos os steps "Dado" dos cenários anteriores
    Given que o ticket e CD123
    Given que o ticket e AG1234
    Given que o valor da passagem e R$ 1.1345,56
    Given que o nome do passageiro e "Beltrano Souza Matos de Alcântara Azevedo"
    Given que o telefone do passageiro é 1234-5678
    Given que o telefone do passageiro é 999-2223

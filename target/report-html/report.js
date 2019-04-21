$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/desafio_cucumber.feature");
formatter.feature({
  "line": 1,
  "name": "Desafio Cucumber",
  "description": "",
  "id": "desafio-cucumber",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Deve criar steps gen�ricos para estes passos",
  "description": "",
  "id": "desafio-cucumber;deve-criar-steps-gen�ricos-para-estes-passos",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "que o ticket e AF345",
  "keyword": "Given "
});
formatter.step({
  "comments": [
    {
      "line": 5,
      "value": "#conectivos and or but para dar mais fluidez na leitura"
    }
  ],
  "line": 6,
  "name": "que o valor da passagem e R$ 230,45",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "que o nome do passageiro e \"Fulano da Silva\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "que o telefone do passageiro e 9999-9999",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "criar os steps",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "o teste vai funcionar",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "345",
      "offset": 17
    }
  ],
  "location": "GerandoCenarios_Desafio_Steps.queOTicketEAF(int)"
});
formatter.result({
  "duration": 204222640,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "230",
      "offset": 29
    },
    {
      "val": "45",
      "offset": 33
    }
  ],
  "location": "GerandoCenarios_Desafio_Steps.queOValorDaPassagemER$(int,int)"
});
formatter.result({
  "duration": 183505,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Fulano da Silva",
      "offset": 28
    }
  ],
  "location": "GerandoCenarios_Desafio_Steps.queONomeDoPassageiroE(String)"
});
formatter.result({
  "duration": 3981215,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "9999",
      "offset": 31
    },
    {
      "val": "9999",
      "offset": 36
    }
  ],
  "location": "GerandoCenarios_Desafio_Steps.queOTelefoneDoPassageiroE2(int,int)"
});
formatter.result({
  "duration": 151787,
  "status": "passed"
});
formatter.match({
  "location": "GerandoCenarios_Desafio_Steps.criarOsSteps()"
});
formatter.result({
  "duration": 23410,
  "status": "passed"
});
formatter.match({
  "location": "GerandoCenarios_Desafio_Steps.oTesteVaiFuncionar()"
});
formatter.result({
  "duration": 32472,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Deve reaproveitar os steps \"Dado\" do cen�rio anterior",
  "description": "",
  "id": "desafio-cucumber;deve-reaproveitar-os-steps-\"dado\"-do-cen�rio-anterior",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "que o ticket e AB167",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "que o ticket especial e AB167",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "que o valor da passagem e R$ 1120,23",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "que o nome do passageiro e \"Cicrano de Oliveira\"",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "que o telefone do passageiro e 9888-8888",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "167",
      "offset": 17
    }
  ],
  "location": "GerandoCenarios_Desafio_Steps.queOTicketEAB(int)"
});
formatter.result({
  "duration": 139705,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "167",
      "offset": 26
    }
  ],
  "location": "GerandoCenarios_Desafio_Steps.queOTicketEspecialEAB(int)"
});
formatter.result({
  "duration": 95151,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1120",
      "offset": 29
    },
    {
      "val": "23",
      "offset": 34
    }
  ],
  "location": "GerandoCenarios_Desafio_Steps.queOValorDaPassagemER$(int,int)"
});
formatter.result({
  "duration": 179728,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Cicrano de Oliveira",
      "offset": 28
    }
  ],
  "location": "GerandoCenarios_Desafio_Steps.queONomeDoPassageiroE(String)"
});
formatter.result({
  "duration": 57770,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "9888",
      "offset": 31
    },
    {
      "val": "8888",
      "offset": 36
    }
  ],
  "location": "GerandoCenarios_Desafio_Steps.queOTelefoneDoPassageiroE2(int,int)"
});
formatter.result({
  "duration": 117805,
  "status": "passed"
});
});
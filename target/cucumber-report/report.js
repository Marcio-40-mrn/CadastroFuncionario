$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("cadastro.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    }
  ],
  "line": 3,
  "name": "Cadastrar Funcionario com Sucesso",
  "description": "",
  "id": "cadastrar-funcionario-com-sucesso",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 2,
      "name": "@cadastro"
    }
  ]
});
formatter.scenarioOutline({
  "line": 10,
  "name": "Cadastro",
  "description": "",
  "id": "cadastrar-funcionario-com-sucesso;cadastro",
  "type": "scenario_outline",
  "keyword": "Esquema do Cenario"
});
formatter.step({
  "line": 11,
  "name": "que acesso o cadastro de usuarios",
  "keyword": "Dado "
});
formatter.step({
  "line": 12,
  "name": "preencho os campos \u003cRole\u003e, \u003cEmployee\u003e, \u003cUser_Name\u003e, \u003cStatus\u003e e \u003cPassword\u003e",
  "keyword": "E "
});
formatter.step({
  "line": 13,
  "name": "Confirmo a inclusão do Funcionario \u003cUser_Name\u003e",
  "keyword": "Então "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "cadastrar-funcionario-com-sucesso;cadastro;",
  "rows": [
    {
      "cells": [
        "Role",
        "Employee",
        "User_Name",
        "Status",
        "Password"
      ],
      "line": 16,
      "id": "cadastrar-funcionario-com-sucesso;cadastro;;1"
    },
    {
      "cells": [
        "\"2\"",
        "\"Aaliyah Haq\"",
        "\"Teste6\"",
        "\"1\"",
        "\"12345678\""
      ],
      "line": 17,
      "id": "cadastrar-funcionario-com-sucesso;cadastro;;2"
    }
  ],
  "keyword": "Exemplos"
});
formatter.before({
  "duration": 8318744475,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "Acesso o sistema",
  "description": "",
  "type": "background",
  "keyword": "Contexto"
});
formatter.step({
  "line": 6,
  "name": "que acesso o sistema",
  "keyword": "Dado "
});
formatter.step({
  "line": 7,
  "name": "preencho usuario \"Admin\" e senha \"admin123\"",
  "keyword": "Quando "
});
formatter.step({
  "line": 8,
  "name": "Valido o acesso",
  "keyword": "Entao "
});
formatter.match({
  "location": "ContextoSteps.que_acesso_o_sistema()"
});
formatter.result({
  "duration": 9942701420,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 18
    },
    {
      "val": "admin123",
      "offset": 34
    }
  ],
  "location": "ContextoSteps.preencho_usuario_e_senha(String,String)"
});
formatter.result({
  "duration": 7131733504,
  "status": "passed"
});
formatter.match({
  "location": "ContextoSteps.valido_o_acesso()"
});
formatter.result({
  "duration": 274968322,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Cadastro",
  "description": "",
  "id": "cadastrar-funcionario-com-sucesso;cadastro;;2",
  "type": "scenario",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "line": 2,
      "name": "@cadastro"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "que acesso o cadastro de usuarios",
  "keyword": "Dado "
});
formatter.step({
  "line": 12,
  "name": "preencho os campos \"2\", \"Aaliyah Haq\", \"Teste6\", \"1\" e \"12345678\"",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4
  ],
  "keyword": "E "
});
formatter.step({
  "line": 13,
  "name": "Confirmo a inclusão do Funcionario \"Teste6\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Então "
});
formatter.match({
  "location": "CadastroSteps.que_acesso_o_cadastro_de_usuarios()"
});
formatter.result({
  "duration": 3199846466,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 20
    },
    {
      "val": "Aaliyah Haq",
      "offset": 25
    },
    {
      "val": "Teste6",
      "offset": 40
    },
    {
      "val": "1",
      "offset": 50
    },
    {
      "val": "12345678",
      "offset": 56
    }
  ],
  "location": "CadastroSteps.preencho_os_campos_e(String,String,String,String,String)"
});
formatter.result({
  "duration": 2596012375,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Teste6",
      "offset": 36
    }
  ],
  "location": "CadastroSteps.confirmo_a_inclusão_do_Funcionario(String)"
});
formatter.result({
  "duration": 22821151473,
  "status": "passed"
});
formatter.after({
  "duration": 836866743,
  "status": "passed"
});
});
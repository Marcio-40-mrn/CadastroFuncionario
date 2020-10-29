#language: pt
@cadastro
Funcionalidade: Cadastrar Funcionario com Sucesso

  Contexto: Acesso o sistema
    Dado que acesso o sistema
    Quando preencho usuario "Admin" e senha "admin123"
    Entao Valido o acesso

  Esquema do Cenario: Cadastro
    Dado que acesso o cadastro de usuarios
    E preencho os campos <Role>, <Employee>, <User_Name>, <Status> e <Password>
    Então Confirmo a inclusão do Funcionario <User_Name>

    Exemplos: 
      | Role | Employee      | User_Name | Status | Password   |
      | "2"  | "Aaliyah Haq" | "Teste6"  | "1"    | "12345678" |

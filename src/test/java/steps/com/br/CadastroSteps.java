package steps.com.br;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import pages.com.br.CadastroPage;

public class CadastroSteps extends CadastroPage{

	@Dado("^que acesso o cadastro de usuarios$")
	public void que_acesso_o_cadastro_de_usuarios() throws Throwable {
	   AcessoFormulario();
	}

	@Dado("^preencho os campos \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" e \"([^\"]*)\"$")
	public void preencho_os_campos_e(String arg1, String arg2, String arg3, String arg4, String arg5) throws Throwable {
	    CadastrarFuncionario(arg1, arg2, arg3, arg4, arg5);
	}

	@Então("^Confirmo a inclusão do Funcionario \"([^\"]*)\"$")
	public void confirmo_a_inclusão_do_Funcionario(String arg1) throws Throwable {
	    LocalizaValorTabela(arg1);
	}

}

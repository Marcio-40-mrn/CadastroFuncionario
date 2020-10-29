package steps.com.br;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pages.com.br.ContextoPage;

public class ContextoSteps extends ContextoPage{
	
	@Dado("^que acesso o sistema$")
	public void que_acesso_o_sistema() throws Throwable {
	    AcessaSistema();
	}

	@Quando("^preencho usuario \"([^\"]*)\" e senha \"([^\"]*)\"$")
	public void preencho_usuario_e_senha(String Usuario, String Senha) throws Throwable {
		EfetuarLogin(Usuario, Senha);
	}

	@Entao("^Valido o acesso$")
	public void valido_o_acesso() throws Throwable {
	    ValidarAcesso();
	}
}

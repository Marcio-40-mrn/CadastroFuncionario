package pages.com.br;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hooks.com.br.Hooks;

public class ContextoPage {

protected WebDriver driver;
	
	public ContextoPage() {
		driver = Hooks.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	public void AcessaSistema() {
		driver.get("https://opensource-demo.orangehrmlive.com//");
		
	}
	
	@FindBy(id="txtUsername")
	public WebElement txtUsername;
	
	@FindBy(name="txtPassword")
	public WebElement txtPassword;
	
	@FindBy(id="btnLogin")
	public WebElement btnlogin;
	
	@FindBy(id="welcome")
	public WebElement validaacesso;
	
	public void EfetuarLogin(String Usuario, String Senha) {
		txtUsername.sendKeys(Usuario);
		txtPassword.sendKeys(Senha);
		btnlogin.click();
	}
	
	public void ValidarAcesso() {
		boolean wc = validaacesso.isDisplayed();
	    Assert.assertTrue(wc);
	}
}

package pages.com.br;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import hooks.com.br.Hooks;
import org.junit.Assert;

public class CadastroPage {

	protected WebDriver driver;
	
	public CadastroPage() {
		driver = Hooks.getDriver();
		PageFactory.initElements(driver, this);
	}
		
	@FindBy(id = "menu_admin_viewAdminModule")
	public WebElement menu_admin_viewAdminModule;

	@FindBy(id = "btnAdd")
	public WebElement btnAdd;

	@FindBy(id = "systemUser_userType")
	public WebElement systemUser_userType;

	@FindBy(id = "systemUser_employeeName_empName")
	public WebElement systemUser_employeeName_empName;

	@FindBy(id = "systemUser_userName")
	public WebElement systemUser_userName;

	@FindBy(id = "systemUser_status")
	public WebElement systemUser_status;

	@FindBy(id = "systemUser_password")
	public WebElement systemUser_password;

	@FindBy(id = "systemUser_confirmPassword")
	public WebElement systemUser_confirmPassword;

	@FindBy(id = "btnSave")
	public WebElement btnSave;
	
	@FindBy(id="resultTable")
	public WebElement resultTable;

	public void AcessoFormulario() {
		menu_admin_viewAdminModule.click();
		btnAdd.click();
	}
	
	public void CadastrarFuncionario(String arg1, String arg2, String arg3, String arg4, String arg5) {
		Select CB = new Select(systemUser_userType); 
		CB.selectByValue(arg1);
		systemUser_employeeName_empName.sendKeys(arg2);
		systemUser_userName.sendKeys(arg3);
		Select CBX = new Select(systemUser_status);
		CBX.selectByValue(arg4);
		systemUser_password.sendKeys(arg5);
		systemUser_confirmPassword.sendKeys(arg5);
		btnSave.click();
	}
	
		
	public void LocalizaValorTabela(String Funcionario) {
		
		boolean flag = false;
		int linhas = resultTable.findElements(By.tagName("tr")).size();
		
		//linhas da tabela
		for (int i = 2; i < linhas; i++) {
			WebElement objLinha = resultTable.findElements(By.tagName("tr")).get(i);
			int colunas = objLinha.findElements(By.tagName("td")).size();
				for (int j = 1; j < colunas; j++) {
					WebElement objColuna = objLinha.findElements(By.tagName("td")).get(j);
					if (objColuna.getText().equals(Funcionario)) {
						flag = true;
						break;
					}
				}
		}
		
		if (flag == false) {
			Assert.fail();
		}
	}
}

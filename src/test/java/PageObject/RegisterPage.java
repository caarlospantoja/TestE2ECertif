package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
private WebDriver driver;
	
	public RegisterPage(WebDriver driver) {
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "13_03_00_45")
	WebElement nome;
	
	@FindBy(id = "13_03_00_46")
	WebElement apelido;
	
	@FindBy(id = "13_03_00_31")
	WebElement prefixo;
	
	@FindBy(id = "13_03_00_32")
	WebElement telefone;
	
	@FindBy(id = "13_03_00_51")
	WebElement email;
	
	@FindBy(id = "13_03_11_85")
	WebElement pwd;
	
	@FindBy(id = "13_03_11_88")
	WebElement confirmpwd;
	
	@FindBy(name = "privacy")
	WebElement privacy;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement submit;
	
	@FindBy(xpath = "//mtc-register/div")
	WebElement registerMsg;
	
	@FindBy(xpath = "//button[text()=' Faça login! ']")
	WebElement fazerLoginBtn;
	
	public void enterName(String nameAdd) {
		nome.click();
		nome.sendKeys(nameAdd);
	}
	
	public void enterApelido(String apelidoAdd) {
		apelido.click();
		apelido.sendKeys(apelidoAdd);
	}
	
	public void enterPrefixo(String prefixoAdd) {
		prefixo.click();
		prefixo.clear();
		prefixo.sendKeys(prefixoAdd);
	}
	
	public void enterTelefone(String telefoneAdd) {
		telefone.click();
		telefone.sendKeys(telefoneAdd);
	}
	
	public void enterEmail(String emailAdd) {
		email.click();
		email.sendKeys(emailAdd);
	}
	
	public void enterPwd(String pwdAdd) {
		pwd.click();
		pwd.sendKeys(pwdAdd);
	}
	
	public void enterConfirmPwd(String confirmPwdAdd) {
		confirmpwd.click();
		confirmpwd.sendKeys(confirmPwdAdd);
	}
	
	public void clickCheckPrivacy() {
		privacy.click();
	}
	
	public void clickSubmit() {
		submit.click();
	}
	
	public void fazerLoginBtnClick() {
		fazerLoginBtn.click();
	}
	
	public String mensageRegister() {
		registerMsg.click();
		return registerMsg.getText();
	}
}

package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
private WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@type='email']")
	WebElement email;
	
	@FindBy(xpath = "//input[@type='password']")
	WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement loginBtn;
	
	@FindBy(xpath = "//span[text()='Área pessoal']")
	WebElement areaPessoalBtn;
	
	@FindBy(xpath = "//button[text()=' Registe-se! ']")
	WebElement registroBtn;
	
	public void enterEmail(String emailAdd) {
		email.sendKeys(emailAdd);
	}
	
	public void enterPassword(String pwd) {
		password.sendKeys(pwd);
	}
	
	public void clickOnLoginBtn() {
		loginBtn.click();
	}
	
	public void clickOnAreaPessoalBtn() {
		areaPessoalBtn.click();
	}
	
	public void clickOnAreaRegistroBtn() {
		registroBtn.click();
	}
	
	

}

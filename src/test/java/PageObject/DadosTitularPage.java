package PageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DadosTitularPage {
	
private WebDriver driver;
	
	public DadosTitularPage(WebDriver driver) {
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "18_01_00_45")
	WebElement nome;
	
	@FindBy(id = "18_01_00_46")
	WebElement apelido;
	
	@FindBy(id = "18_01_00_48")
	WebElement cartCid;
	
	@FindBy(id = "18_01_00_49")
	WebElement validade;
	
	@FindBy(id = "18_01_00_22")
	WebElement nif;
	
	@FindBy(id = "18_01_01_26")
	WebElement selectCountry;
	
	@FindBy(id = "18_01_00_51")
	WebElement email;
	
	@FindBy(id = "18_01_00_31")
	WebElement prefixo;
	
	@FindBy(id = "18_01_00_32")
	WebElement telemovel;
	
	@FindBy(xpath = "//button[text()=' Continuar ']")
	WebElement btnContinue;
	
	@FindBy(id = "18_00_06_97")
	WebElement semCartCid;
	
	@FindBy(xpath = "//mtc-order-tc-modal")
	WebElement condModal;
	
	@FindBy(xpath = "//a[text()='termos e condições aqui']")
	WebElement uploadCondDoc;
	
	@FindBy(id = "02_03_03_17")
	WebElement checkCond;
	
	@FindBy(id = "02_03_05_05")
	WebElement contButton;
	
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
		telemovel.click();
		telemovel.sendKeys(telefoneAdd);
	}
	
	public void enterEmail(String emailAdd) {
		email.click();
		email.sendKeys(emailAdd);
	}
	
	public void enterValidade(String validadeAdd) {
		validade.click();
		validade.sendKeys(validadeAdd);
	}
	
	public void enterCartCid(String cartCidAdd) {
		cartCid.click();
		cartCid.sendKeys(cartCidAdd);
	}
	
	public void enterNif(String nifAdd) {
		nif.click();
		nif.sendKeys(nifAdd);
	}
	
	public void clickWithoutCC() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement semCC = wait.until(ExpectedConditions.visibilityOf(semCartCid));

        
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].click();", semCC);
	}
	
	public String getCondModal() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement modalCond = wait.until(ExpectedConditions.visibilityOf(condModal));

        return modalCond.getText();
	}
	
	public void clickCondDoc() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement condDoc = wait.until(ExpectedConditions.visibilityOf(uploadCondDoc));

        condDoc.click();
        
        WebElement checkCondWait = wait.until(ExpectedConditions.visibilityOf(checkCond));
        checkCondWait.click();
	}
	
	public void clickContButton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement contButt = wait.until(ExpectedConditions.visibilityOf(contButton));

        contButt.click();
	}
}

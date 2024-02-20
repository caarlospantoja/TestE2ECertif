package PageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CertDetailsPage {
	private WebDriver driver;
	
	public CertDetailsPage(WebDriver driver) {
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "00_03_06_93_v_true")
	WebElement sim;
	
	@FindBy(xpath = "//a[text()=' Não ']")
	WebElement nao;
	
	@FindBy(id = "02_01_05_05")
	WebElement btnCont;
	
	@FindBy(xpath = "//mtc-modal-frame")
	WebElement modal;
	
	
	public void clickSim() {
		sim.click();
	}
	
	public void clickNao() {

        nao.click();
	}
	
	public void clickContinuar() {
		WebElement element = driver.findElement(By.xpath("//button[text()=' Continuar ']"));
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].click();", element);
	}
}

package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
private WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "01_04_06_01_v_cdqselo")
	WebElement cdqselo;
	
	@FindBy(id = "01_04_06_01_v_cdqfe")
	WebElement fatElet;
	

	public void clickSeloEl() {
		cdqselo.click();
	}

	public void clickFatEle() {
		fatElet.click();
	}
}

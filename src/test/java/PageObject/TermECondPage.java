package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TermECondPage {
WebDriver ldriver;
	
	public TermECondPage(WebDriver rDriver) {
		ldriver = rDriver;
		
		PageFactory.initElements(rDriver, this);
	}

}

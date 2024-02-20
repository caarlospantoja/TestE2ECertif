package StepDefinition;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.LoggedPage;
import PageObject.LoginPage;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginUser {
	
	
	public WebDriver driver;
	public LoginPage loginPg;
	public LoggedPage loggedPg;
	
	
	/////////////////// Scenario 01 - Login User ////////////////////////
	@Given("User has navigated to login page")
	public void user_has_navigated_to_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://teste.multicert.com/onlinestore/?lang=pt");

		loginPg = new LoginPage(driver);
		loginPg.clickOnAreaPessoalBtn();
	}

	@When("User enters valid email address {string} into email field")
	public void user_enters_valid_email_address_into_email_field(String emailAdd) {
		loginPg.enterEmail(emailAdd);
	}

	@When("User has entered valid password {string} into password field")
	public void user_has_entered_valid_password_into_password_field(String pwd) {
		loginPg.enterPassword(pwd);
	}

	@When("User clicks on login button")
	public void user_clicks_on_login_button() {
		loginPg.clickOnLoginBtn();
	}

	@Then("User should get successfully logged in")
	public void user_should_get_successfully_logged_in() {
		String urlLogged = driver.getCurrentUrl();
		System.out.println(urlLogged);
		
		Assert.assertTrue(urlLogged.contains("https://teste.multicert.com/onlinestore/?lang=pt"));
		driver.quit();
	}
	
}

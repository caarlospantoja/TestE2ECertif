package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.HomePage;
import PageObject.LoggedPage;
import PageObject.LoginPage;
import PageObject.RegisterPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CertDetails {

	public WebDriver driver;
	public LoginPage loginPg;
	public HomePage homePg;
	public LoggedPage loggedPg;
	
	
	@Given("User has a valid login")
	public void user_has_a_valid_login() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://teste.multicert.com/onlinestore/?lang=pt");
		
		loginPg = new LoginPage(driver);
		loginPg.clickOnAreaPessoalBtn();
		loginPg.enterEmail("testemulticert@yopmail.com");
		loginPg.enterPassword("T&ste0123");
		loginPg.clickOnLoginBtn();
		
		
		loggedPg = new LoggedPage(driver);
		loggedPg.clickOnNovoPedido();
	}

	@When("User click to simulate price button")
	public void user_click_to_simulate_price_button() {
		
		homePg = new HomePage(driver);
		homePg.clickFatEle();
		
	}

	@When("logs in you account")
	public void logs_in_you_account() {
		try {
		    Thread.sleep(3000);
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}		
	}

	@Then("User should go to simulate certificates page")
	public void user_should_go_to_simulate_certificates_page() {
		String urlLogged = driver.getCurrentUrl();
		System.out.println(urlLogged);
		
		Assert.assertEquals(urlLogged, "https://teste.multicert.com/onlinestore/order/cdqfe/characteristics?lang=pt");
		driver.quit();
	}
}

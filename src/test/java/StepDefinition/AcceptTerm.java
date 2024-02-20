package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.CertDetailsPage;
import PageObject.DadosTitularPage;
import PageObject.EntidDataPage;
import PageObject.HomePage;
import PageObject.LoggedPage;
import PageObject.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AcceptTerm {
	
	public WebDriver driver;
	public LoginPage loginPg;
	public HomePage homePg;
	public LoggedPage loggedPg;
	public CertDetailsPage certDetPg;
	public EntidDataPage entPg;
	public DadosTitularPage titPg;
	
	@Given("User has been choice your certificate")
	public void user_has_been_choice_your_certificate() {
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
		
		homePg = new HomePage(driver);
		homePg.clickFatEle();
		
		try {
		    Thread.sleep(3000);
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
		
		certDetPg = new CertDetailsPage(driver);
		certDetPg.clickNao();
		

	}

	@Given("User click for continue button")
	public void user_click_for_continuar_button() {
		try {
		    Thread.sleep(3000);
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
		
		certDetPg.clickContinuar();
	}

	@When("User click on link that dont document have ID")
	public void user_click_on_link_that_dont_document_have_id() {
		scrollPageDown(driver);
		
		
		
		entPg = new EntidDataPage(driver);
		entPg.clickOnSemCert();

		
		titPg = new DadosTitularPage(driver);
		titPg.clickWithoutCC();
		
		
	}


	@When("click to upload document")
	public void click_to_upload_document() {
		try {
		    Thread.sleep(2000);
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
	}

	@When("check button from read term document checkout")
	public void check_button_from_read_term_document_checkout() {

		titPg.clickCondDoc();
	}

	@When("click in the continue button")
	public void click_in_the_continue_button() {
		titPg.clickContButton();
	}

	@Then("User go to payment page")
	public void user_go_to_payment_page() {
		try {
		    Thread.sleep(3000);
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
		
		String urlLogged = driver.getCurrentUrl();
		System.out.println(urlLogged);
		
		Assert.assertTrue(urlLogged.contains("https://teste.multicert.com/onlinestore/order/cdqfe/payment"));
		driver.quit();
		
		
	}
	
	public static void scrollPageDown(WebDriver driver) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }
}

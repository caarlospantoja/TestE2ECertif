package StepDefinition;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.LoggedPage;
import PageObject.LoginPage;
import PageObject.RegisterPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RegisterUser {
	
	public WebDriver driver;
	public LoginPage loginPg;
	public RegisterPage regPg;
	
	
	
    private String gerarEmailAleatorio() {
        return "teste" + System.currentTimeMillis() + "@multicert.sibis.com";
    }
    
    private String emailaleatorio;

/////////////////// Scenario 02 - Register User ////////////////////////
@Given("User navigates to Register Account page")
public void user_navigates_to_register_account_page() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://teste.multicert.com/onlinestore/?lang=pt");
	
	loginPg = new LoginPage(driver);
	loginPg.clickOnAreaPessoalBtn();
	loginPg.clickOnAreaRegistroBtn();

}

@When("User enter the details into below fields")
public void user_enter_the_details_into_below_fields(DataTable dataTable) {
	Map<String, String> dataMap = dataTable.asMap(String.class,String.class);
	regPg = new RegisterPage(driver);
	emailaleatorio = gerarEmailAleatorio();	
	
	
	regPg.enterName(dataMap.get("nome"));
	regPg.enterApelido(dataMap.get("apelido"));
	regPg.enterPrefixo(dataMap.get("prefixo"));
	regPg.enterTelefone(dataMap.get("telefone"));
	regPg.enterEmail(emailaleatorio);
	regPg.enterPwd(dataMap.get("password"));
	regPg.enterConfirmPwd(dataMap.get("password"));
	
}

@When("User check the privacy policy")
public void user_check_the_privacy_policy() {
	regPg.clickCheckPrivacy();
}

@When("User click in Continue button")
public void user_click_in_continue_button() {
	regPg.clickSubmit();
	try {
	    Thread.sleep(2000);
	} catch (InterruptedException e) {
	    e.printStackTrace();
	}
}

@Then("User should a pop-up with a successfully registration message")
public void user_should_a_pop_up_with_a_successfully_registration_message() {
	
	String txt = regPg.mensageRegister();
	Assert.assertTrue(txt.contains("Acesso criado com sucesso!"));
	driver.quit();
}
	
}

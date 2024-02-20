package PageObject;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoggedPage {

private WebDriver driver;
	
	public LoggedPage(WebDriver driver) {
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}

    @FindBy(xpath = "//button[text()=' Novo Pedido ']")
    WebElement novoPedido;

    @FindBy(xpath = "//input[@type='email']")
    WebElement textPedidos;

    public String getPedidosText() {
        return textPedidos.getText();
    }

    public void clickOnNovoPedido() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement novoPedidoElement = wait.until(ExpectedConditions.visibilityOf(novoPedido));

        novoPedidoElement.click();
    }
}
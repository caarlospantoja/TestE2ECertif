package com.example.pages;

import com.example.utils.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PedidosPage {
    private WebDriver driver;
    private SeleniumUtils seleniumUtils;


    private By novoPedidoButton = By.id("11_00_05_57");

    public PedidosPage(WebDriver driver) {
        this.driver = driver;
        this.seleniumUtils = new SeleniumUtils(driver, 10);
    }
    public void clicaNovoPedidoButton() {
        seleniumUtils.click(novoPedidoButton);
    }

}

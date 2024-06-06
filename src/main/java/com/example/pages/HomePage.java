package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.example.utils.SeleniumUtils;

public class HomePage {
    private WebDriver driver;
    private SeleniumUtils seleniumUtils;

    private By areaPessoalButton = By.id("00_07_05_73");
    private By pessoalFiltroButton = By.id("01_02_12_02_v_personal");
    private By cdqiButton = By.id("01_04_06_01_v_cdqi");

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.seleniumUtils = new SeleniumUtils(driver, 10);
    }

    public void clickLoginButton() {
        seleniumUtils.click(areaPessoalButton);
    }

    public void clickpessoalFiltroButton() {
        seleniumUtils.click(pessoalFiltroButton);
    }

    public void clickcdqiButton() {
        seleniumUtils.click(cdqiButton);
    }
}

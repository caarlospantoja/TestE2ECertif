package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.example.utils.SeleniumUtils;

public class LoginPage {
    private WebDriver driver;
    private SeleniumUtils seleniumUtils;


    private By emailInput = By.id("12_03_00_51");
    private By passwordInput = By.id("12_03_11_85");
    private By loginButton = By.id("12_03_05_05");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.seleniumUtils = new SeleniumUtils(driver, 10);
    }

    public void enterEmail(String email) {
        seleniumUtils.fillInput(emailInput, email);
    }

    public void enterPassword(String password) {
        seleniumUtils.fillInput(passwordInput, password);
    }

    public void clickLoginButton() {
        seleniumUtils.click(loginButton);
    }
}

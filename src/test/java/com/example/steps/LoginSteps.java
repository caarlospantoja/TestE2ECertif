package com.example.steps;

import com.example.config.Config;
import com.example.pages.HomePage;
import com.example.pages.LoginPage;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginSteps {

    private WebDriver driver;
    private LoginPage loginPage;
    private HomePage homePage;

    @Given("Eu estou na página inicial da loja Online")
    public void acessar_pagina_inicial() {
        driver = Hooks.getDriver();
        String env = System.getProperty("env", "test");
        String baseUrl = Config.getBaseUrl(env);

        driver.get(baseUrl + "/onlinestore"); //+ "/login"

        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
    }

    @When("Eu clico no botão para fazer o login")
    public void clicar_botao_fazer_login() {
        homePage.clickLoginButton();
    }

    @When("Digito e-mail válido {string}")
    public void digitar_email(String email) {
        loginPage.enterEmail(email);
    }

    @When("Digito password válida {string}")
    public void digitar_password(String password) {
        loginPage.enterPassword(password);
    }

    @When("Clico para iniciar a sessão")
    public void clicar_iniciar_sessao() {
        loginPage.clickLoginButton();
    }

    @Then("Eu sou direcionado para a página de de pedidos")
    public void redirecionar_pagina_pedidos() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(driver.getCurrentUrl().contains("https://teste.multicert.com/onlinestore/orders-list"));
    }
}

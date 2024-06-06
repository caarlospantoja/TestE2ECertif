package com.example.pages;

import com.example.utils.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormularioPage {
    private WebDriver driver;
    private SeleniumUtils seleniumUtils;


    private By prepreencherNaoButton = By.id("00_03_06_93_v_false");
    private By formatoRemotoButton = By.id("02_01_12_06_v_7");
    private By tempoUtilizacao3anosButton = By.id("02_01_12_07_v_3");
    private By tempoEmissaoNormalButton = By.id("02_01_12_08_v_1");
    private By continuarFormButton = By.id("02_01_05_05");

    public FormularioPage(WebDriver driver) {
        this.driver = driver;
        this.seleniumUtils = new SeleniumUtils(driver, 10);
    }
    public void naoPrepreencherFormulario() {
        seleniumUtils.click(prepreencherNaoButton);
    }
    public void clicarFormatoRemoto() {
        seleniumUtils.click(formatoRemotoButton);
    }
    public void clicarTempoUtilizacao3anos() {
        seleniumUtils.click(tempoUtilizacao3anosButton);
    }
    public void clicartempoEmissaoNormalButton() {
        seleniumUtils.click(tempoEmissaoNormalButton);
    }
    public void clicarcontinuarFormButton() {
        seleniumUtils.click(continuarFormButton);
    }

}

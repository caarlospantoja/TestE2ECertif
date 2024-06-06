package com.example.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverManagerUtil {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            // Configurar o WebDriverManager para gerenciar o ChromeDriver
            WebDriverManager.chromedriver().setup();

            // Configurar as opções do ChromeDriver
            ChromeOptions options = new ChromeOptions();
            //options.addArguments("--start-maximized");
            options.addArguments("--headless");
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");

            // Inicializar o WebDriver com as opções configuradas
            driver = new ChromeDriver(options);
        }
        return driver;
    }
}

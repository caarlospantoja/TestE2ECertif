package com.example.steps;

import com.example.utils.WebDriverManagerUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {
    private static WebDriver driver;

    @Before
    public void setUp() {
        driver = WebDriverManagerUtil.getDriver();
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }
}

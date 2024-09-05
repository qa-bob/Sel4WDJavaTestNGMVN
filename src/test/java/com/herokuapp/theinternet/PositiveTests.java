package com.herokuapp.theinternet;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class PositiveTests {

    @Test
    public void loginTest() {
        openPage();
    }

    @AfterTest
    public void tearDown(WebDriver driver){
        driver.quit();
    }

    private static void openPage() {
        WebDriver driver = new ChromeDriver();  //TODO:Set this in runtime from the Google Analytics
        String url = "https://schwab.com";  //TODO: Set this in runtime from Jenkins or the CLI
        driver.get(url);
        driver.manage().window().maximize();
    }
}

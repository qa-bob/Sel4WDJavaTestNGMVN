package com.herokuapp.theinternet;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class PositiveTests {

    @Test
    public void loginTest() {
        System.out.println("Running openPage test");
        WebDriver driver = new ChromeDriver();  //TODO:Set this in runtime from the Google Analytics
        String url = "https://schwab.com";  //TODO: Set this in runtime from Jenkins or the CLI
        driver.get(url);
        driver.manage().window().maximize();
        driver.quit();
        System.out.println("Closed browser");
        System.out.println("Completed openPage test");
    }
}

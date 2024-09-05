package com.herokuapp.theinternet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class PositiveTests {

    @Test
    public void landingPageLoadTest() throws InterruptedException {
        System.out.println("Running openPage test");
        WebDriver driver = new ChromeDriver();  //TODO:Set this in runtime from the Google Analytics
        String url = "https://schwab.com";  //TODO: Set this in runtime from Jenkins or the CLI
        driver.get(url);
        driver.manage().window().maximize();
        sleep(1000);
        WebElement logo = driver.findElement(By.cssSelector("#block-sch-beacon-retail-meganav > div > div > div > div.meganv-logo-wrapper.col-1 > a > span.meganv-svg-icon"));
        Assert.assertTrue(logo.isDisplayed());
        driver.quit();
        System.out.println("Closed browser");
        System.out.println("Completed openPage test");
    }
}

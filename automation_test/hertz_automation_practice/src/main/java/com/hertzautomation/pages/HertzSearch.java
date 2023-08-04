package com.hertzautomation.pages;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HertzSearch {

    private WebDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.get("https://www.hertz.com/rentacar/reservation/");
        driver.get("https://www.google.com");
    }

    @Test
    public void testHertzPage(){
        /*WebElement citySearchBox = driver.findElement(By.id("pickup-location"));
        WebElement pickUpDate = driver.findElement(By.id("pickup-date-box"));
        WebElement pickUpHour = driver.findElement(By.id("pickup-time"));
        WebElement dropOffDate = driver.findElement(By.id("dropoff-date-box"));
        WebElement dropOffHour = driver.findElement(By.id("dropoff-time"));
        WebElement continueButton = driver.findElement(By.id("new-resSubmit"));

        citySearchBox.click();
        citySearchBox.clear();
        citySearchBox.sendKeys("New York");
        citySearchBox.submit();

        pickUpDate.click();*/

        WebElement googleSearchbox = driver.findElement(By.name("q"));

        googleSearchbox.click();
        googleSearchbox.clear();
        googleSearchbox.sendKeys("Selenium");
        googleSearchbox.submit();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        assertEquals("Selenium", driver.getTitle());
    }


    //define variables and print them

}

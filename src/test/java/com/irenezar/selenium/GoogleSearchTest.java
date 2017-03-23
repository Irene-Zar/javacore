package com.irenezar.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;

import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertEquals;


/**
 * Created by new_user on 3/20/2017.
 */
public class GoogleSearchTest {
    WebDriver driver;

    //precondition
    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "D:\\KIT\\javacore\\src\\test\\resources\\geckodriver\\geckodriver.exe");
        //Init browser
        driver = new FirefoxDriver();
        //max window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //open url
        driver.get("https://www.google.com");

    }

    @Test
    public void searchTest() {
        //Finds an element by name
        WebElement searchField = driver.findElement(By.name("q"));
        // Sends "Selenium" text into an input field
        searchField.sendKeys("Selenium");
        searchField.submit();
        //Finds first link with specified result
        WebElement seleniumLink = driver.findElement(By.xpath(".//*[@id='rso']/div/div/div[1]/div/h3/a"));
        //Verifies a result

        assertEquals(seleniumLink.getText().contains("Selenium"), true);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}

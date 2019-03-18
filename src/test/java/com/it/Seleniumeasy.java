package com.it;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Seleniumeasy {
    @Test
    public void test3() {
        System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.seleniumeasy.com/test/");
        driver.executeScript("window.scrollTo(0, 1000);");
        driver.findElement(By.cssSelector("#treemenu > li > ul > li:nth-child(1) > a")).click();  //go to Input Forms
        driver.findElement(By.cssSelector("#treemenu > li > ul > li:nth-child(1) > ul > li:nth-child(1) > a")).click();  //go to Simple Form
        String hidden = driver.findElement(By.xpath("//*[@id=\"user-message\"]")).getAttribute("placeholder");
        Assert.assertEquals("Please enter your Message", hidden);
        driver.findElement(By.cssSelector("#user-message")).sendKeys("Monday");
        driver.findElement(By.cssSelector("#get-input > button")).click();
        String yourmessage = driver.findElement(By.id("display")).getText();
        Assert.assertEquals("Monday", yourmessage);
        driver.findElement(By.cssSelector("#gettotal > button")).click();
        String emptytotal = driver.findElement(By.id("displayvalue")).getText();
        Assert.assertEquals("NaN", emptytotal);
        driver.findElement(By.cssSelector("#sum1")).sendKeys("4");
        driver.findElement(By.cssSelector("#sum2")).sendKeys("5");
        driver.findElement(By.cssSelector("#gettotal > button")).click();
        String total = driver.findElement(By.id("displayvalue")).getText();
        Assert.assertEquals("9", total);
        driver.findElement(By.cssSelector("#treemenu > li > ul > li:nth-child(1) > a")).click();   //go to Input Forms
        driver.findElement(By.cssSelector("#treemenu > li > ul > li:nth-child(1) > ul > li:nth-child(2) > a")).click(); //go to Checkbox Demo
        driver.findElement(By.cssSelector("#isAgeSelected")).click();    //single checkbox selected
        String checkboxes = driver.findElement(By.id("txtAge")).getText();
        Assert.assertEquals("Success - Check box is checked", checkboxes);
        driver.findElement(By.id("check1")).click();  //multiple checkbox selected
        String check = driver.findElement(By.id("check1")).getAttribute("value");
        Assert.assertEquals("Uncheck All", check);

        String check2 = driver.findElement(By.id("check1")).getAttribute("value");
        Assert.assertEquals("Check All", check2);



    }
}

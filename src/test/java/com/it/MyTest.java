package com.it;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest {
    @Test
    public void test1() {
        System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://mvnrepository.com");
        String url = driver.getCurrentUrl();
        Assert.assertEquals("https://mvnrepository.com/",url);
        driver.quit();


    }
}

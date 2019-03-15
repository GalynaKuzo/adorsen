package com.it;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.WebElementHandler;
import org.testng.annotations.Test;

public class

NewTest {
    @Test
    public void test1() {

        System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://ain.ua");
        WebElement element =driver.findElement(By.className("login-btn"));
        element.click();
    }
}

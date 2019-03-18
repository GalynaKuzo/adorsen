package com.it;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class SwitchCategoryLearning {
    @Test
    public void test1() {
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_setting_values.notifications", 2);
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);

        System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://ain.ua");
        WebElement element = driver.findElement(By.cssSelector("div > span.lang-switcher > label > ul > a"));
        element.click();
     /*  boolean switcher = driver.findElement(By.className("active")).isEnabled();
       Assert.assertEquals("active", switcher); */
        WebElement lang_switcher = driver.findElement(By.cssSelector("div > span.lang-switcher > label > ul > a"));
        lang_switcher.click();   //todo add assertion to verify on rus/eng/rus pages
        driver.findElement(By.cssSelector("#menu-tematika-1 > li.menu-item.menu-item-type-custom.menu-item-object-custom.menu-item-has-children.menu-item-711957 > a")).click(); //add assertion to dropdown is visible with elements
        driver.findElement(By.cssSelector("#menu-tematika-1 > li.menu-item.menu-item-type-custom.menu-item-object-custom.menu-item-has-children.menu-item-711957 > ul > li.menu-item.menu-item-type-taxonomy.menu-item-object-category.menu-item-743305 > a")).click(); //add assertion to right page is visible
        /*driver.findElement(By.cssSelector("#kps-custom-button > a > span.content-on-hover > span.text-content")).click();*/
        driver.get("https://ain.ua/cards/keep-calm-and-learn-english/");
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("#main > div > div > div > div.post_special__wrap__start > div.post_special__wrap__start--content__wrap > div.post_special__wrap__start--content > div.post_special__wrap__start--content__footer > button > span")).click();
        driver.findElement(By.cssSelector("#body"));
        driver.findElement(By.cssSelector("#more > span.show-for-large")).click(); //eto ponyatno no jest druhaja
        driver.findElement(By.cssSelector("#body"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("#more > span.show-for-large")).click(); //druhaja
        driver.findElement(By.cssSelector("#body"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("#more > span.show-for-large")).click();   //druhaja
        driver.findElement(By.cssSelector("#body"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("#more > span.show-for-large")).click();  //druhaja
        options.setExperimentalOption("prefs", prefs);
        driver.findElement(By.cssSelector("#body"));
        driver.findElement(By.cssSelector("#advice")).click();   //bezplatnyj urok
    }
}

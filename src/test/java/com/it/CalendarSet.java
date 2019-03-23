package com.it;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class CalendarSet {
    @Test
    public void test2() {
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_setting_values.notifications", 2);
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);
        System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
        ChromeDriver driver1 = new ChromeDriver();
        driver1.get("https://ain.ua/events/");
        driver1.findElement(By.cssSelector("#body"));
        driver1.executeScript("window.scrollTo(0, 1300);");
        driver1.findElement(By.cssSelector("#tribe-events-content-wrapper > div > div > div > div.calendar > table > tbody > tr:nth-child(2) > td.date-item.tribe-events-thismonth.tribe-events-past.tribe-events-has-events.mobile-trigger.tribe-event-day-05 > a:nth-child(2)")).click();
        driver1.manage().window().fullscreen();
        String date = driver1.findElement(By.cssSelector("#subbody > section > div > div > div.block-wrap-content > div > div.event-head > time:nth-child(1)")).getText();
        Assert.assertEquals("Дата\n" + "Март 5 .", date);
        String time = driver1.findElement(By.cssSelector("#subbody > section > div > div > div.block-wrap-content > div > div.event-head > time:nth-child(2)")).getText();
        Assert.assertEquals("Время\n" + "15:00", time);
    }
}

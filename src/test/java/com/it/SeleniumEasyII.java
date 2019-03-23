package com.it;

import jdk.jfr.Timespan;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class SeleniumEasyII {
        @Test
       public void Homework() {
            System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
            ChromeDriver driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get("https://www.seleniumeasy.com/test/");
            driver.executeScript("window.scrollTo(0, 1000);");
            /* WebElement GoToInputFormsMenu = driver.findElement(By.cssSelector("#treemenu > li > ul > li:nth-child(1) > a"));
            WebElement SelectDropDownDemoMenu = driver.findElement(By.cssSelector("#treemenu > li > ul > li:nth-child(1) > ul > li:nth-child(4) > a"));
            GoToInputFormsMenu.click();
            SelectDropDownDemoMenu.click();
            WebElement SelectADay = driver.findElement(By. id("select-demo"));
            WebElement Wednesday =driver.findElement(By.xpath("//*[@id=\"select-demo\"]/option[5]"));
            WebElement SelectedDayShow=driver.findElement(By.className("selected-value"));
            WebElement FirstSelectedButton =driver.findElement(By.id("printMe"));
            WebElement AllSelectedButton =driver.findElement(By.id("printAll"));
            WebElement SelectedDisplayText=driver.findElement(By.className("getall-selected"));
            WebElement SelectedValueNewJerSey=driver.findElementByXPath("//*[@id=\"multi-select\"]/option[3]");
            WebElement SelectedValueOhio=driver.findElementByXPath("//*[@id=\"multi-select\"]/option[5]");
            WebElement SelectedValueTexas=driver.findElement(By.xpath("//*[@id=\"multi-select\"]/option[6]"));
            WebElement SelectedValuePennsylvania=driver.findElement(By.xpath("//*[@id=\"multi-select\"]/option[7]"));
            WebElement SelectedValueWashington=driver.findElement(By.xpath("//*[@id=\"multi-select\"]/option[8]"));
            SelectADay.click();
            Wednesday.click();
            Assert.assertEquals("Day selected :- Wednesday", SelectedDayShow.getText());
            FirstSelectedButton.click();
            Assert.assertEquals("First selected option is : undefined",SelectedDisplayText.getText());
            AllSelectedButton.click();
            Assert.assertEquals("Options selected are :", SelectedDisplayText.getText());
            SelectedValueNewJerSey.click();
            FirstSelectedButton.click();
            Assert.assertEquals("First selected option is : New Jersey", SelectedDisplayText.getText());
            SelectedValueOhio.click();
            AllSelectedButton.click();
            Assert.assertEquals("Options selected are : Ohio", SelectedDisplayText.getText());
            SelectedValueTexas.click();
            //SelectedValueTexas.sendKeys( Keys.SHIFT);
            SelectedValuePennsylvania.click();
            //SelectedValuePennsylvania.sendKeys( Keys.SHIFT);
            SelectedValueWashington.click();
            //SelectedValueWashington.sendKeys(Keys.SHIFT);
            AllSelectedButton.click();
            Assert.assertEquals("Options selected are : Washington", SelectedDisplayText.getText());


            WebElement GoToInputFormsMenuRepeat = driver.findElement(By.cssSelector("#treemenu > li > ul > li:nth-child(1) > a"));
            WebElement GoToInputFormSubmit_Menu = driver.findElement(By.cssSelector("#treemenu > li > ul > li:nth-child(1) > ul > li:nth-child(5) > a"));
            GoToInputFormsMenuRepeat.click();
            GoToInputFormSubmit_Menu.click();

            WebElement Submit_Menu_Page_Title=driver.findElementByCssSelector("body > div.container-fluid.text-center > div > div.col-md-6.text-left > h2");
            Assert.assertEquals("Input form with validations", Submit_Menu_Page_Title.getText());

            WebElement FirstName_Input = driver.findElementByXPath("//*[@id=\"contact_form\"]/fieldset/div[1]/div/div/input");
            WebElement LastName_Input = driver.findElementByXPath("//*[@id=\"contact_form\"]/fieldset/div[2]/div/div/input");
            WebElement Phone_Input = driver.findElementByXPath("//*[@id=\"contact_form\"]/fieldset/div[4]/div/div/input");
            WebElement State_Input = driver.findElementByXPath("//*[@id=\"contact_form\"]/fieldset/div[7]/div/div/select");
            WebElement State_Hawaii_Input = driver.findElementByXPath("//*[@id=\"contact_form\"]/fieldset/div[7]/div/div/select/option[13]");
            WebElement Hosting_Yes_Input = driver.findElementByXPath("//*[@id=\"contact_form\"]/fieldset/div[10]/div/div[1]/label/input");
            WebElement Project_Descr_Input=driver.findElementByCssSelector("#contact_form > fieldset > div:nth-child(12) > div > div > textarea");
            WebElement Send_Button = driver.findElementByXPath("//*[@id=\"contact_form\"]/fieldset/div[13]/div/button");
            FirstName_Input.sendKeys("Genny");
            LastName_Input.sendKeys("Moon");
            Phone_Input.sendKeys("232323");
            State_Input.click();
            State_Hawaii_Input.click();
            Hosting_Yes_Input.click();
            Project_Descr_Input.sendKeys("Project about frogs");
            Send_Button.click();
            WebElement FirstName_InputNewPage=driver.findElementByXPath("//*[@id=\"contact_form\"]/fieldset/div[1]/div/div/input");
            Assert.assertEquals("First Name",FirstName_InputNewPage.getAttribute("placeholder"));

            WebElement GoToInputFormsMenuRepeatAgain = driver.findElement(By.cssSelector("#treemenu > li > ul > li:nth-child(1) > a"));
            WebElement AjaxFormSubmit_Menu = driver.findElement(By.cssSelector("#treemenu > li > ul > li:nth-child(1) > ul > li:nth-child(6) > a"));

            GoToInputFormsMenuRepeatAgain.click();
            AjaxFormSubmit_Menu.click();

            WebElement AjaxFormPageTitle = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/h1"));
            WebElement NameInputField = driver.findElement(By.xpath("//*[@id=\"title\"]"));
            WebElement CommentsInputField = driver.findElement(By.id("description"));
            WebElement SuccessSubmitMessage =driver.findElement(By.id("submit-control"));
            WebElement SubmitButton =driver.findElement(By.id("btn-submit"));

            Assert.assertEquals("Ajax Form Submit with Loading icon", AjaxFormPageTitle.getText());
            SubmitButton.click();
            Assert.assertEquals("border: 1px solid rgb(255, 0, 0);",NameInputField.getAttribute("style"));     //error field displayed check

            NameInputField.sendKeys("Galina");
            CommentsInputField.sendKeys("Monday arrived");
            SubmitButton.click();
            Assert.assertEquals("Ajax Request is Processing!", SuccessSubmitMessage.getText());
            WebDriverWait wait = new WebDriverWait(driver, 10);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            /* try {
                driver.findElement(By.xpath("//*[@id=\"btn-submit\"]"));
            }
               catch (NoSuchElementException e) {
            }
            WebElement SuccessAfterProgress = driver.findElementByXPath("//*[@id=\"submit-control\"]");
            Assert.assertEquals("Form submited Successfully!", SuccessAfterProgress.getText()); */



            WebElement GoToInputFormsMenuRepeatAgainAgain = driver.findElement(By.cssSelector("#treemenu > li > ul > li:nth-child(1) > a"));
            WebElement JqueryDropdownSearch_Menu = driver.findElement(By.cssSelector("#treemenu > li > ul > li:nth-child(1) > ul > li:nth-child(7) > a"));
            GoToInputFormsMenuRepeatAgainAgain.click();
            JqueryDropdownSearch_Menu.click();
            WebElement SelectCountry = driver.findElementByXPath("/html/body/div[2]/div/div[2]/div[1]/div/div[2]/span/span[1]/span");
            SelectCountry.click();
            WebElement SearchField = driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
            SearchField.click();
            SearchField.sendKeys("Af");
            WebElement ResultsHighlighted = driver.findElement(By.xpath("/html/body/span/span/span[2]"));
            Assert.assertEquals("South Africa", ResultsHighlighted.getText());
            SearchField.clear();
            SearchField.sendKeys("De");
            Assert.assertEquals("Bangladesh\n" +
                    "Denmark", ResultsHighlighted.getText());
            WebElement Denmark = driver.findElement(By.xpath("//*[@id=\"select2-country-results\"]/li[2]"));
            Denmark.click();
            Assert.assertEquals("Denmark", SelectCountry.getText());

            WebElement SelectStateDropDown = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[2]/span/span[1]/span/ul/li/input"));
            SelectStateDropDown.click();
            SelectStateDropDown.sendKeys("Al");

            WebElement ResultsSearch =driver.findElement(By.className("select2-results"));
            Assert.assertEquals("Alabama\n" +
                    "Alaska\n" +
                    "California", ResultsSearch.getText());





         }
}

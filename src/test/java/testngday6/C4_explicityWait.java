package testngday6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilites.BrowserUtil;
import utilites.DriverUtil;

public class C4_explicityWait {

    @Test
    public void TC1_seleniumexplicity(){
        // go to http://seleniumpractise.blogspot.com/2016/08/how-to-explicit-wait-in-selenium.html
        //click on the timer button
        //after click verify Webdriver is present on the page

        DriverUtil.getDriver().get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");

        //to be able to use explicit wait you need to create an object from WebDriverWait(which comes from selenium)
        //you can specify the time

        WebDriverWait webDriverWait=new WebDriverWait(DriverUtil.getDriver(),15);

        WebElement clickButton=DriverUtil.getDriver().findElement(By.xpath("//button[.='Click me to start timer']"));
        //clickButton.click();
        webDriverWait.until(ExpectedConditions.elementToBeClickable(clickButton)).click();

        WebElement text=DriverUtil.getDriver().findElement(By.id("demo"));
        System.out.println(text.getText());


        BrowserUtil.wait(5);
        System.out.println(text.getText());

        WebElement webDriverText=webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[.='WebDriver']")));

        Assert.assertEquals(webDriverText.getText(),"WebDriver");

    }
}

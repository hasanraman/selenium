package testngDay4;

import basepackage.TestBase2;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilites.DriverUtil;
import utilites.PropertiesReadingUtil;

public class DriverUtilPractice extends TestBase2 {
    @Test
    public void driver_Practice(){

        DriverUtil.getDriver().get(PropertiesReadingUtil.getProperties("google_url"));
        WebElement searchbox=DriverUtil.getDriver().findElement(By.name("q"));
        String searchitem=PropertiesReadingUtil.getProperties("googleSearch");
        searchbox.sendKeys(searchitem+ Keys.ENTER);

        //expectedContainTitle
        String expectedContainTitle=searchitem;
        System.out.println("searchitem = " + searchitem);
        Assert.assertTrue(DriverUtil.getDriver().getTitle().contains(expectedContainTitle));


    }

}

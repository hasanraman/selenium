package testngday5;

import basepackage.TestBase;
import basepackage.TestBase2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilites.DriverUtil;

public class Class1 extends TestBase2 {


    //go to http://renastech.com/?amp
//move the mouse to Mouse Hover button
//then move to Section 1
//then move to section 1.2

    @Test
    public void TC1_hoveroverrenastechpractice(){
        DriverUtil.getDriver().get("http://renastech.com/?amp");

        Actions actions=new Actions(DriverUtil.getDriver()) ;

        WebElement mouseHoverButton=DriverUtil.getDriver().findElement(By.linkText("Mouse Hover"));

        actions.moveToElement(mouseHoverButton).perform();

        WebElement section1=DriverUtil.getDriver().findElement(By.linkText("Section 1"));

        actions.moveToElement(section1).perform();

        WebElement section1_2=DriverUtil.getDriver().findElement(By.linkText("Section 1.2"));

        actions.moveToElement(section1_2).perform();

    }



}

package testngday6;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.RenastechPracticepage;
import utilites.DriverUtil;
import utilites.PropertiesReadingUtil;

public class C5_ecplicitywaitrenastech {
    //go to http://renastech.com/?amp
    //click on show button
    //sent text to the box that appers after clicking show button

    RenastechPracticepage renastechPracticepage;
    @Test
    public void TC1_hiddenelementrenastech(){
        DriverUtil.getDriver().get(PropertiesReadingUtil.getProperties("RenasTech_url"));
        renastechPracticepage=new RenastechPracticepage();

//        WebDriverWait webDriverWait=new WebDriverWait(DriverUtil.getDriver(),15);
//        webDriverWait.until(ExpectedConditions.elementToBeClickable(renastechPracticepage.showbutton)).click();
//
//        //sent text to the box
//        webDriverWait.until(ExpectedConditions.visibilityOf(renastechPracticepage.hiddenbox)).sendKeys("hello");

        renastechPracticepage.senttexttohiddenbox("hello");






    }
}

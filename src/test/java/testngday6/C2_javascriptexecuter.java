package testngday6;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.RenastechPracticepage;
import utilites.DriverUtil;
import utilites.PropertiesReadingUtil;

public class C2_javascriptexecuter {
    //go to http://renastech.com/?amp
    //scroll down to iframe on the page
 RenastechPracticepage renastechPracticepage;

 @Test
    public void TC1_javascriptsexecuter(){
     renastechPracticepage=new RenastechPracticepage();
     DriverUtil.getDriver().get(PropertiesReadingUtil.getProperties("RenasTech_url"));

     //locate iframe to scroll down
     WebElement iframe= renastechPracticepage.iFrame;


     //to be able to scroll down there are two options 1) action 2)js executer

     JavascriptExecutor javascriptExecutor=(JavascriptExecutor) DriverUtil.getDriver();

     javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);",iframe);


 }


}

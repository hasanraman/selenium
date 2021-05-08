package testngDay4;

import basepackage.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import java.util.Set;

public class Class1 extends TestBase {
    @Test
    public void handlingWindowWithJSexecuter(){
      driver.get("https://youtube.com");

        ( (JavascriptExecutor) driver).executeScript("window.open('https://google.com','_blank');");
        ( (JavascriptExecutor) driver).executeScript("window.open('https://facebook.com','_blank');");

       Set<String> windows= driver.getWindowHandles();
       for(String window:windows){
           driver.switchTo().window(window);
           String currentWindow=driver.getWindowHandle();
           System.out.println("currentWindow = " + currentWindow);
           System.out.println("driver.getTitle() = " + driver.getTitle());

       }


    }



}

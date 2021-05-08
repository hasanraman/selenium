package testngday6;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilites.DriverUtil;

public class C3_binanceAutomation {

    @Test
    public void TC_BinanceExample(){
        DriverUtil.getDriver().get("https://www.binance.com/en");

        WebElement tradeButton=DriverUtil.getDriver().findElement(By.xpath("//span[.='Trade']"));
        Actions actions=new Actions(DriverUtil.getDriver());
        actions.moveToElement(tradeButton).perform();

        WebElement convertbutton=DriverUtil.getDriver().findElement(By.id("ba-BasicCONVERT"));
        actions.moveToElement(convertbutton).click().perform();


        //with JS executer
        //JavascriptExecutor javascriptExecutor=(JavascriptExecutor) DriverUtil.getDriver();
        //javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);",convertbutton);

    }
}

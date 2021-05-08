package pages;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilites.DriverUtil;

public abstract class BasePage {

    WebDriverWait webDriverWait=new WebDriverWait(DriverUtil.getDriver(),15);
    public BasePage(){
        PageFactory.initElements(DriverUtil.getDriver(),this);

    }



}

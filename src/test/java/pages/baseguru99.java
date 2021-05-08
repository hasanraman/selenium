package pages;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilites.DriverUtil;

public abstract class baseguru99 {
    WebDriverWait webDriverWait=new WebDriverWait(DriverUtil.getDriver(),15);

    public baseguru99(){
        PageFactory.initElements(DriverUtil.getDriver(),this);
    }
}

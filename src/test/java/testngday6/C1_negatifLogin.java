package testngday6;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SmartBearLoginPage;
import utilites.DriverUtil;
import utilites.PropertiesReadingUtil;

public class C1_negatifLogin {

    SmartBearLoginPage smartBearLoginPage;
    @Test
    public void TC1_smartbearLogintest(){

        smartBearLoginPage=new SmartBearLoginPage();
        DriverUtil.getDriver().get(PropertiesReadingUtil.getProperties("SmartBear_url"));
        smartBearLoginPage.loginSmartBear(PropertiesReadingUtil.getProperties("SmartBear_InvalidUsername"),
                PropertiesReadingUtil.getProperties("SmartBear_InvalidPassword"));

        String expectedText="Invalid Login or Password.";
        String actualText=smartBearLoginPage.getStatusMessage();

        Assert.assertEquals(expectedText,actualText);

    }
}

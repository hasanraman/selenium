package testngday5;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SmartBearLoginPage;
import utilites.DriverUtil;
import utilites.PropertiesReadingUtil;

public class C3_SmartBearPomeExample {
    //to be able to work on page you need to create an object page

    SmartBearLoginPage smartBearLoginPage;

    @Test
    public void TC1_SmartBearPozitifLogin(){
        DriverUtil.getDriver().get(PropertiesReadingUtil.getProperties("SmartBear_url"));
        String userName=PropertiesReadingUtil.getProperties("SmartBear_username");
        String password=PropertiesReadingUtil.getProperties("SmartBear_password");

        smartBearLoginPage=new SmartBearLoginPage();
        smartBearLoginPage.loginSmartBear(userName,password);



        String expectedTitle="Web Orders";
        String actualTitle=DriverUtil.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }
}

package testngday5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilites.DriverUtil;

public class C2_actionmethodpractice {


    //go to http://demo.guru99.com/test/simple_context_menu.html
    //double click to double click button
    //then accept the alert that pops up

    Actions actions;

    @Test
    public void TC1_doubleClick(){
        DriverUtil.getDriver().get("http://demo.guru99.com/test/simple_context_menu.html");

        WebElement doubleclickbutton=DriverUtil.getDriver().findElement(By.xpath("//button[.='Double-Click Me To See Alert']"));
        actions=new Actions(DriverUtil.getDriver());
        actions.doubleClick(doubleclickbutton).perform();

        Alert alert=DriverUtil.getDriver().switchTo().alert();
        alert.accept();

    }

    @Test
    public void TC2_RightClick(){
        DriverUtil.getDriver().get("http://demo.guru99.com/test/simple_context_menu.html");
        WebElement rightClick= DriverUtil.getDriver().findElement(By.xpath("//span[.='right click me']"));
        actions=new Actions(DriverUtil.getDriver());
        actions.contextClick(rightClick).perform();


        WebElement editButton=DriverUtil.getDriver().findElement(By.xpath("//span[.='Edit']"));
        editButton.click();

        Alert alert=DriverUtil.getDriver().switchTo().alert();
        alert.accept();

    }


    @Test
    public void TC3_dragdrop(){
        DriverUtil.getDriver().get("http://demo.guru99.com/test/drag_drop.html");

        WebElement dragfrom=DriverUtil.getDriver().findElement(By.xpath("//a[.=' BANK ']"));
        WebElement dragto=DriverUtil.getDriver().findElement(By.xpath("//ol[@id='bank']/li"));

        actions=new Actions(DriverUtil.getDriver());
        actions.dragAndDrop(dragfrom,dragto).perform();



        WebElement dragfrom2=DriverUtil.getDriver().findElement(By.id("fourth"));
        WebElement dragto2=DriverUtil.getDriver().findElement(By.xpath("//ol[@id='amt7']/li"));

        actions=new Actions(DriverUtil.getDriver());
        actions.dragAndDrop(dragfrom2,dragto2).perform();


    }





}

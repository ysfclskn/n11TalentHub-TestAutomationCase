package utils;


import org.openqa.selenium.By;

import java.io.FileOutputStream;


public class Helper {
    //Clicks WebElements with LinkText
    public static void clickWithLinkText(String linkText){
        Driver.get().findElement(By.linkText(linkText)).click();
    }
    //Clicks WebElements with SpanText
    public static void clickWithSpanText(String spanText){
        String locator = "//span[text()='"+spanText+"']"; //locate element with parameter
        Driver.get().findElement(By.xpath(locator)).click();
    }




}

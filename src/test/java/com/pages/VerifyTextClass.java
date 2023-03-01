package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class VerifyTextClass {

    WebDriver driver;

    public VerifyTextClass(WebDriver driver)
    {
        this.driver = driver;
    }


   public  void  textVerification() throws InterruptedException {
       Thread.sleep(3000);
       WebElement verifyText = driver.findElement(By.xpath("//div[@class='SuccessMessage']"));
       boolean result = verifyText.isDisplayed();
       Assert.assertTrue(result);
       String vr =verifyText.getText();
       System.out.println(vr);


   }
}

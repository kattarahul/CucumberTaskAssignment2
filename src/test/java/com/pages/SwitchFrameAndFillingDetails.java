package com.pages;

import com.seleniumactions.SeleniumActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SwitchFrameAndFillingDetails {

    WebDriver driver;
    SeleniumActions seleniumActions;


    public SwitchFrameAndFillingDetails(WebDriver driver)
    {
        this.driver = driver;
    }


    public void switchFrame()
    {
        WebElement frame =driver.findElement(By.xpath("//div[@id='contactus']/div/div/following-sibling::div/script/following-sibling::script/following-sibling::iframe"));
        driver.switchTo().frame(frame);
        System.out.println(" switching Completed");

    }

    public void enterDetails( String string, String string1,String string3) throws InterruptedException {
        seleniumActions =new SeleniumActions(driver);
        WebElement nameInput =driver.findElement(By.xpath("//input[@ name='name']"));
        seleniumActions.enterTheInputTextField(nameInput,string);

        WebElement emailText = driver.findElement(By.xpath("//input[@ name='email']"));
        seleniumActions.enterTheInputTextField(emailText,string1);

        WebElement message = driver.findElement(By.xpath("//textarea[@name='message']"));
        seleniumActions.enterTheInputTextField(message,string3);

        Thread.sleep(3000);
        WebElement submitButton = driver.findElement(By.xpath("//div[@id='sendiconDiv']"));
        submitButton.click();

    }




}

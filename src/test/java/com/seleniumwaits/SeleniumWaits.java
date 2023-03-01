package com.seleniumwaits;

import com.constant.WaitsClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumWaits {


    WebDriver driver;
    WaitsClass waitClass;
    WebDriverWait wait;

    public SeleniumWaits(WebDriver seleniumwaitdriver)
    {
        waitClass = new WaitsClass();
        wait = new WebDriverWait(seleniumwaitdriver, Duration.ofSeconds(waitClass.waitFor));


    }

    public WebElement waitForElementToClick(WebElement element)
    {

        WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(element));
        return element1;

    }

}

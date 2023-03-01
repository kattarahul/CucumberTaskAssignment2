package com.seleniumactions;

import com.seleniumwaits.SeleniumWaits;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

public class SeleniumActions {

    WebDriver driver;
    SeleniumWaits seleniumWaits;

    public  SeleniumActions(WebDriver seleniumactionsdriver)
    {
        this.driver = seleniumactionsdriver;
        seleniumWaits =new SeleniumWaits(seleniumactionsdriver);
    }


    public boolean moveElementUsingAction(WebElement element)
    {
        Actions act = new Actions(driver);
        boolean flag = false;

        try{
            act.moveToElement(element).build().perform();
//                act.click().build().perform();

            flag =true;
        }
        catch (NoSuchElementException nse)
        {
            flag =false;

        }
        catch (StaleElementReferenceException ste )
        {
            flag= false;

        }
        catch (ElementNotInteractableException eni)
        {
            flag=false;
        }
        return flag;
    }


    public  boolean enterTheInputTextField(WebElement element,String key)
    {
        boolean flag = false;

        try{

            element.sendKeys(key);
            flag =true;
        }
        catch (NoSuchElementException nse)
        {
            flag =false;

        }
        catch (StaleElementReferenceException ste )
        {
            flag= false;

        }
        return flag;
    }







}

package com.lukianchuk.selectors.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by qa1 on 12/22/15.
 */
public class CssSelectorsElementSearcher extends ElementSearcher {

    public WebElement findButtonNew() {
        System.out.println("I'm in CSS");
        return driver.findElement(By.cssSelector(".buttonAsLink.navigationButton"));
    }



}

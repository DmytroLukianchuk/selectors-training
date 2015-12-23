package com.lukianchuk.selectors.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SimpleSelectorsElementSearcher extends ElementSearcher {


    public WebElement findButtonNew() {

        return driver.findElement(By.className("buttonAsLink"));
    }

    public WebElement findInputSearch() {
        return driver.findElement(By.name("//////"));
    }

    public WebElement findLabelName() {
        return driver.findElement(By.className("//////"));
    }
}

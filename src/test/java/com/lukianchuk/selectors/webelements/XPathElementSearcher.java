package com.lukianchuk.selectors.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class XPathElementSearcher extends ElementSearcher {

    public WebElement findButtonNew() {
        System.out.println("I'm in XPATH");

        return driver.findElement(By.xpath("//////"));
    }

    public WebElement findInputSearch() {
        return driver.findElement(By.xpath("//////"));
    }

    public WebElement findLabelName() {
        return driver.findElement(By.xpath("//////"));
    }
}

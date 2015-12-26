package com.lukianchuk.selectors.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by qa1 on 12/22/15.
 */
public class XPathSelectorsElementSearcher extends ElementSearcher {

    public WebElement findButtonNew() {
        System.out.println("I'm in XPath");
        return driver.findElement(By.xpath("//input[@value='New...']"));
    }

    public WebElement findCommentTextField() {
        return driver.findElement(By.xpath("//input[@id='Text']"));
    }

    public WebElement findCatCheckBox() {
        return driver.findElement(By.xpath("//input[@id='Categories' and @value='4']"));
    }

    public WebElement findMoveToRightButton() {
        return driver.findElement(By.xpath("//input[@name = 'CurSelect']"));
    }

    public WebElement findSaveAndReturnButton() {
        return driver.findElement(By.xpath("//input[@value = 'Save & Return']"));
    }

    public String checkCommentPresent() {
        return driver.findElement(By.xpath("//tr[1]/td[3]")).getText();
    }

    public String findCommentTextIsRequiredText() {
        return driver.findElement(By.xpath("//span[span]")).getText();
    }

    public WebElement findDuplicateButton() {
        return driver.findElement(By.xpath("//input[@value='Duplicate...']"));
    }

    public WebElement checkDuplicateModalAppeared() {
        return driver.findElement(By.xpath("//div[@id='dialog']"));
    }

    public WebElement findFirstCommentCheckBox() {
        return driver.findElement(By.xpath("//tbody/tr[1]/td[1]"));
    }
}

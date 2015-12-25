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

    public WebElement findCommentTextField() {
        return driver.findElement(By.cssSelector(".text-box"));
    }

    public WebElement findCatCheckBox() {
        return driver.findElement(By.cssSelector("#Categories[value='4']"));
}
    public WebElement findMoveToRightButton() {
        return driver.findElement(By.cssSelector(".actionbutton[value='>']"));
}
    public WebElement findSaveAndReturnButton() {
        return driver.findElement(By.cssSelector(".buttonAsLink[value='Save & Return']"));
}

    public String checkCommentPresent() {
        return driver.findElement(By.cssSelector("td.textcolumn")).getText();
}

    public String findCommentTextIsRequiredText() {
        return driver.findElement(By.cssSelector("span span")).getText();
}
    public WebElement findDuplicateButton() {
        return driver.findElement(By.cssSelector(".buttonAsLink[value='Duplicate...']"));
}
    public WebElement checkDuplicateModalAppeared() {
        return driver.findElement(By.cssSelector(".modal.ui-dialog-content.ui-widget-content"));
    }

    public WebElement findFirstCommentCheckBox() {
        return driver.findElement(By.cssSelector("tr > td > input[value='1']"));
    }

    public String checkCopyOfCommentText() {
        return driver.findElement(By.cssSelector("tr > td > input[value='1']"));
    }


}

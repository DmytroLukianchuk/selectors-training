package com.lukianchuk.selectors.webelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public abstract class ElementSearcher {
    protected WebDriver driver = new FirefoxDriver();

    public void goToURL(String url) {
        driver.get(url);
    }

    public void closePage() {
        driver.quit();
    }

    public String getCurrentURL() {
        return driver.getCurrentUrl();
    }

    public abstract WebElement findButtonNew();
    public abstract WebElement findCommentTextField();
    public abstract WebElement findCatCheckBox();
    public abstract WebElement findMoveToRightButton();
    public abstract WebElement findSaveAndReturnButton();
    public abstract String checkCommentPresent();
    public abstract WebElement findDuplicateButton();
    public abstract String findCommentTextIsRequiredText();
    public abstract WebElement checkDuplicateModalAppeared();
    public abstract WebElement findFirstCommentCheckBox();

    public abstract String checkErrorNumberFieldNotUnique();

    public abstract WebElement findNumberField();

    public abstract boolean checkCommentIsPresentOnPageNumber(int pageNumber);
}

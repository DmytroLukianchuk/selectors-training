package com.lukianchuk.selectors;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.internal.FindsById;
import org.openqa.selenium.support.FindBy;

/**
 * Created by qa1 on 12/22/15.
 */
public class Drivers {

    @Test
    public void findNewCommentElement() {
        WebDriver fireFox = new FirefoxDriver();
        fireFox.get("http://comments.azurewebsites.net/");
        WebElement newComment = fireFox.findElement(By.cssSelector("input[value='New...']"));
    }

    @Test
    public void findDuplicateCommentElement() {
        WebDriver fireFox = new FirefoxDriver();
        fireFox.get("http://comments.azurewebsites.net/");
        WebElement newComment = fireFox.findElement(By.cssSelector("input[value='Duplicate...']"));
    }

    @Test
    public void findEditCommentElement() {
        WebDriver fireFox = new FirefoxDriver();
        fireFox.get("http://comments.azurewebsites.net/");
        WebElement newComment = fireFox.findElement(By.cssSelector("input[value='Edit...']"));
    }

    @Test
    public void findDeleteCommentElement() {
        WebDriver fireFox = new FirefoxDriver();
        fireFox.get("http://comments.azurewebsites.net/");
        WebElement newComment = fireFox.findElement(By.cssSelector("input[value='Delete']"));
    }




}

package com.lukianchuk.selectors;

import com.lukianchuk.selectors.webelements.CssSelectorsElementSearcher;
import com.lukianchuk.selectors.webelements.ElementSearcher;
import com.lukianchuk.selectors.webelements.SimpleSelectorsElementSearcher;
import com.lukianchuk.selectors.webelements.XPathElementSearcher;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by qa1 on 12/22/15.
 */
public class TestUITests {

    ElementSearcher elementSearcher = new CssSelectorsElementSearcher();

    @After
    public void tearDown() throws Exception {
        elementSearcher.closePage();

   }

//    private ElementSearcher getRigthElementSearcher() {
//        String elementSelectorProperty = System.getProperty("element.selector");
//        System.out.println("PROPERTY: " + elementSelectorProperty);
//
//        if ("css-selector".equals(elementSelectorProperty)) {
//            return new CssSelectorsElementSearcher();
//        } else if ("simple-selector".equals(elementSelectorProperty)) {
//            return new SimpleSelectorsElementSearcher();
//        } else {
//            return new XPathElementSearcher();
//        }
//    }

    // ADDING NEW COMMENT TESTS

        @Test
        public void checkNewButtonLinkTest() {
            System.out.println("Open http://comments.azurewebsites.net/ URL");
            elementSearcher.goToURL("http://comments.azurewebsites.net/");

            System.out.println("Click on New... button");
            elementSearcher.findButtonNew().click();

            System.out.println("Check that correct Page / URL is opened");
            Assert.assertEquals("URLs are not equal", "http://comments.azurewebsites.net/Editor/NewComment", elementSearcher.getCurrentURL());

            System.out.println("Enter valid data to Commment Text field");
            Assert.assertEquals("URLs are not equal", "http://comments.azurewebsites.net/Editor/NewComment", elementSearcher.getCurrentURL());
        }


        @Test
        public void checkNewButtonLinkTest() {
            System.out.println("Open http://comments.azurewebsites.net/Editor/NewComment URL");
            elementSearcher.goToURL("http://comments.azurewebsites.net/Editor/NewComment");


            System.out.println("Enter valid data to Comment Text");
            elementSearcher.findCommentTextField


            System.out.println("Click > button");


            System.out.println("Click Save button");


            Assert.assertEquals("URLs are not equal", "http://comments.azurewebsites.net/Editor/NewComment", elementSearcher.getCurrentURL());
        }









        }


        @Test
        public void testNewPageNavigationTest () {
            elementSearcher.goToURL("http://comments.azurewebsites.net/");
            WebElement buttonNew = elementSearcher.findButtonNew();
            buttonNew.click();
            String currentURL = elementSearcher.getCurrentURL();
            Assert.assertEquals("expected url", currentURL);
        }
//
//    @Test
//    public void findDuplicateCommentElement() {
//    }
//
//    @Test
//    public void findEditCommentElement() {
//    }
//
//    @Test
//    public void findDeleteCommentElement() {
//    }
    }

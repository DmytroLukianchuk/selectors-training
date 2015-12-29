package com.lukianchuk.selectors;

import com.lukianchuk.selectors.webelements.CssSelectorsElementSearcher;
import com.lukianchuk.selectors.webelements.ElementSearcher;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

public class TestUITests {

    public static final String URL = "http://comments.azurewebsites.net/";
    public static final String COMMENT_NUMBER = "111";
    // To change the selectors type from XPath to CSS just uncomment the string beneath and comment second one
    ElementSearcher elementSearcher = new CssSelectorsElementSearcher();
//    ElementSearcher elementSearcher = new XPathSelectorsElementSearcher();

    @After
    public void tearDown() throws Exception {
        elementSearcher.closePage();

    }


// ADDING NEW COMMENT TESTS

        @Test
        public void checkNewButtonLinkTest () {
            System.out.println("Open http://comments.azurewebsites.net/ URL");
            elementSearcher.goToURL(URL);

            System.out.println("Click on New... button");
            elementSearcher.findButtonNew().click();

            System.out.println("Check that correct Page / URL is opened");
            Assert.assertEquals("URLs are not equal", "http://comments.azurewebsites.net/Editor/NewComment",
                    elementSearcher.getCurrentURL());
            System.out.println("Enter valid data to Comment Text field");
            Assert.assertEquals("URLs are not equal", "http://comments.azurewebsites.net/Editor/NewComment",
                    elementSearcher.getCurrentURL());
        }


        @Test
        public void checkNewCommentAddedTest () {
            System.out.println("Open http://comments.azurewebsites.net/Editor/NewComment URL");
            elementSearcher.goToURL("http://comments.azurewebsites.net/Editor/NewComment");

            System.out.println("Enter valid data to Comment Text");
            elementSearcher.findCommentTextField().sendKeys("01 First Comment");

            System.out.println("Check Cat3");
            elementSearcher.findCatCheckBox().click();

            System.out.println("Clcik > move checked Cat");
            elementSearcher.findMoveToRightButton().click();

            System.out.println("Click Save & Return button");
            elementSearcher.findSaveAndReturnButton().click();

            System.out.println("Checking URL of main page");
            Assert.assertEquals("URL is not main", URL,
                    elementSearcher.getCurrentURL());

            System.out.println("Find added Comment");
            System.out.println("Found comment is: " + elementSearcher.checkCommentPresent());
            Assert.assertEquals("Added Comment is not present on the main Page", "01 First Comment",
                    elementSearcher.checkCommentPresent());
        }

        @Test
        public void checkRequiredFieldsErrorsTest () {
            System.out.println("Open http://comments.azurewebsites.net/Editor/NewComment URL");
            elementSearcher.goToURL("http://comments.azurewebsites.net/Editor/NewComment");

            System.out.println("Click on Save button without entering any required data");
            elementSearcher.findSaveAndReturnButton().click();

            System.out.println("Check violation error");
            Assert.assertEquals("Error string in not present / correct", "The Comment Text field is required.",
                    elementSearcher.findCommentTextIsRequiredText());

        }

        @Test
        public void checkDuplicateDialogForNonChosenCatTest () {
            System.out.println("Open http://comments.azurewebsites.net/");
            elementSearcher.goToURL(URL);

            System.out.println("Click on Duplicate... button without checking any group check-box");
            elementSearcher.findDuplicateButton().click();

            System.out.println("Check that alert appears");
            elementSearcher.checkDuplicateModalAppeared();
        }

        @Test
        public void checkDuplicateComment () throws InterruptedException {
            System.out.println("Open http://comments.azurewebsites.net/");
            elementSearcher.goToURL(URL);

            System.out.println("Check First Comment check-box and check");
            elementSearcher.findFirstCommentCheckBox().click();

            System.out.println("Store first Comment value");
            String firstCommentValue = elementSearcher.checkCommentPresent().toString();

            System.out.println("Click on Duplicate... button");
            elementSearcher.findDuplicateButton().click();

            Thread.sleep(1000);
            System.out.println("Check Comment Text is Copy of + firstCommentValue");
            String actualCommentValue = elementSearcher.findCommentTextField().getAttribute("value");

            System.out.println("Check Comment Text has Copy of + Comment");
            Assert.assertEquals("Duplicate Comment is not correct", "Copy of" + firstCommentValue, actualCommentValue);

            System.out.println("Click Save & Return button");
            elementSearcher.findSaveAndReturnButton().click();

            System.out.println("Check number not unique error");
            Assert.assertEquals("Error string in not present / correct", "The Number field should contain value " +
                    "from 0 to 999 and should be unique", elementSearcher.checkErrorNumberFieldNotUnique());

            System.out.println("Clearing the Number field");
            elementSearcher.findNumberField().clear();

            System.out.println("Change number field value to " + COMMENT_NUMBER);
            elementSearcher.findNumberField().sendKeys(COMMENT_NUMBER);

            System.out.println("Click Save & Return button");
            elementSearcher.findSaveAndReturnButton().click();

            System.out.println("Find added Number within All Pages");
            for (int pageNumber = 1; pageNumber <= 4; pageNumber++) {
                if (elementSearcher.checkCommentIsPresentOnPageNumber(COMMENT_NUMBER, pageNumber)) {
                    System.out.println("Comment is found on " + pageNumber + " Page");
                } else {
                    System.out.println("No comment on the " + pageNumber + " Page. Let's find Comment on the next page");
                }

            }




        }
    }

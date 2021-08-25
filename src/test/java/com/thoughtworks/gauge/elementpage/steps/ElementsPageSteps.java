package com.thoughtworks.gauge.elementpage.steps;

import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.elementpage.actions.ElementsPageActions;
import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import selectors.elementpage.ElementsPage;

public class ElementsPageSteps {

    ElementsPageActions elementsPageActions = new ElementsPageActions();
    ElementsPage elementsPage = new ElementsPage();

    @Step("Click on text box")
    public void clickOnTextBox() throws Exception {
        elementsPageActions.clickOnTextBox();
        elementsPageActions.assertPageElements();
    }


    @Step("Click on <string>")
    public void clickOnTextBox(String value) throws InterruptedException {
        elementsPageActions.select(value);
    }


    @Step("Click On check box")
    public void clickOnCheckBox() {
        elementsPageActions.clickOnCheckBox();
    }

    @Step("Click on radio box")
    public void clickOnRadioBox() {
        elementsPageActions.clickOnRadioBox();
    }

    @Step("See elements on the radio box page")
    public void seeElementsOnRadioBoxPage() {
        elementsPageActions.seeElementsRadioButtonPage();
    }

    @Step("Click on check mark")
    public void clickOnCheckMark() {
        elementsPageActions.clickOnCheckField();
    }

    @Step("Fill name formular with <string>")
    public void implementation1(String name) throws InterruptedException {
        elementsPageActions.inputTextToFullName(name);
    }

    @Step("Clear Text")
    public void clearText() {
        elementsPageActions.clearText(elementsPage.fullName);
    }

    @Step("Submit")
    public void submit() {
        elementsPageActions.submitForm();
    }

    @Step("Output is present")
    public void outPutIsPresent() {
        Driver.webDriver.findElement(By.xpath("//*[@id=\"output\"]/div")).isDisplayed();
    }

    @Step("Select Radio Button")
    public void implementation2() {
        elementsPageActions.clickOnRadioOption();
    }
}

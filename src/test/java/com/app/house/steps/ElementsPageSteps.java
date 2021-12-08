package com.app.house.steps;

import com.app.house.actions.ElementsPageActions;
import com.thoughtworks.gauge.Step;
import org.springframework.beans.factory.annotation.Autowired;

public class ElementsPageSteps {

    @Autowired
    private ElementsPageActions elementsPageActions;

    @Step("Click on text box")
    public void clickOnTextBox() throws Exception {
        elementsPageActions.clickOnTextBox();
        elementsPageActions.assertPageElements();
    }


    @Step("Click on <string>")
    public void clickOnTextBox(String value) throws InterruptedException {
//        elementsPageActions.select(value);
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

//    @Step("Clear Text")
//    public void clearText() {
//        elementsPageActions.clearText(elementsPage.fullName);
//    }

    @Step("Submit")
    public void submit() {
        elementsPageActions.submitForm();
    }

    @Step("Output is present")
    public void outPutIsPresent() {
//        Driver.webDriver.findElement(By.xpath("//*[@id=\"output\"]/div")).isDisplayed();
    }

    @Step("Select Radio Button")
    public void implementation2() {
        elementsPageActions.clickOnRadioOption();
    }
}

package com.app.house.actions;

import com.app.house.config.Utilities;
import com.app.house.config.enums.PlaceHolders;
import com.app.house.config.Base;
import com.app.house.page.elementpage.ElementsPage;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@Component
public class ElementsPageActions extends Base implements Utilities {

    @Autowired
    private ElementsPage elementsPage;

    public void clickOnTextBox() {
        elementsPage.textBox.click();
    }

    public void clickOnCheckBox() {
        elementsPage.checkBox.click();
    }

    public void clickOnRadioBox() {
        elementsPage.radioBox.click();
    }

    public void clickOnCheckField() {

//        WebElement checkbox = Driver.webDriver.findElement(By.className("rct-title"));
//        boolean isSelected = elementsPage.checkField.isSelected();
//        if (!isSelected) {
//            checkbox.click();
//        }
//        assertThat(checkbox.isEnabled()).isTrue();
    }


    public void assertPageElements() throws Exception {
        for (WebElement element : elementsPages()
        ) {
            element.isDisplayed();
//            assertThat(element.getAttribute("placeholder")).isNotBlank();
        }
    }

    public void inputTextToFullName(String fullName) throws InterruptedException {
        assertThat(elementsPage.fullName.getAttribute("placeholder")).isNotBlank().isEqualTo(PlaceHolders.FULL_NAME.getIdentifier());
        elementsPage.fullName.sendKeys(fullName);
//        assertThat(elementsPage.outPutAAfterSubmit.isDisplayed()).isFalse();

        //ToDo:After you send the keys assert that the value sent is equal with the value of the field
//        String getString = elementsPage.fullName.getText();
//        assertThat(getString).isEqualTo(fullName);
    }


    public void inputTextToEmail(String email) {
        elementsPage.fullName.sendKeys(email);
        String getString = elementsPage.fullName.getText();
        assertThat(getString).isEqualTo(email);
    }

    public void inputTextToCurrentAddress(String address) {
        elementsPage.fullName.sendKeys(address);
        String getString = elementsPage.fullName.getText();
        assertThat(getString).isEqualTo(address);
    }


    //ToDo: ReFactor Solution
    public void demoMethod(String placeholder, WebElement webElement, PlaceHolders placeHolders) {
        assertThat(webElement.getAttribute("placeholder")).isNotBlank().isEqualTo(placeHolders.getIdentifier());
        webElement.sendKeys(placeholder);
        String getString = webElement.getText();
        assertThat(getString).isEqualTo(placeholder);
    }

    @Override
    public void clearText(WebElement webElement) {
        webElement.clear();
    }


    public void submitForm() {
        elementsPage.submit.click();
    }

    private ArrayList<WebElement> elementsPages() {
        ArrayList<WebElement> elementsPages = new ArrayList<>();
        elementsPages.add(elementsPage.fullName);
        elementsPages.add(elementsPage.email);
        elementsPages.add(elementsPage.currentAddress);
        elementsPages.add(elementsPage.permanentAddress);
        elementsPages.add(elementsPage.submit);
        return elementsPages;
    }

    private ArrayList<WebElement> radioPageElements() {
        ArrayList<WebElement> elementPage = new ArrayList<>();

        elementPage.add(elementsPage.yesRadio);
        elementPage.add(elementsPage.impressiveRadio);
        elementPage.add(elementsPage.noRadio);
        return elementPage;
    }

    public void seeElementsRadioButtonPage() {

        for (WebElement element :
                radioPageElements()) {
            element.isDisplayed();
//            assertThat(element.isDisplayed()).isTrue();
            assertThat(element.isSelected()).isFalse();
        }
    }

    public void clickOnRadioOption() {
        radioPageElements().get(0).click();
    }

    @Override
    public boolean isAt() {
        return false;
    }
}


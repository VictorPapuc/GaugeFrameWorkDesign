package com.thoughtworks.gauge.mainpage.actions;

import org.openqa.selenium.WebElement;
import selectors.mainpage.ElementsPage;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class ElementsPageActions {
    ElementsPage elementsPage = new ElementsPage();

    public void clickOnTextBox() throws InterruptedException {
        elementsPage.textBox.click();
    }


    public void assertPageElements() throws Exception {
        ArrayList<WebElement> elementsPages = new ArrayList<>();
        elementsPages.add(elementsPage.fullName);
        elementsPages.add(elementsPage.email);
        elementsPages.add(elementsPage.currentAddress);
        elementsPages.add(elementsPage.permanentAddress);

        for (WebElement element : elementsPages
        ) {
            element.isDisplayed();
//            assertThat(element.getAttribute("placeholder")).isNotBlank();
        }
    }
}

package com.thoughtworks.gauge.mainpage.steps;

import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.mainpage.actions.ElementsPageActions;

public class ElementsPageSteps {

    ElementsPageActions elementsPageActions = new ElementsPageActions();

    @Step("Click on text box")
    public void clickOnTextBox() throws Exception {
        elementsPageActions.clickOnTextBox();
        elementsPageActions.assertPageElements();
    }
}

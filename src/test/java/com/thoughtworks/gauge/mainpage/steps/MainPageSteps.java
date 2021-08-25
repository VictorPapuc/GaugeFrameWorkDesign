package com.thoughtworks.gauge.mainpage.steps;

import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.mainpage.actions.MainPageActions;

public class MainPageSteps {

    private final MainPageActions mainPageElements = new MainPageActions();

    @Step("Enter elements page")
    public void gotoGetStartedPage() throws Exception {
        mainPageElements.clickOnElements();
    }

    @Step("Enter Checkbox page")
    public void goToCheckBox() throws Exception {
        mainPageElements.clickOnElements();
    }

    @Step("Open the DemoQa homepage")
    public void implementation1() {
        mainPageElements.enterMainPge();
        mainPageElements.verifyMainPage();
    }
}

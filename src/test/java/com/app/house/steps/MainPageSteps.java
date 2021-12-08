package com.app.house.steps;

import com.app.house.actions.MainPageActions;
import com.thoughtworks.gauge.Step;
import org.springframework.beans.factory.annotation.Autowired;

public class MainPageSteps {

    @Autowired
    private MainPageActions mainPageActions;

    @Step("Enter elements page")
    public void gotoGetStartedPage() throws Exception {
        mainPageActions.clickOnElements();
    }

    @Step("Enter Checkbox page")
    public void goToCheckBox() throws Exception {
        mainPageActions.clickOnElements();
    }

    @Step("Open the DemoQa homepage")
    public void implementation1() {
        mainPageActions.enterMainPge();
        mainPageActions.verifyMainPage();
    }
}

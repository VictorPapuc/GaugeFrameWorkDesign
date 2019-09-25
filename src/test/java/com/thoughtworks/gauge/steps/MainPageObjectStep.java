package com.thoughtworks.gauge.steps;

import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.action.pages.MainPageObjectAction;
import driver.Driver;
import driver.PageFactoryInitialization;
import lombok.RequiredArgsConstructor;

import java.util.concurrent.TimeUnit;

@RequiredArgsConstructor
public class MainPageObjectStep {

    public MainPageObjectAction mainPageObjectAction;

    @Step("Enter page")
    public void doAction() {
        Driver.webDriver.get("https://staging1.ogrcrew.com");
        Driver.webDriver.manage().window().fullscreen();
        Driver.webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        mainPageObjectAction.menuMainNavigation.click();

        mainPageObjectAction.acceptCookies.click();

        mainPageObjectAction.menuMainNavigation.click();
    }
}

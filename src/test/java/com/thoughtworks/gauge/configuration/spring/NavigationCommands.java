package com.thoughtworks.gauge.configuration.spring;

import com.thoughtworks.gauge.Step;
import driver.Driver;

public class NavigationCommands {

    @Step("Go back")
    public void goBack() {
        Driver.webDriver.navigate().back();
    }

    @Step("Go back")
    public void goForward() {
        Driver.webDriver.navigate().back();
    }

    @Step("Refresh Page")
    public void refresh() {
        Driver.webDriver.navigate().refresh();
    }
}

package com.thoughtworks.gauge.steps;

import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.action.pages.MainPageObjectAction;
import driver.Driver;
import driver.PageFactoryInitialization;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

@AllArgsConstructor
public class MainPageObjectStep {

    private static final PageFactoryInitialization pageFactoryInitialization = new PageFactoryInitialization(MainPageObjectAction.class);

    @Step("Enter page")
    public void doAction() {
        Driver.webDriver.get("https://staging1.ogrcrew.com");
        Driver.webDriver.manage().window().fullscreen();
        Driver.webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//        PageFactoryInitialization pageFactoryInitialization = new PageFactoryInitialization();


        pageFactoryInitialization.mainPageObjectAction.menuMainNavigation.click();

//        mainPageObjectAction.menuMainNavigation.click();
//
//        mainPageObjectAction.acceptCookies.click();
//
//        mainPageObjectAction.menuMainNavigation.click();
    }
}

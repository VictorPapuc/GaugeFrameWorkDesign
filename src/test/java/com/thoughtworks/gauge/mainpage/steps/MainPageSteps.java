package com.thoughtworks.gauge.mainpage.steps;

import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.mainpage.actions.MainPageActions;
import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.assertj.core.api.Assertions.assertThat;

public class MainPageSteps {

    private final MainPageActions mainPageElements = new MainPageActions();

    @Step("Enter elements page")
    public void gotoGetStartedPage() throws Exception {
        mainPageElements.clickOnElements();
    }

    @Step("Ensure installation instructions are available")
    public void ensureInstallationInstructionsAreAvailable() throws InterruptedException {
        WebElement instructions = Driver.webDriver.findElement(By.xpath("//a[@href='/getting-started-guide/quick-install']"));
        assertThat(instructions).isNotNull();
    }

    @Step("Open the DemoQa homepage")
    public void implementation1() {

        mainPageElements.enterMainPge();
        mainPageElements.verifyMainPage();
    }
}

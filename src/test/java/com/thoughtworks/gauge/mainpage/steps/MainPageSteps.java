package com.thoughtworks.gauge.mainpage.steps;

import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.mainpage.actions.MainPageActions;
import driver.Driver;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import selectors.mainpage.MainPageElements;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class MainPageSteps {

    private final MainPageActions mainPageElements = new MainPageActions();

    @Step("Go to Gauge Get Started Page")
    public void gotoGetStartedPage() throws InterruptedException {

        mainPageElements.verifyMainPage();
//        WebElement menuMainNavigation = Driver.webDriver.findElement(mainPageObjectAction.menuMainNavigation);


//        WebElement getStartedButton = Driver.webDriver.findElement(By.xpath("//a[@href='/getting-started-guide/we-start']"));
//        getStartedButton.click();
//
//        Gauge.writeMessage("Page title is %s", Driver.webDriver.getTitle());
    }

    @Step("Ensure installation instructions are available")
    public void ensureInstallationInstructionsAreAvailable() throws InterruptedException {
        WebElement instructions = Driver.webDriver.findElement(By.xpath("//a[@href='/getting-started-guide/quick-install']"));
        assertThat(instructions).isNotNull();
    }

    @Step("Open the DemoQa homepage")
    public void implementation1() {
        String app_url = System.getenv("APP_URL");
        Driver.webDriver.get(app_url + "/");
        assertThat(Driver.webDriver.getTitle()).contains("ToolsQA");
    }
}

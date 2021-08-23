package com.thoughtworks.gauge.steps;

import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.action.pages.MainPageObjectAction;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class StepImplementation {


    private final MainPageObjectAction mainPageElements = new MainPageObjectAction();


    @Step("Go to Gauge Get Started Page")
    public void gotoGetStartedPage() throws InterruptedException {

//        WebElement menuMainNavigation = Driver.webDriver.findElement(mainPageObjectAction.menuMainNavigation);

        WebElement homeContent = Driver.webDriver.findElement(By.className("home-content"));
        WebElement homeBody = Driver.webDriver.findElement(By.className("home-body"));

        ArrayList<WebElement> listOfElementsPresentInPage = new ArrayList<>();
        listOfElementsPresentInPage.add(mainPageElements.menuMainNavigationDemo);
        listOfElementsPresentInPage.add(homeContent);
        listOfElementsPresentInPage.add(homeBody);

        for (WebElement webElement : listOfElementsPresentInPage) {
            webElement.isDisplayed();
        }

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

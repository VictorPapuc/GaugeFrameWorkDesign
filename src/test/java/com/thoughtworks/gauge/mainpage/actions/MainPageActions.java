package com.thoughtworks.gauge.mainpage.actions;

import driver.Driver;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import selectors.mainpage.MainPageElements;

import java.time.Duration;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.assertThat;

public class MainPageActions {


    private final MainPageElements mainPageElements = new MainPageElements();
    private final String app_url = System.getenv("APP_URL");
    WebDriverWait wait = new WebDriverWait(Driver.webDriver, 200);

//    Wait waita = new FluentWait(Driver.webDriver).pollingEvery(Duration.ZERO);
//

    public void verifyMainPage() {
        ArrayList<WebElement> listOfElementsPresentInPage = new ArrayList<>();
        listOfElementsPresentInPage.add(mainPageElements.menuMainNavigationDemo);
        listOfElementsPresentInPage.add(mainPageElements.homeContent);
        listOfElementsPresentInPage.add(mainPageElements.homeBody);

        for (WebElement webElement : listOfElementsPresentInPage) {
            webElement.isDisplayed();
        }
    }

    public void enterMainPge() {
        Driver.webDriver.get(app_url + "/");
        Driver.webDriver.manage()
                .timeouts()
                .implicitlyWait(2000L, TimeUnit.NANOSECONDS);

        Driver.webDriver.manage()
                .window().maximize();

        assertThat(Driver.webDriver.getTitle()).contains("ToolsQA");
    }

    public void clickOnElements() throws Exception {

        wait.until(ExpectedConditions.elementToBeClickable(mainPageElements.elementsTab));

        boolean elementInPage = mainPageElements.elementsTab.isDisplayed();

        if (elementInPage) {
            mainPageElements.elementsTab.click();
        } else {
            throw new Exception("Element is not on the page");
        }

    }
}

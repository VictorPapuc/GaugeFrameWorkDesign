package com.thoughtworks.gauge.mainpage.actions;

import com.thoughtworks.gauge.configuration.actions.UrlConfiguration;
import driver.Driver;
import org.openqa.selenium.WebElement;
import selectors.mainpage.MainPageElements;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class MainPageActions {

    private final MainPageElements mainPageElements = new MainPageElements();
    private String app_url = System.getenv("APP_URL");

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
        Driver.webDriver.manage().window().maximize();
        assertThat(Driver.webDriver.getTitle()).contains("ToolsQA");
    }

    public void clickOnElements() throws Exception {
        boolean elementInPage = mainPageElements.elementsTab.isDisplayed();

        if (elementInPage) {
            mainPageElements.elementsTab.click();
        } else {
            throw new Exception("Element is not on the page");
        }

        String currentUrl = Driver.webDriver.getCurrentUrl();
        assertThat(currentUrl).isEqualTo(app_url + UrlConfiguration.ELEMENTS.getURL());
    }
}

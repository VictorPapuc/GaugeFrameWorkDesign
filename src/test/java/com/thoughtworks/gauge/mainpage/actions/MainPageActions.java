package com.thoughtworks.gauge.mainpage.actions;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import selectors.mainpage.MainPageElements;

import java.util.ArrayList;

public class MainPageActions {

    private final MainPageElements mainPageElements = new MainPageElements();

    public void verifyMainPage() {
        WebElement homeContent = Driver.webDriver.findElement(By.className("home-content"));
        WebElement homeBody = Driver.webDriver.findElement(By.className("home-body"));

        ArrayList<WebElement> listOfElementsPresentInPage = new ArrayList<>();
        listOfElementsPresentInPage.add(mainPageElements.menuMainNavigationDemo);
        listOfElementsPresentInPage.add(homeContent);
        listOfElementsPresentInPage.add(homeBody);

        for (WebElement webElement : listOfElementsPresentInPage) {
            webElement.isDisplayed();
        }
    }
}

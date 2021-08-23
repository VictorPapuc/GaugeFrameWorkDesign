package com.thoughtworks.gauge.action.pages;

import driver.Driver;
import lombok.RequiredArgsConstructor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MainPageObjectAction {

    //TODO: https://www.guru99.com/page-object-model-pom-page-factory-in-selenium-ultimate-guide.html - page object model Selenium

    public By menuMainNavigation = By.id("fixedban");

    @FindBy(id = "fixedban")
    public WebElement menuMainNavigationDemo;

    @FindBy(id = "onesignal-popover-allow-button")
    public WebElement popUpButtonApprove;

    @FindBy(id = "onesignal-popover-cancel-button")
    public WebElement popUpButtonCancel;

    @FindBy(xpath = "//*[@id=\"cookie_action_close_header\"]")
    public WebElement acceptCookies;

    public MainPageObjectAction() {
        PageFactory.initElements(Driver.webDriver, this);
    }
}

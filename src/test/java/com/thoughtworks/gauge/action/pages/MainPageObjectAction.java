package com.thoughtworks.gauge.action.pages;

import lombok.RequiredArgsConstructor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@RequiredArgsConstructor
public class MainPageObjectAction {

    //TODO: https://www.guru99.com/page-object-model-pom-page-factory-in-selenium-ultimate-guide.html - page object model Selenium

    private WebDriver webDriver;

    @FindBy(xpath = "//*[@id=\"menu-main-navigation\"]/li[2]/a/span")
    public WebElement menuMainNavigation;

    @FindBy(id = "onesignal-popover-allow-button")
    public WebElement popUpButtonApprove;

    @FindBy(id = "onesignal-popover-cancel-button")
    public WebElement popUpButtonCancel;

    @FindBy(xpath = "//*[@id=\"cookie_action_close_header\"]")
    public WebElement acceptCookies;

}

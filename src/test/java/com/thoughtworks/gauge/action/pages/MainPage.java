package com.thoughtworks.gauge.action.pages;

import driver.Driver;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

@AllArgsConstructor
@Slf4j
public class MainPage {

    private final WebElement webElement;

    public void verifyTitle() {

        Driver.webDriver.findElement(By.xpath(""));
        log.info("sss");
    }

    public void clickOnHomePage() {

    }

    public void verifyRefreshOnHomePage() {

    }

    public void verifyTheScrollFunctionality() {

    }


    public void verifyTheLink() {

    }

}

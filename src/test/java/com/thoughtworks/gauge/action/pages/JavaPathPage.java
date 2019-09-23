package com.thoughtworks.gauge.action.pages;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class JavaPathPage extends PathPages {


    @FindBy(how = How.CSS, using = "sss")
    WebElement pageElement;

    @Override
    public void goTo() {
        Driver.webDriver.findElement(By.cssSelector("sss")).click();
    }

    @Override
    public String pathName() {
        return pageElement.getText();
    }

}

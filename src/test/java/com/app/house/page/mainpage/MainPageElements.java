package com.app.house.page.mainpage;

import com.app.house.config.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

@Component
public class MainPageElements extends Base {

    @FindBy(id = "fixedban")
    public WebElement menuMainNavigationDemo;

    @FindBy(className = "home-content")
    public WebElement homeContent;

    @FindBy(className = "home-body")
    public WebElement homeBody;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div/div[1]")
    public WebElement elementsTab;

    @Override
    public boolean isAt() {
        return this.webDriverWait.until((driveInstance) -> this.menuMainNavigationDemo.isDisplayed());
    }
}

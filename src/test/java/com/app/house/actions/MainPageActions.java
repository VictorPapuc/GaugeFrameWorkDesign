package com.app.house.actions;

import com.app.house.config.Base;
import com.app.house.page.mainpage.MainPageElements;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.assertThat;

@Component
public class MainPageActions extends Base {

    @Autowired
    private MainPageElements mainPageElements;

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
        driver.get("https://demoqa.com/");
        driver.manage()
                .timeouts()
                .implicitlyWait(2000L, TimeUnit.NANOSECONDS);

        driver.manage()
                .window().maximize();

        assertThat(driver.getTitle()).contains("ToolsQA");
    }

    public void clickOnElements() throws Exception {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(mainPageElements.elementsTab));

        boolean elementInPage = mainPageElements.elementsTab.isDisplayed();

        if (elementInPage) {
            mainPageElements.elementsTab.click();
        } else {
            throw new Exception("Element is not on the page");
        }

    }

    @Override
    public boolean isAt() {
        return false;
    }
}

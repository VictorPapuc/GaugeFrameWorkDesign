package com.thoughtworks.gauge.configuration.actions;

import com.thoughtworks.gauge.action.pages.MainPage;
import org.openqa.selenium.WebElement;
import org.springframework.context.annotation.Bean;

public class MainPageConfiguration {

    @Bean
    public MainPage mainPage(WebElement webElement) {
        return new MainPage(webElement);
    }

}
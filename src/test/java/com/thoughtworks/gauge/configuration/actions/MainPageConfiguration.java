package com.thoughtworks.gauge.configuration.actions;

import org.openqa.selenium.WebElement;
import org.springframework.context.annotation.Bean;

public class MainPageConfiguration {

    //ToDo: Add Bean configuration to FrameWork

    @Bean
    public MainPage mainPage(WebElement webElement) {
        return new MainPage(webElement);
    }

}

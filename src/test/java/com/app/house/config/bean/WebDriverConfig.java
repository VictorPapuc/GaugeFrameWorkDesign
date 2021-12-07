package com.app.house.config.bean;

import com.app.house.steps.MainPageSteps;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebDriverConfig {

    @Bean
    public WebDriver chromeDriver() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

    @Bean
    public WebDriverWait driverWait(WebDriver driver) {
        return new WebDriverWait(driver, 20);
    }

    @Bean
    public MainPageSteps mainPageSteps() {
        return new MainPageSteps();
    }

}

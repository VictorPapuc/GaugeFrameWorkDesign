package com.thoughtworks.gauge;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ModelOfPageObjectFindby {

    public WebDriver webDriver;

    @FindBy(xpath = "//*[@id=\"menu-3080-particle\"]/nav/ul/li[1]/a/span/span")
    private WebElement user99GuruName;


    public void driverInit(WebDriver drivers){
        WebDriver driver = new ChromeDriver();
        ModelOfPageObjectFindby modelOfPageObjectFindby = new ModelOfPageObjectFindby(driver);
        modelOfPageObjectFindby.getUrl();
    }

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        ModelOfPageObjectFindby modelOfPageObjectFindby = new ModelOfPageObjectFindby(driver);
        modelOfPageObjectFindby.getUrl();
    }

    public ModelOfPageObjectFindby(){

    }

    public ModelOfPageObjectFindby(WebDriver driver) {
        this.webDriver = driver;
        PageFactory.initElements(driver, this);
    }

    public void getUrl() {
        webDriver.get("https://www.guru99.com/page-object-model-pom-page-factory-in-selenium-ultimate-guide.html");
        user99GuruName.click();
    }

}

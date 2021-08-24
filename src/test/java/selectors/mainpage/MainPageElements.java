package selectors.mainpage;

import driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPageElements {

    @FindBy(id = "fixedban")
    public WebElement menuMainNavigationDemo;

    @FindBy(className = "home-content")
    public WebElement homeContent;

    @FindBy(className = "home-body")
    public WebElement homeBody;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div/div[1]")
    public WebElement elementsTab;

    public MainPageElements() {
        PageFactory.initElements(Driver.webDriver, this);
    }
}

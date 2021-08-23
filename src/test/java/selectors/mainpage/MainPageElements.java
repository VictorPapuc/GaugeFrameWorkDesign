package selectors.mainpage;

import driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPageElements {

    @FindBy(id = "fixedban")
    public WebElement menuMainNavigationDemo;

    public MainPageElements() {
        PageFactory.initElements(Driver.webDriver, this);
    }
}

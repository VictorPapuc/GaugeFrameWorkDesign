package selectors.mainpage;

import driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElementsPage {

    @FindBy(id = "item-0")
    public WebElement textBox;

    @FindBy(id = "userName")
    public WebElement fullName;

    @FindBy(id = "userEmail")
    public WebElement email;

    @FindBy(id = "currentAddress-label")
    public WebElement currentAddress;

    @FindBy(id = "permanentAddress")
    public WebElement permanentAddress;

    public ElementsPage() {
        PageFactory.initElements(Driver.webDriver, this);
    }

}

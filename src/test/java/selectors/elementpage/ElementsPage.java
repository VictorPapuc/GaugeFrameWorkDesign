package selectors.elementpage;

import driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElementsPage {

    @FindBy(id = "item-0")
    public WebElement textBox;

    @FindBy(id = "item-1")
    public WebElement checkBox;

    @FindBy(id = "item-2")
    public WebElement radioBox;

    @FindBy(id = "tree-node-home")
    public WebElement checkField;

    @FindBy(id = "userName")
    public WebElement fullName;

    @FindBy(id = "userEmail")
    public WebElement email;

    @FindBy(id = "currentAddress-label")
    public WebElement currentAddress;

    @FindBy(id = "permanentAddress")
    public WebElement permanentAddress;

    @FindBy(id = "submit")
    public WebElement submit;


    @FindBy(id = "yesRadio")
    public WebElement yesRadio;
    @FindBy(id = "impressiveRadio")
    public WebElement impressiveRadio;
    @FindBy(id = "noRadio")
    public WebElement noRadio;

    public ElementsPage() {
        PageFactory.initElements(Driver.webDriver, this);
    }

}

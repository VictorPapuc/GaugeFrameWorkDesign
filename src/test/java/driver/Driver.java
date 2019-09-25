package driver;

import com.thoughtworks.gauge.AfterSuite;
import com.thoughtworks.gauge.BeforeSuite;
import com.thoughtworks.gauge.action.pages.MainPageObjectAction;
import org.openqa.selenium.WebDriver;

public class Driver {

    // Holds the WebDriver instance
    public static WebDriver webDriver;

    public MainPageObjectAction mainPageObjectAction;


    // Initialize a webDriver instance of required browser
    // Since this does not have a significance in the application's business domain, the BeforeSuite hook is used to instantiate the webDriver
    @BeforeSuite
    public void initializeDriver() {
        webDriver = DriverFactory.getDriver();
    }

    //     Close the webDriver instance
    @AfterSuite
    public void closeDriver() {
        webDriver.quit();
    }

//    @BeforeSuite
//    public void beforeTest() {
//        mainPageObjectAction = PageFactory.initElements(Driver.webDriver, MainPageObjectAction.class);
//    }


}

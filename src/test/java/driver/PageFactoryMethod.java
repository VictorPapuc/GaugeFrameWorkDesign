package driver;

import com.thoughtworks.gauge.action.pages.MainPageObjectAction;
import org.openqa.selenium.support.PageFactory;

public enum PageFactoryMethod {

    MainPageObject("Page Object", MainPageObjectAction.class);

    private Class aClass;

    PageFactoryMethod(String description, Class aClass) {
        this.aClass = aClass;
    }

}

package driver;

import com.thoughtworks.gauge.action.pages.MainPage;
import com.thoughtworks.gauge.action.pages.MainPageObjectAction;
import org.apache.log4j.chainsaw.Main;
import org.aspectj.lang.annotation.Before;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryInitialization {

    public MainPageObjectAction mainPageObjectAction = PageFactory.initElements(Driver.webDriver, MainPageObjectAction.class);


    public MainPageObjectAction mainPageObjectAction1;

//    @Before
//    public void beforeTest() {
//        login = PageFactory.initElements(driver, LoginPage.class );
//    }

//   public void initElements() {
//       MainPageObjectAction mainPageObjectAction = PageFactory.initElements(Driver.webDriver, MainPageObjectAction.class);
//   }

//       List<Class> init = new ArrayList<>();
//       init.add(MainPageObjectAction.class);
//
//       PageFactory.initElements(Driver.webDriver, init);


//
//    @Override
//    public <T> MainPageObjectAction getPage(Class<T> page) {
//        return PageFactory.initElements(Driver.webDriver, MainPageObjectAction.class);
//    }
//
//    public static <T> T getPage1(Class<T> page) {
//        return PageFactory.initElements(Driver.webDriver, page);
//    }
}

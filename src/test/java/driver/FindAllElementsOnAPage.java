package driver;

import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class FindAllElementsOnAPage {

    @Step("Driver something to url")
    public void findElementsInAPage() {
        Driver.webDriver.get("http://google.com");

        WebElement findElementByName = Driver.webDriver.findElement(By.xpath("//*[@id]"));
        List<WebElement> list = new ArrayList<>();
        list.add(findElementByName);

        for (WebElement el : list) {
            printElement(el.getAttribute("id"));
        }


        List<WebElement> webElements = Driver.webDriver.findElements(By.xpath("//*[@id]"));

        for (WebElement s : webElements
        ) {

            System.out.println(s.getAttribute("id"));
        }

    }

    public void printElement(String r) {
        System.out.println(r);

    }

}

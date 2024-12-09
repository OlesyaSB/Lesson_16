import org.openqa.selenium.WebDriver;

import static org.openqa.selenium.support.PageFactory.initElements;

abstract public class FirstClass {
    protected static WebDriver driver;

    public static void setDriver(WebDriver webDriver) {

        driver = webDriver;
    }




}

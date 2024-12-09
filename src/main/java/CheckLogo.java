import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.openqa.selenium.support.PageFactory.initElements;

public class CheckLogo extends FirstClass {

    @FindBy(xpath = "//div[@class='pay__partners']")
    private WebElement logo;


    public void CheckLogos() {
        List<WebElement> logos = driver.findElements(By.xpath("//div[@class='pay__partners']"));
        assertTrue(!logos.isEmpty(), "Логотипы платежных систем отсутсвуют");
    }
    public CheckLogo() {
        driver.get("http://mts.by/");
        initElements(driver, this);
    }
}

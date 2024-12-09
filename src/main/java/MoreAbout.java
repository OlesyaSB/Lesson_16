import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.openqa.selenium.support.PageFactory.initElements;

public class MoreAbout extends FirstClass {

    @FindBy(xpath = "//*[@id='pay-section']/div/div/div[2]/section/div/a")
    private WebElement moreAboutLink;

    public MoreAbout() {
        driver.get("http://mts.by/");
        initElements(driver, this);
    }

    public MoreAbout checkUrl() {
        moreAboutLink.click();
        String expectedUrl = "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/";
        String actualUrl = driver.getCurrentUrl();
        assertEquals(actualUrl, expectedUrl);
        return null;
    }


}

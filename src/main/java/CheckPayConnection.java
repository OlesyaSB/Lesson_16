import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.openqa.selenium.support.PageFactory.initElements;

public class CheckPayConnection extends FirstClass {
    @FindBy(xpath = "//*[@id='cookie-agree']")
    private WebElement cookiButtom;
    @FindBy(xpath = "//*[@id='pay-section']/div/div/div[2]/section/div/div[1]/div[1]")
    private WebElement paySectionList;
    @FindBy(xpath = "//*[@id='pay-section']/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[1]/p")
    private WebElement payConnection;
    @FindBy(xpath = "//input[@class='phone'][@id='connection-phone']")
    private WebElement payConnectionPlaceH;

    @FindBy(xpath = "//input[@id='connection-sum'][@placeholder='Сумма']")
    private WebElement placeholderPayConnectionSum;

    @FindBy(xpath = "//*[@id='connection-email']")
    private WebElement placeholderPayNetMail;


    public CheckPayConnection checkPayConnectionTel() {
        paySectionList.click();
        payConnection.click();
        String expectedName1 = "Номер телефона";
        String actualName1 = payConnectionPlaceH.getAttribute("placeholder");
        assertEquals(expectedName1, actualName1);
        return null;
    }

    public CheckPayConnection checkPayConnectionSum() {
        paySectionList.click();
        payConnection.click();
        String expectedName2 = "Сумма";
        String actualName2 = placeholderPayConnectionSum.getAttribute("placeholder");
        assertEquals(expectedName2, actualName2);

        return null;
    }

    public CheckPayConnection checkPayConnectionMail() {
        paySectionList.click();
        payConnection.click();
        String expectedName3 = "E-mail для отправки чека";
        String actualName3 = placeholderPayNetMail.getAttribute("placeholder");
        assertEquals(expectedName3, actualName3);

        return null;


    }

    public CheckPayConnection() {
        driver.get("http://mts.by/");
        initElements(driver, this);
    }


}

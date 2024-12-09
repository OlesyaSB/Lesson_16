import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.openqa.selenium.support.PageFactory.initElements;

public class PayArreas extends FirstClass{

    @FindBy(xpath = "//*[@id='cookie-agree']")
    private WebElement cookiButtom;
    @FindBy(xpath = "//*[@id='pay-section']/div/div/div[2]/section/div/div[1]/div[1]")
    private WebElement paySectionList;
    @FindBy(xpath = "//*[@id='pay-section']/div/div/div[2]/section/div/div[1]/div[1]/div[2]")
    private WebElement payArreas;
    @FindBy(xpath = "//input[@id='score-arrears']")
    private WebElement placeholderPayArreas;
    @FindBy(xpath = "//input[@id='arrears-sum'][@placeholder='Сумма']")
    private WebElement placeholderPayArreasSum;

    @FindBy(xpath = "//*[@id='arrears-email']")
    private WebElement placeholderPayArreasMail;


    public PayNet checkingPayArreas() {
        paySectionList.click();
        payArreas.click();
        String expectedName1 = "Номер счета на 2073";
        String actualName1 = placeholderPayArreas.getAttribute("placeholder");
        assertEquals(expectedName1, actualName1);

        return null;
    }

    public PayNet checkingPayArreasSum() {
        paySectionList.click();
        payArreas.click();
        String expectedName2 = "Сумма";
        String actualName2 = placeholderPayArreasSum.getAttribute("placeholder");
        assertEquals(expectedName2, actualName2);

        return null;
    }

    public PayNet checkingPayArreasMail() {
        paySectionList.click();
        payArreas.click();
        String expectedName3 = "E-mail для отправки чека";
        String actualName3 = placeholderPayArreasMail.getAttribute("placeholder");
        assertEquals(expectedName3, actualName3);

        return null;


    }

    public PayArreas() {
        driver.get("http://mts.by/");
        initElements(driver, this);
    }
}

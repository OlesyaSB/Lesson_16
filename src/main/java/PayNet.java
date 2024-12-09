import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.openqa.selenium.support.PageFactory.initElements;

public class PayNet extends FirstClass {

    @FindBy(xpath = "//*[@id='cookie-agree']")
    private WebElement cookiButtom;
    @FindBy(xpath = "//*[@id='pay-section']/div/div/div[2]/section/div/div[1]/div[1]")
    private WebElement paySectionList;
    @FindBy(xpath = "//*[@id='pay-section']/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[2]/p")
    private WebElement payNet;
    @FindBy(xpath = "//input[@id='internet-phone']")
    private WebElement placeholderPayNet;
    @FindBy(xpath = "//input[@id='internet-sum'][@placeholder='Сумма']")
    private WebElement placeholderPayNetSum;

    @FindBy(xpath = "//*[@id='internet-email']")
    private WebElement placeholderPayNetMail;


    public PayNet checkingPayNet() {
        paySectionList.click();
        payNet.click();
        String expectedName1 = "Номер абонента";
        String actualName1 = placeholderPayNet.getAttribute("placeholder");
        assertEquals(expectedName1, actualName1);

        return null;
    }

    public PayNet checkingPayNetSum() {
        paySectionList.click();
        payNet.click();
        String expectedName2 = "Сумма";
        String actualName2 = placeholderPayNetSum.getAttribute("placeholder");
        assertEquals(expectedName2, actualName2);

        return null;
    }

    public PayNet checkingPayNetMail() {
        paySectionList.click();
        payNet.click();
        String expectedName3 = "E-mail для отправки чека";
        String actualName3 = placeholderPayNetMail.getAttribute("placeholder");
        assertEquals(expectedName3, actualName3);

        return null;


    }

    public PayNet() {
        driver.get("http://mts.by/");
        initElements(driver, this);
    }
}

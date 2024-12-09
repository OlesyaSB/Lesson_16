import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.openqa.selenium.support.PageFactory.initElements;

public class PayInstallment extends FirstClass {
    @FindBy(xpath = "//*[@id='cookie-agree']")
    private WebElement cookiButtom;
    @FindBy(xpath = "//*[@id='pay-section']/div/div/div[2]/section/div/div[1]/div[1]")
    private WebElement paySectionList;

    @FindBy(xpath = "//*[@id='pay-section']/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[3]")
    private WebElement payInstallment;
    @FindBy(xpath = "//input[@class='score'][@id='score-instalment']")
    private WebElement payInstallmentPlaceH;

    @FindBy(xpath = "//input[@id='instalment-sum'][@placeholder='Сумма']")
    private WebElement placeholderPayInstallmentSum;

    @FindBy(xpath = "//*[@id='instalment-email']")
    private WebElement placeholderPayInstallmentMail;

    public PayInstallment checkingPayInstallment() {
        paySectionList.click();
        payInstallment.click();
        String expectedName1 = "Номер счета на 44";
        String actualName1 = payInstallmentPlaceH.getAttribute("placeholder");
        assertEquals(expectedName1, actualName1);

        return null;
    }

    public PayInstallment checkingPayInstallmentSum() {
        paySectionList.click();
        payInstallment.click();
        String expectedName2 = "Сумма";
        String actualName2 = placeholderPayInstallmentSum.getAttribute("placeholder");
        assertEquals(expectedName2, actualName2);

        return null;
    }

    public PayInstallment checkingPayInstallmentMail() {
        paySectionList.click();
        payInstallment.click();
        String expectedName3 = "E-mail для отправки чека";
        String actualName3 = placeholderPayInstallmentMail.getAttribute("placeholder");
        assertEquals(expectedName3, actualName3);

        return null;


    }

    public PayInstallment() {
        driver.get("http://mts.by/");
        initElements(driver, this);
    }
}


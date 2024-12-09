import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.openqa.selenium.support.PageFactory.initElements;

public class PayingPage extends FirstClass {

    @FindBy(xpath = "/html/body/app-root/div/div/div/app-payment-container/section/div/div/div[1]/span[1]")
    private WebElement sumUp;
    @FindBy(xpath = "/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/button")
    private WebElement sumDown;
    @FindBy(xpath = "/html/body/app-root/div/div/div/app-payment-container/section/div/div/div[2]/span")
    private WebElement number;
    @FindBy(xpath = "/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[1]/app-input/div/div/div[1]/label")
    private WebElement numberCard;
    @FindBy(xpath = "/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[2]/div[1]/app-input/div/div/div[1]/label")
    private WebElement data;
    @FindBy(xpath = "/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[2]/div[3]/app-input/div/div/div[1]/label")
    private WebElement cvc;
    @FindBy(xpath = "/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[3]/app-input/div/div/div[1]/label")
    private WebElement name;
    @FindBy(xpath = "/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[1]/app-input/div/div/div[2]/div/div")
    private WebElement logos;

    public PayingPage checkingSumUp() {
        //paySectionList.click();
        //payNet.click();
        String expectedName1 = "200.00 BYN";
        String actualName1 = sumUp.getText();
        assertEquals(expectedName1, actualName1);
        String expectedName2 = " Оплатить  200.00 BYN ";
        String actualName2 = sumDown.getText();
        assertEquals(expectedName2, actualName2);
        String expectedName3 = "Оплата: Услуги связи\n" +
                "Номер:375297777777";
        String actualName3 = number.getText();
        assertEquals(expectedName3, actualName3);
        String expectedName4 = "Номер карты";
        String actualName4 = numberCard.getText();
        assertEquals(expectedName4, actualName4);
        String expectedName5 = "Срок действия";
        String actualName5 = data.getText();
        assertEquals(expectedName5, actualName5);
        String expectedName6 = "CVC";
        String actualName6 = cvc.getText();
        assertEquals(expectedName6, actualName6);
        String expectedName7 = "Имя держателя (как на карте)";
        String actualName7 = name.getText();
        assertEquals(expectedName7, actualName7);

        return null;
    }
    public void CheckLogos2() {
        List<WebElement> logos2 = driver.findElements(By.xpath("//div[@class='pay__partners']"));
        assertTrue(!logos2.isEmpty(), "Логотипы платежных систем отсутсвуют");
    }

    public PayingPage() {
        driver.get("http://mts.by/");
        initElements(driver, this);
    }

}

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.openqa.selenium.support.PageFactory.initElements;

public class CheckPay extends FirstClass {


    @FindBy(xpath = "//*[@id='cookie-agree']")
    private WebElement cookiButtom;
    @FindBy(xpath = "//*[@id='pay-section']/div/div/div[2]/section/div/div[1]/div[1]")
    private WebElement paySectionList;
    @FindBy(xpath = "//*[@id='pay-section']/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[1]/p")
    private WebElement payConnection;
    @FindBy(xpath = "//*[@id='connection-phone']")
    private WebElement payNumber;
    @FindBy(xpath = "//*[@id='connection-sum']")
    private WebElement paySum;
    @FindBy(xpath = "//button[@class='button button__default ']")
    private WebElement payContinue;


   @FindBy(xpath = "//div[@class='pay-description__cost']//span[@_ngcontent-xcp-c62][1]")
    private WebElement sumUp;
    @FindBy(xpath = "//button[@class='colored disabled']")
    private WebElement sumDown;
    @FindBy(xpath = "//div[@class='pay-description__text']//span[@_ngcontent-ung-c62]")
    private WebElement number;
    @FindBy(xpath = "//div[@class='content ng-tns-c46-1']//label[@class='ng-tns-c46-1 ng-star-inserted']")
    private WebElement numberCard;
    @FindBy(xpath = "//div[@class='content ng-tns-c46-4']//label[@class='ng-tns-c46-4 ng-star-inserted']")
    private WebElement data;
    @FindBy(xpath = "//div[@class='content ng-tns-c46-5']//label[@class='ng-tns-c46-5 ng-star-inserted']")
    private WebElement cvc;
    @FindBy(xpath = "//div[@class='content ng-tns-c46-3']//label[@class='ng-tns-c46-3 ng-star-inserted']")
    private WebElement name;
    @FindBy(xpath = "//div[@class='cards-brands ng-tns-c46-1']//div[@class='cards-brands cards-brands__container ng-tns-c61-0 ng-trigger ng-trigger-brandsState ng-star-inserted']")
    private WebElement logos;

    public CheckPay() {
        driver.get("http://mts.by/");
        initElements(driver, this);
    }


    public CheckPay fillFields(String numberValue, String sumValue) {
        //CookBut.click();
        paySectionList.click();
        payConnection.click();
        payNumber.sendKeys(numberValue);
        paySum.sendKeys(sumValue);
        payContinue.click();

        //String expectedName1 = "200.00 BYN";
        //String actualName1 = sumUp.getText();
       // assertEquals(expectedName1, actualName1);
        //String expectedName2 = " Оплатить  200.00 BYN ";
       // String actualName2 = sumDown.getText();
        //assertEquals(expectedName2, actualName2);
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

    public CheckPay CheckLogos2() {
        List<WebElement> logos2 = driver.findElements(By.xpath("//div[@class='pay__partners']"));
        assertTrue(!logos2.isEmpty(), "Логотипы платежных систем отсутсвуют");
        return null;
    }


}





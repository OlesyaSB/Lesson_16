import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.openqa.selenium.support.PageFactory.initElements;

public class CheckName extends FirstClass {

    @FindBy(xpath = "//*[@id='cookie-agree']")
    private WebElement cookiButtom;
    @FindBy(xpath = "//div[@class='pay__wrapper']/h2")
    private WebElement name;


    @FindBy(xpath = "//div[@class='select']//li[@class='select__item'][2]")
    private WebElement payInstallment;
    @FindBy(xpath = "//div[@class='select']//li[@class='select__item'][3]")
    private WebElement payDebt;

    public CheckName checkingName() {
        String expectedName = "Онлайн пополнение\n" +
                "без комиссии";
        String actualName = name.getText();
        assertEquals(expectedName, actualName);

        return null;
    }

    public CheckName() {
        driver.get("http://mts.by/");
        initElements(driver, this);
    }


}

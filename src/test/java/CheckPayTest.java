import org.junit.jupiter.api.Test;

public class CheckPayTest extends FirstClassTest{

    @Test
    public void checkTicket() {
        String number = "297777777";
        String sum = "200";
        CheckPay checkPay = new CheckPay();
        checkPay.fillFields(number, sum);
        checkPay.CheckLogos2();

    }
}

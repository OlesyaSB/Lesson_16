import org.junit.jupiter.api.Test;

public class PayArreasTest extends FirstClassTest{

    @Test
    public void testPayArreas() {
        PayArreas payArreas = new PayArreas();
        payArreas.checkingPayArreas();
        payArreas.checkingPayArreasSum();
        payArreas.checkingPayArreasMail();
    }
}

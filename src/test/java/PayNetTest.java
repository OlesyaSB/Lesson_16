import org.junit.jupiter.api.Test;

public class PayNetTest extends FirstClassTest{

    @Test
    public void testPayNet() {
        PayNet payNet = new PayNet();
        payNet.checkingPayNet();
        payNet.checkingPayNetSum();
        payNet.checkingPayNetMail();
    }
}

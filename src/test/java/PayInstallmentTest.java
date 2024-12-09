import org.junit.jupiter.api.Test;

public class PayInstallmentTest extends FirstClassTest{

    @Test
    public void testPayInstallment() {
        PayInstallment payInstallment = new PayInstallment();
        payInstallment.checkingPayInstallment();
        payInstallment.checkingPayInstallmentSum();
        payInstallment.checkingPayInstallmentMail();
    }
}

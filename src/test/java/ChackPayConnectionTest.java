import org.junit.jupiter.api.Test;

public class ChackPayConnectionTest extends FirstClassTest{

    @Test
    public void checkingPayConnectionMail() {
        CheckPayConnection checkPayConnection = new CheckPayConnection();
        checkPayConnection.checkPayConnectionTel();
        checkPayConnection.checkPayConnectionSum();
        checkPayConnection.checkPayConnectionMail();
    }
}

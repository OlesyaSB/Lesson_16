import org.junit.jupiter.api.Test;

public class CheckNameTest extends FirstClassTest {

    @Test
    public void testName() {
        CheckName checkName = new CheckName();
        checkName.checkingName();
    }
}

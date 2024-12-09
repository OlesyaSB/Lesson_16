import org.junit.jupiter.api.Test;

public class MoreAboutTest extends FirstClassTest{

    @Test
    public void checkMoreInfo() {
        MoreAbout moreAbout = new MoreAbout();
        moreAbout.checkUrl();
    }
}

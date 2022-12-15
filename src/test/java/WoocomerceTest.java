import org.testng.annotations.Test;

public class WoocomerceTest extends Base {

    private final static String woocomerceMain_URL = "https://woocommerce.avalab.io/";

    @Test
    public void initWoocomerce(){
        WoocomerceMainPage mainPage = new WoocomerceMainPage(woocomerceMain_URL);
    }
}

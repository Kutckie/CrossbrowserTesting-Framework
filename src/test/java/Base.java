import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.comparator.CompositeFileComparator;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;


abstract public class Base {

    /**
     * Основные параметры
     */
    public void setup(){
        Configuration.driverManagerEnabled = true;
        Configuration.headless = false;
        Configuration.browserSize = "800x600";
    }
    @Parameters({"BrowserType"})
    @BeforeTest
    public void init(String BrowserType) throws Exception{
        if(BrowserType.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            Configuration.browser = "firefox";
        }
        else if(BrowserType.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            Configuration.browser = "chrome";
        }
        /*
        in case no browser were chosen throw exception
         */
        else{
            throw new Exception("Browser N/A");
        }
        setup();
    }

    @AfterTest
    public void termination(){
        Selenide.closeWebDriver();
    }
}

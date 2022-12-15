import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class WoocomerceMainPage {
    private final SelenideElement addWhiteShirt = $x("//a[@href=\"?add-to-cart=16\"]");
    public WoocomerceMainPage(String URL){
        Selenide.open(URL);
    }

    public void clickAddButton(){
        addWhiteShirt.click();
    }

}

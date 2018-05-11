package pages;

import base.MobileAPI;
import org.openqa.selenium.WebElement;

public class Controls extends MobileAPI {
    public void clickBtns(){
        WebElement btns = ad.findElementByTagName("Controls");
        btns.click();
        sleep(5);
    }
}


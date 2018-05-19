
package mainAutomation;

import base.MobileAPI;

public class PatioAndGarden extends MobileAPI {

    public void patioAndGarden(){
        typeByXpath("//android.widget.TextView[@content-desc=\"Patio & Garden button\"]","Patio");
    }
    public void scroll(){
        scroll_to("Outdoor Heating");
    }
}


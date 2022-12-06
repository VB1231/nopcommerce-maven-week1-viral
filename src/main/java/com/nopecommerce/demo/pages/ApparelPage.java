package com.nopecommerce.demo.pages;

import com.nopecommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ApparelPage extends Utility {
    By apparelPage=By.linkText("Apparel");
    public String getStringApparelPage(){
        return getTextFromElement(apparelPage);
    }
    public void clickOnApparel(){
        clickOnElement(apparelPage);
    }
}

package com.nopecommerce.demo.pages;

import com.nopecommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class JewelleryPage extends Utility {
    By jewelleryPage = By.linkText("Jewelry");

    public String getStringJeweleryPage() {
        return getTextFromElement(jewelleryPage);
    }

    public void clickOnJeweleryPage() {
        clickOnElement(jewelleryPage);
    }
}

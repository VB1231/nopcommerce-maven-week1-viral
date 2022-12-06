package com.nopecommerce.demo.pages;

import com.nopecommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class DigitalDownloadPage extends Utility {
    By digitalDownPage = By.linkText("Digital downloads");

    public String getStringDigitalDownloadPage() {
        return getTextFromElement(digitalDownPage);
    }

    public void clickOnDigitalDownLoadPage() {
        clickOnElement(digitalDownPage);
    }
}

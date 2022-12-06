package com.nopecommerce.demo.pages;

import com.nopecommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class GiftCardsPage extends Utility {
    By giftCardPage = By.linkText("Gift Cards");

    public String getStringGiftCardPage() {
        return getTextFromElement(giftCardPage);
    }

    public void clickOnGiftCardPage() {
        clickOnElement(giftCardPage);
    }
}

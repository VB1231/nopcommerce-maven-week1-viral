package com.nopecommerce.demo.testsuite;

import com.nopecommerce.demo.pages.GiftCardsPage;
import com.nopecommerce.demo.pages.HomePage;
import com.nopecommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GiftCardTest extends BaseTest {
    HomePage homePage = new HomePage();
     GiftCardsPage giftCardsPage = new GiftCardsPage();
    @Test
    public void verifyUserShouldNavigateToElectronicPage(){
        giftCardsPage.clickOnGiftCardPage();
        Assert.assertEquals(giftCardsPage.getStringGiftCardPage(),"Gift Cards","not verified");
    }
}

package com.nopecommerce.demo.testsuite;

import com.nopecommerce.demo.pages.HomePage;
import com.nopecommerce.demo.pages.JewelleryPage;
import com.nopecommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JewelryTest extends BaseTest {
    HomePage homePage = new HomePage();
     JewelleryPage jewelleryPage = new JewelleryPage();
    @Test
    public void verifyUserShouldNavigateToElectronicPage(){
        jewelleryPage.clickOnJeweleryPage();
        Assert.assertEquals(jewelleryPage.getStringJeweleryPage(),"Jewelry","not verified");
    }
}

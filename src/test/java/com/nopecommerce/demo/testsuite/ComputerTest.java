package com.nopecommerce.demo.testsuite;

import com.nopecommerce.demo.pages.ComputerPage;
import com.nopecommerce.demo.pages.HomePage;
import com.nopecommerce.demo.testbase.BaseTest;
import org.openqa.selenium.StaleElementReferenceException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ComputerTest extends BaseTest {
    HomePage homePage = new HomePage();
    ComputerPage computerPage = new ComputerPage();
    @Test
    public void verifyUserShouldNavigateToComputerPage(){
        //homePage.topMenu();
        computerPage.clickOnComputer();
       Assert.assertEquals("Computers",computerPage.getStringComputer(),"verified");
    }
    @Test
    public void verifyProductArrangeInAlphaBaticalOrder(){
        computerPage.clickOnComputer();
        computerPage.clickOnDesktop();
        computerPage.selectPositionZtoA();
        computerPage.verifyPositionZTOA();

    }
    @Test
    public void verifyProductAddedToShoppingCartSuccessFully()throws StaleElementReferenceException,InterruptedException{
        computerPage.clickOnComputer();
        computerPage.clickOnDesktop();
        computerPage.selectPositionZtoA();
        Thread.sleep(700);
         computerPage.addToCart();
       Assert.assertEquals(computerPage.verifyTextBuildComputer(),"Build your own computer","not verify");
        computerPage.selectDualCore();
        computerPage.selectRAM();
        computerPage.selectGB();
        computerPage.selectRadioGb();
        computerPage.selectOS();
        computerPage.setSelectTotalCommander();
        Assert.assertEquals(computerPage.verifyTotal(),"$1,475.00","not veirfy");
        computerPage.addToCartT();
        Assert.assertEquals(computerPage.verifyAddToCartMessage(),"The product has been added to your shopping cart","not verify");
        computerPage.closeVerifyMessage();
        computerPage.mouseHoverShoppingCart();
        Assert.assertEquals(computerPage.verifyShoppingCart(),"Shopping cart","not verify");
        computerPage.updateQty("2");
        Assert.assertEquals(computerPage.updateTotalVerify(),"$2,950.00","not verify");
        computerPage.clickOnCheckOut();
        Assert.assertEquals(computerPage.verifyWelcomeMessage(),"Welcome, Please Sign In!","not verify");
        computerPage.checkOutGuest();
        computerPage.fillAllMandatoryField();
        computerPage.clickOnShippingMethod();
        computerPage.clickPaymentMethod();
        computerPage.fillCardDetail("Master card");
        Assert.assertEquals(computerPage.verifyPaymentMethod(),"Credit Card","not verify");
        Assert.assertEquals(computerPage.verifyTotalShipping(),"$2,950.00","not verify");
        Assert.assertEquals(computerPage.VerifyShippingMethod(),"Next Day Air","not verify");
        computerPage.clickOnConfirm();
        Assert.assertEquals(computerPage.verifyThankYou(),"Thank you","No verify");
        Assert.assertEquals(computerPage.VerifyYourOrderConfirm(),"Your order has been successfully processed!","No verify");
        computerPage.clickCompleteConfirm();
        Assert.assertEquals(computerPage.verifyWelcomeToStore(),"Welcome to our store","No verify");

    }
}

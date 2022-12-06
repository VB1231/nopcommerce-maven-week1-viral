package com.nopecommerce.demo.pages;

import com.nopecommerce.demo.utility.Utility;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComputerPage extends Utility {
    By computerPage = By.linkText("Computers");
    By desktopPage = By.linkText("Desktops");
    By selectPosition = By.xpath("//select[@id='products-orderby']");
    By verifyTextBuild = By.linkText("Build your own computer");
    //h1[contains(text(),'Build your own computer')]");
    By selectDualCore = By.id("product_attribute_1");
    By clickAddToCart = By.xpath("(//button[@type='button'][normalize-space()='Add to cart'])[1]");
    By selectGB = By.id("product_attribute_1");
    By selectRAM = By.id("product_attribute_2");

    By selectRadioGB = By.xpath("//input[@id='product_attribute_3_7']");
    By selectOS = By.id("product_attribute_4_9");

    By selectTotalCommander = By.id("product_attribute_5_12");
    By totalPrice = By.id("add-to-cart-button-1");
    By verifyTotal = By.xpath("//span[normalize-space()='$1,475.00']");
    By verifyAddToCartMessage = By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]");
    By closeVerifyMessage = By.xpath("//span[@class='close']");
    By mouseHoverShoppingCart =By.xpath("//span[contains(text(),'Shopping cart')]");
    By clickGoCart=By.xpath("//button[contains(text(),'Go to cart')]");
    By verifyShoppingCart = By.xpath("//h1[contains(text(),'Shopping cart')]");
    By updateQty = By.xpath("//input[@value='1']");
    By clickUpdate = By.id("updatecart");
    By verifyUpdateTotal = By.xpath("//span[@class='value-summary']/strong");
    By acceptTerm = By.id("termsofservice");
    By clickCheckOut = By.id("checkout");
    By verifyWelcomeMessage = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By checkOutGuest =By.xpath("//button[contains(text(),'Checkout as Guest')]");
    By mandatoryName =By.id("BillingNewAddress_FirstName");
    By mandatoryLastName = By.id("BillingNewAddress_LastName");
    By mandatoryEmail = By.id("BillingNewAddress_Email");
    By mandatoryCountry = By.id("BillingNewAddress_CountryId");
    By mandatoryState = By.id("BillingNewAddress_StateProvinceId");
    By mandatoryCity = By.id("BillingNewAddress_City");
    By mandatoryAddress = By.xpath("//input[@id='BillingNewAddress_Address1']");
    By mandatoryPostalCode = By.id("BillingNewAddress_ZipPostalCode");
    By mandatoryPhone = By.id("BillingNewAddress_PhoneNumber");
    By clickContinue = By.name("save");
    By selectShippingMethod = By.id("shippingoption_1");
    By clickOnContinueShip = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
    By clickPaymentMethod = By.id("paymentmethod_1");
    By clickContinue1 = By.xpath("//button[@class='button-1 payment-method-next-step-button']");
    By masterCard = By.id("CreditCardType");
    By cardName = By.id("CardholderName");
    By cardNumber = By.id("CardNumber");
    By cardExMonth = By.id("ExpireMonth");
    By cardExYear = By.id("ExpireYear");
    By cardCode = By.id("CardCode");
    By cardContinue = By.xpath("//button[@class='button-1 payment-info-next-step-button']");

    By verifyPaymentMethod = By.xpath("//span[contains(text(),'Credit Card')]");
    By verifyShippingMethod = By.xpath("//span[@class='value' and contains(text(),'Next Day Air')]");
    By verifyShippingTotal = By.xpath("//span[@class='value-summary' and contains(text(),'$2,950.00')]");
    By confirm = By.xpath("//button[contains(text(),'Confirm')]");
    By verifyThankYo = By.xpath("//h1[contains(text(),'Thank you')]");
    By verifyYourOrder = By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");
    By orderConfirm = By.xpath("//button[contains(text(),'Continue')]");
    By verifyWelcomeToStore = By.xpath("//h2[contains(text(),'Welcome to our store')]");




    public String getStringComputer() {
        return getTextFromElement(computerPage);
    }

    public void clickOnComputer() {
        clickOnElement(computerPage);
    }

    public void clickOnDesktop() {
        clickOnElement(desktopPage);
    }

    public void selectPositionZtoA() {
        clickOnElement(selectPosition);
        selectByVisibleTextFromDropDown(selectPosition, "Name: Z to A");
    }

    public void verifyPositionZTOA() {
        List<WebElement> manageBookingList = driver.findElements(By.xpath("//span[contains(text(),'Sort by')]"));
        List<String> beforeSorted = new ArrayList<String>();
        for (WebElement p : manageBookingList) {
            beforeSorted.add(p.getText());
        }
        selectByVisibleTextFromDropDown(selectPosition, "Name: Z to A");
        List<WebElement> manageBookingList1 = driver.findElements(By.xpath("//span[contains(text(),'Sort by')]"));
        List<String> afterSorted = new ArrayList<String>();
        for (WebElement q : manageBookingList) {
            afterSorted.add(q.getText());
        }
        Collections.sort(beforeSorted);
        Assert.isTrue(true, String.valueOf(beforeSorted), afterSorted);
    }
    public String verifyTextBuildComputer()throws StaleElementReferenceException {
        clickOnElement(clickAddToCart);
        return getTextFromElement(verifyTextBuild);

    }
    public void addToCart()throws StaleElementReferenceException{
        clickOnElement(clickAddToCart);
    }
    public void selectGB(){
        clickOnElement(selectGB);
        selectByIndexFromDropDown(selectGB,1);
    }
    public void selectDualCore(){
               selectByIndexFromDropDown(selectDualCore,1);
    }
    public void selectRAM(){
        clickOnElement(selectRAM);
        selectByIndexFromDropDown(selectRAM,3);
    }
    public void selectRadioGb(){
        clickOnElement(selectRadioGB);
    }
    public void selectOS(){
        clickOnElement(selectOS);
    }
    public void setSelectTotalCommander(){
        clickOnElement(selectTotalCommander);
    }
    public String verifyTotal(){
        return getTextFromElement(verifyTotal);
    }
   public void addToCartT(){
        clickOnElement(totalPrice);
   }
   public String verifyAddToCartMessage(){
        return getTextFromElement(verifyAddToCartMessage);
   }
   public void closeVerifyMessage(){
        clickOnElement(closeVerifyMessage);
   }
   public void mouseHoverShoppingCart(){
        mouseHoverToElement(mouseHoverShoppingCart);
        clickOnElement(clickGoCart);
   }
   public String verifyShoppingCart(){
        return getTextFromElement(verifyShoppingCart);
   }
   public void updateQty(String qty){
        driver.findElement(updateQty).clear();
        sendTextToElement(updateQty,qty);
        clickOnElement(clickUpdate);}

    public String updateTotalVerify(){
        clickOnElement(clickUpdate);
        return getTextFromElement(verifyUpdateTotal);
    }
    public void clickOnCheckOut(){
        clickOnElement(acceptTerm);
        clickOnElement(clickCheckOut);
    }
    public void checkOutGuest(){
        clickOnElement(checkOutGuest);
    }
    public String verifyWelcomeMessage(){
        return getTextFromElement(verifyWelcomeMessage);
    }
    public void fillAllMandatoryField(){
        driver.findElement(mandatoryName).clear();
        sendTextToElement(mandatoryName,"viral");
        sendTextToElement(mandatoryLastName,"brahmbhatt");
        driver.findElement(mandatoryEmail).clear();
        sendTextToElement(mandatoryEmail,randomEmail());
        selectByIndexFromDropDown(mandatoryCountry,1);
        selectByVisibleTextFromDropDown(mandatoryState,"AA (Armed Forces Americas)");
        sendTextToElement(mandatoryCity,"London");
        sendTextToElement(mandatoryAddress,"14 The Avenue");
        sendTextToElement(mandatoryPostalCode,"WD23 7AB");
        sendTextToElement(mandatoryPhone,"01245666");
        clickOnElement(clickContinue);
    }
    public void clickOnShippingMethod(){
        clickOnElement(selectShippingMethod);
        clickOnElement(clickOnContinueShip);
    }
    public void clickPaymentMethod(){
        clickOnElement(clickPaymentMethod);
        clickOnElement(clickContinue1);
    }
    public void fillCardDetail(String s){
       // driver.findElement(masterCard).clear();
        selectByVisibleTextFromDropDown(masterCard,s);
        sendTextToElement(cardName,"Viral Brahm");
        sendTextToElement(cardNumber,"1234 4564 2521 123");
        selectByIndexFromDropDown(cardExMonth,3);
        selectByIndexFromDropDown(cardExYear,3);
        sendTextToElement(cardCode,"123");
        clickOnElement(cardContinue);

    }
    public String VerifyShippingMethod(){
        return getTextFromElement(verifyShippingMethod);
    }
    public String verifyPaymentMethod(){
        return getTextFromElement(verifyPaymentMethod);
    }
    public String verifyTotalShipping(){
        return getTextFromElement(verifyShippingTotal);
           }

           public void clickOnConfirm(){
        clickOnElement(confirm);
           }
           public String verifyThankYou(){
             return getTextFromElement(verifyThankYo);
           }
           public String VerifyYourOrderConfirm(){
        return getTextFromElement(verifyYourOrder);
           }
           public void clickCompleteConfirm(){
        clickOnElement(orderConfirm);
           }
           public String verifyWelcomeToStore(){
        return getTextFromElement(verifyWelcomeToStore);
           }



}

package com.nopecommerce.demo.pages;

import com.nopecommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ElectronicPage extends Utility {
    By electronicPage =By.linkText("Electronics");
    By cellphonePage = By.linkText("Cell phones");
    By verifyTextCellPhone = By.xpath("//h1[contains(text(),'Cell phones')]");
    By clickOnList = By.xpath("//a[contains(text(),'List')]");
    By clickOnNokiaLumia =By.linkText("Nokia Lumia 1020");
            //By.xpath("//h2/a[contains(text(),'Nokia Lumia 1020')]");
    By verifyTextNokiaLumia = By.xpath("//h1[contains(text(),'Nokia Lumia 1020')]");
    By verifyPrice =By.id("price-value-20");
    By qty=By.id("product_enteredQuantity_20");
    By addToCart = By.id("add-to-cart-button-20");
   By closeMessageBar= By.xpath("//span[@class='close']");


    By priceVerifyText = By.xpath("//span[@class='value-summary']/strong");
    By mouseHoverToShoppingCart = By.xpath("//span[contains(text(),'Shopping cart')]");
    By clickGoCart = By.xpath("//button[contains(text(),'Go to cart')]");
    By acceptTerms = By.id("termsofservice");
    By Checkout = By.id("checkout");
    By verifyWelcomeSignIn = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By clickOnRegister = By.xpath("//button[contains(text(),'Register')]");
    By verifyRegisterComplete = By.xpath("//div[@class='result']");
    By clickOnCompleteAfterRegister = By.xpath("//div[@class='buttons']/a");
    By verifyShoppingCartAfterContinue = By.xpath("//h1[contains(text(),'Shopping cart')]");
    By termsConditionAccept = By.id("termsofservice");
    By clickOnCheckOut = By.id("checkout");
    By selectRadioAirShip = By.id("shippingoption_2");
    By clickContinue1=By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
    By selectPaymentMethod = By.id("paymentmethod_1");
    By paymentClick = By.xpath("//button[@class='button-1 payment-method-next-step-button']");
    By clickLogout = By.xpath("//a[contains(text(),'Log out')]");
  By verifyShippingMethod = By.xpath("//span[normalize-space()='2nd Day Air']");
    By verifyShippingTotal = By.xpath("//span[@class='value-summary' and contains(text(),'$698.00')]");
    public String getStringElectronic(){
        return getTextFromElement(electronicPage);
    }
    public void clickOnElectronic(){
        clickOnElement(electronicPage);
    }
    public void electronicToCellPhone(){
        mouseHoverToElement(electronicPage);
       clickOnElement(cellphonePage);
    }
    public String verifyTextCellPhone(){
        return getTextFromElement(verifyTextCellPhone);
    }
    public void clickOnList(){
        clickOnElement(clickOnList);
    }
    public void clickOnNokiaLumia(){
        clickOnElement(clickOnNokiaLumia);
    }
    public String verifyTextNokiaLumia(){
        return getTextFromElement(verifyTextNokiaLumia);
    }
    public String verifyPrice(){
        return getTextFromElement(verifyPrice);
    }
    public void changeQty(String q){
        driver.findElement(qty).clear();
        sendTextToElement(qty,q);
        clickOnElement(addToCart);
        clickOnElement(closeMessageBar);
    }
    public String verifyTotalChangePrice(){
        mouseHoverToElement(mouseHoverToShoppingCart);
        clickOnElement(clickGoCart);
        return getTextFromElement(priceVerifyText);
    }
    public void acceptTermsAndClick(){
        clickOnElement(acceptTerms);
        clickOnElement(Checkout);
    }
    public String verifyWelcomeSignIn(){
        return getTextFromElement(verifyWelcomeSignIn);
    }
    public void clickOnRegister(){
        clickOnElement(clickOnRegister);
    }
    public String verifyRegisterComplete(){
        return getTextFromElement(verifyRegisterComplete);
    }
    public void clickOnContinueAfterRegisterComplete(){
        clickOnElement(clickOnCompleteAfterRegister);
    }
    public String verifyShoppingCartAfterContinue(){
        return getTextFromElement(verifyShoppingCartAfterContinue);
    }
    public void clickOnTermsAccept(){
        clickOnElement(termsConditionAccept);
        clickOnElement(clickOnCheckOut);
    }
    public void selectShipmentType(){
        clickOnElement(selectRadioAirShip);
        clickOnElement(clickContinue1);
    }
    public void selectPaymentMethod(){
        clickOnElement(selectPaymentMethod);
        clickOnElement(paymentClick);
    }
    public void clickOnLogOut(){
        clickOnElement(clickLogout);
    }
    public String verifyShippingMethod(){
        return getTextFromElement(verifyShippingMethod);
    }
    public String VerifyShippingTotal(){
        return getTextFromElement(verifyShippingTotal);
    }
}

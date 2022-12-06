package com.nopecommerce.demo.pages;

import com.nopecommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {

    By registerPage = By.xpath("///a[contains(text(),'Register')]");
    By genderMale = By.id("gender-male");
    By firstName = By.id("FirstName");
    By lastName = By.id("LastName");
    By birthDay = By.xpath("//select[@name='DateOfBirthDay']");
    By birthMonth = By.xpath("//select[@name='DateOfBirthMonth']");
    By birthYear = By.xpath("//select[@name='DateOfBirthYear']");
    By emailField = By.id("Email");
    By companyField = By.id("Company");
    By passwordField = By.id("Password");
    By confirmPassword = By.id("ConfirmPassword");
    By clickRegister = By.id("register-button");

    public void clickOnRegisterPage() {
        clickOnElement(registerPage);
    }

    public void fillAllMandatoryField() {
        clickOnElement(genderMale);
        sendTextToElement(firstName, "viral");
        sendTextToElement(lastName, "Brahm");
        selectByIndexFromDropDown(birthDay, 3);
        selectByIndexFromDropDown(birthMonth, 3);
        selectByIndexFromDropDown(birthYear, 6);
       // final String randomEmail= randomEmail();
        //driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(randomEmail);
        sendTextToElement(emailField, randomEmail());
        sendTextToElement(companyField, "Prime Testing");
        sendTextToElement(passwordField, "Welcome123");
        sendTextToElement(confirmPassword, "Welcome123");
        clickOnElement(clickRegister);
    }
}

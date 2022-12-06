package com.nopecommerce.demo.testsuite;

import com.nopecommerce.demo.pages.RegisterPage;
import com.nopecommerce.demo.testbase.BaseTest;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest {
    RegisterPage registerPage = new RegisterPage();
    @Test
    public void clickRegister(){
        registerPage.clickOnRegisterPage();
    }
    @Test
        public void verifyUserShouldRegister(){
         registerPage.fillAllMandatoryField();
    }
}

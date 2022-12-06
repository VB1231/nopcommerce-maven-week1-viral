package com.nopecommerce.demo.testsuite;

import com.nopecommerce.demo.pages.BooksPage;
import com.nopecommerce.demo.pages.HomePage;
import com.nopecommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BooksTest extends BaseTest {
    HomePage homePage = new HomePage();
    BooksPage booksPage = new BooksPage();
    @Test
    public void verifyUserShouldNavigateToDigitalDownLoadPage(){
        booksPage.clickOnDigitalDownLoadPage();
        Assert.assertEquals(booksPage.getStringDigitalDownloadPage(),"Books","not Verified");
    }

}

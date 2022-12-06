package com.nopecommerce.demo.testsuite;

import com.nopecommerce.demo.pages.DigitalDownloadPage;
import com.nopecommerce.demo.pages.HomePage;
import com.nopecommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DigitalDownTest extends BaseTest {
    HomePage homePage = new HomePage();
    DigitalDownloadPage digitalDownloadPage = new DigitalDownloadPage();
    @Test
    public void verifyUserShouldNavigateToDigitalDownLoadPage(){
        digitalDownloadPage.clickOnDigitalDownLoadPage();
        Assert.assertEquals(digitalDownloadPage.getStringDigitalDownloadPage(),"Digital downloads","not Verified");
    }

}

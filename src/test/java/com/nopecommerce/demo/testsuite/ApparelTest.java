package com.nopecommerce.demo.testsuite;

import com.nopecommerce.demo.pages.ApparelPage;
import com.nopecommerce.demo.pages.HomePage;
import com.nopecommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ApparelTest extends BaseTest {
    HomePage homePage = new HomePage();
    ApparelPage apparelPage = new ApparelPage();
    @Test
    public void verifyUserShouldNavigateToApparelPage(){
        apparelPage.clickOnApparel();
        Assert.assertEquals(apparelPage.getStringApparelPage(),"Apparel","Not Verified");
    }
}

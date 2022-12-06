package com.nopecommerce.demo.testsuite;

import com.nopecommerce.demo.pages.HomePage;
import com.nopecommerce.demo.pages.TopMenuPage;
import com.nopecommerce.demo.testbase.BaseTest;
import org.testng.annotations.Test;

public class TopMenuTest extends BaseTest {
    TopMenuPage t = new TopMenuPage();
    HomePage homePage = new HomePage();

    @Test
    public void selectTopMenu(){
        t.topMenu("Computers");
    }

}

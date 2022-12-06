package com.nopecommerce.demo.pages;

import com.nopecommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TopMenuPage extends Utility {
    By topMenu = By.xpath("//div[@class='header-menu']//ul[@class='top-menu notmobile']/li");
ComputerPage cp = new ComputerPage();
    public void topMenu(String menu){
        List<WebElement> myAccountList = driver.findElements(topMenu);
        try {
            for (WebElement options : myAccountList) {
                System.out.println(options.getText());
                if (options.getText().equalsIgnoreCase(menu)) {
                    options.click();
                    break;
                }
            }
        } catch (StaleElementReferenceException e) {
            myAccountList = driver.findElements(topMenu);
        }
    }
}

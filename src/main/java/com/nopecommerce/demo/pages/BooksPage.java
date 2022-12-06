package com.nopecommerce.demo.pages;

import com.nopecommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class BooksPage extends Utility {
    By booksPage = By.linkText("Books");

    public String getStringDigitalDownloadPage() {
        return getTextFromElement(booksPage);
    }

    public void clickOnDigitalDownLoadPage() {
        clickOnElement(booksPage);
    }
}

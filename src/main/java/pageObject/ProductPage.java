package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ProductPage {
    WebDriver ldriver;

    public ProductPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "//span[@class='title']")
    WebElement Product;

    @FindBy(xpath = "//div[text()='Sauce Labs Backpack']")
    WebElement FirstProduct;


    public void verifyProductPage() {
        if (Product.isDisplayed()) {
            Assert.assertTrue(true);
        } else {
            Assert.assertTrue(false);
        }
    }

    public void clickOnSauceLab(){
        FirstProduct.click();
    }
}
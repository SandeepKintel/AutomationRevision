package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class YourCartPage {
    WebDriver ldriver;

    public YourCartPage(WebDriver rdriver){
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy (xpath = "//span[text()='Your Cart']")
    WebElement YourCartText;

    @FindBy (xpath = "//button[@id=\"continue-shopping\"]")
    WebElement ContinueShoppingButton;

    @FindBy (xpath = "//button[@id=\"checkout\"]")
    WebElement CheckoutButton;



    public void verifyCartPage(){
        if (YourCartText.isDisplayed()){
            Assert.assertTrue(true);
            System.out.println("User is successfully navigated to the Your Cart Page");
        }else {
            Assert.assertTrue(false);
        }
    }

    public void clickOnCheckoutButton(){
        CheckoutButton.click();
    }
}

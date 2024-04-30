package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SauceLabBackPack {


    WebDriver ldriver;

    public SauceLabBackPack(WebDriver rdriver){
        ldriver = rdriver;
        PageFactory.initElements(rdriver,this);
    }

    @FindBy (xpath = "//a[@class='shopping_cart_link']")
    WebElement CartButton;
    @FindBy (xpath = "//button[@id='add-to-cart']")
    WebElement AddToCart;

    @FindBy (xpath = "//button[@id='remove']")
    WebElement RemoveText;


    public void verifySauceLabBackPackPage(){
        ProductPage pg =new ProductPage(ldriver);
        WebElement Prod = pg.FirstProduct;

        if(Prod.isDisplayed()){
            Assert.assertTrue(true);
            System.out.println("Product Page is displayed");
        }else{
            Assert.assertTrue(false);
        }
    }

    public void clickAddToCart(){
        AddToCart.click();
    }

    public void clickOnCartButton(){
        CartButton.click();
    }

    public void verifyAddToCartAction(){
        if(RemoveText.isDisplayed()){
            Assert.assertTrue(true);
            System.out.println("Item has been added to the Cart");
        }else{
            Assert.assertTrue(false);
        }
    }





}

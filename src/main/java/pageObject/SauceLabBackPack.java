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

    @FindBy (xpath = "//button[@id='add-to-cart']")
    WebElement AddToCart;


    public void verifySauceLabBackPackPage(){
        ProductPage pg =new ProductPage(ldriver);

        if(pg.Product.isDisplayed()){
            Assert.assertTrue(true);
            System.out.println("Product Page is displayed");
        }else{
            Assert.assertTrue(false);
        }
    }

    public void clickAddToCart(){
        AddToCart.click();
    }


}

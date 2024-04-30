import base.BaseClass;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.annotations.Test;
import pageObject.SauceLabBackPack;
import pageObject.YourCartPage;

public class ProductTestCase extends BaseClass {

    @Test
    public void ProductTestCase(){
        ExtentSparkReporter spark = new ExtentSparkReporter("target/spark.html");
        extent.attachReporter(spark);
        SauceLabBackPack sb = new SauceLabBackPack(driver);
        YourCartPage yp = new YourCartPage(driver);
        logger.info("Directing to SauceLab Page");
        test = extent.createTest("Navigating to BackPack Page");
        sb.verifySauceLabBackPackPage();
        logger.info("SauceLab BackPack Page is Validated");
        test = extent.createTest("User is successfully navigated to the SauceLab Backpack Page");
        sb.clickAddToCart();
        logger.info("User has clicked on the Add To Cart Button");
        test = extent.createTest("User as successfully clicked on the Add To Cart Button");
        sb.verifyAddToCartAction();
        logger.info("Item has been added to the cart successfully");
        test = extent.createTest("Add to Cart action has been validated successfully");
        sb.clickOnCartButton();
        logger.info("User has clicked on the Cart Icon");
        test = extent.createTest("Validating that user is able to click on the Cart Button");
        yp.verifyCartPage();
        logger.info("User is successfully navigated to the Your Cart Page");
        test = extent.createTest("User is successfully navigated to the Your Cart Page");
        extent.flush();


    }
}

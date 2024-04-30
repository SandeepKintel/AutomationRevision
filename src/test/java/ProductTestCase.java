import base.BaseClass;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import pageObject.SauceLabBackPack;

public class ProductTestCase extends BaseClass {

    public void ProductTestCase(){
        ExtentSparkReporter spark = new ExtentSparkReporter("target/spark.html");
        extent.attachReporter(spark);
        SauceLabBackPack sb = new SauceLabBackPack(driver);
        logger.info("Directing to SauceLab Page");
        test = extent.createTest("Navigating to BackPack Page");
        sb.verifySauceLabBackPackPage();
        logger.info("SauceLab BackPack Page is Validated");
        test = extent.createTest("User is successfully navigated to the SauceLab Backpack Page");
        sb.clickAddToCart();
        logger.info("User has clicked on the Add To Cart Button");
        test = extent.createTest("User as successfully clicked on the Add To Cart Button");
        extent.flush();


    }
}

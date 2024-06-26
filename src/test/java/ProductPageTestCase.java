import base.BaseClass;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.annotations.Test;
import pageObject.ProductPage;

public class ProductPageTestCase extends BaseClass {

    @Test
    public void ProductPageTestCase(){
        //driver.get(baseUrl);
        ExtentSparkReporter spark=new ExtentSparkReporter("target/spark.html");
        extent.attachReporter(spark);
        ProductPage pg =new ProductPage(driver);
        logger.info("Directing to the Product Page");
        test = extent.createTest("Navigating to the Product Page");
        pg.verifyProductPage();
        logger.info("Successfully Navigated to the Product Page");
        test  = extent.createTest("User is successfully directed to the Product Page");
        pg.clickOnSauceLab();
        logger.info("Clicking on the Sauce Lab Backpack");
        test = extent.createTest("User is clicking on the Sauce Lab Backpack ");
        extent.flush();
    }
}

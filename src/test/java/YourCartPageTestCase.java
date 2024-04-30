import base.BaseClass;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import pageObject.YourCartPage;

public class YourCartPageTestCase extends BaseClass {

    public YourCartPageTestCase(){
        ExtentSparkReporter spark = new ExtentSparkReporter("target/spark.html");
        extent.attachReporter(spark);
        YourCartPage ycp = new YourCartPage(driver);
        ycp.verifyCartPage();
        logger.info("User is successfully navigated to the Your Cart Page");
        test = extent.createTest("validating that user is able to navigate to the Your Cart Page");
        ycp.clickOnCheckoutButton();
        logger.info("User has clicked on the Checkout Button");
        test = extent.createTest("Validating that user has successfully clicked on the Checkout Button");
    }
}

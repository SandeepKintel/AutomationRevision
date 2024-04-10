import base.BaseClass;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.annotations.Test;
import pageObject.LoginPage;
import pageObject.ProductPage;

public class LoginTestCase extends BaseClass {

    @Test
    public void LoginTestCase() {

        driver.get(baseUrl);
        ExtentSparkReporter spark = new ExtentSparkReporter("target/spark.html");
        extent.attachReporter(spark);
        LoginPage lp = new LoginPage(driver);
        logger.info("Directed to the Website");
        test = extent.createTest("Navigate to the login page", "In this step user is navigating to the login page");
        lp.verifyLoginPage();
        logger.info("User is successfully navigated to the Login Page");
        test = extent.createTest("Validate the login page", "In this step user is successfully navigated to the login page");
        lp.enterUserName(userName);
        logger.info("Username has been entered");
        test = extent.createTest("Validate User is able to enter the User id", "In this step user is successfully entered the email id in the user id field");
        lp.enterPassword(passWord);
        logger.info("Password has been entered");
        test = extent.createTest("Validate User is able to enter the Password", "In this step user is successfully entered the password in the password field");
        lp.clickLoginButton();
        logger.info("User has been successfully logged In");
        test = extent.createTest("Validate User is able to click on the login button", "In this step user is successfully clicked on the Login button");
        ProductPage  pp=new ProductPage(driver);
        pp.verifyProductPage();
        logger.info("Login Page has been verified successfully");
        test = extent.createTest("Validate User is successfully logged In ", "In this step user is successfully logged In to the application by using valid credentials");
        extent.flush();
    }
}

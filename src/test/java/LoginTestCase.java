import base.BaseClass;
import org.testng.annotations.Test;
import pageObject.LoginPage;
import pageObject.ProductPage;

public class LoginTestCase extends BaseClass {

    @Test
    public void LoginTestCase() {
        driver.get(baseUrl);
        LoginPage lp = new LoginPage(driver);
        logger.info("Directed to the Website");
        lp.verifyLoginPage();
        logger.info("User is successfully navigated to the Login Page");
        lp.enterUserName(userName);
        logger.info("Username has been entered");
        lp.enterPassword(passWord);
        logger.info("Password has been entered");
        lp.clickLoginButton();
        logger.info("User has been successfully logged In");
        ProductPage  pp=new ProductPage(driver);
        pp.verifyProductPage();
        logger.info("Login Page has been verified successfully");
    }
}

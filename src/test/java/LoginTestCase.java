import base.BaseClass;
import org.testng.annotations.Test;
import pageObject.LoginPage;

public class LoginTestCase extends BaseClass {

    @Test
    public void LoginTestCase() {
        driver.get(baseUrl);
        LoginPage lp = new LoginPage(driver);
        lp.enterUserName(userName);
        lp.enterPassword(passWord);
        lp.clickLoginButton();
    }
}

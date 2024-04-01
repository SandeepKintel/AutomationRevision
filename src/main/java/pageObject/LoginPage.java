package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver ldriver; //creating an instance of the driver
    //Passing the driver as a perimeter so whenever we create an instance of this class this
    // constructor will call, and then it will point the other page's driver to this page
    public LoginPage(WebDriver rdriver){
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }
    @FindBy(xpath= "//input[@id='user-name']")
    WebElement username;

    @FindBy(xpath = "//input[@id='password']")
    WebElement password;

    @FindBy(xpath = "//input[@id='login-button']")
    WebElement loginButton;

    public void enterUserName(String Email){
        username.sendKeys(Email);
    }

    public void enterPassword(String Password){
        password.sendKeys(Password);
    }

    public void clickLoginButton(){
        loginButton.click();
    }
}

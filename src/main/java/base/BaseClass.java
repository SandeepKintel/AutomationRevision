package base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import util.ReadConfig;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class BaseClass {
    ReadConfig readconfig = new ReadConfig();
        public String baseUrl = readconfig.getAppUrl();
        public String userName= readconfig.getEmail();
        public String passWord= readconfig.getPassword();
        //public String driverValue= readconfig.getDriver();
        public static WebDriver driver;
        public static Logger logger;

        public static ExtentReports report;
        public static ExtentTest test;
        public static ExtentReports extent = new ExtentReports();
    //Test edit from github
    //Second Edit from Github 


        @BeforeTest
        public void setUp(){
            System.setProperty("webdriver.chrome.driver", readconfig.getDriver());
            ChromeOptions options = new ChromeOptions();
            driver= new ChromeDriver(options);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            logger = Logger.getLogger("AutomationRevision");
        }

//        @AfterTest
//        public void tearDown(){
//            driver.quit();
//        }
    }

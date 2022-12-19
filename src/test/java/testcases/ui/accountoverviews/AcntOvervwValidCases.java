package testcases.ui.accountoverviews;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pageObjects.AccountOverview;
import pageObjects.LoginPage;
import utility.Browser;
import utility.TestDataReader;

import java.util.Properties;

public class AcntOvervwValidCases {
    Browser br;
    LoginPage login;
    AccountOverview acntoverviewobj;
    WebDriver driver;
    Properties browser;
    Properties testcase;

    @BeforeSuite
    public void readBrowser(){
        browser= TestDataReader.readProperties("Browser.properties");
        br=new Browser(browser.getProperty("browser"));
    }

    @BeforeMethod
    public void readtestData() {
        br.launchBrowser();
        br.maximize();
        driver = br.getDriver();
        login = new LoginPage(br.getDriver());
        acntoverviewobj = new AccountOverview(br.getDriver());
        testcase = TestDataReader.readProperties("tc001.properties");
        br.navigateUrl(browser.getProperty("url"));
        login.enterUsername(testcase.getProperty("username"));
        login.enterPassword(testcase.getProperty("password"));
        login.clickLogIn();
    }

    @Test
    public void tc001_acntoverview_validcase1(){
        br.navigateUrl(browser.getProperty("url"));
        acntoverviewobj.clickaccountoverview();
        acntoverviewobj.clickaccountid();
        acntoverviewobj.clickselectmonths();
        acntoverviewobj.clickaccounttype();
        acntoverviewobj.clickgobutton();
        //acntoverviewobj.fundtransferrecieved();
    }
    /*@Test(priority = 2)
    public void dealwithmultiplewindows(){
        br.navigateUrl(browser.getProperty("url"));
        acntoverviewobj.clickaccountoverview();
        Set<String> windows=driver.getWindowHandles();
        String currentwindow = driver.getWindowHandle();
        System.out.println(driver.getTitle());

        for(String window:windows){
            if(!window.equals(currentwindow)){
                driver.switchTo().window(window);
                System.out.println(driver.getTitle());
            }
        }
    }*/

}


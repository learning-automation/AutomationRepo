package testcases.ui.opennewaccount;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.OpenNewAccount;
import utility.Browser;
import utility.TestDataReader;

import java.util.Properties;

public class OpenNewAccountValidCase {
    Browser br;
    LoginPage login;
    OpenNewAccount opennewaccountobj;
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
        opennewaccountobj= new OpenNewAccount(br.getDriver());
        testcase = TestDataReader.readProperties("TC_001.properties");
        br.navigateUrl(browser.getProperty("url"));
        login.enterUsername(testcase.getProperty("username"));
        login.enterPassword(testcase.getProperty("password"));
        login.clickLogIn();
}
@Test
public void TC_001Validcase(){
      br.navigateUrl(browser.getProperty("url"));

      opennewaccountobj.openNewAccountClick();
      opennewaccountobj.clickchecking();
      opennewaccountobj.clickaccountnumber();
      opennewaccountobj.setOpennewAccButton();

    }
}
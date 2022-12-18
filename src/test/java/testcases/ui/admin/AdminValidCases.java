package testcases.ui.admin;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pageObjects.AdminPage;
import pageObjects.LoginPage;
import utility.Browser;
import utility.TestDataReader;

import java.util.Properties;

public class AdminValidCases {
    Browser br;
    LoginPage login;
    WebDriver driver;
    Properties browser;
    Properties testCase;
    AdminPage admin;

    @BeforeSuite
    public void readBrowser() {
        browser = TestDataReader.readProperties("Browser.properties");
        br = new Browser(browser.getProperty("browser"));
    }

    @BeforeMethod
    public void readTestData() {
        br.launchBrowser();
        br.maximize();
        driver = br.getDriver();
        login = new LoginPage(br.getDriver());
        admin=new AdminPage(br.getDriver());
    }
    @Test
    public void tc002_parabank_adminPageButton(){
        admin.clickAdminPageButton();

    }

    @Test
    public void tc002_parabank_initializeButton(){
        admin.clickInitializeButton();

    }

    @Test
    public void tc002_parabank_cleanButton(){
        admin.clickCleanButton();

    }

    @Test
    public void tc002_parabank_shutdownButton(){
        admin.clickShutdownButton();

    }
}

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

    @BeforeMethod
    public void readBrowser() {
        browser = TestDataReader.readProperties("Browser.properties");
        br = new Browser(browser.getProperty("browser"));
        br = new Browser(browser.getProperty("browser"));
        br.launchBrowser();
        br.maximize();
        driver = br.getDriver();
        login = new LoginPage(br.getDriver());
    }

    @Test
    public void tc002_parabank_adminPage() {
        admin.clickAdminPageButton();
        admin.clickInitializeButton();
        admin.clickCleanButton();
        admin.clickShutdownButton();
        admin.clickSoapButton();
        admin.clickRestXMLButton();
        admin.clickRestJSONButton();
        admin.clickJDBCButton();


    }
}

package testcases.ui.forgetinfo;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pageObjects.ForgetLoginInfoPage;
import utility.Browser;
import utility.TestDataReader;
import java.util.Properties;

public class ForgetInfoCases {

    Browser br;
    WebDriver driver;
    Properties browser;
    Properties testCase;
    ForgetLoginInfoPage forgetLoginInfoPage;

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
        forgetLoginInfoPage = new ForgetLoginInfoPage(br.getDriver());
    }

    @Test
    public void tC001_ForgetInfoParaBank() throws InterruptedException {
        testCase = TestDataReader.readProperties("ForgetLoginInfo.properties");
        br.navigateUrl(browser.getProperty("url"));
        forgetLoginInfoPage.click_info();
        forgetLoginInfoPage.getTitle(testCase.getProperty("title1"));
        forgetLoginInfoPage.getInfoTitle(testCase.getProperty("title2"));
        forgetLoginInfoPage.firstName(testCase.getProperty("first_name"));
        forgetLoginInfoPage.lastName(testCase.getProperty("last_name"));
        forgetLoginInfoPage.address(testCase.getProperty("address1"));
        forgetLoginInfoPage.city(testCase.getProperty("city1"));
        forgetLoginInfoPage.state(testCase.getProperty("state1"));
        forgetLoginInfoPage.zip(testCase.getProperty("zip_code1"));
        forgetLoginInfoPage.ssnCode(testCase.getProperty("ssn_number1"));
        forgetLoginInfoPage.clickLogIn();

    }


}

package testcases.ui;

import utility.Browser;
import utility.TestData;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.QaFoxPageObject;
import utility.TestDataReader;

import java.util.Properties;

public class QaFoxTestCases {

    Browser br;
    WebDriver driver;
    QaFoxPageObject qaFoxPageObject;
    Properties testCase;

    @BeforeSuite
    public void beforesuit() {
        testCase = TestDataReader.readProperties("Browser.properties");
        br = new Browser(testCase.getProperty("browser"));
    }

    @BeforeTest
    public void beforetest() {
        br.launchBrowser();
        br.maximize();
        driver = br.getDriver();
        qaFoxPageObject = new QaFoxPageObject(br.getDriver());
        br.navigateUrl(testCase.getProperty("url1"));
    }
    @Test
    public void clickbtnTutorial() {
        qaFoxPageObject.hoverAction();
        qaFoxPageObject.hoverAction2();
        qaFoxPageObject.clickbtntutorial();
        qaFoxPageObject.hoverAction3();
        qaFoxPageObject.clickbtntutorial();
        qaFoxPageObject.hoverAction4();
        qaFoxPageObject.clickbtntutorial();
        qaFoxPageObject.hoverAction5();
        qaFoxPageObject.clickbtntutorial();
        qaFoxPageObject.hoverAction6();
        qaFoxPageObject.clickbtntutorial();
        qaFoxPageObject.hoverAction7();
        qaFoxPageObject.clickbtntutorial();
        qaFoxPageObject.hoverAction8();
    }
}

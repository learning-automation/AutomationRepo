package testcases.ui;

import utility.Browser;
import utility.TestData;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.QaFoxPageObject;

public class QaFoxTestCases {

    Browser br;
    WebDriver driver;
    QaFoxPageObject qaFoxPageObject;

    @BeforeSuite
    public void beforesuit() {
        br = new Browser(TestData.browser);
    }

    @BeforeTest
    public void beforetest() {
        br.launchBrowser();
        br.maximize();
        driver = br.getDriver();
        qaFoxPageObject = new QaFoxPageObject(br.getDriver());
    }
    @Test
    public void clickbtnTutorial() {
        br.navigateUrl(TestData.url);
        //qaFoxPageObject.clickbtnhome();
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
        //qaFoxPageObject.clickbtnwebdriver();

    }
}

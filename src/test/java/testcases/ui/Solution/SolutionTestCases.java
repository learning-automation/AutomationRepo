package testcases.ui.Solution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.SolutionPage;
import utility.Browser;
import utility.TestDataReader;

import java.util.Properties;

public class SolutionTestCases {

    Browser br;
    LoginPage login;
    WebDriver driver ;
    Properties browser ;
    Properties testCase;
    SolutionPage solution;

    @BeforeSuite
    public void readBrowser(){

        browser = TestDataReader.readProperties("Browser.properties");
        br = new Browser(browser.getProperty("browser"));
    }


    @BeforeMethod
    public void readData(){
        br.launchBrowser();
        br.maximize();
        driver = br.getDriver();
        login = new LoginPage(br.getDriver());
        solution = new SolutionPage(br.getDriver());
        testCase = TestDataReader.readProperties("TC_001.properties");
        br.navigateUrl(browser.getProperty("url"));
        login.enterUsername(testCase.getProperty("username"));
        login.enterPassword(testCase.getProperty("password"));
        login.clickLogIn();
        solution.clickOnProduct();

    }
    @Test
    public void TC_001_solution() {
        br.navigateUrl(browser.getProperty("url"));
        solution.clickOnSolution();
        solution.clickApiSecurityTesting();
        solution.clickOnSolution();
        solution.clickAPITesting();
        solution.clickOnSolution();
        solution.clickApplSecTest();
        solution.clickOnSolution();
        solution.clickAutomatedTesting();
        solution.clickOnSolution();
        solution.clickCodeCoverage();
        solution.clickOnSolution();
        solution.clickCodeQuality();
        solution.clickOnSolution();
        solution.clickContinuousTesting();
        solution.clickOnSolution();
        solution.clickFunctinalSafetyCompliance();
        solution.clickOnSolution();
        solution.clickLowCodeApplicationTesting();
        solution.clickOnSolution();
        solution.clickPerformanceTesting();
        solution.clickOnSolution();
        solution.clickReportingAnalytics();
        solution.clickOnSolution();
        solution.clickRequirementsTracebility();
        solution.clickOnSolution();
        solution.clickServiceVirtulization();
        solution.clickOnSolution();
        solution.clickSmartTestExecution();
        solution.clickOnSolution();
        solution.clickStaticCodeAnalysis();
        solution.clickOnSolution();
        solution.clickTestDataManagement();
        solution.clickOnSolution();
        solution.clickTestEnvironmentProvisioning();
        solution.clickOnSolution();
        solution.clickUnitTesting();
        solution.clickOnSolution();
        solution.clickWebUITesting();
        solution.clickOnSolution();

    }


}

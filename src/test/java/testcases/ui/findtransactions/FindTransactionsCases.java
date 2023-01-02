package testcases.ui.findtransactions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;
import pageObjects.BillPayPage;
import pageObjects.FindTransactions;
import pageObjects.LoginPage;
import utility.Browser;
import utility.TestDataReader;

import java.util.Properties;

public class FindTransactionsCases {

    //---------------------------------------------------------------------------------------------------------
//    It will Launch the browser.
   
    Browser br;
    Properties browser;
    LoginPage loginPage;
    WebDriver driver;
    FindTransactions findTransactions;
    Properties testcase;

    @BeforeSuite
    public void readBrowser() {
        browser = TestDataReader.readProperties("Browser.properties");
        br = new Browser(browser.getProperty("browser"));
        br.launchBrowser();
        br.maximize();
    }

    //-------------------------------------------------------------------------------------------------------------
//    It will login the parabank homepage

  

    @BeforeMethod
    public void readData() {

        driver = br.getDriver();
        loginPage = new LoginPage(br.getDriver());
        findTransactions = new FindTransactions(br.getDriver());     // POM Page invoked here

        // for login
        testcase = TestDataReader.readProperties("findtransactions.properties");
        br.navigateUrl(browser.getProperty("url"));
        loginPage.enterUsername(testcase.getProperty("username1"));
        loginPage.enterPassword(testcase.getProperty("password1"));
        loginPage.clickLogIn();
    }

    //-------------------------------------------------------------------------------------------------------------
//  >>>>>   TEST CASES



    @Test(priority = 1)
    public void tc001_FindTransactionByID() {

        findTransactions.setClickFindTransactions();
//        findTransactions.setddSelectAccount("AccountNumber");
        findTransactions.setEnterTransactionID(testcase.getProperty("transactionIDD"));
        findTransactions.clickBtnFindTransactionByID();

        Assert.assertEquals(findTransactions.getErrorMsg().getText(), testcase.getProperty("errorMsgFT"));
    }


    @Test(priority = 2)
    public void tc002_FindTransactionByDate() {

        findTransactions.setClickFindTransactions();
//        findTransactions.setddSelectAccount("AccountNumber");
        findTransactions.setEnterTransactionByDate(testcase.getProperty("byDate"));
        findTransactions.clickBtnFindTransactionByDate();
        Assert.assertEquals(driver.getTitle(), "ParaBank | Find Transactions", "Test Case2 is passed");

    }

    @Test(priority = 3)
    public void tc003_FindTransactionByDateRange() {

        findTransactions.setClickFindTransactions();
//        findTransactions.setddSelectAccount("AccountNumber");
        findTransactions.setEnterTransactionFromDate(testcase.getProperty("fromDate"));
        findTransactions.setEnterTransactionToDate(testcase.getProperty("toDate"));
        findTransactions.clickBtnFindTransactionByDateRange();
        Assert.assertEquals(driver.getTitle(), "ParaBank | Find Transactions", "Test case 3 is passed");
    }

    @Test(priority = 4)
    public void tc004_FindTransactionByAmount() {

        findTransactions.setClickFindTransactions();
//        findTransactions.setddSelectAccount("AccountNumber");
        findTransactions.setEnterTransactionAmount(testcase.getProperty("byAmount"));
        findTransactions.clickBtnFindTransactionByAmount();
        Assert.assertEquals(driver.getTitle(),"ParaBank | Find Transactions","Test case 4 is passed");
    }

//    @AfterSuite
//    public void closeBrowser(){
//        br.closeBrowser();
//    }
}
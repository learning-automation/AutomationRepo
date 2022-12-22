package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FindTransactions {
    WebDriver driver;
    WebDriverWait wait;
    public FindTransactions(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }

    @FindBy(xpath = "//a[contains(., 'Find Transactions')]")
    WebElement clickFindTransactions;

    @FindBy(xpath = "//*[@id='accountId'")
    WebElement ddSelectAccount;

    @FindBy(xpath = "//*[@id='criteria.transactionId']")
    WebElement enterTransactionID;

    @FindBy(xpath = "//*[@id='criteria.onDate']")
    WebElement enterTransactiByDate;

    @FindBy(xpath = "//*[@id='criteria.fromDate']")
    WebElement enterTransactionFromDate;

    @FindBy(xpath = "//*[@id='criteria.toDate']")
    WebElement enterTransactionToDate;

    @FindBy(xpath = "//*[@id='criteria.amount']")
    WebElement enterTransactionAmount;


    @FindBy(xpath = "//*[@class='button' and @ng-click=\"criteria.searchType = 'ID'\"]")            /* Buttons */
    WebElement btnFindTransactionByID;

    @FindBy(xpath = "//*[@id='criteria.onDate' and @ng-required=\"criteria.searchType === 'DATE'\"]")
    WebElement btnFindTransactionByDate;

    @FindBy(xpath = "//*[@class='button' and @ng-click=\"criteria.searchType = 'DATE_RANGE'\"]")
    WebElement btnFindTransactionByDateRange;

    @FindBy(xpath = "//*[@class='button' and @ng-click=\"criteria.searchType = 'AMOUNT'\"]")
    WebElement btnFindTransactionByAmount;

    //    @FindBy(xpath = "//*[@class='input' and @name='username']")                             /* Username and password */
//            WebElement username;
//    @FindBy(xpath = "//*[@class='input' and @name='password']")
//    WebElement password;
//    @FindBy(xpath = "//*[@value='Log In' and @class='button']")
//    WebElement btnLogin;
//
    @FindBy(xpath = "//*[@class='error']")
    WebElement errorMsg;

//


    public void setClickFindTransactions(){
        WebElement element1 = this.wait.until(ExpectedConditions.elementToBeClickable(clickFindTransactions));
        element1.click();
    }

            public void setddSelectAccount(String selectAccount){
                Select s = new Select(ddSelectAccount);
                s.selectByValue(selectAccount);
                Reporter.log("Selected Account nummber is >>>" + selectAccount);
            }

                public void setEnterTransactionID(String enterTransID) {
                    WebElement element2 = this.wait.until(ExpectedConditions.elementToBeClickable(enterTransactionID));
                    element2.sendKeys(enterTransID);
                    Reporter.log("Selected Transaction ID is >>>" + enterTransID);
                }

                    public void setEnterTransactionByDate(String ByDate){
                        WebElement element3= this.wait.until(ExpectedConditions.elementToBeClickable(enterTransactiByDate));
                        element3.sendKeys(ByDate);
                        Reporter.log("Selected Transaction Date is >>>" + ByDate);

                    }

    public void setEnterTransactionFromDate(String FromDate){
        WebElement element4=wait.until(ExpectedConditions.elementToBeClickable(enterTransactionFromDate));
        element4.sendKeys(FromDate);
        Reporter.log("From Date is >>>" + FromDate);
            }

            public void setEnterTransactionToDate(String ToDate){
                WebElement element5=wait.until(ExpectedConditions.elementToBeClickable(enterTransactionToDate));
                element5.sendKeys(ToDate);
                Reporter.log("To Date is >>>"+ ToDate);
            }

                public void setEnterTransactionAmount(String Amount){
                    WebElement element6=wait.until(ExpectedConditions.elementToBeClickable(enterTransactionAmount));
                    element6.sendKeys(Amount);
                    Reporter.log("Transaction Amount is >>>" + Amount);
                }

                    public void clickBtnFindTransactionByID(){                                /* Methods for Buttons */
                        WebElement btn1= wait.until(ExpectedConditions.visibilityOf(btnFindTransactionByID));
                        btn1.click();
                    }

                        public void clickBtnFindTransactionByDate(){
                            WebElement btn2= wait.until(ExpectedConditions.visibilityOf(btnFindTransactionByDate));
                            btn2.click();
                        }

    public void clickBtnFindTransactionByDateRange(){
        WebElement btn3= wait.until(ExpectedConditions.visibilityOf(btnFindTransactionByDateRange));
        btn3.click();
        }

            public void clickBtnFindTransactionByAmount(){
                WebElement btn4= wait.until(ExpectedConditions.visibilityOf(btnFindTransactionByAmount));
                btn4.click();
        }

                public WebElement getErrorMsg(){
                   return errorMsg;
                }

//    public void enterUsername(String txtUsername){                            /* Methods for Username and Password*/
//        username.sendKeys("ameen");
//    }
//
//    public void enterPassword(String txtPassword){
//        password.sendKeys("ameen");
//
//    }
//    public void clickLogin(){
//        btnLogin.click();
//    }




//    public static void main(String args[]) throws Exception{
//
//        System.setProperty("webdriver.chrome.driver","C:\\Users\\FAHIM\\Downloads\\chromedriver_win32\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//
//        FindTransactions FT = new FindTransactions(driver);
//        driver.get("https://parabank.parasoft.com/");


    // Thread.sleep(5000);

//        FT.enterUsername("fahim");
//        FT.enterPassword("fahim");
//        FT.clickLogin();


//        LoginPage lp = new LoginPage(driver);
//        lp.enterUsername("ameen");
//        lp.enterUsername("ameen");
//        lp.clickLogIn();
//        FT.setClickFindTransactions();
//        FT.setddSelectAccount();
//        FT.setEnterTransactionID();
//        FT.clickBtnFindTransactionByID();
//        Assert.assertEquals(FT.errorMsg.getText(),"An internal error has occurred and has been logged.","Test case is passed.");
//        System.out.println("Test case is passed");


//        FT.setEnterTransactionID();
//
//        FT.clickBtnFindTransactionByID();


}





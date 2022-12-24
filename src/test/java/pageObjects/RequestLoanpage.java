package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class RequestLoanpage {

    @FindBy(xpath = "//a[@href='/parabank/requestloan.htm']")
    public WebElement lnkrequestloan;

    @FindBy(xpath = "//*[@id='amount']")
    public WebElement loanamount;

    @FindBy(xpath = "//*[@id='downPayment']")
    public WebElement downpayent;

    @FindBy(xpath = "//select[@id='fromAccountId']")
    public WebElement formaccount;

    @FindBy(xpath = "//*[@value='Apply Now']")
    public WebElement btn;

    @FindBy(xpath = "//div[@class='ng-scope']")
    public WebElement errormsg;

    private WebDriver driver;
    private WebDriverWait wait;


    public RequestLoanpage(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 90);
    }

    public void requestloanhyperlnk() {
        WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(lnkrequestloan));
        ele.click();
        Reporter.log("click hyper link");
    }

    public void enterLoanAmount(String a) {
        WebElement ele = wait.until(ExpectedConditions.visibilityOf(loanamount));
        ele.sendKeys();
        Reporter.log("Enter loan amount" + a);
    }

    public void enterDownpayment(String b) {
        WebElement ele = wait.until(ExpectedConditions.visibilityOf(downpayent));
        ele.sendKeys();
        Reporter.log("enter amount" + b);
    }

    public void formAccount() {
       formaccount.click();
        Reporter.log("Click on Account no");
    }

    public void buttonClick() {
       btn.click();
        Reporter.log("click");
    }

    public void lblerror() {
        WebElement ele = wait.until(ExpectedConditions.visibilityOf(errormsg));
        Reporter.log("error message");

    }
}






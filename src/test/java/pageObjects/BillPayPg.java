package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class BillPayPg
{
    private final WebDriver driver;
    private final WebDriverWait wait;

    public BillPayPg(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
        this.wait = new WebDriverWait(driver, 45);
    }
    @FindBy(xpath = "//a[text()='Bill Pay']")
    WebElement linkBillpay;

    @FindBy(xpath = "//*[@ng-model='payee.name']")
    WebElement txtPayeename;

    @FindBy(xpath = "//*[@ng-model='payee.address.street']")
    WebElement textAdresss;

    @FindBy(xpath = "//*[@ng-model='payee.address.city']")
    WebElement txtCity;

    @FindBy(xpath = "//*[@ng-model='payee.address.state']")
    WebElement txtState;

    @FindBy(xpath = "//*[@ng-model='payee.address.zipCode']")
    WebElement txtZipcode;

    @FindBy(xpath = "//*[@ng-model='payee.phoneNumber']")
    WebElement txtPhonenumber;

    @FindBy(xpath = "//*[@ng-model='payee.accountNumber']")
    WebElement txtAccountnumber;

    @FindBy(xpath = "//*[@ng-model='verifyAccount']")
    WebElement txtVerifyAccount;

    @FindBy(xpath = "//*[@ng-model='amount']")
    WebElement txtAmount;

    @FindBy(xpath = "//*[@ng-model='accountId']")
    WebElement selectAccount;

    @FindBy(xpath = "//*[@value='Send Payment']")
    WebElement btnSend;

    public void clickBillPay()
    {
        WebElement bilpaylink = wait.until(ExpectedConditions.elementToBeClickable(linkBillpay));
        bilpaylink.click();
    }
    public void enterTxtPayeename(String payeename)
    {
        WebElement payee = wait.until(ExpectedConditions.visibilityOf(txtPayeename));
        payee.sendKeys(payeename);
        Reporter.log("entering payeename: "+ payeename);
        System.out.println("entering payeename: "+ payeename);;
    }
    public void enterTextAdresss(String address)
    {
        WebElement adres = wait.until(ExpectedConditions.visibilityOf(textAdresss));
        adres.sendKeys(address);
        Reporter.log("Entering Address: " + address );
        System.out.println("Entering Address: " + address );
    }
    public void enterTxtCity(String city)
    {
        WebElement citi = wait.until(ExpectedConditions.visibilityOf(txtCity));
        citi.sendKeys(city);
        Reporter.log("Entering city: " + city);
        System.out.println("Entering city: " + city);
    }
    public void enterTxtState(String state)
    {
        WebElement stat = wait.until(ExpectedConditions.visibilityOf(txtState));
        stat.sendKeys(state);
        Reporter.log("Entering state: " + state);
        System.out.println("Entering state: " + state);
    }
    public void enterTxtZipcode(String zipcode)
    {
        WebElement zip = wait.until(ExpectedConditions.visibilityOf(txtZipcode));
        zip.sendKeys(zipcode);
        Reporter.log("Entering zipcode: " + zipcode);
        System.out.println("Entering zipcode: " + zipcode);
    }
    public void enterTxtPhonenumber(String phonenumber)
    {
        WebElement phone = wait.until(ExpectedConditions.visibilityOf(txtPhonenumber));
        phone.sendKeys(phonenumber);
        Reporter.log("Entering phone number: " + phonenumber);
        System.out.println("Entering phone number: " + phonenumber);
    }
    public void enterTxtAccountnumber(String accountnumber)
    {
        WebElement accoount = wait.until(ExpectedConditions.visibilityOf(txtAccountnumber));
        accoount.sendKeys(accountnumber);
        Reporter.log("Entering Account number: " + accountnumber);
        System.out.println("Entering Account number: " + accountnumber);
    }
    public void enterTxtVerifyAccount(String verifyAccount)
    {
        WebElement vaccount = wait.until(ExpectedConditions.visibilityOf(txtVerifyAccount));
        vaccount.sendKeys(verifyAccount);
        Reporter.log("verifyaccount: " + verifyAccount);
        System.out.println("verifyaccount: " + verifyAccount);
    }
    public void enterTxtAmount(String amount)
    {
        WebElement amt = wait.until(ExpectedConditions.visibilityOf(txtAmount));
        amt.sendKeys(amount);
        Reporter.log("Entering amount: " + amount);
        System.out.println("Entering amount: " + amount);
    }
    public void enterSelectAccount()
    {
        Select dd = new Select(selectAccount);
        dd.selectByIndex(0);
    }
    public void clickBtnSend()
    {
        WebElement sendbtn = wait.until(ExpectedConditions.elementToBeClickable(btnSend));
        sendbtn.click();
    }
}

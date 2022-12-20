package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BillPayPg
{
    private WebDriver driver;

    public BillPayPg(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
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
        linkBillpay.click();
    }
    public void setTxtPayeename(String payeename)
    {
        txtPayeename.sendKeys(payeename);
    }
    public void setTextAdresss(String address)
    {
        textAdresss.sendKeys(address);
    }
    public void setTxtCity(String city)
    {
        txtCity.sendKeys(city);
    }
    public void setTxtState(String state)
    {
        txtState.sendKeys(state);
    }
    public void setTxtZipcode(String zipcode)
    {
        txtZipcode.sendKeys(zipcode);
    }
    public void setTxtPhonenumber(String phonenumber)
    {
        txtPhonenumber.sendKeys(phonenumber);
    }
    public void setTxtAccountnumber(String accountnumber)
    {
        txtAccountnumber.sendKeys(accountnumber);
    }
    public void setTxtVerifyAccount(String verifyAccount)
    {
        txtVerifyAccount.sendKeys(verifyAccount);
    }
    public void setTxtAmount(String amount)
    {
        txtAmount.sendKeys(amount);
    }
    public void setSelectAccount()
    {
        Select dd = new Select(selectAccount);
        dd.selectByIndex(0);
    }
    public void clickBtnSend()
    {
        btnSend.click();
    }

}

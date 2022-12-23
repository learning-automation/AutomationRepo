package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class RegisterPage {
    private WebDriver driver;

    @FindBy(partialLinkText = "Regis")
    public WebElement linkRegister;
    @FindBy(xpath = "//*[@name='customer.firstName']")
    public WebElement txtFirstName;
    @FindBy(xpath = "//*[@id='customer.lastName']")
    public WebElement txtLastName;
    @FindBy(xpath = "//*[@id='customer.address.street']")
    public WebElement txtAddress;
    @FindBy(xpath = "//*[@id='customer.address.city']")
    public WebElement txtCity;
    @FindBy(xpath = "//*[@id='customer.address.state']")
    public WebElement txtState;
    @FindBy(xpath = "//*[@id='customer.address.zipCode']")
    public WebElement txtZipCode;
    @FindBy(xpath = "//*[@id='customer.phoneNumber']")
    public WebElement txtPhone;
    @FindBy(xpath = "//*[@id='customer.ssn']")
    public WebElement txtSsn;
    @FindBy(xpath = "//*[@id='customer.username']")
    public WebElement txtUserName;
    @FindBy(xpath = "//*[@id='customer.password']")
    public WebElement txtPassword;
    @FindBy(xpath = "//*[@id='repeatedPassword']")
    public WebElement txtConfirm;
    @FindBy(xpath = "//*[@type='submit']")
    public WebElement btnRegister;

    private WebDriverWait wait;

    public RegisterPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
        this.driver=driver;
        this.wait= new WebDriverWait(driver, 90);
    }

    public void clickRegister()
    {
        WebElement ele=wait.until(ExpectedConditions.elementToBeClickable(linkRegister));
        ele.click();
        Reporter.log("Clicking to Register");

    }

    public void enterFirstName(String firstname)
    {
        WebElement ele=wait.until(ExpectedConditions.visibilityOf(txtFirstName));
        ele.sendKeys(firstname);
        Reporter.log("Entering First Name" +firstname);

    }
    public void enterLastName(String lastname)
    {
        WebElement ele=wait.until(ExpectedConditions.visibilityOf(txtLastName));
        ele.sendKeys(lastname);
        Reporter.log("Entering Last Name" +lastname);
    }

    public void enterAddress(String address)
    {
        WebElement ele=wait.until(ExpectedConditions.visibilityOf(txtAddress));
        ele.sendKeys(address);
        Reporter.log("Entering Address" +address);
    }

    public void enterCity(String city)
    {
        WebElement ele=wait.until(ExpectedConditions.visibilityOf(txtCity));
        ele.sendKeys(city);
        Reporter.log("Entering city" +city);
    }

    public void enterState(String state)
    {
        WebElement ele=wait.until(ExpectedConditions.visibilityOf(txtState));
        ele.sendKeys(state);
        Reporter.log("Entering state" +state);
    }

    public void enterZipCode(String zipcode)
    {
        WebElement ele=wait.until(ExpectedConditions.visibilityOf(txtZipCode));
        ele.sendKeys(zipcode);
        Reporter.log("Entering Zip code" +zipcode);
    }

    public void enterPhone(String phone)
    {
        WebElement ele=wait.until(ExpectedConditions.visibilityOf(txtPhone));
        ele.sendKeys(phone);
        Reporter.log("Entering phone number" +phone);
    }

    public void enterSsn(String ssn)
    {
        WebElement ele=wait.until(ExpectedConditions.visibilityOf(txtSsn));
        ele.sendKeys(ssn);
        Reporter.log("Entering SSN number" +ssn);
    }

    public void enterUserName(String username)
    {
        WebElement ele=wait.until(ExpectedConditions.visibilityOf(txtUserName));
        ele.sendKeys(username);
        Reporter.log("Entering User Name" +username);
    }

    public void enterPassword(String password)
    {
        WebElement ele=wait.until(ExpectedConditions.visibilityOf(txtPassword));
        ele.sendKeys(password);
        Reporter.log("Entering password" +password);
    }

    public void enterConfirm(String confirm)
    {
        WebElement ele=wait.until(ExpectedConditions.visibilityOf(txtConfirm));
        ele.sendKeys(confirm);
        Reporter.log("Entering confirm password" +confirm);
    }

    public void clickRegister1()
    {
        WebElement ele=wait.until(ExpectedConditions.elementToBeClickable(btnRegister));
        ele.click();
        Reporter.log("Clicking to Register");

    }
}

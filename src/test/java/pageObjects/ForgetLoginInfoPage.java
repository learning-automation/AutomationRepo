
package pageObjects;

import org.apache.xpath.operations.String;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class ForgetLoginInfoPage {
    @FindBy(linkText = "Forgot login info?")
    public WebElement linkForgetLogin;

    @FindBy(xpath = "//*[@id=\'rightPanel\']/h1")  // single qoutes in xpath
    public WebElement txtTitle;

    @FindBy(xpath = "//*[@id=\'rightPanel\']/p") // single qoutes in xpath
    public WebElement txtMsgTitle;

    @FindBy(id = "firstName")
    public WebElement txtFirstName;

    @FindBy(css = "#lastName")
    public WebElement txtLastName;

    @FindBy(name = "address.street")
    public WebElement txtAddress;

    @FindBy(xpath = "//input[@id='address.city']")
    public WebElement txtCity;

    @FindBy(id = "address.state")
    public WebElement txtState;

    @FindBy(xpath = "//input[@id='address.zipCode']")
    public WebElement digitZipCode;

    @FindBy(id = "ssn")
    public WebElement digitSsnCode;

    @FindBy(className = "button")
    public WebElement btnLogin;

    public WebDriver driver;
    public WebDriverWait wait;

    public ForgetLoginInfoPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 90);
    }

    public void click_info() {
        linkForgetLogin.click();
        Reporter.log("Click on login info");
    }

    public void getTitle(String title1) throws InterruptedException {
        Thread.sleep(1000);
        System.out.println(txtTitle.getText());
        Assert.assertEquals(txtTitle.getText(), title1);
    }

    public void getInfoTitle(String title2) throws InterruptedException {
        Thread.sleep(1000);
        System.out.println(txtMsgTitle.getText());
        Assert.assertEquals(txtMsgTitle.getText(), title2);
    }

    public void firstName(String first_name) {
        WebElement ele = wait.until(ExpectedConditions.visibilityOf(txtFirstName));
        ele.sendKeys(first_name);
        Reporter.log("Entering first name:" + txtFirstName);
    }

    public void lastName(String last_name) {
        WebElement ele= wait.until(ExpectedConditions.visibilityOf(txtLastName)); // webdriver wait changes
        ele.sendKeys(last_name);
        Reporter.log("Entering last name:" + last_name);
    }

    public void address(String address1) {
        txtAddress.sendKeys(address1);
        Reporter.log("Entering address:" + address1);
    }

    public void city(String city1) {
        WebElement ele= wait.until(ExpectedConditions.visibilityOf(txtCity));   // webdriver wait changes
        ele.sendKeys(city1);
        Reporter.log("Entering city:" + city1);

    }

    public void state(String state1) {
        WebElement ele= wait.until(ExpectedConditions.visibilityOf(txtState));   // webdriver wait changes
        ele.sendKeys(state1);
        Reporter.log("Entering state:" + state1);
    }

    public void zip(String zip_code1) {
        WebElement ele= wait.until(ExpectedConditions.visibilityOf(digitZipCode));   // webdriver wait changes
        ele.sendKeys(zip_code1);
        Reporter.log("Entering state:" + zip_code1);
    }

    public void ssnCode(String ssn_number1) {
        WebElement ele= wait.until(ExpectedConditions.visibilityOf(digitSsnCode));   // webdriver wait changes
        ele.sendKeys(ssn_number1);
        Reporter.log("Entering state:" + ssn_number1);
    }

    public void clickLogIn() {
        WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(btnLogin));
        ele.click();
        Reporter.log("Clicking login button");
    }


}

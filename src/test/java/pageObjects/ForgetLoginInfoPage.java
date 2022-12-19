package pageObjects;

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
    public WebElement fr_login;
    @FindBy(xpath = "//*[@id=\"rightPanel\"]/h1")
    public WebElement title;
    @FindBy(xpath = "//*[@id=\"rightPanel\"]/p")
    public WebElement info_title;
    @FindBy(id = "firstName")
    public WebElement f_name;
    @FindBy(css = "#lastName")
    public WebElement l_name;
    @FindBy(name = "address.street")
    public WebElement address;
    @FindBy(xpath = "//input[@id='address.city']")
    public WebElement city;
    @FindBy(id = "address.state")
    public WebElement state;
    @FindBy(xpath = "//input[@id='address.zipCode']")
    public WebElement zipcode;
    @FindBy(id = "ssn")
    public WebElement ssn;
    @FindBy(className = "button")
    public WebElement fn_login;
    public WebDriver driver;
    public WebDriverWait wait;

    public ForgetLoginInfoPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 90);
    }

    public void click_info() {
        fr_login.click();
        Reporter.log("Click on login info");
    }

    public void getTitle(String title1) throws InterruptedException {
        Thread.sleep(1000);
        System.out.println(title.getText());
        Assert.assertEquals(title.getText(), title1);
    }

    public void getInfoTitle(String title2) throws InterruptedException {
        Thread.sleep(1000);
        System.out.println(info_title.getText());
        Assert.assertEquals(info_title.getText(), title2);
    }

    public void firstName(String first_name) {
        WebElement ele = wait.until(ExpectedConditions.visibilityOf(f_name));
        ele.sendKeys(first_name);
        Reporter.log("Entering first name:" + f_name);
    }

    public void lastName(String last_name) {
        l_name.sendKeys(last_name);

        Reporter.log("Entering last name:" + last_name);
    }

    public void address(String address1) {
        address.sendKeys(address1);
        Reporter.log("Entering address:" + address1);

    }

    public void city(String city1) {

        city.sendKeys(city1);

        Reporter.log("Entering city:" + city1);

    }

    public void state(String state1) {
        state.sendKeys(state1);
        Reporter.log("Entering state:" + state1);

    }

    public void zip(String zip_code1) {

        zipcode.sendKeys(zip_code1);
        Reporter.log("Entering state:" + zip_code1);
    }

    public void ssnCode(String ssn_number1) {
        ssn.sendKeys(ssn_number1);
        Reporter.log("Entering state:" + ssn_number1);

    }

    public void clickLogIn() {
        WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(fn_login));
        ele.click();
        Reporter.log("Clicking login button");
    }


}

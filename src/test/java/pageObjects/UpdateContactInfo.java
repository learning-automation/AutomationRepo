//import pageObjects.UpdateContactInfo;
package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class UpdateContactInfo {
    private WebDriver driver;
    private WebDriverWait wait;


    @FindBy(xpath = "//input[@id='customer.firstName']")
    public WebElement txtFirstname;

    @FindBy(xpath="//input[@id='customer.lastName']")
    public WebElement txtLastname;

    @FindBy(xpath = "//input[@id='customer.address.street']")
    public WebElement txtAddress;

    @FindBy(xpath = "//input[@id='customer.address.city']")
    public WebElement txtCity;

    @FindBy(xpath = "//input[@id='customer.address.state']")
    public WebElement txtState;

    @FindBy(xpath = "//input[@id='customer.address.zipCode']")
    public WebElement txtZipcode;

    @FindBy(xpath = "//input[@id='customer.phoneNumber']")
    public WebElement txtPhone;

    @FindBy(xpath ="//*[@value='Update Profile']")
        public WebElement btnUpdate;

    @FindBy(xpath="//a[@href='register.htm']")
    public WebElement clickRegister;

    @FindBy(xpath="//a[@href='/parabank/updateprofile.htm']")
    public WebElement clickUpdateInfo;


    @FindBy(xpath = "//*[@class='title']")
    public WebElement lblMsg;


    public UpdateContactInfo(WebDriver driver)
    {
      PageFactory.initElements(driver,this);
        this.driver=driver;
        this.wait=new WebDriverWait(driver ,90);

    }
    public void enterFirstname(String firstname){
        WebElement ele = wait.until(ExpectedConditions.visibilityOf(txtFirstname));
        ele.sendKeys(firstname);
        Reporter.log("Entering FirstName:" + firstname);
    }

    public void enterLastname(String lastname){
        WebElement ele = wait.until(ExpectedConditions.visibilityOf(txtLastname));
        ele.sendKeys(lastname);
        Reporter.log("Entering LastName:" + lastname);
    }

    public void enterAddress(String address){
        WebElement ele = wait.until(ExpectedConditions.visibilityOf(txtAddress));
        ele.sendKeys(address);
        Reporter.log("Entering Address:" + address);
    }

    public void enterCity(String city){
        WebElement ele = wait.until(ExpectedConditions.visibilityOf(txtCity));
        ele.sendKeys(city);
        Reporter.log("Entering City:" +city);
    }

    public void enterState(String state){
        WebElement ele = wait.until(ExpectedConditions.visibilityOf(txtState));
        ele.sendKeys(state);
        Reporter.log("Entering State:" + state);
    }

    public void enterZipcode(String zipcode){
        WebElement ele = wait.until(ExpectedConditions.visibilityOf(txtZipcode));
        ele.sendKeys(zipcode);
        Reporter.log("Entering Zipcode:" + zipcode);
    }

    public void enterPhone(String phone){
        WebElement ele = wait.until(ExpectedConditions.visibilityOf(txtPhone));
        ele.sendKeys(phone);
        Reporter.log("Entering Phone Number:" + phone);
    }

    public void clickRegister()
    {
        WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(clickRegister));
        ele.click();
        Reporter.log("Click on Register");

    }

    public void clickUpdateInfo()
    {
        WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(clickUpdateInfo));
        ele.click();
        Reporter.log("Click on Update Contact Info");
    }

    public void clickUpdate(){
        WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(btnUpdate));
        ele.click();
        Reporter.log("Clicking Update Profile button");
    }


    public WebElement getMsgElement(){
        return lblMsg;
    }



}

//import pageObjects.UpdateContactInfo;
package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import org.testng.Reporter;

//import javax.xml.stream.XMLStreamReader;

public class UpdateContactInfoPage<lblMsg> {
    private WebDriver driver;
    private WebDriverWait wait;


    @FindBy(xpath = "//*[@id='customer.firstName']")
    public WebElement txtFirstname;

    @FindBy(xpath="//*[@id='customer.lastName']")
    public WebElement txtLastname;

    @FindBy(xpath = "//*[@id='customer.address.street']")
    public WebElement txtAddress;

    @FindBy(xpath = "//*[@id='customer.address.city']")
    public WebElement txtCity;

    @FindBy(xpath = "//*[@id='customer.address.state']")
    public WebElement txtState;

    @FindBy(xpath = "//*[@id='customer.address.zipCode']")
    public WebElement txtZipcode;

    @FindBy(xpath = "//*[@id='customer.phoneNumber']")
    public WebElement txtPhone;

    @FindBy(xpath ="//*[@value='Update Profile']")
        public WebElement btnUpdate;

    @FindBy(xpath="//a[@href='register.htm']")
    public WebElement lnkRegister;

    @FindBy(xpath="//a[@href='/parabank/updateprofile.htm']")
    public WebElement lnkUpdateInfo;


    @FindBy(xpath = "//*[@class='title']")
    public WebElement lblMsg;


    public UpdateContactInfoPage(WebDriver driver)
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

    public void lnkRegister()
    {
        WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(lnkRegister));
        ele.click();
        Reporter.log("Click on Register");

    }

    public void lnkUpdateInfo()
    {
        WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(lnkUpdateInfo));
        ele.click();
        Reporter.log("Click on Update Contact Info");
    }

    public void clickUpdate(){
        WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(btnUpdate));
        ele.click();
        Reporter.log("Clicking Update Profile button");

    }


   // public WebElement getMsgElement(){
   public void validateTitle(String title) {
         Assert.assertEquals(lblMsg,lblMsg.getText());



     // return lblMsg;
       }



}

package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import java.util.List;

public class OpenNewAccountPage {
    @FindBy(xpath = "//a[contains(text(),'Open New Account')]")
    public WebElement linkOpenNewAccount;

    @FindBy(xpath = "//select[@id='type']")
    public WebElement ddAccountType;

    @FindBy(xpath = "//select[@id='fromAccountId']")
    public WebElement ddAccountNumber;

    @FindBy(xpath="input[class='button']")
    public WebElement btnOpenNewAccount;

    @FindBy(className = "title")
    public WebElement accountOpened;

    @FindBy(id="newAccountId")
    public WebElement newAccountIdIs;


    private WebDriver driver;
    private WebDriverWait wait;

    public OpenNewAccountPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 90);
    }
    public void openNewAccountClick(){
        WebElement ele=wait.until(ExpectedConditions.elementToBeClickable(linkOpenNewAccount));
        linkOpenNewAccount.click();
        Reporter.log("Clicking link");
    }
    public void clickAccountType(){
        WebElement elechechekinglist=wait.until(ExpectedConditions.elementToBeClickable(ddAccountType));
        Select Accountcheckinglist=new Select(elechechekinglist);
        List<WebElement> checkingoption=Accountcheckinglist.getOptions();
        Accountcheckinglist.selectByIndex(1);
        Reporter.log("Clicking dropdown list");
    }

    public void clickAccountNumber(){
        WebElement eleaccountlist=wait.until(ExpectedConditions.elementToBeClickable(ddAccountNumber));
        Select accountNumberList=new Select(eleaccountlist);
        List<WebElement> accountoptions=accountNumberList.getOptions();
        accountNumberList.selectByIndex(0);
        Reporter.log("Clicking dropdown list");
    }

    public void clickOpennewAccountButton(){
        //System.out.println("parabank");
        WebElement ele=wait.until(ExpectedConditions.elementToBeClickable(btnOpenNewAccount));
        btnOpenNewAccount.click();
        Reporter.log("Clicking open new account  button");
      //  Reporter.log("Clicking open new account button");
       // System.out.println("New Account is created"+accountOpened.getText());
        //accountOpened.getText();
       // newAccountIdIs.getText();


    }
}
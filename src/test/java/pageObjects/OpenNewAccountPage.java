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
     @FindBy(linkText = "Open New Account")
    public WebElement lnkOpenNewAccount;

    @FindBy(xpath = "//*[@id='type']")
    public WebElement ddAccountType;

    @FindBy(xpath = "//*[@id='fromAccountId']")
    public WebElement ddAccountNumber;

    @FindBy(xpath="//*[@class='button']")
    public WebElement btnOpenNewAccount;

    private WebDriver driver;
    private WebDriverWait wait;

    public OpenNewAccountPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 90);
    }
    public void clickOpenNewAccountLink(){
        WebElement ele=wait.until(ExpectedConditions.elementToBeClickable(lnkOpenNewAccount));
        lnkOpenNewAccount.click();
        Reporter.log("Clicking link");
    }
    public void clickAccountType(){
        WebElement eleAccountTypeList=wait.until(ExpectedConditions.elementToBeClickable(ddAccountType));
        Select accountCheckingList=new Select(eleAccountTypeList);
        List<WebElement> checkingOption=accountCheckingList.getOptions();
        accountCheckingList.selectByIndex(1);
        Reporter.log("Clicking dropdown list");
    }

    public void clickAccountNumber(){
        WebElement eleaccountlist=wait.until(ExpectedConditions.elementToBeClickable(ddAccountNumber));
        Select accountNumberList=new Select(eleaccountlist);
        List<WebElement> accountoptions=accountNumberList.getOptions();
        accountNumberList.selectByIndex(0);
        Reporter.log("Clicking dropdown list");
    }


    public void clickOpenNewAccountButton(){

        WebElement ele=wait.until(ExpectedConditions.elementToBeClickable(btnOpenNewAccount));
        ele.click();
        Reporter.log("Clicking open new account  button");
        System.out.println("ok");



    }
}
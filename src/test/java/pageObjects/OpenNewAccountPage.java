package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class OpenNewAccountPage {
    @FindBy(xpath = "//a[contains(text(),'Open New Account')]")
    public WebElement linkOpenNewAccount;

    @FindBy(xpath = "//select[@id='type']")
    public WebElement ddAccountType;

    @FindBy(xpath = "//select[@id='fromAccountId']")
    public WebElement ddAccountNumber;

     @FindBy(css="input[value='submit']")
     public WebElement openNewAccButton;



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
    }
    public void clickchecking(){
        WebElement elechechekinglist=wait.until(ExpectedConditions.elementToBeClickable(ddAccountType));
        Select Accountcheckinglist=new Select(elechechekinglist);
        List<WebElement> checkingoption=Accountcheckinglist.getOptions();
        Accountcheckinglist.selectByIndex(1);
    }

    public void clickaccountnumber(){
        WebElement eleaccountlist=wait.until(ExpectedConditions.elementToBeClickable(ddAccountNumber));
        Select Acountnolist=new Select(eleaccountlist);
        List<WebElement> accountoptions=Acountnolist.getOptions();
        Acountnolist.selectByValue("14454");
}

      public void setOpennewAccountButton(){

        WebElement ele=wait.until(ExpectedConditions.elementToBeClickable(openNewAccButton));
        openNewAccButton.click();


    }
}
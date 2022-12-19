package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class OpenNewAccount {
    @FindBy(xpath = "//a[contains(text(),'Open New Account')]")
    public WebElement linkOpenNewAccount;

    @FindBy(xpath = "//select[@id='type']")
    public WebElement chkng;

    @FindBy(xpath = "//select[@id='fromAccountId']")
    public WebElement acnt;

     @FindBy(css="input[value='submit']")
     public WebElement opennewAccButton;
     @FindBy(css="h1[class='title']")
     public WebElement openaccount;

     private WebDriver driver;
     private WebDriverWait wait;

    public OpenNewAccount(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 90);
    }
    public void openNewAccountClick(){
        WebElement ele=wait.until(ExpectedConditions.elementToBeClickable(linkOpenNewAccount));
        linkOpenNewAccount.click();
    }
    public void clickchecking(){
        WebElement elechechekinglist=wait.until(ExpectedConditions.elementToBeClickable(chkng));
        Select Accountcheckinglist=new Select(elechechekinglist);
        List<WebElement> checkingoption=Accountcheckinglist.getOptions();
        Accountcheckinglist.selectByIndex(1);
    }

    public void clickaccountnumber(){
        WebElement eleaccountlist=wait.until(ExpectedConditions.elementToBeClickable(acnt));
        Select Acountnolist=new Select(eleaccountlist);
        List<WebElement> accountoptions=Acountnolist.getOptions();
        Acountnolist.selectByIndex(1);
}

      public void setOpennewAccButton(){

        WebElement ele=wait.until(ExpectedConditions.elementToBeClickable(opennewAccButton));
        opennewAccButton.click();


    }
}
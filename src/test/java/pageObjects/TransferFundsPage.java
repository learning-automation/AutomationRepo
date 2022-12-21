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

public class TransferFundsPage {
    @FindBy(xpath = "//a[contains(text(),'Transfer Funds')]")
    public WebElement linkTransferFund;
    @FindBy(xpath = "//*[@id='amount']")
    public WebElement txtAmount;
    @FindBy(xpath = "//*[@id='fromAccountId']")
    public WebElement ddFromAccountList;
    @FindBy(xpath = "//*[@id='toAccountId']")
    public WebElement ddToAccountList;
    @FindBy(xpath = "//input[@class='button']")
    public WebElement buttonTransfer;
    private WebDriver driver;
    private WebDriverWait wait;

    private static final String FROM_ACCOUNT = "14232";
    private static final String TO_ACCOUNT = "14232";

    public TransferFundsPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 90);
    }

    public void clickTransferFunds()
    {


        WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(linkTransferFund));
        ele.click();
        Reporter.log("Click On Transfer Fund Link");
    }

    public void enterAmount(String amt)
    {
        WebElement ele = wait.until(ExpectedConditions.visibilityOf(txtAmount));

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        txtAmount.sendKeys(amt);
            Reporter.log("Enter the Amount " +amt);
    }
    public void fromAccount()
    {
        WebElement elelist = wait.until(ExpectedConditions.elementToBeClickable(ddFromAccountList));
        Select fromAccntNolist = new Select(elelist);
        List<WebElement> accountOptions = fromAccntNolist.getOptions();
        fromAccntNolist.selectByValue(FROM_ACCOUNT);
        ddFromAccountList.click();
        Reporter.log("Selecting FromAccount Number: "+FROM_ACCOUNT);
    }
    public void toAccount()
    {
        WebElement eletlist = wait .until(ExpectedConditions.elementToBeClickable(ddToAccountList));
        Select toAccntNolist = new Select(eletlist);
        List<WebElement> accountOptions = toAccntNolist.getOptions();
        toAccntNolist.selectByValue(TO_ACCOUNT);
        ddToAccountList.click();
        Reporter.log("Selecting ToAccount Number:"+TO_ACCOUNT);

    }
    public void clickButton()
    {
        WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(buttonTransfer));
        buttonTransfer.click();
        Reporter.log("Clicking Transfer Button");
    }

}
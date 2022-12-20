package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class TransferFunds {
    @FindBy(xpath = "//a[contains(text(),'Transfer Funds')]")
    public WebElement linkTransferFund;
    @FindBy(xpath = "//*[@id='amount']")
    public WebElement txtAmount;
    @FindBy(xpath = "//*[@id='fromAccountId']")
    public WebElement selectFromAccount;
    @FindBy(xpath = "//*[@id='toAccountId']")
    public WebElement selectToAccount;
    @FindBy(xpath = "//input[@class='button']")
    public WebElement buttonTransfer;
    private WebDriver driver;
    private WebDriverWait wait;
    public TransferFunds(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 90);
    }

    public void clickTransferFunds()
    {
        //    WebElement ele = driver.findElement(transferfund);
        WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(linkTransferFund));
        System.out.println("On Transfer fund: " + ele);
        ele.click();
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
    }
    public void fromAccount()
    {
        WebElement elelist = wait.until(ExpectedConditions.elementToBeClickable(selectFromAccount));
        Select fromAccntNolist = new Select(elelist);
        List<WebElement> accountOptions = fromAccntNolist.getOptions();
        fromAccntNolist.selectByIndex(0);
        selectFromAccount.click();
    }
    public void toAccount()
    {
        WebElement eletlist = wait .until(ExpectedConditions.elementToBeClickable(selectToAccount));
        Select toAccntNolist = new Select(eletlist);
        List<WebElement> accountOptions = toAccntNolist.getOptions();
        toAccntNolist.selectByIndex(0);
        selectToAccount.click();

    }
    public void clickButton()
    {
        WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(buttonTransfer));
        buttonTransfer.click();
    }

}
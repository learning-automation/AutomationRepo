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
    public WebElement transferfund;


    @FindBy(xpath = "//input[@id='amount']")
    public WebElement amount;

    @FindBy(xpath = "//select[@id='fromAccountId']")
    public WebElement fromaccount;

    @FindBy(xpath = "//select[@id='toAccountId']")
    public WebElement toaccount;

    @FindBy(xpath = "//input[@class='button']")
    public WebElement Transferbttn;

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
        WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(transferfund));
        System.out.println("On Transfer fund: " + ele);
        ele.click();
    }

    public void enterAmount(String amt)
    {
        WebElement ele = wait.until(ExpectedConditions.visibilityOf(amount));
//        char[] amtArr = amt.toCharArray();
//        for (char ch: amtArr) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
//            amount.sendKeys("" + ch);
//        }
        amount.sendKeys(amt);
    }

    public void fromAccount()
    {
        WebElement elelist = wait.until(ExpectedConditions.elementToBeClickable(fromaccount));
        Select fromAccntNolist = new Select(elelist);
        List<WebElement> accountOptions = fromAccntNolist.getOptions();
        fromAccntNolist.selectByIndex(0);
        fromaccount.click();
    }

    public void toAccount()
    {
        WebElement eletlist = wait .until(ExpectedConditions.elementToBeClickable(toaccount));
        Select toAccntNolist = new Select(eletlist);
        List<WebElement> accountOptions = toAccntNolist.getOptions();
        toAccntNolist.selectByIndex(0);
        toaccount.click();

    }

    public void clickButton()
    {
        WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(Transferbttn));
        Transferbttn.click();
    }

}
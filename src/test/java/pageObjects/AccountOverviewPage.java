package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AccountOverviewPage {
    @FindBy(xpath = "//a[contains(text(),'Accounts Overview')]")
    public WebElement linkAccountOverview;

    @FindBy(xpath = "//a[@class='ng-binding']")
    public WebElement linkAccountId;

    @FindBy(xpath = "//*[@id='month']")
    public WebElement ddSelectActivityPeriod;

    @FindBy(xpath = "//*[@name='transactionType']")
    public WebElement ddSelectType;

    @FindBy(xpath = "//*[@value='Go']")
    public WebElement buttonGo;

    @FindBy(xpath = "//a[contains(text(),'Funds Transfer Received')]")
    public WebElement checkboxFundTransfer;

    private WebDriver driver;
    private WebDriverWait wait;

    public AccountOverviewPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 90);
    }

    public void clickAccountOverview() {
        WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(linkAccountOverview));
       linkAccountOverview.click();
    }

    public void clickAccountId(){
        WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(linkAccountId));
        /*Select entrylist = new Select(ele);
        List<WebElement> multipleentries = entrylist.getOptions();
        entrylist.selectByIndex(0);*/
        linkAccountId.click();
    }

    public void clickSelectMonths(){
        WebElement elemonthslist = wait.until(ExpectedConditions.elementToBeClickable(ddSelectActivityPeriod));
        Select monthslist = new Select(elemonthslist);
        List<WebElement> monthsoption = monthslist.getOptions();
        monthslist.selectByIndex(12);
       ddSelectActivityPeriod.click();
    }

    public void clickAccountType(){
        WebElement eleacnttypelist = wait.until(ExpectedConditions.elementToBeClickable(ddSelectType));
        Select accounttypelist  = new Select(eleacnttypelist);
        List<WebElement> accountoption = accounttypelist.getOptions();
        accounttypelist.selectByIndex(2);
    ddSelectType.click();
    }

    public void clickgobutton(){
        WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(buttonGo));
        buttonGo.click();
    }
    /*public void fundtransferrecieved(){
        WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(fundtransferchkbox));
        fundtransferchkbox.click();
        Alert dialog=driver.switchTo().alert();
        dialog.accept();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/

    }




package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AccountOverview extends Operations {
    @FindBy(xpath = "//a[contains(text(),'Accounts Overview')]")
    public WebElement AcntOreview;

    @FindBy(xpath = "//a[@class='ng-binding']")
    public WebElement Acntid;

    @FindBy(xpath = "//select[@id='month']")
    public WebElement selectmonths;

    @FindBy(xpath = "//select[@name='transactionType']")
    public WebElement selecttype;

    @FindBy(xpath = "//input[@class='button']")
    public WebElement gobutton;

    @FindBy(xpath = "//a[contains(text(),'Funds Transfer Received')]")
    public WebElement fundtransferchkbox;

    @FindBy(xpath = "//button[contains(.,'Follow')]")
    public WebElement followBtn;

    private WebDriver driver;
    private WebDriverWait wait;
    private JavascriptExecutor js;

    public AccountOverview(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 90);
        this.js = (JavascriptExecutor) driver;
    }

    public void clickaccountoverview(){
        WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(AcntOreview));
        AcntOreview.click();
    }

    public void clickaccountid(){
        clickElement(Acntid);
    }

    public void clickselectmonths(){
        WebElement elemonthslist = wait.until(ExpectedConditions.elementToBeClickable(selectmonths));
        Select monthslist = new Select(elemonthslist);
        List<WebElement> monthsoption = monthslist.getOptions();
        monthslist.selectByIndex(12);
        selectmonths.click();
    }

    public void clickaccounttype(){
        WebElement eleacnttypelist = wait.until(ExpectedConditions.elementToBeClickable(selecttype));
        Select accounttypelist  = new Select(eleacnttypelist);
        List<WebElement> accountoption = accounttypelist.getOptions();
        accounttypelist.selectByIndex(2);
        selecttype.click();
    }

    public void clickgobutton(){
        //clickElement(gobutton, true);
        clickElement(gobutton);
    }
    public void clickFollowButton(){
        js.executeScript("arguments[0].click()", followBtn);
        js.executeScript("document.getElementById('_wpnonce').click()");
        js.executeScript("window.scrollBy(0,100)");

        // ----- Syntax for the Java script executor
        //JavascriptExecutor j1 = (JavascriptExecutor)driver;
        //j1.executeScript("script", arguments);
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




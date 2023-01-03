package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;


public class ProductsPage {
    @FindBy(xpath = "//*[.='Products']")
    public WebElement lnkHomePageProducts;

    @FindBy(xpath = "//*[@title='Products']")
    public WebElement lnkParasoftPageProducts;

    @FindBy(xpath = "//*[@title='Parasoft C/C++test']")
    public WebElement lnkParasoftC;

    @FindBy(xpath = "//*[@title='Parasoft Jtest']")
    public WebElement lnkParasoftJtest;

    @FindBy(xpath = "//*[@title='Parasoft dotTEST']")
    public WebElement lnkParasoftDotTest;

    @FindBy(xpath = "//*[@title='Parasoft Insure++']")
    public WebElement lnkParasoftInsure;

    @FindBy(xpath = "//*[@title='Parasoft DTP']")
    public WebElement lnkParasoftDTP;

    @FindBy(xpath = "//*[@title='Parasoft CTP']")
    public WebElement lnkParasoftCTP;

    @FindBy(xpath = "//*[@title='Parasoft Selenic']")
    public WebElement lnkParasoftSelenic;

    @FindBy(xpath = "//*[@title='Parasoft SOAtest']")
    public WebElement lnkParasoftSoatest;

    @FindBy(xpath = "//*[@title='Parasoft Virtualize']")
    public WebElement lnkParasoftVirtualize;

    private WebDriver driver;
    private WebDriverWait wait;

    public ProductsPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
        this.wait = new WebDriverWait(driver,90);
    }

    public void clickProductsLink(){
        WebElement eleProduct = wait.until(ExpectedConditions.elementToBeClickable(lnkHomePageProducts));
        eleProduct.click();
        Reporter.log("Clicking on Products Link");

    }

    public void hoverProducts1Link() {
        WebElement eleParaProduct = wait.until(ExpectedConditions.elementToBeClickable(lnkParasoftPageProducts));
        Actions ac = new Actions(driver);
        ac.moveToElement(eleParaProduct).perform();
        Reporter.log("Hover on Products Link");
    }

    public void clickParasoft_cLink(){
        WebElement eleParasoftC = wait.until(ExpectedConditions.elementToBeClickable(lnkParasoftC));
        eleParasoftC.click();
        Reporter.log("Clicking on ParasoftC/C++test Link");
    }

    public void clickParasoft_jTestLink(){
        WebElement eleParasoftJtest = wait.until(ExpectedConditions.elementToBeClickable(lnkParasoftJtest));
        eleParasoftJtest.click();
        Reporter.log("Clicking on ParasoftJtest Link");
    }

    public void clickParasoft_dotTestLink(){
        WebElement eleParasoftDotTest = wait.until(ExpectedConditions.elementToBeClickable(lnkParasoftDotTest));
        eleParasoftDotTest.click();
        Reporter.log("Clicking on ParasoftdotTEST Link");
    }

    public void clickParasoft_insureLink(){
        WebElement eleParasoftInsure = wait.until(ExpectedConditions.elementToBeClickable(lnkParasoftInsure));
        eleParasoftInsure.click();
        Reporter.log("Clicking on ParasoftInsure++ Link");
    }

    public void clickParasoft_dtpLink(){
        WebElement eleParasoftDTP = wait.until(ExpectedConditions.elementToBeClickable(lnkParasoftDTP));
        eleParasoftDTP.click();
        Reporter.log("Clicking on ParasoftDTP Link");
    }

    public void clickParasoft_ctpLink(){
        WebElement eleParasoftCTP = wait.until(ExpectedConditions.elementToBeClickable(lnkParasoftCTP));
        eleParasoftCTP.click();
        Reporter.log("Clicking on ParasoftCTP Link");
    }

    public void clickParasoft_selenicLink(){
        WebElement eleParasoftSelenic = wait.until(ExpectedConditions.elementToBeClickable(lnkParasoftSelenic));
        eleParasoftSelenic.click();
        Reporter.log("Clicking on ParasoftSelenic Link");
    }

    public void clickParasoft_soatestLink(){
        WebElement eleParasoftSoatest = wait.until(ExpectedConditions.elementToBeClickable(lnkParasoftSoatest));
        eleParasoftSoatest.click();
        Reporter.log("Clicking on ParasoftSOAtest Link");
    }

    public void clickParasoft_virtualizeLink() {
        WebElement eleParasoftVirtualize = wait.until(ExpectedConditions.elementToBeClickable(lnkParasoftVirtualize));
        eleParasoftVirtualize.click();
        Reporter.log("Clicking on ParasoftVirtualize Link");
    }

}

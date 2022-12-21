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
    public WebElement linkHomePageProducts;

    @FindBy(xpath = "//*[@title='Products']")
    public WebElement linkParasoftPageProducts;

    @FindBy(xpath = "//*[@title='Parasoft C/C++test']")
    public WebElement linkParasoftC;

    @FindBy(xpath = "//*[@title='Parasoft Jtest']")
    public WebElement linkParasoftJtest;

    @FindBy(xpath = "//*[@title='Parasoft dotTEST']")
    public WebElement linkParasoftDotTest;

    @FindBy(xpath = "//*[@title='Parasoft Insure++']")
    public WebElement linkParasoftInsure;

    @FindBy(xpath = "//*[@title='Parasoft DTP']")
    public WebElement linkParasoftDTP;

    @FindBy(xpath = "//*[@title='Parasoft CTP']")
    public WebElement linkParasoftCTP;

    @FindBy(xpath = "//*[@title='Parasoft Selenic']")
    public WebElement linkParasoftSelenic;

    @FindBy(xpath = "//*[@title='Parasoft SOAtest']")
    public WebElement linkParasoftSoatest;

    @FindBy(xpath = "//*[@title='Parasoft Virtualize']")
    public WebElement linkParasoftVirtualize;

    private WebDriver driver;
    private WebDriverWait wait;

    public ProductsPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
        this.wait = new WebDriverWait(driver,90);
    }

    public void clickProductsLink(){
        WebElement eleProduct = wait.until(ExpectedConditions.elementToBeClickable(linkHomePageProducts));
        eleProduct.click();
        Reporter.log("Clicking on Products Link");

    }

    public void hoverProducts1Link() {
        WebElement eleParaProduct = wait.until(ExpectedConditions.elementToBeClickable(linkParasoftPageProducts));
        Actions ac = new Actions(driver);
        ac.moveToElement(eleParaProduct).perform();
        Reporter.log("Hover on Products Link");
    }

    public void clickParasoft_cLink(){
        WebElement eleParasoftC = wait.until(ExpectedConditions.elementToBeClickable(linkParasoftC));
        eleParasoftC.click();
        Reporter.log("Clicking on ParasoftC/C++test Link");
    }

    public void clickParasoft_jTestLink(){
        WebElement eleParasoftJtest = wait.until(ExpectedConditions.elementToBeClickable(linkParasoftJtest));
        eleParasoftJtest.click();
        Reporter.log("Clicking on ParasoftJtest Link");
    }

    public void clickParasoft_dotTestLink(){
        WebElement eleParasoftDotTest = wait.until(ExpectedConditions.elementToBeClickable(linkParasoftDotTest));
        eleParasoftDotTest.click();
        Reporter.log("Clicking on ParasoftdotTEST Link");
    }

    public void clickParasoft_insureLink(){
        WebElement eleParasoftInsure = wait.until(ExpectedConditions.elementToBeClickable(linkParasoftInsure));
        eleParasoftInsure.click();
        Reporter.log("Clicking on ParasoftInsure++ Link");
    }

    public void clickParasoft_dtpLink(){
        WebElement eleParasoftDTP = wait.until(ExpectedConditions.elementToBeClickable(linkParasoftDTP));
        eleParasoftDTP.click();
        Reporter.log("Clicking on ParasoftDTP Link");
    }

    public void clickParasoft_ctpLink(){
        WebElement eleParasoftCTP = wait.until(ExpectedConditions.elementToBeClickable(linkParasoftCTP));
        eleParasoftCTP.click();
        Reporter.log("Clicking on ParasoftCTP Link");
    }

    public void clickParasoft_selenicLink(){
        WebElement eleParasoftSelenic = wait.until(ExpectedConditions.elementToBeClickable(linkParasoftSelenic));
        eleParasoftSelenic.click();
        Reporter.log("Clicking on ParasoftSelenic Link");
    }

    public void clickParasoft_soatestLink(){
        WebElement eleParasoftSoatest = wait.until(ExpectedConditions.elementToBeClickable(linkParasoftSoatest));
        eleParasoftSoatest.click();
        Reporter.log("Clicking on ParasoftSOAtest Link");
    }

    public void clickParasoft_virtualizeLink() {
        WebElement eleParasoftVirtualize = wait.until(ExpectedConditions.elementToBeClickable(linkParasoftVirtualize));
        eleParasoftVirtualize.click();
        Reporter.log("Clicking on ParasoftVirtualize Link");
    }

}

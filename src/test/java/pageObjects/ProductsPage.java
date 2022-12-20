package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ProductsPage {
    @FindBy(xpath = "//a[.='Products']")
    public WebElement linkHomePageProducts;

    @FindBy(xpath = "//a[@title='Products']")
    public WebElement linkParasoftPageProducts;

    @FindBy(xpath = "//a[@title='Parasoft C/C++test']")
    public WebElement linkParasoftC;

    @FindBy(xpath = "//a[@title='Parasoft Jtest']")
    public WebElement linkParasoftJtest;

    @FindBy(xpath = "//a[@title='Parasoft dotTEST']")
    public WebElement linkParasoftDotTest;

    @FindBy(xpath = "//a[@title='Parasoft Insure++']")
    public WebElement linkParasoftInsure;

    @FindBy(xpath = "//a[@title='Parasoft DTP']")
    public WebElement linkParasoftDTP;

    @FindBy(xpath = "//a[@title='Parasoft CTP']")
    public WebElement linkParasoftCTP;

    @FindBy(xpath = "//a[@title='Parasoft Selenic']")
    public WebElement linkParasoftSelenic;

    @FindBy(xpath = "//a[@title='Parasoft SOAtest']")
    public WebElement linkParasoftSoatest;

    @FindBy(xpath = "//a[@title='Parasoft Virtualize']")
    public WebElement linkParasoftVirtualize;

    private WebDriver driver;
    private WebDriverWait wait;

    public ProductsPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
        this.wait = new WebDriverWait(driver,90);
    }

    public void clickProducts(){
        WebElement eleProduct = wait.until(ExpectedConditions.elementToBeClickable(linkHomePageProducts));
        eleProduct.click();

    }

    public void hoverProducts1() {
        WebElement eleParaProduct = wait.until(ExpectedConditions.elementToBeClickable(linkParasoftPageProducts));
        Actions ac = new Actions(driver);
        ac.moveToElement(eleParaProduct).perform();
    }

    public void clickParasoft_c(){
        WebElement eleParasoftC = wait.until(ExpectedConditions.elementToBeClickable(linkParasoftC));
        eleParasoftC.click();
    }

    public void clickParasoft_jTest(){
        WebElement eleParasoftJtest = wait.until(ExpectedConditions.elementToBeClickable(linkParasoftJtest));
        eleParasoftJtest.click();
    }

    public void clickParasoft_dotTest(){
        WebElement eleParasoftDotTest = wait.until(ExpectedConditions.elementToBeClickable(linkParasoftDotTest));
        eleParasoftDotTest.click();
    }

    public void clickParasoft_insure(){
        WebElement eleParasoftInsure = wait.until(ExpectedConditions.elementToBeClickable(linkParasoftInsure));
        eleParasoftInsure.click();
    }

    public void clickParasoft_dtp(){
        WebElement eleParasoftDTP = wait.until(ExpectedConditions.elementToBeClickable(linkParasoftDTP));
        eleParasoftDTP.click();
    }

    public void clickParasoft_ctp(){
        WebElement eleParasoftCTP = wait.until(ExpectedConditions.elementToBeClickable(linkParasoftCTP));
        eleParasoftCTP.click();
    }

    public void clickParasoft_selenic(){
        WebElement eleParasoftSelenic = wait.until(ExpectedConditions.elementToBeClickable(linkParasoftSelenic));
        eleParasoftSelenic.click();
    }

    public void clickParasoft_soatest(){
        WebElement eleParasoftSoatest = wait.until(ExpectedConditions.elementToBeClickable(linkParasoftSoatest));
        eleParasoftSoatest.click();
    }

    public void clickParasoft_virtualize() {
        WebElement eleParasoftVirtualize = wait.until(ExpectedConditions.elementToBeClickable(linkParasoftVirtualize));
        eleParasoftVirtualize.click();
    }

}


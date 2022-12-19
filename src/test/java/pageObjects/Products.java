package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Products {
    @FindBy(xpath = "//a[.='Products']")
    public WebElement aProducts;

    @FindBy(xpath = "//a[@title='Products']")
    public WebElement aProducts1;

    @FindBy(xpath = "//a[@title='Parasoft C/C++test']")
    public WebElement parac;

    @FindBy(xpath = "//a[@title='Parasoft Jtest']")
    public WebElement jtest;

    @FindBy(xpath = "//a[@title='Parasoft dotTEST']")
    public WebElement dottest;

    @FindBy(xpath = "//a[@title='Parasoft Insure++']")
    public WebElement insure;

    @FindBy(xpath = "//a[@title='Parasoft DTP']")
    public WebElement dtp;

    @FindBy(xpath = "//a[@title='Parasoft CTP']")
    public WebElement ctp;

    @FindBy(xpath = "//a[@title='Parasoft Selenic']")
    public WebElement selenic;

    @FindBy(xpath = "//a[@title='Parasoft SOAtest']")
    public WebElement soatest;

    @FindBy(xpath = "//a[@title='Parasoft Virtualize']")
    public WebElement virtualize;

    private WebDriver driver;

    private WebDriverWait wait;

    public Products(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void clickProducts(){
        aProducts.click();

    }

    public void hoverProducts1() {
        Actions ac = new Actions(driver);
        ac.moveToElement(aProducts1).perform();
    }

    public void clickParasoft_C(){
        parac.click();
    }

    public void clickParasoft_JTest(){
        jtest.click();
    }

    public void clickParasoft_dotTest(){
        dottest.click();
    }

    public void clickParasoft_Insure(){
        insure.click();
    }

    public void clickParasoft_DTP(){
        dtp.click();
    }

    public void clickParasoft_CTP(){
        ctp.click();
    }

    public void clickParasoft_Selenic(){
        selenic.click();
    }

    public void clickParasoft_Soatest(){
        soatest.click();
    }

    public void clickParasoft_virtualize(){
        virtualize.click();
    }

}


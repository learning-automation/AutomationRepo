package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import java.util.concurrent.TimeUnit;

public class QaFoxPageObject {

    public WebDriver driver;
    public WebDriverWait wait;

    @FindBy(xpath = "//*[@id='menu-item-4251']")
    public WebElement btn3webdriver;

    //@FindBy(xpath = "//*[.='Tutorials']")
    @FindBy(xpath = "//*[@id='menu-item-4247']")
    public WebElement btn2tutorial;


    @FindBy(xpath = "//*[@id='menu-item-11548']")
    public WebElement btn4codeceptj;

    @FindBy(xpath = "//*[@id='menu-item-9950']")
    public WebElement btnmobiletesting;

    @FindBy(xpath = "//*[@id='menu-item-4248']")
    public WebElement btnselenium;

    @FindBy(xpath = "//*[@id='menu-item-4253']")
    public WebElement btnmanualtesting;

    @FindBy(xpath = "//*[@id='menu-item-10388']")
    public WebElement btnadvtesting;

    @FindBy(xpath = "//*[@id='menu-item-4249']")
    public WebElement btnAppium;

    public QaFoxPageObject(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 2);
        Reporter.log("Accessing constructor");
    }

    public void hoverAction() {
        Actions ac = new Actions(driver);
        ac.moveToElement(btn2tutorial).perform();
        WebElement ele = wait.until(ExpectedConditions.visibilityOf(btn2tutorial));
    }
    public void hoverAction2() {
        Actions ac = new Actions(driver);
        ac.moveToElement(btn2tutorial).click(btn3webdriver).perform();
        WebElement ele = wait.until(ExpectedConditions.visibilityOf(btn2tutorial));
    }
    public void hoverAction3() {
        Actions ac = new Actions(driver);
        WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(btn2tutorial));
        ac.moveToElement(btn2tutorial).click(btn4codeceptj).perform();
    }
    public void hoverAction4() {
        Actions ac = new Actions(driver);
        WebElement ele = wait.until(ExpectedConditions.visibilityOf(btn2tutorial));
        ac.moveToElement(btn2tutorial).click(btnmobiletesting).perform();
    }
    public void hoverAction5() {
        Actions ac = new Actions(driver);
        WebElement ele = wait.until(ExpectedConditions.visibilityOf(btn2tutorial));
        ac.moveToElement(btn2tutorial).click(btnselenium).perform();
    }
    public void hoverAction6() {
        Actions ac = new Actions(driver);
        WebElement ele = wait.until(ExpectedConditions.visibilityOf(btn2tutorial));
        ac.moveToElement(btn2tutorial).click(btnmanualtesting).perform();
    }
    public void hoverAction7() {
        Actions ac = new Actions(driver);
        WebElement ele = wait.until(ExpectedConditions.visibilityOf(btn2tutorial));
        ac.moveToElement(btn2tutorial).click(btnadvtesting).perform();
    }
    public void hoverAction8() {
        Actions ac = new Actions(driver);
        WebElement ele = wait.until(ExpectedConditions.visibilityOf(btn2tutorial));
        ac.moveToElement(btn2tutorial).click(btnAppium).perform();
    }
    public void clickbtnwebdriver() {
        btn3webdriver.click();
        Reporter.log("Clicking webdriver button");
    }
    public void clickbtntutorial(){
        btn2tutorial.click();
        Reporter.log("Clicking Tutorial button");
    }

    //public WebElement getErrorElement(){    return lblError; }
}


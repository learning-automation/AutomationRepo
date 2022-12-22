package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;


public class QaFoxPageObject {

    public WebDriver driver;
    public WebDriverWait wait;

    @FindBy(xpath = "//*[.='WebDriverIO']")
    public WebElement btnWebDriverIO;

    @FindBy(xpath = "(//a[.='Tutorials'])[2]")
    public WebElement btnTutorial;


    @FindBy(xpath = "//*[.='CodeceptJS']")
    public WebElement btnCodeceptjs;

    @FindBy(xpath = "//*[.='Mobile Testing']")
    public WebElement btnMobileTesting;

    @FindBy(xpath = "//*[.='Selenium Java']")
    public WebElement btnSeleniumJava;

    @FindBy(xpath = "//*[.='Manual Testing']")
    public WebElement btnManualTesting;

    @FindBy(xpath = "//*[.='Advanced Software Testing']")
    public WebElement btnAdvtesting;

    @FindBy(xpath = "//*[.='Appium']")
    public WebElement btnAppium;

    public QaFoxPageObject(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 2);
        Reporter.log("Accessing constructor");
        System.out.println("Accessing constructor");
    }

    public void hoverAction() {
        Actions ac = new Actions(driver);
        ac.moveToElement(btnTutorial).perform();
        WebElement ele = wait.until(ExpectedConditions.visibilityOf(btnTutorial));
        Reporter.log("Clicking Tutorial Menu");
        System.out.println("Clicking Tutorial Menu");
    }

    public void hoverAction2() {
        Actions ac = new Actions(driver);
        ac.moveToElement(btnTutorial).click(btnWebDriverIO).perform();
        WebElement ele = wait.until(ExpectedConditions.visibilityOf(btnTutorial));
        Reporter.log("Clicking Tutorial Menu WebDriverIO submenu");
        System.out.println("Clicking Tutorial Menu WebDriverIO submenu");
    }

    public void hoverAction3() {
        Actions ac = new Actions(driver);
        WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(btnTutorial));
        ac.moveToElement(btnTutorial).click(btnCodeceptjs).perform();
        Reporter.log("Clicking Tutorial Menu and Codeceptjs Submenu");
    }

    public void hoverAction4() {
        Actions ac = new Actions(driver);
        WebElement ele = wait.until(ExpectedConditions.visibilityOf(btnTutorial));
        ac.moveToElement(btnTutorial).click(btnMobileTesting).perform();
        Reporter.log("Clicking Tutorial Menu and Mobile Testing Submenu");
    }

    public void hoverAction5() {
        Actions ac = new Actions(driver);
        WebElement ele = wait.until(ExpectedConditions.visibilityOf(btnTutorial));
        ac.moveToElement(btnTutorial).click(btnSeleniumJava).perform();
        Reporter.log("Clicking Tutorial Menu and Selenium Submenu");
    }

    public void hoverAction6() {
        Actions ac = new Actions(driver);
        WebElement ele = wait.until(ExpectedConditions.visibilityOf(btnTutorial));
        ac.moveToElement(btnTutorial).click(btnManualTesting).perform();
        Reporter.log("Clicking Tutorial Menu and Manual Testing Submenu");
    }

    public void hoverAction7() {
        Actions ac = new Actions(driver);
        WebElement ele = wait.until(ExpectedConditions.visibilityOf(btnTutorial));
        ac.moveToElement(btnTutorial).click(btnAdvtesting).perform();
        Reporter.log("Clicking Tutorial Menu and Advtesting Submenu");
    }

    public void hoverAction8() {
        Actions ac = new Actions(driver);
        WebElement ele = wait.until(ExpectedConditions.visibilityOf(btnTutorial));
        ac.moveToElement(btnTutorial).click(btnAppium).perform();
        Reporter.log("Clicking Tutorial Menu and Appium Submenu");
        System.out.println("Clicking Tutorial Menu and Appium Submenu");
    }

    public void clickbtnWebDriverIO() {
        WebElement ele = wait.until(ExpectedConditions.visibilityOf(btnWebDriverIO));
        ele.click();
        Reporter.log("Clicking webdriver button");
    }

    public void clickbtntutorial() {
        WebElement ele = wait.until(ExpectedConditions.visibilityOf(btnTutorial));
        ele.click();
        Reporter.log("Clicking Tutorial button");
    }
}


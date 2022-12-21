package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class SolutionPage {
    @FindBy(xpath = "//*[contains(text(),'Product')]")
    public WebElement lnkProduct;

    @FindBy(xpath = "//*[@title='Solutions']")
    public WebElement lnkSolutions;

    @FindBy(linkText = "//*[@title='API Security Testing']")
    public WebElement lnkApiSecurityTesting;

    @FindBy(xpath = "//*[@title='API Testing']")
    public WebElement lnkAPITesting;

    @FindBy(xpath = "//*[@title='Application Security Testing']")
    public WebElement lnkApplSecTesting;

    @FindBy(xpath = "//*[@title='Automated Testing']")
    public WebElement lnkAutomatedTesting;

    @FindBy(xpath = "//*[@title='Code Coverage']")
    public WebElement lnkCodeCoverage;

    @FindBy(xpath = "//*[@title='Code Quality']")
    public WebElement lnkCodequality;

    @FindBy(xpath = "//*[@title='Continuous Testing']")
    public WebElement lnkContinuousTesting;

    @FindBy(xpath = "//*[@title='Functional Safety Compliance']")
    public WebElement lnkFunctionalSafetyCompliance;

    @FindBy(xpath = "//*[@title='Low-Code Application Testing']")
    public WebElement lnkLowCodeApplicationTesting;

    @FindBy(xpath = "//*[@title='Performance Testing']")
    public WebElement lnkPerformanceTesting;

    @FindBy(xpath = "//*[@title='Reporting & Analytics']")
    public WebElement lnkReportingAnalytics;

    @FindBy(xpath = "//*[@title='//a[@title='Requirements Traceability']")
    public WebElement lnkRequirementsTracebility;

    @FindBy(xpath = "//*[@title='Service Virtualization']")
    public WebElement lnkServiceVirtulization;

    @FindBy(xpath = "//*[@title='Smart Test Execution']")
    public WebElement lnkSmartTestExecution;

    @FindBy(xpath = "//*[@title='Static Code Analysis']")
    public WebElement lnkStaticCodeAnalysis;

    @FindBy(xpath = "//*[@title='Test Data Management']")
    public WebElement lnkTestDataManagement;

    @FindBy(xpath = "//*[@title='Test Environment Provisioning']")
    public WebElement lnkTestEnvironmentProvisioning;

    @FindBy(xpath = "//*[@title='Unit Testing']")
    public WebElement lnkUnitTesting;

    @FindBy(xpath = "//*[@title='Web UI Testing']")
    public WebElement lnkWebUITesting;


    private WebDriver driver;
    private WebDriverWait wait;

    public SolutionPage (WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 20);
    }

    public void clickOnProduct(){
        WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(lnkProduct));
        lnkProduct.click();
        Reporter.log("clicking on Product");
    }

    public void clickOnSolution(){
        WebElement eleSolution = wait.until(ExpectedConditions.elementToBeClickable(lnkSolutions));
        Actions ac = new Actions(driver);
        ac.moveToElement(eleSolution).build().perform();
    }

    public void clickApiSecurityTesting(){
        WebElement clkApiSecTes = wait.until(ExpectedConditions.elementToBeClickable(lnkApiSecurityTesting));
        clkApiSecTes.click();
        Reporter.log("clicking on API Security Testing");
    }

    public void clickAPITesting(){
        WebElement clickApiTesting = wait.until(ExpectedConditions.visibilityOf(lnkAPITesting));
        clickApiTesting.click();
        Reporter.log("clicking API Testing link");
    }

    public void clickApplSecTest(){
        WebElement eleAppSel = wait.until(ExpectedConditions.elementToBeClickable(lnkApplSecTesting));
        eleAppSel.click();
        Reporter.log("Clicking Application Security Testing");
    }

    public void clickAutomatedTesting(){
        WebElement eleAutTest = wait.until(ExpectedConditions.elementToBeClickable(lnkAutomatedTesting));
        eleAutTest.click();
        Reporter.log("Clicking Automated Testing");
    }

    public void clickCodeCoverage(){
        WebElement eleCodeCove = wait.until(ExpectedConditions.elementToBeClickable(lnkCodeCoverage));
        eleCodeCove.click();
        Reporter.log("Clicking Code Coverage");
    }

    public void clickCodeQuality(){
        WebElement eleCodeQual = wait.until(ExpectedConditions.elementToBeClickable(lnkCodequality));
        eleCodeQual.click();
        Reporter.log("Clicking Code Quality");
    }

    public void clickContinuousTesting(){
        WebElement eleContTest = wait.until(ExpectedConditions.elementToBeClickable(lnkContinuousTesting));
        eleContTest.click();
        Reporter.log("Clicking Continuous Testing");
    }

    public void clickFunctinalSafetyCompliance(){
        WebElement eleFunSafCom = wait.until(ExpectedConditions.elementToBeClickable(lnkFunctionalSafetyCompliance));
        eleFunSafCom.click();
        Reporter.log("Clicking Functional Safety Compliance");
    }

    public void clickLowCodeApplicationTesting(){
        WebElement eleLoCoAppTest = wait.until(ExpectedConditions.elementToBeClickable(lnkLowCodeApplicationTesting));
        eleLoCoAppTest.click();
        Reporter.log("Clicking Low Code Application Testing");
    }

    public void clickPerformanceTesting(){
        WebElement elePerfTest = wait.until(ExpectedConditions.elementToBeClickable(lnkPerformanceTesting));
        elePerfTest.click();
        Reporter.log("Clicking Performance Testing");
    }
    public void clickReportingAnalytics(){
        WebElement eleRepAnaly = wait.until(ExpectedConditions.elementToBeClickable(lnkReportingAnalytics));
        eleRepAnaly.click();
        Reporter.log("Clicking Reporting Analytics");
    }

    public void clickRequirementsTracebility(){
        WebElement eleRequTra = wait.until(ExpectedConditions.elementToBeClickable(lnkRequirementsTracebility));
        eleRequTra.click();
        Reporter.log("Clicking Requirements Tracebility");
    }

    public void clickServiceVirtulization(){
        WebElement eleSerVir = wait.until(ExpectedConditions.elementToBeClickable(lnkServiceVirtulization));
        eleSerVir.click();
        Reporter.log("Clicking Service Virtulization");
    }

    public void clickSmartTestExecution(){
        WebElement eleSamTeExe = wait.until(ExpectedConditions.elementToBeClickable(lnkSmartTestExecution));
        eleSamTeExe.click();
        Reporter.log("Clicking Smart Test Execution");
    }

    public void clickStaticCodeAnalysis(){
        WebElement eleStaCoAna = wait.until(ExpectedConditions.elementToBeClickable(lnkStaticCodeAnalysis));
        eleStaCoAna.click();
        Reporter.log("Clicking Static Code Analysis");
    }

    public void clickTestDataManagement(){
        WebElement eleTeDaMana = wait.until(ExpectedConditions.elementToBeClickable(lnkTestDataManagement));
        eleTeDaMana.click();
        Reporter.log("Clicking Test Data Management");
    }

    public void clickTestEnvironmentProvisioning(){
        WebElement eleTeEnvprov = wait.until(ExpectedConditions.elementToBeClickable(lnkTestEnvironmentProvisioning));
        eleTeEnvprov.click();
        Reporter.log("Clicking Test Environment Provisioning");
    }

    public void clickUnitTesting(){
        WebElement eleUnTest = wait.until(ExpectedConditions.elementToBeClickable(lnkUnitTesting));
        eleUnTest.click();
        Reporter.log("Clicking Unit Testing");
    }

    public void clickWebUITesting(){
        WebElement eleWebUITest = wait.until(ExpectedConditions.elementToBeClickable(lnkWebUITesting));
        eleWebUITest.click();
        Reporter.log("Clicking Web UI Testing");
    }

}

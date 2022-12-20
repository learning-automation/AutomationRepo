package testcases.ui.Solution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.SolutionPage;
import utility.Browser;
import utility.TestDataReader;

import java.util.Properties;

public class SolutionTestCases {

    Browser br;
    LoginPage login;
    WebDriver driver ;
    Properties browser ;
    Properties testCase;
    SolutionPage solupage;

    @BeforeSuite
    public void readBrowser(){

        browser = TestDataReader.readProperties("Browser.properties");
        br = new Browser(browser.getProperty("browser"));
    }


    @BeforeMethod
    public void readdata(){
        br.launchBrowser();
        br.maximize();
        driver = br.getDriver();
        login = new LoginPage(br.getDriver());
        solupage = new SolutionPage(br.getDriver());
        testCase = TestDataReader.readProperties("TC_001.properties");
        br.navigateUrl(browser.getProperty("url"));
        login.enterUsername(testCase.getProperty("username"));
        login.enterPassword(testCase.getProperty("password"));
        login.clickLogIn();
        solupage.clickOnProduct();

    }

    @Test
    public void TC_001_solution() {
        Actions action = new Actions(driver);
        WebElement SolutionMain = driver.findElement(By.linkText("Solutions"));
        action.moveToElement(SolutionMain).perform();
        WebElement subApisecurity = driver.findElement(By.linkText("API Security Testing"));
        action.moveToElement(subApisecurity).perform();
        action.click().build().perform();
    }

    @Test
    public void TC_002_solution(){
        Actions action = new Actions(driver);
        WebElement SolutionMain = driver.findElement(By.linkText("Solutions"));
        action.moveToElement(SolutionMain).perform();
        WebElement subApisecurity = driver.findElement(By.linkText("API Testing"));
        action.moveToElement(subApisecurity).perform();
        action.click();
    }

    @Test
    public void TC_003_solution(){
        Actions action = new Actions(driver);
        WebElement SolutionMain = driver.findElement(By.linkText("Solutions"));
        action.moveToElement(SolutionMain).perform();
        WebElement subApisecurity = driver.findElement(By.linkText("Application Security Testing"));
        action.moveToElement(subApisecurity).perform();
        action.click();
    }

    @Test
    public void TC_004_solution(){
        Actions action = new Actions(driver);
        WebElement SolutionMain = driver.findElement(By.linkText("Solutions"));
        action.moveToElement(SolutionMain).perform();
        WebElement subApisecurity = driver.findElement(By.linkText("Automated Testing"));
        action.moveToElement(subApisecurity).perform();
        action.click();
    }

    @Test
    public void TC_005_solution(){
        Actions action = new Actions(driver);
        WebElement SolutionMain = driver.findElement(By.linkText("Solutions"));
        action.moveToElement(SolutionMain).perform();
        WebElement subApisecurity = driver.findElement(By.linkText("Code Coverage"));
        action.moveToElement(subApisecurity).perform();
        action.click().build().perform();
    }

    @Test
    public void TC_006_solution(){
        Actions action = new Actions(driver);
        WebElement SolutionMain = driver.findElement(By.linkText("Solutions"));
        action.moveToElement(SolutionMain).perform();
        WebElement subApisecurity = driver.findElement(By.linkText("Code Quality"));
        action.moveToElement(subApisecurity).perform();
        action.click();
    }

    @Test
    public void TC_007_solution(){
        Actions action = new Actions(driver);
        WebElement SolutionMain = driver.findElement(By.linkText("Solutions"));
        action.moveToElement(SolutionMain).perform();
        WebElement subApisecurity = driver.findElement(By.linkText("Continuous Testing"));
        action.moveToElement(subApisecurity).perform();
        action.click();
    }

    @Test
    public void TC_008_solution(){
        Actions action = new Actions(driver);
        WebElement SolutionMain = driver.findElement(By.linkText("Solutions"));
        action.moveToElement(SolutionMain).perform();
        WebElement subApisecurity = driver.findElement(By.linkText("Functional Safety Compliance"));
        action.moveToElement(subApisecurity).perform();
        action.click();
    }

    @Test
    public void TC_009_solution(){
        Actions action = new Actions(driver);
        WebElement SolutionMain = driver.findElement(By.linkText("Solutions"));
        action.moveToElement(SolutionMain).perform();
        WebElement subApisecurity = driver.findElement(By.linkText("Low-Code Application Testing"));
        action.moveToElement(subApisecurity).perform();
        action.click();
    }

    @Test
    public void TC_010_solution(){
        Actions action = new Actions(driver);
        WebElement SolutionMain = driver.findElement(By.linkText("Solutions"));
        action.moveToElement(SolutionMain).perform();
        WebElement subApisecurity = driver.findElement(By.linkText("Performance Testing"));
        action.moveToElement(subApisecurity).perform();
        action.click();
    }

    @Test
    public void TC_011_solution(){
        Actions action = new Actions(driver);
        WebElement SolutionMain = driver.findElement(By.linkText("Solutions"));
        action.moveToElement(SolutionMain).perform();
        WebElement subApisecurity = driver.findElement(By.linkText("Reporting & Analytics"));
        action.moveToElement(subApisecurity).perform();
        action.click();
    }

    @Test
    public void TC_012_solution(){
        Actions action = new Actions(driver);
        WebElement SolutionMain = driver.findElement(By.linkText("Solutions"));
        action.moveToElement(SolutionMain).perform();
        WebElement subApisecurity = driver.findElement(By.linkText("Requirements Traceability"));
        action.moveToElement(subApisecurity).perform();
        action.click();
    }

    @Test
    public void TC_013_solution(){
        Actions action = new Actions(driver);
        WebElement SolutionMain = driver.findElement(By.linkText("Solutions"));
        action.moveToElement(SolutionMain).perform();
        WebElement subApisecurity = driver.findElement(By.linkText("Service Virtualization"));
        action.moveToElement(subApisecurity).perform();
        action.click();
    }

    @Test
    public void TC_014_solution(){
        Actions action = new Actions(driver);
        WebElement SolutionMain = driver.findElement(By.linkText("Solutions"));
        action.moveToElement(SolutionMain).perform();
        WebElement subApisecurity = driver.findElement(By.linkText("Smart Test Execution"));
        action.moveToElement(subApisecurity).perform();
        action.click();
    }

    @Test
    public void TC_015_solution(){
        Actions action = new Actions(driver);
        WebElement SolutionMain = driver.findElement(By.linkText("Solutions"));
        action.moveToElement(SolutionMain).perform();
        WebElement subApisecurity = driver.findElement(By.linkText("Static Code Analysis"));
        action.moveToElement(subApisecurity).perform();
        action.click();
    }

    @Test
    public void TC_016_solution(){
        Actions action = new Actions(driver);
        WebElement SolutionMain = driver.findElement(By.linkText("Solutions"));
        action.moveToElement(SolutionMain).perform();
        WebElement subApisecurity = driver.findElement(By.linkText("Test Data Management"));
        action.moveToElement(subApisecurity).perform();
        action.click();
    }

    @Test
    public void TC_017_solution(){
        Actions action = new Actions(driver);
        WebElement SolutionMain = driver.findElement(By.linkText("Solutions"));
        action.moveToElement(SolutionMain).perform();
        WebElement subApisecurity = driver.findElement(By.linkText("Test Environment Provisioning"));
        action.moveToElement(subApisecurity).perform();
        action.click();
    }

    @Test
    public void TC_018_solution(){
        Actions action = new Actions(driver);
        WebElement SolutionMain = driver.findElement(By.linkText("Solutions"));
        action.moveToElement(SolutionMain).perform();
        WebElement subApisecurity = driver.findElement(By.linkText("Unit Testing"));
        action.moveToElement(subApisecurity).perform();
        action.click();
    }

    @Test
    public void TC_019_solution(){
        Actions action = new Actions(driver);
        WebElement SolutionMain = driver.findElement(By.linkText("Solutions"));
        action.moveToElement(SolutionMain).perform();
        WebElement subApisecurity = driver.findElement(By.linkText("Web UI Testing"));
        action.moveToElement(subApisecurity).perform();
        action.click();
    }

}

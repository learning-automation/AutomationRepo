package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

public class Request_Loan {

    public static String RequestLoan = "//a[@href='/parabank/requestloan.htm']";
    public String LoanAmt= "//input[@id='amount']";
    public String DownP = "//input[@id='downPayment']";
    public String FAc = "//select[@id='fromAccountId']";
    public String ClkBtn ="//input[@value='Apply Now']";
    public String StatusMsg = "//div[@class='ng-scope']";
    public WebDriver driver;
    public static int lamt = 500000;
    public static int Damt = 25000;
    public int a = 3883;



    public Request_Loan(WebDriver driver){
        this.driver = driver;
    }

    public void Request_hyperlnk(){
        WebElement ele = driver.findElement(By.xpath(RequestLoan));
        ele.click();
        Reporter.log("" );}

    public void EnterLoanAmt(){
        driver.findElement(By.xpath(LoanAmt)).sendKeys("" +lamt);
    }

    public void EnterDownPt(){
        driver.findElement(By.xpath(DownP)).sendKeys("" +Damt);
    }


    public void FormAc(){
        driver.findElement(By.xpath(FAc)).sendKeys("" +a);//click();
    }

    public void ButtonClk (){
        driver.findElement(By.xpath(ClkBtn)).click();
    }

    public WebElement errormsg(){
        return driver.findElement(By.xpath(StatusMsg));
    }


}



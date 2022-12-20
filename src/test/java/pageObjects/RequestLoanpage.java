package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

public class RequestLoanpage {

    public static String lnkrequestloan = "//a[@href='/parabank/requestloan.htm']";
    public String loanamount= "//*[@id='amount']";
    public String downpayent = "//*[@id='downPayment']";
    public String FAc = "//select[@id='fromAccountId']";
    public String button ="//*[@value='Apply Now']";
    public String errormsg = "//div[@class='ng-scope']";
    public WebDriver driver;
    public static int lamt = 500000;
    public static int Damt = 25000;
    public int a = 3883;



    public RequestLoanpage(WebDriver driver){
        this.driver = driver;
    }

    public void requestloanhyperlnk(){
        WebElement ele = driver.findElement(By.xpath(lnkrequestloan));
        ele.click();
        Reporter.log("" );}

    public void enterloanamount(){
        driver.findElement(By.xpath(loanamount)).sendKeys("" +lamt);
    }

    public void enterdownpayment(){
        driver.findElement(By.xpath(downpayent)).sendKeys("" +Damt);
    }


    public void FormAc(){
        driver.findElement(By.xpath(FAc)).sendKeys("" +a);//click();
    }

    public void buttonClk (){
        driver.findElement(By.xpath(button)).click();
    }

    public WebElement errormsg(){
        return driver.findElement(By.xpath(errormsg));
    }


}



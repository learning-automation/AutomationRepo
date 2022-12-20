package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class AdminPage {
    //Administration
    //DatabaseSection
    @FindBy(xpath = "//*[@href='admin.htm']")
    public WebElement btnAdmin;

    @FindBy(xpath = "//*[@value='INIT']")
    public WebElement btnInitialize;

    @FindBy(xpath = "//*[@value='CLEAN']")
    public WebElement btnclean;

    //JMS Service

    @FindBy(xpath = "//*[@value='Shutdown']")
    public WebElement btnShutdown;

    //data access mode
    //radio buttons
    @FindBy(xpath = "//*[@value='Shutdown']")
    public WebElement btnSoap;
    @FindBy(xpath = "//*[@value='Shutdown']")
    public WebElement btnRestXML;
    @FindBy(xpath = "//*[@value='Shutdown']")
    public WebElement btnRestJSON;
    @FindBy(xpath = "//*[@value='Shutdown']")
    public WebElement btnJDBC;

    //Web service
    //WSDL
    @FindBy(xpath = "//*[@href='services/ParaBank?wsdl']")
    public WebElement btnWSDL;
    @FindBy(xpath = "//*[@href='services/ParaBank?wadl']")
    public WebElement btnWADL;
    @FindBy(xpath = "//*[@href='services/ParaBank?wsdl']")
    public WebElement btnSwagger;


    private WebDriver driver;
    private WebDriverWait wait;

    public AdminPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 90);
    }

    public void clickAdminPageButton(){
        WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(btnAdmin));
        ele.click();
        Reporter.log("Clicking admin page button");
    }

    //databse
    public void clickInitializeButton(){
        WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(btnInitialize));
        ele.click();
        Reporter.log("Clicking initialize button");
    }
    public void clickCleanButton(){
        WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(btnclean));
        ele.click();
        Reporter.log("Clicking clean button");
    }
    //jms service
    public void clickShutdownButton(){
        WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(btnShutdown));
        ele.click();
        Reporter.log("Clicking shutdown button");
    }

    public void clickSoapButton(){
        WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(btnSoap));
        ele.click();
        Reporter.log("Clicking soap button");
    }
    public void clickRestXMLButton(){
        WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(btnRestXML));
        ele.click();
        Reporter.log("Clicking rest xml button");
    }
    public void clickRestJSONButton(){
        WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(btnRestJSON));
        ele.click();
        Reporter.log("Clicking rest json button");
    }
    public void clickJDBCButton(){
        WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(btnJDBC));
        ele.click();
        Reporter.log("Clicking JDBC button");
    }



}

package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SolutionPage {
    @FindBy(xpath = "//a[contains(text(),'Product')]")
    public WebElement ClickProduct;


    private WebDriver driver;
    private WebDriverWait wait;

    public SolutionPage (WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 20);
    }

    public void clickOnProduct(){
        WebElement ele = wait.until(ExpectedConditions.visibilityOf(ClickProduct));
        ClickProduct.click();
    }

}

package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Operations {
    protected WebDriverWait wait;
    protected WebDriver driver;

    public Operations(WebDriver driver){
        this.wait = new WebDriverWait(driver, 90);
        this.driver = driver;
    }

    public void clickElement(WebElement element){
        WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(element));
        ele.click();
    }

    public void clickElement(WebElement element, boolean viaMouse){
        if(viaMouse) {
            Actions a = new Actions(driver);
            a.moveToElement(element).click().build().perform();
        }else {
            element.sendKeys(Keys.ENTER);
        }
    }
}

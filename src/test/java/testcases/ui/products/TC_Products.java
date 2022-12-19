package testcases.ui.products;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pageObjects.Products;
import utility.Browser;
import utility.TestDataReader;

import java.util.Properties;

public class TC_Products {
    Browser br;
    WebDriver driver ;
    Properties browser ;
    Products products;

    @BeforeSuite
    public void readBrowser(){
        browser = TestDataReader.readProperties("Browser.properties");
        br = new Browser(browser.getProperty("browser"));
    }

    @BeforeMethod
    public void readTestData() {
        br.launchBrowser();
        br.maximize();
        driver = br.getDriver();
        products = new Products((br.getDriver()));
    }

    @Test
    public void parabank_Products_001(){
        br.navigateUrl(browser.getProperty("url"));

        products.clickProducts();
        products.hoverProducts1();
        products.clickParasoft_C();
        products.hoverProducts1();
        products.clickParasoft_JTest();
        products.hoverProducts1();
        products.clickParasoft_dotTest();
        products.hoverProducts1();
        products.clickParasoft_Insure();
        products.hoverProducts1();
        products.clickParasoft_DTP();
        products.hoverProducts1();
        products.clickParasoft_CTP();
        products.hoverProducts1();
        products.clickParasoft_Selenic();
        products.hoverProducts1();
        products.clickParasoft_Soatest();
        products.hoverProducts1();
        products.clickParasoft_virtualize();
        products.hoverProducts1();

    }
}

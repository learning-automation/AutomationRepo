package testcases.ui.products;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pageObjects.ProductsPage;
import utility.Browser;
import utility.TestDataReader;

import java.util.Properties;

public class TC_Products001 {
    Browser br;
    WebDriver driver ;
    Properties browser ;
    ProductsPage products;

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
        products = new ProductsPage((br.getDriver()));
    }

    @Test
    public void tc001_parabank_products(){
        br.navigateUrl(browser.getProperty("url"));
        products.clickProducts();
        products.hoverProducts1();
        products.clickParasoft_c();
        products.hoverProducts1();
        products.clickParasoft_jTest();
        products.hoverProducts1();
        products.clickParasoft_dotTest();
        products.hoverProducts1();
        products.clickParasoft_insure();
        products.hoverProducts1();
        products.clickParasoft_dtp();
        products.hoverProducts1();
        products.clickParasoft_ctp();
        products.hoverProducts1();
        products.clickParasoft_selenic();
        products.hoverProducts1();
        products.clickParasoft_soatest();
        products.hoverProducts1();
        products.clickParasoft_virtualize();
        products.hoverProducts1();
}
}


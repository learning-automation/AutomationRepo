package testcases.ui.products;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pageObjects.ProductsPage;
import utility.Browser;
import utility.TestDataReader;

import java.util.Properties;

public class Products {
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
        br.navigateUrl(browser.getProperty("url"));
        products = new ProductsPage((br.getDriver()));
    }

    @Test
    public void tc001_parabank_products(){
        products.clickProductsLink();
        products.hoverProducts1Link();
        products.clickParasoft_cLink();
        products.hoverProducts1Link();
        products.clickParasoft_jTestLink();
        products.hoverProducts1Link();
        products.clickParasoft_dotTestLink();
        products.hoverProducts1Link();
        products.clickParasoft_insureLink();
        products.hoverProducts1Link();
        products.clickParasoft_dtpLink();
        products.hoverProducts1Link();
        products.clickParasoft_ctpLink();
        products.hoverProducts1Link();
        products.clickParasoft_selenicLink();
        products.hoverProducts1Link();
        products.clickParasoft_soatestLink();
        products.hoverProducts1Link();
        products.clickParasoft_virtualizeLink();
        products.hoverProducts1Link();
    }
}



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
    ProductsPage productsPage;

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
        productsPage = new ProductsPage((br.getDriver()));
    }

    @Test
    public void tc001_parabank_products(){
        productsPage.clickProductsLink();
        productsPage.hoverProducts1Link();
        productsPage.clickParasoft_cLink();
        productsPage.hoverProducts1Link();
        productsPage.clickParasoft_jTestLink();
        productsPage.hoverProducts1Link();
        productsPage.clickParasoft_dotTestLink();
        productsPage.hoverProducts1Link();
        productsPage.clickParasoft_insureLink();
        productsPage.hoverProducts1Link();
        productsPage.clickParasoft_dtpLink();
        productsPage.hoverProducts1Link();
        productsPage.clickParasoft_ctpLink();
        productsPage.hoverProducts1Link();
        productsPage.clickParasoft_selenicLink();
        productsPage.hoverProducts1Link();
        productsPage.clickParasoft_soatestLink();
        productsPage.hoverProducts1Link();
        productsPage.clickParasoft_virtualizeLink();
        productsPage.hoverProducts1Link();
    }
}



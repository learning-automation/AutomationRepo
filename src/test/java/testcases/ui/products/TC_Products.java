package testcases.ui.products;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pageObjects.ProductsPage;
import utility.Browser;
import utility.TestDataReader;

import java.util.Properties;

public class TC_Products {
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
    public void tc001_parabank_products() {
        products.clickProducts(); // Products on Home Page

    }

    @Test
    public void tc002_parabank_products() {
        products.clickProducts();
        products.hoverProducts1(); // Products on Parasoft Page

    }

    @Test
    public void tc003_parabank_parasoftC() {
        products.clickProducts();
        products.hoverProducts1();
        products.clickParasoft_c(); // Parasoft C/C++

    }

    @Test
    public void tc004_parabank_parasoftJtest() {
        products.clickProducts();
        products.hoverProducts1();
        products.clickParasoft_jTest();
    }


    @Test
    public void tc005_parabank_parasoftDotTest() {
        products.clickProducts();
        products.hoverProducts1();
        products.clickParasoft_dotTest();

    }

    @Test
    public void tc006_parabank_parasoftInsure() {
        products.clickProducts();
        products.hoverProducts1();
        products.clickParasoft_insure();

    }

    @Test
    public void tc007_parabank_parasoftDTP() {
        products.clickProducts();
        products.hoverProducts1();
        products.clickParasoft_dtp();

    }

    @Test
    public void tc008_parabank_parasoftCTP() {
        products.clickProducts();
        products.hoverProducts1();
        products.clickParasoft_ctp();

    }

    @Test
    public void tc09_parabank_parasoftselenic() {
        products.clickProducts();
        products.hoverProducts1();
        products.clickParasoft_selenic();

    }

    @Test
    public void tc010_parabank_parasoftSoatest() {
        products.clickProducts();
        products.hoverProducts1();
        products.clickParasoft_soatest();

    }

    @Test
    public void tc011_parabank_parasoftVirtualize() {
        products.clickProducts();
        products.hoverProducts1();
        products.clickParasoft_virtualize();

    }


}
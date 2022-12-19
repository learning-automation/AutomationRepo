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
        br.navigateUrl(browser.getProperty("url"));
        products = new Products((br.getDriver()));
        products.clickProducts();
        products.hoverProducts1();
    }

  /*  @Test
    public void tc001_parabank_Products() {
        br.navigateUrl(browser.getProperty("url"));
        products.clickProducts(); // Products on Home Page

    }

    @Test
    public void tc002_parabank_Products() {
        br.navigateUrl(browser.getProperty("url"));
        products.hoverProducts1(); // Products on Parasoft Page

    }*/

    @Test
    public void tc003_parabank_Products() {
        products.hoverProducts1();
        products.clickParasoft_C(); // Parasoft C/C++

    }

    @Test
    public void tc004_parabank_Products() {
        products.hoverProducts1();
        products.clickParasoft_JTest();

    }

    @Test
    public void tc005_parabank_Products() {
        products.hoverProducts1();
        products.clickParasoft_JTest();

    }

    @Test
    public void tc006_parabank_Products() {
        products.hoverProducts1();
        products.clickParasoft_dotTest();

    }

    @Test
    public void tc007_parabank_Products() {
        products.hoverProducts1();
        products.clickParasoft_Insure();

    }

    @Test
    public void tc008_parabank_Products() {
        products.hoverProducts1();
        products.clickParasoft_DTP();

    }

    @Test
    public void tc009_parabank_Products() {
        products.hoverProducts1();
        products.clickParasoft_CTP();

    }

    @Test
    public void tc010_parabank_Products() {
        products.hoverProducts1();
        products.clickParasoft_Selenic();

    }

    @Test
    public void tc011_parabank_Products() {
        products.hoverProducts1();
        products.clickParasoft_Soatest();

    }

    @Test
    public void tc012_parabank_Products() {
        products.hoverProducts1();
        products.clickParasoft_virtualize();

    }


}

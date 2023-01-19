package practice.priyankaProgramsNew;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBar {
    /*public static void main(String args[]) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Priyanka\\Downloads\\chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.geeksforgeeks.org/");
        JavascriptExecutor js = (JavascriptExecutor) driver;

        //Scroll down till the bottom of the page
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        //js.executeScript("window.scrollBy(0,250)", "");
        //js.executeScript("window.scrollBy(250,0)", ""); // horizontal
       // js.executeScript("document.getElementById('gvLocationHorizontalRail').scrollLeft += 250", "");
    }*/

    public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver","C:\\Users\\Priyanka\\Downloads\\chromedriver\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.get("https://www.bing.com/search?q=myntra%20online%20shopping&pc=0SLN&ptag=C22N9997D061122A00ED787AAB&form=CONBDF&conlogo=CT3210127");

       JavascriptExecutor js =  (JavascriptExecutor) driver;
       js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    }
}

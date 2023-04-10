package MainClass;

import BC.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.AfterClass;
public class NewTest  {
    static WebDriver driver ;
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\a1354\\eclipse-workspace\\Shriam_General_Insurance\\Git_Integration\\src\\main\\java\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://www.softwaretestingmaterial.com/");

        driver.quit();

    }

}
//    public WebDriver driver;
//    @Test
//    public void openMyBlog() {
//        driver.get("https://www.softwaretestingmaterial.com/");
//    }
//
//    @BeforeClass
//    public void beforeClass() {
//
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\a1354\\eclipse-workspace\\Shriam_General_Insurance\\Git_Integration\\src\\main\\java\\chromedriver.exe");
//        driver = new ChromeDriver();
//
//    }
//
//    @AfterClass
//    public void afterClass() {
//        driver.quit();
//    }


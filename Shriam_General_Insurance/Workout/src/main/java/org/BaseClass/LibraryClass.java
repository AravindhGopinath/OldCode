package org.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.locators.Xpaths;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;


public class LibraryClass {

    public static WebDriver driver;

    public static void launchBrowser() {


        try {
            switch ("chrome") {

                case "chrome":
                    System.setProperty("webdriver.chrome.silentOutput", "true");
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;


                case "firefox":

                    System.setProperty("webdriver.firefox.silentOutput", "true");
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();

                    break;

                case "ie":
                    System.setProperty("webdriver.ie.silentOutput", "true");
                    WebDriverManager.iedriver().setup();
                    driver = new InternetExplorerDriver();

                    break;


                default:
                    System.setProperty("webdriver.edge.silentOutput", "true");
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;


            }
            driver.manage().window().maximize();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void url_Launch (String URl){

        try {
            driver.get(URl);
        }
        catch (Exception e) {

            System.out.println(e);

        }

    }

    public static void initWebElements(){

        PageFactory.initElements(driver, Xpaths.getInstance());

    }




}

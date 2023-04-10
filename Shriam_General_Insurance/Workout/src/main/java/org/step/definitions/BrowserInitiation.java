package org.step.definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.BaseClass.LibraryClass;

public class BrowserInitiation extends LibraryClass {


    @Before
    public static void browserLaunch(){
        launchBrowser();

        url_Launch("https://www.facebook.com/");

        initWebElements();


    }
    @After
    public static void tearDown(){

        driver.quit();

    }

}

package org.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Xpaths {

    private static Xpaths xpathsPageInstance;

    private Xpaths(){

    }
    public static Xpaths getInstance(){
        if (xpathsPageInstance==null){
            xpathsPageInstance=new Xpaths();
        }
        return xpathsPageInstance;
    }

    @FindBy (id="name")

    private WebElement username;

    public WebElement getUsername() {
        return username;
    }
}

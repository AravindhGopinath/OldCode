package org.elements;

import org.libglobal.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Locators extends LibGlobal{

	public Locators() {

		PageFactory.initElements(driver, this);
		}

	@CacheLookup
	
	@FindBy(xpath="(//a[@class='btn btn-primary-ao agree-btn1 nav-show settimer btnpagination btn-getloan-fixed btn-shadow ajax-landing-submit'])[1]")
	
	private WebElement disabledbtn;
	
	@FindBy(xpath="(//span[@class='checkmark'])[1]")

	private WebElement checkbox;
	
	@FindBy(xpath="(//a[@class='knowhowlink ajax-know-how'])[1]")
	
	private WebElement knowhowbtn;
	
	@FindBy(xpath="(//a[@data-target='#exampleModal'])[1]")
	
	private WebElement tandcbtn ;
	
	@FindBy(xpath="(//button[@class='close'])[8]")
	
	private WebElement knowhowbtnclose;
	
	@FindBy(xpath="(//a[@target='_blank'])[4]")
	
	private WebElement reportproblem;
	
	@FindBy(xpath="//a[@class='btn btn-primary-ao btn-shadow btn-darkgrey']")	
	
	private WebElement gotitbtn;
	
	@FindBy(xpath="(//button[@class='close'])[1]")
	
	private WebElement tandcclosebtn;
	
	@FindBy(xpath="(//a[text()=' www.shriramcity.in'])[1]")
	
	private WebElement tandcshriramlinkbtn;
	
	@FindBy(xpath="(//div[@class='modal-body'])[1]")
	
	private WebElement tandcscroll;
	
	@FindBy(xpath="//*[@id=\"onloadPopup\"]/div/div/div/a")
	
	private WebElement shriclosebtn; 
	
	

	public WebElement getShriclosebtn() {
		return shriclosebtn;
	}

	public WebElement getTandcscroll() {
		return tandcscroll;
	}

	public WebElement getReportproblem() {
		return reportproblem;
	}

	public WebElement getGotitbtn() {
		return gotitbtn;
	}

	public WebElement getTandcclosebtn() {
		return tandcclosebtn;
	}

	public WebElement getTandcshriramlinkbtn() {
		return tandcshriramlinkbtn;
	}

	public WebElement getKnowhowbtnclose() {
		return knowhowbtnclose;
	}

	public WebElement getTandcbtn() {
		return tandcbtn;
	}

	public WebElement getKnowhowbtn() {
		return knowhowbtn;
	}

	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getDisabledbtn() {
		
	return disabledbtn;
	
	}



}


package org.elements;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Elements extends BaseClass {
	
	 public  Elements() {
		PageFactory.initElements(driver, this);
	}
	
	@CacheLookup
	
	@FindBy(xpath = "//*[@id=\"onloadPopup\"]/div/div/div/a")
	private WebElement NoticeCloseButton;

	@FindBy(xpath = "(//a[@class='apply-now'])[3]")
	private WebElement applynow;
	
	@FindBy(xpath = "(//button[@class='btn btn-sm pr2 qkcopy'])")
	private WebElement Clickbutton;
	
	@FindBy(xpath = "//button[@class='t-btn t-btn-primary e-right qkgoldloandetsubmit']")
	private WebElement finalapply;

	public WebElement getNoticeCloseButton() {
		return NoticeCloseButton;
	}

	public WebElement getApplynow() {
		return applynow;
	}

	public WebElement getClickbutton() {
		return Clickbutton;
	}

	public WebElement getFinalapply() {
		return finalapply;
	}
	

}

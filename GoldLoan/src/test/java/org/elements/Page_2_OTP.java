package org.elements;

import org.libglobal.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_2_OTP extends LibGlobal{
	
	public Page_2_OTP() {

		PageFactory.initElements(driver, this);
		}

	@CacheLookup
	
	@FindBy(xpath="(//input[@type='tel'])[1]")
	
	private WebElement otp1;
	
	@FindBy(xpath="(//input[@type='tel'])[2]")
	
	private WebElement otp2;
	
	@FindBy(xpath="(//input[@type='tel'])[3]")
	
	private WebElement otp3;
	
	@FindBy(xpath="(//input[@type='tel'])[4]")
	
	private WebElement otp4;
	
	@FindBy(xpath="(//input[@type='tel'])[5]")
	
	private WebElement otp5; 
	
	@FindBy(xpath="(//input[@type='tel'])[6]")
	
	private WebElement otp6;
	
	@FindBy(id="stage-v-g")
	
	private WebElement verifybtn;
	
	@FindBy(xpath="//button[@class='confirm btn btn-lg btn-danger']")
	
	private WebElement okbtn;
	
	@FindBy(id="stage-v-g")
	
	private WebElement verifydisbalebtn;
	
	
	
	
	
	
	
	public WebElement getVerifydisbalebtn() {
		return verifydisbalebtn;
	}

	public WebElement getOkbtn() {
		return okbtn;
	}

	public WebElement getVerifybtn() {
		return verifybtn;
	}

	public WebElement getOtp1() {
		return otp1;
	}

	public WebElement getOtp2() {
		return otp2;
	}

	public WebElement getOtp3() {
		return otp3;
	}

	public WebElement getOtp4() {
		return otp4;
	}

	public WebElement getOtp5() {
		return otp5;
	}

	public WebElement getOtp6() {
		return otp6;
	}

}

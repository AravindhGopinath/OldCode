package org.elements;

import org.libglobal.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_3 extends LibGlobal {

	public Page_3() {

		PageFactory.initElements(driver, this);
		}

	@CacheLookup
	
	@FindBy(xpath="(//button[@class='edit-btn'])[1]")
	
	private WebElement changeloanamtbtn;
	
	@FindBy(xpath="//div[@class='noUi-touch-area']")

	private WebElement viewloanamount;
	
	@FindBy(xpath="(//div[@class='noUi-marker noUi-marker-horizontal noUi-marker-large'])[3]")
	
	private WebElement sliderchange;

	@FindBy(xpath="//div[@class='btn-fixed modl-bt']")
	
	private WebElement confirmbutton;
	
	@FindBy(xpath="//div[@style='transform: translate(-385.71%, 0px); z-index: 4;']")
	
	private WebElement viewloanamount2;
	
	@FindBy(id="bank-next-2")
	
	private WebElement acptbtn;
	
	@FindBy(xpath="(//button[@class='edit-btn'])[2]")
	
	private WebElement bankacbtn;
	
	@FindBy(xpath="//p[@class='bank-det-popup']")
	
	private WebElement bankacbtn2;
	
	@FindBy(xpath="//button[@class='btn btn-bordered bank-edit-action']")
	
	private WebElement bankacbtn3;
	
	@FindBy(xpath="(//button[@class='close'])[4]")
	
	private WebElement bankpopupclose;
	
	@FindBy(id="Account1")
	
	private WebElement bankname;
	
	@FindBy(id="AccountNumber1")
	
	private WebElement bankacno;
	
	@FindBy(id="rAccountNumber1")
	
	private WebElement rebankacno;
	
	@FindBy(id="IFSC1")
	
	private WebElement bankifsc;
	
	@FindBy(xpath="//button[@class='btn btn-covered btn-shadow ajax-bank-update-confirmation']")
	
	private WebElement savebtn;
	
	public WebElement getSavebtn() {
		return savebtn;
	}

	public WebElement getBankname() {
		return bankname;
	}

	public WebElement getBankacno() {
		return bankacno;
	}

	public WebElement getRebankacno() {
		return rebankacno;
	}

	public WebElement getBankifsc() {
		return bankifsc;
	}

	public WebElement getBankpopupclose() {
		return bankpopupclose;
	}

	public WebElement getBankacbtn2() {
		return bankacbtn2;
	}

	public WebElement getBankacbtn3() {
		return bankacbtn3;
	}

	public WebElement getBankacbtn() {
		return bankacbtn;
	}

	public WebElement getAcptbtn() {
		return acptbtn;
	}
	
	public WebElement getViewloanamount2() {
		return viewloanamount2;
	}

	public WebElement getConfirmbutton() {
	return confirmbutton;
}

	public WebElement getSliderchange() {
		return sliderchange;
	}

	public WebElement getViewloanamount() {
		return viewloanamount;
	}

	public WebElement getChangeloanamtbtn() {
		return changeloanamtbtn;
	}
	
}

package org.webelements;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Locators_6th_page extends BaseClass {

	public Locators_6th_page() {

		PageFactory.initElements(driver, this);
	}
	
	@CacheLookup
	
	@FindBy(xpath="(//div[@class='_3-zL border-global'])[3]")
	
	private WebElement netbanking_btn;
	
	@FindBy(xpath="//button[@class='btn btn-primary w100 pos-r _2fNU   ']")
	
	private WebElement pay_btn;
	
	@FindBy(xpath="//button[@class='btn btnd']")
	
	private WebElement success_payment_btn;
	
	@FindBy(xpath="//button[@class='btn btnl']")
	
	private WebElement failure_payment_btn;
	
	@FindBy(id="proceed-button")
	
	private WebElement send_anyway_btn;
	
	@FindBy(id="policyUrl")
	
	private WebElement download_polciy_btn;
	
	@FindBy(xpath="//label[@for='star4']")
	
	private WebElement star4_btn;

	public WebElement getNetbanking_btn() {
		return netbanking_btn;
	}

	public WebElement getPay_btn() {
		return pay_btn;
	}

	public WebElement getSuccess_payment_btn() {
		return success_payment_btn;
	}

	public WebElement getFailure_payment_btn() {
		return failure_payment_btn;
	}

	public WebElement getSend_anyway_btn() {
		return send_anyway_btn;
	}

	public WebElement getDownload_polciy_btn() {
		return download_polciy_btn;
	}

	public WebElement getStar4_btn() {
		return star4_btn;
	}
	
}

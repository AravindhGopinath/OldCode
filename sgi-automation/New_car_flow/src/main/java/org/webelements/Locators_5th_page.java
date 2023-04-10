package org.webelements;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Locators_5th_page extends BaseClass {

	public Locators_5th_page() {

		PageFactory.initElements(driver, this);
	}
	
	@CacheLookup
	
	@FindBy(id="ow_name")
	
	private WebElement full_name_RC;
	
	@FindBy(id="ow_email")
	
	private WebElement email;
	
	@FindBy(id="ow_adLine1")
	
	private WebElement address_line_1;
	
	@FindBy(id="ow_adLine2")
	
	private WebElement address_line_2;
	
	@FindBy(id="ow_pincode")
	
	private WebElement pincode;
	
	@FindBy(id="ow_nomineeName")
	
	private WebElement Nominee_name;
	
	@FindBy(id="ow_nomineeRel")
	
	private WebElement relationship;
	
	@FindBy(id="ow_nomineeAge")
	
	private WebElement Nominee_age;
	
	@FindBy(xpath="(//button[@class='align-item-center'])[1]")
	
	private WebElement continue_btn;
	
	@FindBy(id="new_chassisNumber")
	
	private WebElement chassis_number_textbox;
	
	@FindBy(id="new_enginNumber")
	
	private WebElement engine_number_textbox;
	
	@FindBy(xpath="//span[@class='tog-circle']")
	
	private WebElement tog_circle;
	
	@FindBy(id="pi_hypo_type")
	
	private WebElement hypothecation_loan;
	
	@FindBy(id="pi_hypo_LoanProvider")
	
	private WebElement loan_provider;
	
	@FindBy(id="pi_hypo_FinancierBank")
	
	private WebElement financier_branch;
	
	@FindBy(xpath="(//button[@class='align-item-center'])[2]")

	private WebElement continue_btn_pageii;
	
	@FindBy(id="viewPolicy_breakup")
	
	private WebElement view_policy_breakup;
	
	@FindBy(xpath="//a[@class='navBack']")
	
	private WebElement policy_breakup_back_button;
	
	public WebElement getPolicy_breakup_back_button() {
		return policy_breakup_back_button;
	}

	@FindBy(id="paynowTerms")
	
	private WebElement paynow_agree_checkbox;
	
	@FindBy(xpath="//button[@class='modal-btn term-btn']")
	
	private WebElement tandc_btn;
	
	@FindBy(xpath="(//button[@class='primary-btn modal-close-btn mx-auto mt-20 x-icon'])[15]")
	
	private WebElement tandc_popup_close_btn;
	
	@FindBy(xpath="(//button[@class='primary-btn modal-close-btn mx-auto'])[2]")
	
	private WebElement tandc_gotit_btn;
	
	@FindBy(xpath="(//button[@class='align-item-center d-flex'])[2]")
	
	private WebElement paynow_final_btn;

	public WebElement getFull_name_RC() {
		return full_name_RC;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getAddress_line_1() {
		return address_line_1;
	}

	public WebElement getAddress_line_2() {
		return address_line_2;
	}

	public WebElement getPincode() {
		return pincode;
	}

	public WebElement getNominee_name() {
		return Nominee_name;
	}

	public WebElement getRelationship() {
		return relationship;
	}

	public WebElement getNominee_age() {
		return Nominee_age;
	}

	public WebElement getContinue_btn() {
		return continue_btn;
	}

	public WebElement getChassis_number_textbox() {
		return chassis_number_textbox;
	}

	public WebElement getEngine_number_textbox() {
		return engine_number_textbox;
	}

	public WebElement getTog_circle() {
		return tog_circle;
	}

	public WebElement getHypothecation_loan() {
		return hypothecation_loan;
	}

	public WebElement getLoan_provider() {
		return loan_provider;
	}

	public WebElement getFinancier_branch() {
		return financier_branch;
	}

	public WebElement getContinue_btn_pageii() {
		return continue_btn_pageii;
	}

	public WebElement getView_policy_breakup() {
		return view_policy_breakup;
	}

	public WebElement getPaynow_agree_checkbox() {
		return paynow_agree_checkbox;
	}

	public WebElement getTandc_btn() {
		return tandc_btn;
	}

	public WebElement getTandc_popup_close_btn() {
		return tandc_popup_close_btn;
	}

	public WebElement getTandc_gotit_btn() {
		return tandc_gotit_btn;
	}

	public WebElement getPaynow_final_btn() {
		return paynow_final_btn;
	}
	
	
	
}

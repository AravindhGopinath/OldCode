package org.webelements;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Locators_3rd_page extends BaseClass {

	public Locators_3rd_page() {

		PageFactory.initElements(driver, this);
	}
	
	@CacheLookup

	@FindBy(id="c_vd_MakeModel")
	
	private WebElement Make_field_textbox;
	
	@FindBy(id="c_vd_Variant")
	
	private WebElement variant_field_textbox;
	
	@FindBy(id="c_vd_RegistrationDate")
	
	private WebElement date_of_reg;
	
	@FindBy(id="n_YearOfManifacture")
	
	private WebElement year_of_manufacture;
	
	@FindBy(xpath="//label[@for='c_vd_Individual']")
	
	private WebElement individual_btn;
	
	@FindBy(xpath="//label[@for='c_vd_Company']")
	
	private WebElement company_btn;
	
	@FindBy(id="c_vd_companyName")
	
	private WebElement company_name_textbox;
	
	@FindBy(id="c_vd_GSTNumber")
	
	private WebElement gst_no_textbox;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	
	private WebElement confirm_continue_btn;

	public WebElement getMake_field_textbox() {
		return Make_field_textbox;
	}

	public WebElement getVariant_field_textbox() {
		return variant_field_textbox;
	}

	public WebElement getDate_of_reg() {
		return date_of_reg;
	}

	public WebElement getYear_of_manufacture() {
		return year_of_manufacture;
	}

	public WebElement getIndividual_btn() {
		return individual_btn;
	}

	public WebElement getCompany_btn() {
		return company_btn;
	}

	public WebElement getCompany_name_textbox() {
		return company_name_textbox;
	}

	public WebElement getGst_no_textbox() {
		return gst_no_textbox;
	}

	public WebElement getConfirm_continue_btn() {
		return confirm_continue_btn;
	}
	
	
	
	
}

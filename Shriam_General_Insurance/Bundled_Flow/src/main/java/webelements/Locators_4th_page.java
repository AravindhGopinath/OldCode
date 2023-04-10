package webelements;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Locators_4th_page extends BaseClass {

	public Locators_4th_page() {

		PageFactory.initElements(driver, this);
	}
	
	@CacheLookup
	
	@FindBy(id="planTarget")
	
	private WebElement here_is_your_plan_btn;
	
	@FindBy(xpath="(//button[@class='primary-btn modal-close-btn mx-auto mt-20 x-icon'])[8]")
	
	private WebElement here_is_your_plan_close_btn;
	
	@FindBy(xpath="(//button[@class='info-btn modal-btn'])[4]")
	
	private WebElement additional_cover_info_btn;
	
	@FindBy(xpath="(//button[@class='primary-btn modal-close-btn mx-auto mt-20 x-icon'])[11]")
	
	private WebElement additional_cover_info_close_btn;
	
	@FindBy(xpath="//label[@for='ElectricalAccessories']")
	
	private WebElement electrical_accs_radio_btn;
	
	@FindBy(xpath="//label[@for='NonElectricalAccessories']")
	
	private WebElement non_electrical_accs_radio_btn;
	
	@FindBy(xpath="//label[@for='LPG_CNG']")
	
	private WebElement lpg_cng_btn;
	
	@FindBy(id="lpg_fuelType")
	
	private WebElement fuel_type;
	
	@FindBy(id="lpg_amount")
	
	private WebElement lpg_amount;
	
	public WebElement getFuel_type() {
		return fuel_type;
	}

	public WebElement getLpg_amount() {
		return lpg_amount;
	}

	@FindBy(id="ea_accessoriesName")
	
	private WebElement electrical_accs_name_textbox;
	
	@FindBy(id="ea_accessoriesAmount")
	
	private WebElement electrical_accs_amount_textbox;
	
	@FindBy(xpath="(//button[@class='primary-btn mx-auto'])[1]")
	
	private WebElement electrical_accs_submit_btn;
	
	@FindBy(xpath="(//button[@class='primary-btn mx-auto'])[2]")
	
	private WebElement non_electrical_accs_submit_btn;
	
	@FindBy(id="non_ea_accessoriesName")
	
	private WebElement non_electrical_accs_name_textbox;
	
	@FindBy(id="non_ea_accessoriesAmount")
	
	private WebElement non_electrical_accs_amount_textbox;
	
	public WebElement getNon_electrical_accs_name_textbox() {
		return non_electrical_accs_name_textbox;
	}

	public WebElement getNon_electrical_accs_amount_textbox() {
		return non_electrical_accs_amount_textbox;
	}

	@FindBy(xpath="(//button[@class='primary-btn mx-auto'])[3]")
	
	private WebElement lpg_cng_submit_btn;
	
	@FindBy(xpath="(//button[@class='info-btn modal-btn'])[5]")
	
	private WebElement idv_info_btn;
	
	@FindBy(xpath="(//button[@class='primary-btn modal-close-btn mx-auto mt-20 x-icon'])[13]")

	private WebElement idv_info_popup_close_btn;
	
	@FindBy(id="IDVslider")
	
	private WebElement  idv_js_slider;
	
	@FindBy(xpath="(//button[@class='info-btn modal-btn'])[6]")
	
	private WebElement add_ons_info_btn;
	
	@FindBy(xpath="(//button[@class='primary-btn modal-close-btn mx-auto mt-20 x-icon'])[12]")
	
	private WebElement add_ons_info_close_btn;
	
	@FindBy(xpath="(//label[@class='extra-cov-box'])[1]")
	
	private WebElement pac_cover_btn;
	
	@FindBy(xpath="(//label[@class='extra-cov-box'])[2]")
	
	private WebElement rsa_cover_btn;
	
	@FindBy(xpath="(//label[@class='extra-cov-box'])[3]")
	
	private WebElement zero_dep_cover_btn;
	
	@FindBy(xpath="(//label[@class='extra-cov-box'])[4]")
	
	private WebElement view_more_covergae_btn;
	
	@FindBy(xpath="//label[@for='add4']")
	
	private WebElement addon_cover_btn1;
	
	@FindBy(xpath="//label[@for='add5']")
	
	private WebElement addon_cover_btn2;
	
	@FindBy(xpath="//label[@for='add6']")
	
	private WebElement addon_cover_btn3;
	
	@FindBy(xpath="//label[@for='add7']")

	private  WebElement addon_cover_btn4;
	
	@FindBy(xpath="//a[@class='align-item-center modal-close-btn d-flex']")
	
	private WebElement addon_confirm_continue_btn;
	
	@FindBy(xpath="(//button[@class='align-item-center d-flex'])[1]")
	
	private WebElement final_continue_btn;

	public WebElement getHere_is_your_plan_btn() {
		return here_is_your_plan_btn;
	}

	public WebElement getHere_is_your_plan_close_btn() {
		return here_is_your_plan_close_btn;
	}

	public WebElement getAdditional_cover_info_btn() {
		return additional_cover_info_btn;
	}

	public WebElement getAdditional_cover_info_close_btn() {
		return additional_cover_info_close_btn;
	}

	public WebElement getElectrical_accs_radio_btn() {
		return electrical_accs_radio_btn;
	}

	public WebElement getNon_electrical_accs_radio_btn() {
		return non_electrical_accs_radio_btn;
	}

	public WebElement getLpg_cng_btn() {
		return lpg_cng_btn;
	}

	public WebElement getElectrical_accs_name_textbox() {
		return electrical_accs_name_textbox;
	}

	public WebElement getElectrical_accs_amount_textbox() {
		return electrical_accs_amount_textbox;
	}

	public WebElement getElectrical_accs_submit_btn() {
		return electrical_accs_submit_btn;
	}

	public WebElement getNon_electrical_accs_submit_btn() {
		return non_electrical_accs_submit_btn;
	}

	public WebElement getLpg_cng_submit_btn() {
		return lpg_cng_submit_btn;
	}

	public WebElement getIdv_info_btn() {
		return idv_info_btn;
	}

	public WebElement getIdv_info_popup_close_btn() {
		return idv_info_popup_close_btn;
	}

	public WebElement getIdv_js_slider() {
		return idv_js_slider;
	}

	public WebElement getAdd_ons_info_btn() {
		return add_ons_info_btn;
	}

	public WebElement getAdd_ons_info_close_btn() {
		return add_ons_info_close_btn;
	}

	public WebElement getPac_cover_btn() {
		return pac_cover_btn;
	}

	public WebElement getRsa_cover_btn() {
		return rsa_cover_btn;
	}

	public WebElement getZero_dep_cover_btn() {
		return zero_dep_cover_btn;
	}

	public WebElement getView_more_covergae_btn() {
		return view_more_covergae_btn;
	}

	public WebElement getAddon_cover_btn1() {
		return addon_cover_btn1;
	}

	public WebElement getAddon_cover_btn2() {
		return addon_cover_btn2;
	}

	public WebElement getAddon_cover_btn3() {
		return addon_cover_btn3;
	}

	public WebElement getAddon_cover_btn4() {
		return addon_cover_btn4;
	}

	public WebElement getAddon_confirm_continue_btn() {
		return addon_confirm_continue_btn;
	}

	public WebElement getFinal_continue_btn() {
		return final_continue_btn;
	} 
	
	
	
}

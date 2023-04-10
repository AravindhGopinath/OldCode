package org.webelements;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Locators extends BaseClass {

	public Locators() {

		PageFactory.initElements(driver, this);
	}

	@CacheLookup

	@FindBy(id = "cn")

	private WebElement carno_page1;

	@FindBy(id = "name")

	private WebElement mobno_page1;

	@FindBy(id = "agree")

	private WebElement checkbox_page1;
	
//	termsagree
	
	@FindBy(id="agree")
	
	private WebElement checkbox_page_6; 

	@FindBy(xpath = "//button[@class='modal-btn term-btn']")

	private WebElement tandc_page1;

	@FindBy(id = "Icon_ionic-md-close")

	private WebElement tandcclosebtn_page1;
	
	@FindBy(xpath="//button[@class='primary-btn modal-close-btn mx-auto']")
	
	private WebElement tandcgotitbtn_page1;

	@FindBy(xpath = "//div[@class='common_button']")

	private WebElement getquotebtn_page1;

	@FindBy(xpath = "(//input[@class='otp'])[1]")

	private WebElement otp1_page2;

	@FindBy(xpath = "(//input[@class='otp'])[2]")

	private WebElement otp2_page2;

	@FindBy(xpath = "(//input[@class='otp'])[3]")

	private WebElement otp3_page2;

	@FindBy(xpath = "(//input[@class='otp'])[4]")

	private WebElement otp4_page2;

	@FindBy(xpath = "(//input[@class='otp'])[5]")

	private WebElement otp5_page2;

	@FindBy(xpath = "(//input[@class='otp'])[6]")

	private WebElement otp6_page2;

	@FindBy(xpath = "//button[@class='resend_otp f-m']")

	private WebElement resendotpbtn_page2;

	@FindBy(xpath = "//div[@class='right_arrow_disable']")

	private WebElement otpgobtn_page2;
	
	@FindBy(xpath="//div[@class='edit_text']")
	
	private WebElement editbtn_page3;
	
	@FindBy(xpath="//img[@alt='edit']")
	
	private WebElement img_editbtn_page3;
	
	@FindBy(id="name3")
	
	private WebElement vehicle_no_page3_ii;

	@FindBy(id="select2-make-container")
	
	private WebElement makeandmodel_drpdwn_page3_ii;
	
	@FindBy(xpath="//span[@class='select2-search select2-search--dropdown']")
	
	private WebElement makeandmodel_sendkeys_page4_ii;
	
	@FindBy(xpath="//input[@class='select2-search__field']")
	
	private WebElement makeandmodel_snd_kys_page3_ii;
	
	@FindBy(id="name5")
	
	private WebElement variant_drpdwn_page3_ii;
	
	@FindBy(id="name1")
	
	private WebElement reg_date_drpdwn_page3_ii;
	
	@FindBy(xpath="//input[@class='price-range']")
	
	private WebElement slider_page4;
	
	@FindBy(xpath="/html/body/main/section/div/div/div[2]/div[2]/div[5]/div/div[1]/label")
	
	private WebElement individual_radio_btn_page3_ii;
	
	@FindBy(xpath="//label[text()='Company']")
	
	private WebElement company_text_page3;
	
	@FindBy(xpath="/html/body/main/section/div/div/div[2]/div[2]/div[5]/div/div[2]/label")
	
	private WebElement comapny_btn_page3_ii;
	
	@FindBy(xpath="(//input[@class='form-box'])[5]")
	
	private WebElement city_of_reg_page3_ii;
	
	@FindBy(xpath="(//input[@class='form-box'])[6]")
	
	private WebElement enter_company_name_page3_ii;
	
	@FindBy(xpath="(//input[@class='form-box'])[7]")
	
	private WebElement enter_gst_no_page3_ii;
	
	@FindBy(xpath="//img[@alt='info']")
	
	private WebElement infobtn_page3;
	
	@FindBy(xpath="//label[@for='com']")
	
	private WebElement comprehensive_radiobtn_page3;
	
	@FindBy(id="two")
	
	private WebElement owndamage_radiobtn_page3;
	
	@FindBy(id="three")
	
	private WebElement thrirdparty_radiobtn_page3;
	
	@FindBy(id="name6")
	
	private WebElement comprehensive_previous_policydate_page3;
	
	@FindBy(id="name2")
	
	private WebElement owndamage_thirdparty_policy_startdate_page3;
	
	@FindBy(id="name3")
	
	private WebElement owndamage_thirdparty_policy_enddate_page3;
	
	@FindBy(id="name4")
	
	private WebElement owndamage_policy_startdate_page3;
	
	@FindBy(id="name5")
	
	private WebElement thirdparty_previous_policy_expiry_date_page3;
	
	@FindBy(xpath="//a[text()='Get Quote ']")
	
	private WebElement getquotebtn_page3;
	
	@FindBy(xpath="//div[@class='common_button card-edit-button']")
	
	private WebElement confirm_continue_btn_page3;
	
	@FindBy(xpath="//span[@class='edit-view']")
	
	private WebElement ncbeditbtn_page4;
	
	@FindBy(xpath="//span[@class='tog-circle']")
	
	private WebElement togswitch_ownership_transfer_page4; 
	
	@FindBy(xpath="(//label[@class='radio-wr'])[1]")
	
	private WebElement make_claim_in_previous_policy_nobtn_page4;
	
	@FindBy(xpath="(//label[@class='radio-wr'])[2]")
	
	private WebElement make_claim_in_previous_policy_yesbtn_page4;
	
	@FindBy(xpath="(//label[@class='radio-wr'])[3]")
	
	private WebElement ncbbonus_50btn;
	
	@FindBy(xpath="(//label[@class='radio-wr'])[4]")
	
	private WebElement ncbbonus_45btn;
	
	@FindBy(xpath="(//label[@class='radio-wr'])[5]")
	
	private WebElement ncbbonus_35btn;
	
	@FindBy(xpath="(//label[@class='radio-wr'])[6]")
	
	private WebElement ncbbonus_25btn;
	
	@FindBy(xpath="(//label[@class='radio-wr'])[7]")
	
	private WebElement ncbbonus_20btn;
	
	@FindBy(xpath="(//label[@class='radio-wr'])[8]")
	
	private WebElement ncbbonus_0btn;
	
	@FindBy(xpath="//button[@class='primary-btn modal-close-btn mx-auto mt-20 mb-0']")
	
	private WebElement confirmandcontinuebtn_ncb_poppup_page4;
	
	@FindBy(id="Icon_ionic-md-close")
	
	private WebElement closebtn_ncb_poppup_page4;
	
	@FindBy(xpath="(//button[@class='info-btn modal-btn'])[1]")
	
	private WebElement here_your_plan_info_page4;
	
	@FindBy(xpath="(//button[@class='primary-btn modal-close-btn mx-auto mt-20 x-icon'])[2]")
	
	private WebElement here_your_plan_info_closebtn_page4;
	
	@FindBy(xpath="(//button[@class='info-btn modal-btn'])[2]")
	
	private WebElement extra_protection_info_btn_page4;
	
	@FindBy(xpath="(//button[@class='primary-btn modal-close-btn mx-auto mt-20 x-icon'])[3]")
	
	private WebElement extra_protection_popup_closebtn_page4;
	
	@FindBy(id="Icon_ionic-md-close")
	
	private WebElement electrical_non_electrical_lpg_cng_accs_popup_close_btn_page4_ii;
	
	@FindBy(xpath="(//label[@class='extr-pro-label'])[1]")
	
	private WebElement electrical_accs_radio_btn_page4;
	
	@FindBy(xpath="//input[@class='form-box']")
	
	private WebElement electrical_accs_name_txtbox_page4_ii;
	
	@FindBy(xpath="(//input[@class='form-box'])[2]")
	
	private WebElement electrical_accs_amount_textbox_page4_ii;
	
	@FindBy(xpath="(//button[@class='primary-btn modal-close-btn mx-auto'])[1]")
	
	private WebElement electrical_accs_submit_btn_page4_ii;
	
	@FindBy(xpath="(//label[@class='extr-pro-label'])[2]")
	
	private WebElement non_electrical_accs_radio_btn_page4;
	
	@FindBy(xpath="(//input[@class='form-box'])[3]")
	
	private WebElement non_electrrical_accs_name_textbox_page4_ii;
	
	@FindBy(xpath="(//input[@class='form-box'])[4]")
	
	private WebElement non_electrrical_accs_amount_textbox_page4_ii;
	
	@FindBy(xpath="(//button[@class='primary-btn modal-close-btn mx-auto'])[2]")
	
	private WebElement non_electrical_accs_submit_btn_page4_ii;
	
	@FindBy(xpath="(//label[@class='extr-pro-label'])[3]")
	
	private WebElement Lpg_Cng_accs_radio_btn_page4;
	
	@FindBy(id="na")
	
	private WebElement fuel_type_lpg_cng_drpdwn_page4_ii;
	
	@FindBy(xpath="(//input[@class='form-box'])[5]")
	
	private WebElement enter_amount_lpg_cng_page4_ii; 	
	
	@FindBy(xpath="(//button[@class='primary-btn modal-close-btn mx-auto'])[3]")
	
	private WebElement lpg_cng_submit_btn_page4_ii;
	
	@FindBy(xpath="(//button[@class='info-btn modal-btn'])[3]")
	
	private WebElement insured_value_infobtn_page4;
	
	@FindBy(xpath="(//button[@class='primary-btn modal-close-btn mx-auto mt-20 x-icon'])[8]")
	
	private WebElement idvpopup_closebtn_page4;
	
	@FindBy(xpath="(//button[@class='info-btn modal-btn'])[4]")
	
	private WebElement add_extra_coverage_infobtn_page4;
	
	@FindBy(xpath="(//button[@class='primary-btn modal-close-btn mx-auto mt-20 x-icon'])[7]")
	
	private WebElement add_extra_coverage_popup_closebtn_page4;
	
	@FindBy(xpath="(//label[@class='extra-cov-box'])[1]")
	
	private WebElement pac_btn_page4;
	
	@FindBy(xpath="(//label[@class='extra-cov-box'])[2]")
	
	private WebElement rsa_btn_page4;
	
	@FindBy(xpath="(//label[@class='extra-cov-box'])[3]")
	
	private WebElement zerodep_btn_page4;
	
	@FindBy(xpath="//button[@class='view-more-btn modal-btn']")
	
	private WebElement viewmore_covereage_btn_page4;
	
	@FindBy(id="add_btn")
	
	private WebElement pac_add_btn_in_popup;
	
	@FindBy(xpath="(//button[text()='Add'])[2]")
	
	private WebElement pacii_add_btn_in_popup;
	
	@FindBy(xpath="(//button[@class='primary-btn modal-close-btn mx-auto mt-20 x-icon'])[5]")
	
	private WebElement viewmore_coverage_close_btn_page4;
	
	@FindBy(xpath="(//a[@class='align-item-center d-flex'])[2]")
	
	private WebElement viewmore_coverage_confirm_continue_btn_popup_page4;
	
	@FindBy(xpath="(//a[@class='align-item-center d-flex'])[1]")
	
	private WebElement continue_btn_page4;
	
	@FindBy(id="rc")
	
	private WebElement rcfullname_page5;
	
	@FindBy(xpath="(//input[@class='form-box'])[2]")
	
	private WebElement mobno_page5;
	
	@FindBy(id="email")
	
	private WebElement email_page5;
	
	@FindBy(xpath="(//input[@class='form-box'])[4]")
	
	private WebElement addressline1_page5;
	
	@FindBy(xpath="(//input[@class='form-box'])[5]")
	
	private WebElement addressline2_page5;
	
	@FindBy(id="pc")
	
	private WebElement pincode_page5;
	
	@FindBy(xpath="(//input[@class='form-box'])[7]")
	
	private WebElement nominee_name_page5;
	
	@FindBy(xpath="//select[@class='form-box']")
	
	private WebElement relationship_page5;
	
	@FindBy(xpath="(//input[@class='form-box'])[8]")
	
	private WebElement nomineeage_page5;
	
	@FindBy(id="f_step1")
	
	private WebElement continue_btn_ownerinfo_page5;
	
	@FindBy(xpath="(//button[@class='modal-btn'])[1]")
	
	private WebElement chassisno_edit_btn_page5_ii;
	
	@FindBy(xpath="(//button[@class='modal-btn'])[2]")
	
	private WebElement engine_no_page5_ii;
	
	@FindBy(xpath="//span[@class='tog-circle']")
	
	private WebElement toggleswitch_page5_ii;
	
	@FindBy(id="hypothe")
	
	private WebElement hypothecation_loan_page5_ii;
	
	@FindBy(xpath="(//input[@class='form-box'])[14]")
	
	private WebElement chasis_no_page5_ii;
	
	@FindBy(xpath="(//input[@class='form-box'])[15]")
	
	private WebElement edited_engine_no_page5_ii;
	
	@FindBy(xpath="//button[@class='primary-btn modal-close-btn pop_full_width mx-auto']")
	
	private WebElement got_it_btn_page_5_ii;
	
	@FindBy(id="name3")
	
	private WebElement loan_provider_page_5_ii;
	
	@FindBy(xpath="(//input[@class='form-box'])[10]")
	
	private WebElement financier_name_page_5_ii;
	
	@FindBy(id="in")
	
	private WebElement insurer_page5_ii;
	
	@FindBy(id="pon")
	
	private WebElement policyno_page5_ii;
	
	@FindBy(id="pe")
	
	private WebElement policyexpdate_page5_ii;
	
	@FindBy(id="f_step2")
	
	private WebElement paynow_btn_page5_ii;
	
	@FindBy(xpath="//div[@class='s_policy']")
	
	private WebElement view_policy_breakup_page5_iii;
	
	@FindBy(id="agree")
	
	private WebElement paynow_btn_page5_iii;
	
	@FindBy(xpath="(//div[@class='common_button flex-end'])[3]")
	
	private WebElement paynow_btn_page_6;
	
	@FindBy(xpath="(//img[@class='payment-img'])[1]")
	
	private WebElement paytm_btn_page_5_ii;
	
	@FindBy(xpath="//a[@class='align-item-center d-flex mx-auto']")
	
	private WebElement proceed_to_pay_btn_page_5_iii;
	
	@FindBy(xpath="//button[@class='modal-btn term-btn']")
	
	private WebElement tandc_btn_page5_iii;
	
	@FindBy(xpath="//a[@class='primary-btn m-0 w-50']")
	
	private WebElement download_policy_btn_page6;
	
	@FindBy(xpath="//a[@class='primary-btn-outline m-0 w-50 p-relative modal-btn']")
	
	private WebElement share_btn_page6;
	
	@FindBy(id="star1")
	
	private WebElement starrating1_btn_page6;
	
	@FindBy(id="star2")
	
	private WebElement starrating2_btn_page6;
	
	@FindBy(id="star3")
	
	private WebElement starrating3_btn_page6;
	
	@FindBy(xpath="//label[@for='star4']")
	
	private WebElement starrating4_btn_page6;
	
	@FindBy(id="star5")
	
	private WebElement starrating5_btn_page6;

	public WebElement getCarno_page1() {
		return carno_page1;
	}

	public WebElement getMobno_page1() {
		return mobno_page1;
	}

	public WebElement getCheckbox_page1() {
		return checkbox_page1;
	}

	public WebElement getTandc_page1() {
		return tandc_page1;
	}

	public WebElement getTandcclosebtn_page1() {
		return tandcclosebtn_page1;
	}

	public WebElement getTandcgotitbtn_page1() {
		return tandcgotitbtn_page1;
	}

	public WebElement getGetquotebtn_page1() {
		return getquotebtn_page1;
	}

	public WebElement getOtp1_page2() {
		return otp1_page2;
	}

	public WebElement getOtp2_page2() {
		return otp2_page2;
	}

	public WebElement getOtp3_page2() {
		return otp3_page2;
	}

	public WebElement getOtp4_page2() {
		return otp4_page2;
	}

	public WebElement getOtp5_page2() {
		return otp5_page2;
	}

	public WebElement getMakeandmodel_snd_kys_page3_ii() {
		return makeandmodel_snd_kys_page3_ii;
	}
	
	public WebElement getOtp6_page2() {
		return otp6_page2;
	}

	public WebElement getPaynow_btn_page_6() {
		return paynow_btn_page_6;
	}
	
	public WebElement getResendotpbtn_page2() {
		return resendotpbtn_page2;
	}

	public WebElement getOtpgobtn_page2() {
		return otpgobtn_page2;
	}

	public WebElement getEditbtn_page3() {
		return editbtn_page3;
	}

	public WebElement getImg_editbtn_page3() {
		return img_editbtn_page3;
	}
	
	public WebElement getCheckbox_page_6() {
		return checkbox_page_6;
	}
	
	public WebElement getVehicle_no_page3_ii() {
		return vehicle_no_page3_ii;
	}
	
	public WebElement getMakeandmodel_drpdwn_page3_ii() {
		return makeandmodel_drpdwn_page3_ii;
	}

	public WebElement getVariant_drpdwn_page3_ii() {
		return variant_drpdwn_page3_ii;
	}

	public WebElement getReg_date_drpdwn_page3_ii() {
		return reg_date_drpdwn_page3_ii;
	}

	public WebElement getIndividual_radio_btn_page3_ii() {
		return individual_radio_btn_page3_ii;
		
	}
	
	public WebElement getMakeandmodel_sendkeys_page4_ii() {
		return makeandmodel_sendkeys_page4_ii;
	}

	
	public WebElement getCompany_text_page3() {
		return company_text_page3;
	}

	public WebElement getComapny_btn_page3_ii() {
		return comapny_btn_page3_ii;
	}

	public WebElement getCity_of_reg_page3_ii() {
		return city_of_reg_page3_ii;
	}
	
	public WebElement getEnter_company_name_page3_ii() {
		return enter_company_name_page3_ii;
	}

	public WebElement getEnter_gst_no_page3_ii() {
		return enter_gst_no_page3_ii;
	}
	
	public WebElement getInfobtn_page3() {
		return infobtn_page3;
	}

	public WebElement getComprehensive_radiobtn_page3() {
		return comprehensive_radiobtn_page3;
	}

	public WebElement getOwndamage_radiobtn_page3() {
		return owndamage_radiobtn_page3;
	}

	public WebElement getThrirdparty_radiobtn_page3() {
		return thrirdparty_radiobtn_page3;
	}

	public WebElement getComprehensive_previous_policydate_page3() {
		return comprehensive_previous_policydate_page3;
	}

	public WebElement getOwndamage_thirdparty_policy_startdate_page3() {
		return owndamage_thirdparty_policy_startdate_page3;
	}

	public WebElement getOwndamage_thirdparty_policy_enddate_page3() {
		return owndamage_thirdparty_policy_enddate_page3;
	}

	public WebElement getOwndamage_policy_startdate_page3() {
		return owndamage_policy_startdate_page3;
	}

	public WebElement getThirdparty_previous_policy_expiry_date_page3() {
		return thirdparty_previous_policy_expiry_date_page3;
	}

	public WebElement getGetquotebtn_page3() {
		return getquotebtn_page3;
	}
	
	public WebElement getConfirm_continue_btn_page3() {
		return confirm_continue_btn_page3;
	}

	public WebElement getNcbeditbtn_page4() {
		return ncbeditbtn_page4;
	}

	public WebElement getTogswitch_ownership_transfer_page4() {
		return togswitch_ownership_transfer_page4;
	}

	public WebElement getMake_claim_in_previous_policy_nobtn_page4() {
		return make_claim_in_previous_policy_nobtn_page4;
	}

	public WebElement getMake_claim_in_previous_policy_yesbtn_page4() {
		return make_claim_in_previous_policy_yesbtn_page4;
	}

	public WebElement getNcbbonus_50btn() {
		return ncbbonus_50btn;
	}

	public WebElement getNcbbonus_45btn() {
		return ncbbonus_45btn;
	}

	public WebElement getNcbbonus_35btn() {
		return ncbbonus_35btn;
	}

	public WebElement getNcbbonus_25btn() {
		return ncbbonus_25btn;
	}

	public WebElement getNcbbonus_20btn() {
		return ncbbonus_20btn;
	}

	public WebElement getNcbbonus_0btn() {
		return ncbbonus_0btn;
	}

	public WebElement getConfirmandcontinuebtn_ncb_poppup_page4() {
		return confirmandcontinuebtn_ncb_poppup_page4;
	}

	public WebElement getClosebtn_ncb_poppup_page4() {
		return closebtn_ncb_poppup_page4;
	}

	public WebElement getHere_your_plan_info_page4() {
		return here_your_plan_info_page4;
	}

	public WebElement getHere_your_plan_info_closebtn_page4() {
		return here_your_plan_info_closebtn_page4;
	}

	public WebElement getElectrical_non_electrical_lpg_cng_accs_popup_close_btn_page4_ii() {
		return electrical_non_electrical_lpg_cng_accs_popup_close_btn_page4_ii;
	}

	public WebElement getElectrical_accs_name_txtbox_page4_ii() {
		return electrical_accs_name_txtbox_page4_ii;
	}

	public WebElement getElectrical_accs_amount_textbox_page4_ii() {
		return electrical_accs_amount_textbox_page4_ii;
	}

	public WebElement getElectrical_accs_submit_btn_page4_ii() {
		return electrical_accs_submit_btn_page4_ii;
	}

	public WebElement getNon_electrrical_accs_name_textbox_page4_ii() {
		return non_electrrical_accs_name_textbox_page4_ii;
	}

	public WebElement getNon_electrrical_accs_amount_textbox_page4_ii() {
		return non_electrrical_accs_amount_textbox_page4_ii;
	}

	public WebElement getNon_electrical_accs_submit_btn_page4_ii() {
		return non_electrical_accs_submit_btn_page4_ii;
	}

	public WebElement getFuel_type_lpg_cng_drpdwn_page4_ii() {
		return fuel_type_lpg_cng_drpdwn_page4_ii;
	}

	public WebElement getEnter_amount_lpg_cng_page4_ii() {
		return enter_amount_lpg_cng_page4_ii;
	}

	public WebElement getLpg_cng_submit_btn_page4_ii() {
		return lpg_cng_submit_btn_page4_ii;
	}
	public WebElement getElectrical_accs_radio_btn_page4() {
		return electrical_accs_radio_btn_page4;
	}

	public WebElement getNon_electrical_accs_radio_btn_page4() {
		return non_electrical_accs_radio_btn_page4;
	}

	public WebElement getLpg_Cng_accs_radio_btn_page4() {
		return Lpg_Cng_accs_radio_btn_page4;
	}

	public WebElement getPac_add_btn_in_popup() {
		return pac_add_btn_in_popup;
	}

	public WebElement getPacii_add_btn_in_popup() {
		return pacii_add_btn_in_popup;
	}

	public WebElement getViewmore_coverage_close_btn_page4() {
		return viewmore_coverage_close_btn_page4;
	}

	public WebElement getViewmore_coverage_confirm_continue_btn_popup_page4() {
		return viewmore_coverage_confirm_continue_btn_popup_page4;
	}

	public WebElement getExtra_protection_info_btn_page4() {
		return extra_protection_info_btn_page4;
	}

	public WebElement getExtra_protection_popup_closebtn_page4() {
		return extra_protection_popup_closebtn_page4;
	}

	public WebElement getInsured_value_infobtn_page4() {
		return insured_value_infobtn_page4;
	}

	public WebElement getIdvpopup_closebtn_page4() {
		return idvpopup_closebtn_page4;
	}

	public WebElement getAdd_extra_coverage_infobtn_page4() {
		return add_extra_coverage_infobtn_page4;
	}

	public WebElement getAdd_extra_coverage_popup_closebtn_page4() {
		return add_extra_coverage_popup_closebtn_page4;
	}

	public WebElement getPac_btn_page4() {
		return pac_btn_page4;
	}

	public WebElement getRsa_btn_page4() {
		return rsa_btn_page4;
	}

	public WebElement getZerodep_btn_page4() {
		return zerodep_btn_page4;
	}

	public WebElement getViewmore_covereage_btn_page4() {
		return viewmore_covereage_btn_page4;
	}

	public WebElement getContinue_btn_page4() {
		return continue_btn_page4;
	}

	public WebElement getRcfullname_page5() {
		return rcfullname_page5;
	}

	public WebElement getMobno_page5() {
		return mobno_page5;
	}

	public WebElement getEmail_page5() {
		return email_page5;
	}

	public WebElement getAddressline1_page5() {
		return addressline1_page5;
	}

	public WebElement getSlider_page4() {
		return slider_page4;
	}
	
	public WebElement getAddressline2_page5() {
		return addressline2_page5;
	}

	public WebElement getPincode_page5() {
		return pincode_page5;
	}

	public WebElement getNominee_name_page5() {
		return nominee_name_page5;
	}

	public WebElement getRelationship_page5() {
		return relationship_page5;
	}

	public WebElement getNomineeage_page5() {
		return nomineeage_page5;
	}

	public WebElement getContinue_btn_ownerinfo_page5() {
		return continue_btn_ownerinfo_page5;
	}

	public WebElement getChassisno_edit_btn_page5_ii() {
		return chassisno_edit_btn_page5_ii;
	}

	public WebElement getEngine_no_page5_ii() {
		return engine_no_page5_ii;
	}

	public WebElement getToggleswitch_page5_ii() {
		return toggleswitch_page5_ii;
	}

	public WebElement getInsurer_page5_ii() {
		return insurer_page5_ii;
	}

	public WebElement getPolicyno_page5_ii() {
		return policyno_page5_ii;
	}
	
	public WebElement getHypothecation_loan_page5_ii() {
		return hypothecation_loan_page5_ii;
	}

	public WebElement getChasis_no_page5_ii() {
		return chasis_no_page5_ii;
	}

	public WebElement getEdited_engine_no_page5_ii() {
		return edited_engine_no_page5_ii;
	}

	public WebElement getGot_it_btn_page_5_ii() {
		return got_it_btn_page_5_ii;
	}

	public WebElement getLoan_provider_page_5_ii() {
		return loan_provider_page_5_ii;
	}

	public WebElement getFinancier_name_page_5_ii() {
		return financier_name_page_5_ii;
	}
	
	public WebElement getPolicyexpdate_page5_ii() {
		return policyexpdate_page5_ii;
	}

	public WebElement getPaynow_btn_page5_ii() {
		return paynow_btn_page5_ii;
	}

	public WebElement getView_policy_breakup_page5_iii() {
		return view_policy_breakup_page5_iii;
	}

	public WebElement getPaynow_btn_page5_iii() {
		return paynow_btn_page5_iii;
	}

	public WebElement getTandc_btn_page5_iii() {
		return tandc_btn_page5_iii;
	}

	public WebElement getPaytm_btn_page_5_ii() {
		return paytm_btn_page_5_ii;
	}

	public WebElement getProceed_to_pay_btn_page_5_iii() {
		return proceed_to_pay_btn_page_5_iii;
	}
	public WebElement getDownload_policy_btn_page6() {
		return download_policy_btn_page6;
	}

	public WebElement getShare_btn_page6() {
		return share_btn_page6;
	}

	public WebElement getStarrating1_btn_page6() {
		return starrating1_btn_page6;
	}

	public WebElement getStarrating2_btn_page6() {
		return starrating2_btn_page6;
	}

	public WebElement getStarrating3_btn_page6() {
		return starrating3_btn_page6;
	}

	public WebElement getStarrating4_btn_page6() {
		return starrating4_btn_page6;
	}

	public WebElement getStarrating5_btn_page6() {
		return starrating5_btn_page6;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

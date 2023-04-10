package WebElements;

import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.management.modelmbean.XMLParseException;

import static baseclass.BaseClass.driver;

public class Save_and_proposal_screen_Xpaths {

    public Save_and_proposal_screen_Xpaths() {

        PageFactory.initElements(driver, this);
    }

    @CacheLookup

    @FindBy(xpath = "//h3[text()='Enter Details']")

    private WebElement save_and_proposal_screen_one_drop_off_handle;

    public WebElement getSave_and_proposal_screen_one_drop_off_handle() {
        return save_and_proposal_screen_one_drop_off_handle;
    }

    @FindBy(xpath = "//div[@class='col-md-5 col-lg-5 layout-left']")

    private WebElement dummy_click_save_and_proposal_screen_two;

    public WebElement getDummy_click_save_and_proposal_screen_two() {
        return dummy_click_save_and_proposal_screen_two;
    }

    @FindBy(xpath = "//h3[text()='Verify policy details']")

    private WebElement save_and_proposal_screen_two_drop_off_handle;

    public WebElement getSave_and_proposal_screen_two_drop_off_handle() {
        return save_and_proposal_screen_two_drop_off_handle;
    }

    @FindBy(xpath = "(//h3[@class='page-sub-hd'])[3]")

    private WebElement save_and_proposal_screen_three_drop_off_handle;

    public WebElement getSave_and_proposal_screen_three_drop_off_handle() {
        return save_and_proposal_screen_three_drop_off_handle;
    }

    @FindBy(xpath = "(//a[@class='st_bk_arrow navBack'])[1]")

    private WebElement back_button_save_and_propsal_screen;

    @FindBy(xpath = "//label[@for='ow_name']")

    private WebElement full_name_click;

    @FindBy(id = "ow_name")

    private WebElement full_name_sendkeys;

    @FindBy(xpath = "//label[@for='ow_email']")

    private WebElement email_field_click;

    @FindBy(id = "ow_email")

    private WebElement email_sendkeys;

    @FindBy(xpath = "//label[@for='ow_adLine1']")

    private WebElement address_line1_click;

    @FindBy(id="ow_adLine1")

    private WebElement address_line1_sendkeys;

    @FindBy(xpath = "//label[@for='ow_adLine2']")

    private WebElement addresss_line2_click;

    @FindBy(id="ow_adLine2")

    private WebElement address_line2_sendkeys;

    @FindBy(xpath = "//label[@for='ow_pincode']")

    private WebElement pincode_field_click;

    @FindBy(id="ow_pincode")

    private WebElement pincode_field_sendkeys;

    @FindBy(xpath = "//label[@for='ow_nomineeName']")

    private WebElement nominee_name_field_click;

    @FindBy(id="ow_nomineeName")

    private WebElement nominee_name_field_sendkeys;

    @FindBy(xpath = "//label[@for='ow_nomineeRel']")

    private WebElement relationship_field_click;

    @FindBy(id="ow_nomineeRel")

    private WebElement relationship_field_sendkeys;

    @FindBy(xpath = "//label[@for='ow_nomineeAge']")

    private WebElement nominee_age_field_click;

    @FindBy(id="ow_nomineeAge")

    private WebElement nominee_age_field_sendkeys;

    @FindBy(xpath="(//button[@class='align-item-center'])[1]")

    private WebElement continue_btn_save_and_proposal_screen;

    @FindBy(xpath = "(//a[@class='st_bk_arrow navBack'])[2]")

    private WebElement back_button_save_and_proposal_screen2;

    @FindBy(xpath = "//label[@for='new_chassisNumber']")

    private WebElement chassis_number_field_click;

    @FindBy(id = "new_chassisNumber")

    private WebElement chasssis_number_field_sendkeys;

    @FindBy(xpath="//label[@for='new_enginNumber']")

    private WebElement engine_number_field_click;

    @FindBy(id="new_enginNumber")

    private WebElement engine_number_field_sendkeys;

    @FindBy(xpath="(//span[@class='tog-circle'])[1]")

    private WebElement hypothecation_loan_tog_switch;

    @FindBy(xpath = "//label[@for='pi_hypo_type']")

    private WebElement select_hypothecation_click;

    @FindBy(id = "pi_hypo_type")

    private WebElement select_hypothecation_sendkeys;

    @FindBy(xpath="//label[@for='pi_hypo_LoanProvider']")

    private WebElement loan_provider_click;

    @FindBy(id="pi_hypo_LoanProvider")

    private WebElement loan_provider_sendkeys;

    @FindBy(xpath = "//label[@for='pi_hypo_FinancierBank']")

    private WebElement financier_click;

    @FindBy(id = "pi_hypo_FinancierBank")

    private WebElement financier_sendkeys;

    @FindBy(xpath = "(//span[@class='tog-circle'])[2]")

    private WebElement I_dont_know_my_previous_policy_details_tog_switch;

    @FindBy(xpath = "//label[@for='c_vd_Comprehensive']")

    private WebElement comprehensive_radio_btn;

    @FindBy(xpath = "//label[@for='c_vd_OwnDamage']")

    private WebElement own_damage_radio_btn;

    @FindBy(xpath = "//label[@for='c_vd_ThirdParty']")

    private WebElement third_party_radio_btn;

    @FindBy(xpath = "(//label[@for='pp_Insurer'])[2]")

    private WebElement insurer_comprehensive_click;

    @FindBy(id="pp_Insurer")

    private WebElement insurer_comprehensive_sendkeys;

    @FindBy(xpath = "//label[@for='pp_PolicyNumber']")

    private WebElement policy_number_comprehensive_click;

    @FindBy(id="pp_PolicyNumber")

    private WebElement policy_number_comprehensicve_sendkeys;

    @FindBy(xpath = "//label[@for='pp_ExpiryDate']")

    private WebElement policy_exp_date_comprehensive_click;

    @FindBy(id="pp_ExpiryDate")

    private WebElement policy_exp_date_comprehensive_sendkeys;

    @FindBy(xpath = "(//label[@for='pp_Insurer'])[1]")

    private WebElement third_party_insurer_for_own_damage_click;

    @FindBy(id="insurers_tp")

    private WebElement third_party_insurer_for_own_damage_sendkeys;

    @FindBy(xpath = "(//label[@for='pp_PolicyNumber_tp'])[1]")

    private WebElement Third_Party_Policy_Number_for_own_damage_click;

    @FindBy(id="pp_PolicyNumber_tp")

    private WebElement Third_Party_Policy_Number_for_own_damage_sendkeys;

    @FindBy(xpath = "(//label[@for='c_vd_od_tpPolicyStartDate'])[1]")

    private WebElement Third_party_policy_start_date_for_own_damage_click;

    @FindBy(id="c_vd_od_tpPolicyStartDate")

    private WebElement Third_party_policy_start_date_for_own_damage_sendkeys;

    @FindBy(xpath = "(//label[@for='insurers_od'])[1]")

    private WebElement own_damage_insurer_for_own_damage_click;

    @FindBy(id="insurers_od")

    private WebElement own_damage_insurer_for_own_damage_sendkeys;

    @FindBy(xpath = "(//label[@for='pp_PolicyNumber_od'])[1]")

    private WebElement Own_Damage_Policy_Number_for_own_damage_click;

    @FindBy(id="pp_PolicyNumber_od")

    private WebElement Own_Damage_Policy_Number_for_own_damage_sendkeys;

    @FindBy(xpath = "(//label[@for='c_vd_od_ownDamagPolicyStartDate'])[1]")

    private WebElement Own_damage_policy_start_date_click;

    @FindBy(id="c_vd_od_ownDamagPolicyStartDate")

    private WebElement Own_damage_policy_start_date_sendkeys;

    @FindBy(xpath = "(//button[@class='align-item-center'])[2]")

    private WebElement continue_btn_save_and_proposal_screen2;

    @FindBy(xpath = "(//a[@class='st_bk_arrow navBack'])[3]")

    private WebElement back_button_save_and_proposal_screen3;

    @FindBy(xpath = "//span[@class='add-tg modal-btn pointer']")

    private WebElement addons_premium_btn_save_and_proposal_screen3;

    @FindBy (xpath="(//button[@class='primary-btn modal-close-btn mx-auto mt-20 x-icon'])[7]")

    private WebElement  addons_premium_close_btn_save_and_proposal_screen3;

    @FindBy(id="viewPolicy_breakup")

    private WebElement view_policy_breakup_button;

    @FindBy(xpath = "//a[@class='navBack']")

    private WebElement view_policy_breakup_back_button;

    @FindBy(id = "Icon_feather-info")

    private WebElement policy_expired_info_btn;

    @FindBy(id="paynowTerms")

    private WebElement tandc_checkbox;

    @FindBy(xpath = "(//button[@class='align-item-center d-flex'])[2]")

    private WebElement final_paynow_btn;

    public WebElement getBack_button_save_and_propsal_screen() {
        return back_button_save_and_propsal_screen;
    }

    public WebElement getFull_name_click() {
        return full_name_click;
    }

    public WebElement getFull_name_sendkeys() {
        return full_name_sendkeys;
    }

    public WebElement getEmail_field_click() {
        return email_field_click;
    }

    public WebElement getEmail_sendkeys() {
        return email_sendkeys;
    }

    public WebElement getAddress_line1_click() {
        return address_line1_click;
    }

    public WebElement getAddress_line1_sendkeys() {
        return address_line1_sendkeys;
    }

    public WebElement getAddresss_line2_click() {
        return addresss_line2_click;
    }

    public WebElement getAddress_line2_sendkeys() {
        return address_line2_sendkeys;
    }

    public WebElement getPincode_field_click() {
        return pincode_field_click;
    }

    public WebElement getPincode_field_sendkeys() {
        return pincode_field_sendkeys;
    }

    public WebElement getNominee_name_field_click() {
        return nominee_name_field_click;
    }

    public WebElement getNominee_name_field_sendkeys() {
        return nominee_name_field_sendkeys;
    }

    public WebElement getRelationship_field_click() {
        return relationship_field_click;
    }

    public WebElement getRelationship_field_sendkeys() {
        return relationship_field_sendkeys;
    }

    public WebElement getNominee_age_field_click() {
        return nominee_age_field_click;
    }

    public WebElement getNominee_age_field_sendkeys() {
        return nominee_age_field_sendkeys;
    }

    public WebElement getContinue_btn_save_and_proposal_screen() {
        return continue_btn_save_and_proposal_screen;
    }

    public WebElement getBack_button_save_and_proposal_screen2() {
        return back_button_save_and_proposal_screen2;
    }

    public WebElement getChassis_number_field_click() {
        return chassis_number_field_click;
    }

    public WebElement getChasssis_number_field_sendkeys() {
        return chasssis_number_field_sendkeys;
    }

    public WebElement getEngine_number_field_click() {
        return engine_number_field_click;
    }

    public WebElement getEngine_number_field_sendkeys() {
        return engine_number_field_sendkeys;
    }

    public WebElement getHypothecation_loan_tog_switch() {
        return hypothecation_loan_tog_switch;
    }

    public WebElement getSelect_hypothecation_click() {
        return select_hypothecation_click;
    }

    public WebElement getSelect_hypothecation_sendkeys() {
        return select_hypothecation_sendkeys;
    }

    public WebElement getLoan_provider_click() {
        return loan_provider_click;
    }

    public WebElement getLoan_provider_sendkeys() {
        return loan_provider_sendkeys;
    }

    public WebElement getFinancier_click() {
        return financier_click;
    }

    public WebElement getFinancier_sendkeys() {
        return financier_sendkeys;
    }

    public WebElement getI_dont_know_my_previous_policy_details_tog_switch() {
        return I_dont_know_my_previous_policy_details_tog_switch;
    }

    public WebElement getComprehensive_radio_btn() {
        return comprehensive_radio_btn;
    }

    public WebElement getOwn_damage_radio_btn() {
        return own_damage_radio_btn;
    }

    public WebElement getThird_party_radio_btn() {
        return third_party_radio_btn;
    }

    public WebElement getInsurer_comprehensive_click() {
        return insurer_comprehensive_click;
    }

    public WebElement getInsurer_comprehensive_sendkeys() {
        return insurer_comprehensive_sendkeys;
    }

    public WebElement getPolicy_number_comprehensive_click() {
        return policy_number_comprehensive_click;
    }

    public WebElement getPolicy_number_comprehensicve_sendkeys() {
        return policy_number_comprehensicve_sendkeys;
    }

    public WebElement getPolicy_exp_date_comprehensive_click() {
        return policy_exp_date_comprehensive_click;
    }

    public WebElement getPolicy_exp_date_comprehensive_sendkeys() {
        return policy_exp_date_comprehensive_sendkeys;
    }

    public WebElement getThird_party_insurer_for_own_damage_click() {
        return third_party_insurer_for_own_damage_click;
    }

    public WebElement getThird_party_insurer_for_own_damage_sendkeys() {
        return third_party_insurer_for_own_damage_sendkeys;
    }

    public WebElement getThird_Party_Policy_Number_for_own_damage_click() {
        return Third_Party_Policy_Number_for_own_damage_click;
    }

    public WebElement getThird_Party_Policy_Number_for_own_damage_sendkeys() {
        return Third_Party_Policy_Number_for_own_damage_sendkeys;
    }

    public WebElement getThird_party_policy_start_date_for_own_damage_click() {
        return Third_party_policy_start_date_for_own_damage_click;
    }

    public WebElement getThird_party_policy_start_date_for_own_damage_sendkeys() {
        return Third_party_policy_start_date_for_own_damage_sendkeys;
    }

    public WebElement getOwn_damage_insurer_for_own_damage_click() {
        return own_damage_insurer_for_own_damage_click;
    }

    public WebElement getOwn_damage_insurer_for_own_damage_sendkeys() {
        return own_damage_insurer_for_own_damage_sendkeys;
    }

    public WebElement getOwn_Damage_Policy_Number_for_own_damage_click() {
        return Own_Damage_Policy_Number_for_own_damage_click;
    }

    public WebElement getOwn_Damage_Policy_Number_for_own_damage_sendkeys() {
        return Own_Damage_Policy_Number_for_own_damage_sendkeys;
    }

    public WebElement getOwn_damage_policy_start_date_click() {
        return Own_damage_policy_start_date_click;
    }

    public WebElement getOwn_damage_policy_start_date_sendkeys() {
        return Own_damage_policy_start_date_sendkeys;
    }

    public WebElement getContinue_btn_save_and_proposal_screen2() {
        return continue_btn_save_and_proposal_screen2;
    }

    public WebElement getBack_button_save_and_proposal_screen3() {
        return back_button_save_and_proposal_screen3;
    }

    public WebElement getAddons_premium_btn_save_and_proposal_screen3() {
        return addons_premium_btn_save_and_proposal_screen3;
    }

    public WebElement getAddons_premium_close_btn_save_and_proposal_screen3() {
        return addons_premium_close_btn_save_and_proposal_screen3;
    }

    public WebElement getView_policy_breakup_button() {
        return view_policy_breakup_button;
    }

    public WebElement getView_policy_breakup_back_button() {
        return view_policy_breakup_back_button;
    }

    public WebElement getPolicy_expired_info_btn() {
        return policy_expired_info_btn;
    }

    public WebElement getTandc_checkbox() {
        return tandc_checkbox;
    }

    public WebElement getFinal_paynow_btn() {
        return final_paynow_btn;
    }
}

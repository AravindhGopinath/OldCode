package WebElements;

import baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.nio.file.Watchable;

public class Premium_Page_Xpaths extends BaseClass {

    public Premium_Page_Xpaths() {

        PageFactory.initElements(driver, this);
    }

    @CacheLookup

    @FindBy(xpath = "//p[text()='Please verify your details and continue']")

    private WebElement premium_screen_drop_off_handle;

    public WebElement getPremium_screen_drop_off_handle() {
        return premium_screen_drop_off_handle;
    }

    @FindBy(xpath = "//a[@class='d-back-g navBack']")

    private WebElement back_button_premium_page4;

    @FindBy(xpath = "//h3[@class='edit-view']")

    private WebElement ncb_edit_button_premium_page4;

    @FindBy(xpath = "(//button[@class='primary-btn modal-close-btn mx-auto mt-20 x-icon'])[1]")

    private WebElement ncb_edit_popup_close_button_page4;

    @FindBy (xpath="(//span[@class='tog-circle'])[3]")

    private WebElement togswitch_ncb_popup_page4;

    @FindBy(xpath = "(//label[@class='radio-wr'])[2]")

    private WebElement make_claim_yes_button_ncb_popup_page4;

    @FindBy(xpath="(//label[@class='radio-wr'])[1]")

    private WebElement make_claim_no_button_ncb_popup_page4;

    @FindBy(xpath="//label[@for='NCB_50']")

    private WebElement ncb_50_popup_page4;

    @FindBy(xpath="//label[@for='NCB_45']")

    private WebElement ncb_45_popup_page4;

    @FindBy(xpath="//label[@for='NCB_35']")

    private WebElement ncb_35_popup_page4;

    @FindBy(xpath="//label[@for='NCB_25']")

    private WebElement ncb_25_popup_page4;

    @FindBy(xpath = "//label[@for='NCB_20']")

    private WebElement ncb_20_popup_page4;

    @FindBy(xpath = "//label[@for='NCB_0']")

    private WebElement ncb_0_popup_page4;

    public WebElement getNcb_0_popup_page4() {
        return ncb_0_popup_page4;
    }

    @FindBy(xpath="//button[@class='primary-btn mx-auto mt-20 mb-0']")

    private WebElement confirm_and_continue_button_ncb_popup_page4;

    @FindBy(id="claimStatusNCB")

    private WebElement ncb_get_value_premium_page4;

    @FindBy(xpath = "(//button[@class='info-btn modal-btn fd-al'])[3]")

    private WebElement comprehensive_info_btn_premium_page4;

    @FindBy(xpath = "(//button[@class='primary-btn modal-close-btn mx-auto mt-20 x-icon'])[11]")

    private WebElement comprehensive_info_close_btn_page4;

    @FindBy(xpath="(//button[@class='info-btn modal-btn fd-al'])[4]")

    private WebElement third_party_cover_info_btn_page4;

    @FindBy(xpath = "(//button[@class='primary-btn modal-close-btn mx-auto mt-20 x-icon'])[12]")

    private WebElement third_party_cover_info_close_btn_page4;

    @FindBy(xpath = "(//button[@class='info-btn modal-btn fd-al'])[5]")

    private WebElement own_damage_cover_info_btn_page4;

    @FindBy(xpath = "(//button[@class='primary-btn modal-close-btn mx-auto mt-20 x-icon'])[10]")

    private WebElement own_damage_info_close_btn_page4;

    @FindBy(xpath = "//label[@for='plane_market_comp']")

    private WebElement Comprehensive_cover_btn_premium_page4;

    @FindBy(xpath = "//label[@for='plane_market_tp']")

    private WebElement Third_party_cover_btn_premium_page4;

    @FindBy(xpath = "//label[@for='plane_market_own']")

    private WebElement Own_damage_cover_btn_premium_page4;

    @FindBy(xpath = "(//button[@class='info-btn modal-btn'])[1]")

    private WebElement insure_your_bike_for_info_btn_premium_page4;

    @FindBy(xpath = "(//button[@class='primary-btn modal-close-btn mx-auto mt-20 x-icon'])[8]")

    private WebElement insure_your_bike_for_info_close_btn_premium_page4;

    @FindBy(xpath = "(//label[@class='extra-cov-box p-relative'])[1]")

    private WebElement one_year_btn_premium_page4;

    @FindBy(xpath = "(//label[@class='extra-cov-box p-relative'])[2]")

    private WebElement two_year_btn_premium_page4;

    @FindBy(xpath = "(//label[@class='extra-cov-box p-relative'])[3]")

    private WebElement three_year_btn_premium_page4;

    @FindBy(xpath = "(//button[@class='info-btn modal-btn'])[2]")

    private WebElement idv_info_btn_premium_page4;

    @FindBy(xpath = "(//button[@class='primary-btn modal-close-btn mx-auto mt-20 x-icon'])[13]")

    private WebElement idv_popup_close_btn_page4;

    @FindBy(id="minIDV")

    private WebElement min_idv_get_value_premium_page4;

    @FindBy(id ="IDVslider")

    private WebElement idv_slider_pointer_premium_page4;

    @FindBy(xpath = "(//button[@class='info-btn modal-btn'])[3]")

    private WebElement add_ons_info_btn_premium_page4;

    @FindBy(xpath = "(//button[@class='primary-btn modal-close-btn mx-auto mt-20 x-icon'])[9]")

    private WebElement add_ons_popup_close_btn_premium_page4;

    @FindBy(xpath="(//label[@class='extra-cov-box'])[1]")

    private WebElement personal_accidental_cover_premium_page4;

    @FindBy(xpath="(//label[@class='extra-cov-box'])[2]")

    private WebElement road_side_assistance_premium_page4;

    @FindBy(xpath = "(//label[@class='extra-cov-box'])[3]")

    private WebElement zero_depreciation_premium_page4;

    @FindBy(xpath = "//button[@class='view-more-btn hide-e modal-btn']")

    private WebElement view_more_coverage_button_premium_page4;

    @FindBy(xpath="(//button[@class='info-btn modal-btn'])[4]")

    private WebElement add_extra_coverage_info_btn_premium_page4;

    @FindBy(xpath = "//button[@class='primary-btn mx-auto addextraClose']")

    private WebElement  add_extra_coverage_info_close_btn_premium_page4;

    public WebElement getAdd_extra_coverage_info_close_btn_premium_page4() {
        return add_extra_coverage_info_close_btn_premium_page4;
    }

    @FindBy(xpath="//label[@for='add4']")

    private WebElement Consumables_cover_premium_page4;

    @FindBy(xpath="//label[@for='add5']")

    private WebElement Cover_for_loss_of_driving_license_and_registration_certificate_btn_premium_page4;

    @FindBy(xpath="//label[@for='add6']")

    private WebElement Daily_expenses_reimbursement_btn_premium_page4;

    @FindBy(xpath="//label[@for='add7']")

    private WebElement Engine_Protector_btn_premium_page4;

    @FindBy(xpath="//label[@for='add8']")

    private WebElement Hospital_Daily_Cash_Allowance_premium_page4;

    @FindBy(xpath="//label[@for='add9']")

    private WebElement PA_Cover_For_Passengers_UnNamed_Persons_premium_page4;

    @FindBy(xpath="//label[@for='add10']")

    private WebElement Personal_Belongings_cover_premium_page4;

    @FindBy(xpath="//label[@for='add11']")

    private WebElement Invoice_Return_premium_page4;

    @FindBy(xpath = "//a[@class='align-item-center modal-close-btn d-flex']")

    private WebElement confirm_and_continue_btn_premium_page4;

    @FindBy(xpath = "(//button[@class='align-item-center d-flex'])[1]")

    private WebElement continue_final_btn_premium_page4;

    public WebElement getBack_button_premium_page4() {
        return back_button_premium_page4;
    }

    public WebElement getNcb_edit_button_premium_page4() {
        return ncb_edit_button_premium_page4;
    }

    public WebElement getNcb_edit_popup_close_button_page4() {
        return ncb_edit_popup_close_button_page4;
    }

    public WebElement getTogswitch_ncb_popup_page4() {
        return togswitch_ncb_popup_page4;
    }

    public WebElement getMake_claim_yes_button_ncb_popup_page4() {
        return make_claim_yes_button_ncb_popup_page4;
    }

    public WebElement getMake_claim_no_button_ncb_popup_page4() {
        return make_claim_no_button_ncb_popup_page4;
    }

    public WebElement getNcb_50_popup_page4() {
        return ncb_50_popup_page4;
    }

    public WebElement getNcb_45_popup_page4() {
        return ncb_45_popup_page4;
    }

    public WebElement getNcb_35_popup_page4() {
        return ncb_35_popup_page4;
    }

    public WebElement getNcb_25_popup_page4() {
        return ncb_25_popup_page4;
    }

    public WebElement getNcb_20_popup_page4() {
        return ncb_20_popup_page4;
    }

    public WebElement getConfirm_and_continue_button_ncb_popup_page4() {
        return confirm_and_continue_button_ncb_popup_page4;
    }

    public WebElement getNcb_get_value_premium_page4() {
        return ncb_get_value_premium_page4;
    }

    public WebElement getComprehensive_info_btn_premium_page4() {
        return comprehensive_info_btn_premium_page4;
    }

    public WebElement getComprehensive_info_close_btn_page4() {
        return comprehensive_info_close_btn_page4;
    }

    public WebElement getThird_party_cover_info_btn_page4() {
        return third_party_cover_info_btn_page4;
    }

    public WebElement getThird_party_cover_info_close_btn_page4() {
        return third_party_cover_info_close_btn_page4;
    }

    public WebElement getOwn_damage_cover_info_btn_page4() {
        return own_damage_cover_info_btn_page4;
    }

    public WebElement getOwn_damage_info_close_btn_page4() {
        return own_damage_info_close_btn_page4;
    }

    public WebElement getComprehensive_cover_btn_premium_page4() {
        return Comprehensive_cover_btn_premium_page4;
    }

    public WebElement getThird_party_cover_btn_premium_page4() {
        return Third_party_cover_btn_premium_page4;
    }

    public WebElement getOwn_damage_cover_btn_premium_page4() {
        return Own_damage_cover_btn_premium_page4;
    }

    public WebElement getInsure_your_bike_for_info_btn_premium_page4() {
        return insure_your_bike_for_info_btn_premium_page4;
    }

    public WebElement getInsure_your_bike_for_info_close_btn_premium_page4() {
        return insure_your_bike_for_info_close_btn_premium_page4;
    }

    public WebElement getOne_year_btn_premium_page4() {
        return one_year_btn_premium_page4;
    }

    public WebElement getTwo_year_btn_premium_page4() {
        return two_year_btn_premium_page4;
    }

    public WebElement getThree_year_btn_premium_page4() {
        return three_year_btn_premium_page4;
    }

    public WebElement getIdv_info_btn_premium_page4() {
        return idv_info_btn_premium_page4;
    }

    public WebElement getIdv_popup_close_btn_page4() {
        return idv_popup_close_btn_page4;
    }

    public WebElement getMin_idv_get_value_premium_page4() {
        return min_idv_get_value_premium_page4;
    }

    public WebElement getIdv_slider_pointer_premium_page4() {
        return idv_slider_pointer_premium_page4;
    }

    public WebElement getAdd_ons_info_btn_premium_page4() {
        return add_ons_info_btn_premium_page4;
    }

    public WebElement getAdd_ons_popup_close_btn_premium_page4() {
        return add_ons_popup_close_btn_premium_page4;
    }

    public WebElement getPersonal_accidental_cover_premium_page4() {
        return personal_accidental_cover_premium_page4;
    }

    public WebElement getRoad_side_assistance_premium_page4() {
        return road_side_assistance_premium_page4;
    }

    public WebElement getZero_depreciation_premium_page4() {
        return zero_depreciation_premium_page4;
    }

    public WebElement getView_more_coverage_button_premium_page4() {
        return view_more_coverage_button_premium_page4;
    }

    public WebElement getAdd_extra_coverage_info_btn_premium_page4() {
        return add_extra_coverage_info_btn_premium_page4;
    }

    public WebElement getConsumables_cover_premium_page4() {
        return Consumables_cover_premium_page4;
    }

    public WebElement getCover_for_loss_of_driving_license_and_registration_certificate_btn_premium_page4() {
        return Cover_for_loss_of_driving_license_and_registration_certificate_btn_premium_page4;
    }

    public WebElement getDaily_expenses_reimbursement_btn_premium_page4() {
        return Daily_expenses_reimbursement_btn_premium_page4;
    }

    public WebElement getEngine_Protector_btn_premium_page4() {
        return Engine_Protector_btn_premium_page4;
    }

    public WebElement getHospital_Daily_Cash_Allowance_premium_page4() {
        return Hospital_Daily_Cash_Allowance_premium_page4;
    }

    public WebElement getPA_Cover_For_Passengers_UnNamed_Persons_premium_page4() {
        return PA_Cover_For_Passengers_UnNamed_Persons_premium_page4;
    }

    public WebElement getPersonal_Belongings_cover_premium_page4() {
        return Personal_Belongings_cover_premium_page4;
    }

    public WebElement getInvoice_Return_premium_page4() {
        return Invoice_Return_premium_page4;
    }

    public WebElement getConfirm_and_continue_btn_premium_page4() {
        return confirm_and_continue_btn_premium_page4;
    }

    public WebElement getContinue_final_btn_premium_page4() {
        return continue_final_btn_premium_page4;
    }
}

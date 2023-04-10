package WebElements;

import baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Edit_screen_Xpaths extends BaseClass {

    public Edit_screen_Xpaths() {

        PageFactory.initElements(driver, this);
    }

    @CacheLookup

    @FindBy(xpath = "(//p[text()='Confirm your bike details to view plans'])[2]")

    private WebElement drop_off_handle_edit_screen;

    public WebElement getDrop_off_handle_edit_screen() {
        return drop_off_handle_edit_screen;
    }

    @FindBy(id="c_regNumber")

    private WebElement regno_textbox_page3;

    @FindBy(xpath = "//label[@for='c_vd_MakeModel']")

    private WebElement make_field_click_page3;

    @FindBy(id="c_vd_MakeModel")

    private WebElement make_field_sendkeys_page3;

    @FindBy(xpath="//label[@for='c_vd_Variant']")

    private WebElement variant_field_click_page3;

    @FindBy(id="c_vd_Variant")

    private WebElement variant_field_sendkeys_page3;

    @FindBy(xpath = "//label[@for='c_vd_RegistrationDate']")

    private WebElement date_of_reg_click_page3;

    @FindBy(id="c_vd_RegistrationDate")

    private WebElement date_of_reg_sendkeys_page3;

    @FindBy(xpath="//label[@for='c_vd_PolicyStatus']")

    private WebElement policy_status_click_page3;

    @FindBy(id="c_vd_PolicyStatus")

    private WebElement policy_status_sendkeys_page3;

    @FindBy(xpath="(//button[@type='submit'])[2]")

    private WebElement confirm_and_continue_button_page3;

    public WebElement getRegno_textbox_page3() {
        return regno_textbox_page3;
    }

    public WebElement getMake_field_click_page3() {
        return make_field_click_page3;
    }

    public WebElement getMake_field_sendkeys_page3() {
        return make_field_sendkeys_page3;
    }

    public WebElement getVariant_field_click_page3() {
        return variant_field_click_page3;
    }

    public WebElement getVariant_field_sendkeys_page3() {
        return variant_field_sendkeys_page3;
    }

    public WebElement getDate_of_reg_click_page3() {
        return date_of_reg_click_page3;
    }

    public WebElement getDate_of_reg_sendkeys_page3() {
        return date_of_reg_sendkeys_page3;
    }

    public WebElement getPolicy_status_click_page3() {
        return policy_status_click_page3;
    }

    public WebElement getPolicy_status_sendkeys_page3() {
        return policy_status_sendkeys_page3;
    }

    public WebElement getConfirm_and_continue_button_page3() {
        return confirm_and_continue_button_page3;
    }
}

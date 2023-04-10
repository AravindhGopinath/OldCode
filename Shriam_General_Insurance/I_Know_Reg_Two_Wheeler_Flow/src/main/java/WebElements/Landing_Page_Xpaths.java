package WebElements;

import baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Landing_Page_Xpaths extends BaseClass {

    public Landing_Page_Xpaths() {

        PageFactory.initElements(driver, this);
    }

    @CacheLookup

    @FindBy(id = "reg_number")

    private WebElement bike_no_Page1;

    @FindBy(id="mobile_number")

    private WebElement mob_no_page1;

    @FindBy(xpath = "//h4[text()='SHRIRAM PRIVACY POLICY']")

    private WebElement shriram_title;

    public WebElement getShriram_title() {
        return shriram_title;
    }

    @FindBy(id="termsagree")

    private WebElement tandc_checkbox_page1;

    @FindBy(xpath="//button[@class='modal-btn term-btn']")

    private WebElement tandc_link_click_page1;

    @FindBy(xpath = "(//button[@class='primary-btn modal-close-btn mx-auto mt-20 x-icon'])[14]")

    private WebElement tandc_link_close_page1;

    public WebElement getTandc_link_close_page1() {
        return tandc_link_close_page1;
    }

    @FindBy(id="gisendotp")

    private WebElement insure_now_btn_page1;

    @FindBy(id="closeotp")

    private WebElement otp_page_back_button_page2;

    @FindBy(id="otp1")

    private WebElement otp_1_page2;

    @FindBy(id="otp2")

    private WebElement otp_2_page2;

    @FindBy(id="otp3")

    private WebElement otp_3_page2;

    @FindBy(id="otp4")

    private WebElement otp_4_page2;

    @FindBy(xpath="//a[@class='gi-re-send-otp']")

    private WebElement resend_otp_btn_page2;

    @FindBy(id="verifyotpCar")

    private WebElement otp_send_button_page2;

    public WebElement getBike_no_Page1() {
        return bike_no_Page1;
    }

    public WebElement getMob_no_page1() {
        return mob_no_page1;
    }

    public WebElement getTandc_checkbox_page1() {
        return tandc_checkbox_page1;
    }

    public WebElement getTandc_link_click_page1() {
        return tandc_link_click_page1;
    }

    public WebElement getInsure_now_btn_page1() {
        return insure_now_btn_page1;
    }

    public WebElement getOtp_page_back_button_page2() {
        return otp_page_back_button_page2;
    }

    public WebElement getOtp_1_page2() {
        return otp_1_page2;
    }

    public WebElement getOtp_2_page2() {
        return otp_2_page2;
    }

    public WebElement getOtp_3_page2() {
        return otp_3_page2;
    }

    public WebElement getOtp_4_page2() {
        return otp_4_page2;
    }

    public WebElement getResend_otp_btn_page2() {
        return resend_otp_btn_page2;
    }

    public WebElement getOtp_send_button_page2() {
        return otp_send_button_page2;
    }
}

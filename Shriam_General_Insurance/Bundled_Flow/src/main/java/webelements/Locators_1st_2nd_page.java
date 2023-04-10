package webelements;

import base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Locators_1st_2nd_page extends BaseClass {

	public Locators_1st_2nd_page() {

		PageFactory.initElements(driver, this);
	}

	@CacheLookup
	
	@FindBy(id="ginewcar")
	
	private WebElement new_car_btn_home_screen;
	
	@FindBy(id="city")
	
	private WebElement city_field_textbox;
	
	@FindBy(id="mobile_number")
	
	private WebElement mob_no_textbox;
	
	@FindBy(id="termsagree")
	
	private WebElement tandc_checkbox;
	
	@FindBy(xpath="//button[@class='modal-btn term-btn']")
	
	private WebElement tandc_link_btn;
	
	@FindBy(xpath="(//button[@class='primary-btn modal-close-btn mx-auto mt-20 x-icon'])[14]")
	
	private WebElement tandc_close_btn;
	
	@FindBy(xpath="(//button[@class='primary-btn modal-close-btn mx-auto'])[1]")
	
	private WebElement tandc_gotit_btn;
	
	@FindBy(id="gisendotp")
	
	private WebElement insure_now_btn;
	
	@FindBy(xpath = "//input[@id='otp1']")

	private WebElement otp1_page2;

	@FindBy(xpath = "//input[@id='otp2']")

	private WebElement otp2_page2;

	@FindBy(xpath = "//input[@id='otp3']")

	private WebElement otp3_page2;

	@FindBy(xpath = "//input[@id='otp4']")

	private WebElement otp4_page2;
	
	@FindBy(xpath="//a[@class='gi-re-send-otp']")
	
	private WebElement resend_otp_btn;

	@FindBy(id="verifyotpCar")
	
	private WebElement otp_verify_btn;

	public WebElement getNew_car_btn_home_screen() {
		return new_car_btn_home_screen;
	}

	public WebElement getCity_field_textbox() {
		return city_field_textbox;
	}

	public WebElement getMob_no_textbox() {
		return mob_no_textbox;
	}

	public WebElement getTandc_checkbox() {
		return tandc_checkbox;
	}

	public WebElement getTandc_link_btn() {
		return tandc_link_btn;
	}

	public WebElement getTandc_close_btn() {
		return tandc_close_btn;
	}

	public WebElement getTandc_gotit_btn() {
		return tandc_gotit_btn;
	}

	public WebElement getInsure_now_btn() {
		return insure_now_btn;
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

	public WebElement getResend_otp_btn() {
		return resend_otp_btn;
	}

	public WebElement getOtp_verify_btn() {
		return otp_verify_btn;
	} 
	
	
}

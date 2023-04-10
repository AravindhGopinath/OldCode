package run;

import java.awt.AWTException;

import base.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import webelements.*;

public class New_Fw {

	public static void landingPage(String City, String Mobile_No, String TandC_Checkbox, 
			String Insure_Now_Button, String Resend_OTP, String OTP_1, String OTP_2, 
			String OTP_3, String OTP_4) throws InterruptedException {

		BaseClass lb = new BaseClass();

		WebDriver driver = lb.driver;
		
		Locators_1st_2nd_page pg1 = new Locators_1st_2nd_page();
		
		pg1.getNew_car_btn_home_screen().click();
		
		pg1.getCity_field_textbox().click();
		
		pg1.getCity_field_textbox().sendKeys(City);
		
		pg1.getMob_no_textbox().click();
		
		pg1.getMob_no_textbox().sendKeys(Mobile_No);
		
		pg1.getTandc_link_btn().click();
		
		pg1.getTandc_close_btn().click();
		
		pg1.getTandc_link_btn().click();
		
		pg1.getTandc_gotit_btn().click();
		

		String tandc = TandC_Checkbox;
		
		if (tandc.equals("Yes")) {
			
			pg1.getTandc_checkbox().click();
			
		} 
		
		else {

			System.out.println("Can't able to click checkbox");
		}
		
		
		String insurebtn =Insure_Now_Button;
		
		if (insurebtn.equals("Yes")) {
			
		pg1.getInsure_now_btn().click();
			
		} 
		
		else {

			System.out.println("Can't able to click Insure now Button");
			
		}
		
		Thread.sleep(32000);
		
		String otpresend =Resend_OTP;
	
		if (otpresend.equals("Yes")) {
			
		pg1.getResend_otp_btn().click();
			
		}
		
		else {

			System.out.println("Can't able to click resend button");
			
		}
		
		pg1.getOtp1_page2().sendKeys(OTP_1);
	
		pg1.getOtp2_page2().sendKeys(OTP_2);
		
		pg1.getOtp3_page2().sendKeys(OTP_3);
		
		pg1.getOtp4_page2().sendKeys(OTP_4);
		
		pg1.getOtp_verify_btn().click();
	
	
	}
	
	
	public static void editPage(String Make, String Variant, String Date_of_reg, 
			String Year_of_manufacture, String Select_registration, String Enter_company_name, 
			String Enter_GST_number, String Confirm_continue_button) throws AWTException, InterruptedException {


		BaseClass lb = new BaseClass();

		WebDriver driver = lb.driver;
		
		Locators_3rd_page pg3 =new  Locators_3rd_page();
	
		WebElement make_field_textbox = pg3.getMake_field_textbox();
		
		make_field_textbox.click();
		
		make_field_textbox.sendKeys(Make);
		
		make_field_textbox.sendKeys(Keys.ARROW_DOWN);
		
		make_field_textbox.sendKeys(Keys.ENTER);
		
//		lb.pindropselect();
		
		WebElement variant_field_textbox = pg3.getVariant_field_textbox();
		
		variant_field_textbox.click();
		
		variant_field_textbox.sendKeys(Variant);
		
		variant_field_textbox.sendKeys(Keys.ARROW_DOWN);
		
		variant_field_textbox.sendKeys(Keys.ENTER);
		
//		lb.pindropselect();
		
		WebElement date_of_reg = pg3.getDate_of_reg();
		
		date_of_reg.click();
		
		date_of_reg.sendKeys(Date_of_reg);
		
		WebElement year_of_manufacture = pg3.getYear_of_manufacture();
		
		lb.selectOptionByText(year_of_manufacture, Year_of_manufacture);
	
		WebElement individual_btn = pg3.getIndividual_btn();
		
		WebElement company_btn = pg3.getCompany_btn();
	
		System.out.println(Select_registration);

		if (Select_registration.contentEquals("Individual")) {

			lb.btnClick(individual_btn);

		} else if (Select_registration.contentEquals("Company")) {

			lb.btnClick(company_btn);
			
			WebElement company_name_textbox = pg3.getCompany_name_textbox();
			
			WebElement gst_no_textbox = pg3.getGst_no_textbox();
			
			company_name_textbox.sendKeys(Enter_company_name);
			
			Thread.sleep(2000);

			gst_no_textbox.sendKeys(Enter_GST_number);

		}
		
		
		String confirm_btn = Confirm_continue_button;
		
		if (Confirm_continue_button.equals("Yes")) {
			
			pg3.getConfirm_continue_btn().click();
			
		} 
		
		else {

			System.out.println("Can't able to click confirm and continue button");
		}
		
	}
	
	public static void premiumPage(String electrical_accs_btn_click, 
			String electrical_accessories_name, String electrical_accs_amount, 
			String non_electrical_accs_btn_click, String non_electrical_accs_name, 
			String non_electrical_accs_amount, String lpg_cng_accs_btn_click, String lpg_amount, 
			String cng_amount) throws AWTException, InterruptedException {

		BaseClass lb = new BaseClass();

		WebDriver driver = lb.driver;
		
		Locators_4th_page pg4 =new Locators_4th_page();
		
		pg4.getHere_is_your_plan_btn().click();
		
		pg4.getHere_is_your_plan_close_btn().click();
		
		pg4.getAdditional_cover_info_btn().click();
		
		pg4.getAdditional_cover_info_close_btn().click();
		
		String electrical_accs_click = electrical_accs_btn_click;
		
		if (electrical_accs_click.equals("Yes")) {
			
			pg4.getElectrical_accs_radio_btn().click();

			pg4.getElectrical_accs_name_textbox().sendKeys(electrical_accessories_name);
			
			pg4.getElectrical_accs_amount_textbox().sendKeys(electrical_accs_amount);
			
			pg4.getElectrical_accs_submit_btn().click();
		} 
		
		else {

			System.out.println("Can't able to click and sendkeys in electrical accs");
		}
		
		String non_electrical_accs_click = non_electrical_accs_btn_click;

		if (non_electrical_accs_click.equals("Yes")) {
			
		pg4.getNon_electrical_accs_radio_btn().click();
		
		pg4.getNon_electrical_accs_name_textbox().sendKeys(non_electrical_accs_name);
			
		pg4.getNon_electrical_accs_amount_textbox().sendKeys(non_electrical_accs_amount);
		
		pg4.getNon_electrical_accs_submit_btn().click();
		
		} 
		
		else {
			
			System.out.println("Can't able to click and sendkeys in non electrical accs");

		}
		
		String lpg_cng = lpg_cng_accs_btn_click;

		if (lpg_cng.equals("LPG")) {
			
			WebElement fuel_type = pg4.getFuel_type();
			
			fuel_type.click();
			
			fuel_type.sendKeys(Keys.ARROW_DOWN);
			
			fuel_type.sendKeys(Keys.ENTER);
			
//			lb.pindropselect();
			
			pg4.getLpg_amount().sendKeys(lpg_amount);
			
			pg4.getLpg_cng_submit_btn().click();
		} 
		
		else {

			WebElement fuel_type = pg4.getFuel_type();
			
			fuel_type.click();
			
			fuel_type.sendKeys(Keys.ARROW_DOWN);
			
			fuel_type.sendKeys(Keys.ENTER);
			
//			lb.pindropselectSingleClick();
			
			pg4.getLpg_amount().sendKeys(cng_amount);
			
			pg4.getLpg_cng_submit_btn().click();
		}
		
		pg4.getIdv_info_btn().click();
		
		Thread.sleep(2000);
		
		pg4.getIdv_info_popup_close_btn().click();
		
		WebElement idv_js_slider = pg4.getIdv_js_slider();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].value='100000';", idv_js_slider);
		
		pg4.getAdd_ons_info_btn().click();
		
		pg4.getAdd_ons_info_close_btn().click();
		
		pg4.getZero_dep_cover_btn().click();
		
		pg4.getView_more_covergae_btn().click();
		
		pg4.getAddon_cover_btn1().click();
		
		pg4.getAddon_cover_btn2().click();
		
		pg4.getAddon_cover_btn3().click();
		
		pg4.getAddon_cover_btn4().click();
		
		pg4.getAddon_confirm_continue_btn().click();
		
		pg4.getFinal_continue_btn().click();
		
		
	}
	
	public static void enterDetailsPage(String Fullname, String email, String Address_line1, 
			String Address_line2, String pincode, String Nominee_name, 
			String Nominee_age, String chassis_number, String engine_number, 
			String loan_provider, String financier_branch, String paynow_validation) throws AWTException, InterruptedException {
		
		BaseClass lb = new BaseClass();

		WebDriver driver = lb.driver;
		
		Locators_5th_page pg5 =new Locators_5th_page();
		
		pg5.getFull_name_RC().sendKeys(Fullname);
		
		pg5.getEmail().sendKeys(email);
	
		pg5.getAddress_line_1().sendKeys(Address_line1);
	
		pg5.getAddress_line_2().sendKeys(Address_line2);
		
		pg5.getPincode().sendKeys(pincode);
		
		pg5.getNominee_name().sendKeys(Nominee_name);
	
		WebElement relationship = pg5.getRelationship();
		
		relationship.click();
		
		relationship.sendKeys(Keys.ARROW_DOWN);
		
		relationship.sendKeys(Keys.ENTER);
		
//		lb.pindropselect();
		
		pg5.getNominee_age().sendKeys(Nominee_age);
		
		pg5.getContinue_btn().click();
		
		pg5.getChassis_number_textbox().sendKeys(chassis_number);
	
		pg5.getEngine_number_textbox().sendKeys(engine_number);
		
		pg5.getTog_circle().click();
		
		WebElement hypothecation_loan = pg5.getHypothecation_loan();
		
		hypothecation_loan.click();
		
		hypothecation_loan.sendKeys(Keys.ARROW_DOWN);
		
		hypothecation_loan.sendKeys(Keys.ENTER);

//		lb.pindropselect();
		
		pg5.getLoan_provider().sendKeys(loan_provider);
		
		pg5.getFinancier_branch().sendKeys(financier_branch);
		
		pg5.getContinue_btn_pageii().click();
		
		pg5.getView_policy_breakup().click();
		
		pg5.getPolicy_breakup_back_button().click();
		
		pg5.getTandc_btn().click();
		
		pg5.getTandc_popup_close_btn().click();
		
		pg5.getTandc_btn().click();
		
		pg5.getTandc_gotit_btn().click();
		
		pg5.getPaynow_agree_checkbox().click();
		
		String payment =paynow_validation;
		
		if (payment.equals("Yes")) {
		
			pg5.getPaynow_final_btn().click();
			
		}
		
		else {
			
			System.out.println("Can't able to find element");
		}
		
	}
	
	public static void paymentFinalScreen() {

		BaseClass lb = new BaseClass();

		WebDriver driver = lb.driver;
		
		Locators_6th_page pg6 =new Locators_6th_page();
		
		
		pg6.getNetbanking_btn().click();
		
		pg6.getPay_btn().click();
		
		pg6.getSuccess_payment_btn().click();
		
		pg6.getSend_anyway_btn().click();
		
		pg6.getStar4_btn().click();
		
		pg6.getDownload_polciy_btn().click();
		
		
	}
	
	
}

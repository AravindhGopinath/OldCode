package org.run;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.webelements.Locators;

public class Run_New {

	static Logger log = Logger.getLogger(Run_New.class);

	public static void testCase(String Car_no, String Mob_no, String OTP_1, String OTP_2, String OTP_3, String OTP_4,
			String OTP_5, String OTP_6, String Vehicle_number, String Make_and_model, String Variant,
			String Registration_date, String Select_registration, String city_of_registration,
			String Enter_company_name, String Enter_GST_number, String select_previous_policy_type,
			String previous_policy_expiry_date, String Ea_Enter_accessories_name, String Ea_Enter_accessories_amount,
			String NEa_Enter_accessories_name, String NEa_Enter_accessories_amount, String Fuel_Type,
			String Enter_amount, String Full_name, String Mob_no1, String Email, String Ad_line1, String Ad_line2,
			String Pincode, String Nominee_name, String Nominee_age, String Relationship, String Chassis_Number,
			String Engine_Number, String Hypothecation, String Loan_Provider, String Financier_Branch, String Insurer,
			String Policy_Number, String Policy_Expiry_Date) throws InterruptedException, IOException, AWTException {

		BaseClass lb = new BaseClass();

		WebDriver driver = lb.driver;

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Locators ls = new Locators();

		// ***********************************************************_Page 1_******************************************************************

		WebElement carno_page1 = ls.getCarno_page1();

		carno_page1.clear();

		carno_page1.sendKeys(Car_no);
		
		log.info("******************** Vehicle number passed in 1st page ************************");

		WebElement mobno_page1 = ls.getMobno_page1();

		mobno_page1.clear();

		mobno_page1.sendKeys(Mob_no);

		log.info("******************** Mobile number passed in 1st page ************************");

		ls.getTandc_page1().click();

		// Thread.sleep(2500);

		WebElement tandcclosebtn_page1 = ls.getTandcclosebtn_page1();

		lb.btnClick(tandcclosebtn_page1);
		
		// Thread.sleep(2500);

		ls.getTandc_page1().click();

		// Thread.sleep(2500);

		ls.getTandcgotitbtn_page1().click();

		// Thread.sleep(2000);

		WebElement checkbox_page1 = ls.getCheckbox_page1();

		lb.Click(checkbox_page1);

		// Thread.sleep(2500);

		ls.getGetquotebtn_page1().click();

		log.info("******************** Get quote button clicked in 1st page ************************");
		
		// Thread.sleep(2000);

		// ***********************************************************_Page 2_******************************************************************

		ls.getOtp1_page2().sendKeys(OTP_1);

		// Thread.sleep(1500);

		ls.getOtp2_page2().sendKeys(OTP_2);

		System.out.println(OTP_2);

		// Thread.sleep(1500);

		WebElement otp3_page2 = ls.getOtp3_page2();

		otp3_page2.sendKeys(OTP_3);

		// Thread.sleep(1500);

		WebElement otp4_page2 = ls.getOtp4_page2();

		otp4_page2.sendKeys(OTP_4);
		
		log.info("******************** Four OTP's passed in 2nd page ************************");

		// Thread.sleep(1500);

		ls.getOtpverifybtn_page2().click();
		
		log.info("******************** OTP Verify button clicked in 2nd page ************************");

// ***********************************************************_Page 3_******************************************************************

		WebElement editbtn_page3 = ls.getEditbtn_page3();

//****************************************************_Comprehensive_I_Know_***********************************************************
		
		if (editbtn_page3.isDisplayed()) {

			String s = select_previous_policy_type;

			System.out.println(s);

			if (s.equals("Comprehensive")) {
				
				WebElement datepicker_year_page_3_ii = ls.getDatepicker_year_page_3_ii();

				WebElement datepicker_month_page_3_ii = ls.getDatepicker_month_page_3_ii();

				ls.getComprehensive_radiobtn_page3().click();

				Thread.sleep(3000);
				
				WebElement findElement = driver.findElement(By.id("vd_comp_ppEpiryDate"));

				findElement.click();

				Thread.sleep(3000);

				lb.selectOptionByText(datepicker_year_page_3_ii, "2022");

				Thread.sleep(3000);

				lb.selectOptionByText(datepicker_month_page_3_ii, "May");

				Thread.sleep(3000);

				WebElement datepicker_previous_policy_date_page3_ii = ls.getDatepicker_previous_policy_date_page3_ii();

				datepicker_previous_policy_date_page3_ii.click();

				Thread.sleep(3000);

				driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();

				Thread.sleep(9000);
				
				WebElement ncbeditbtn_page4 = ls.getNcbeditbtn_page4();

				ncbeditbtn_page4.click();

				 Thread.sleep(2000);
				
				 ls.getClosebtn_ncb_poppup_page4().click();
				
				 ncbeditbtn_page4.click();

				 Thread.sleep(2000);

				WebElement togswitch_ownership_transfer_page4 = ls.getTogswitch_ownership_transfer_page4();
				
				togswitch_ownership_transfer_page4.click();

				 Thread.sleep(2000);

				togswitch_ownership_transfer_page4.click();

				 Thread.sleep(2000);

				ls.getMake_claim_in_previous_policy_yesbtn_page4().click();

				 Thread.sleep(2000);

				ls.getMake_claim_in_previous_policy_nobtn_page4().click();

				 Thread.sleep(2000);

				ls.getNcbbonus_50btn().click();

				 Thread.sleep(2000);

				ls.getNcbbonus_45btn().click();

				 Thread.sleep(2000);

				ls.getNcbbonus_35btn().click();

				 Thread.sleep(2000);

				ls.getNcbbonus_25btn().click();

				 Thread.sleep(2000);

				ls.getNcbbonus_20btn().click();

				 Thread.sleep(2000);

				ls.getNcbbonus_0btn().click();

				 Thread.sleep(2000);

				ls.getNcbbonus_45btn().click();

				 Thread.sleep(2000);

				ls.getConfirmandcontinuebtn_ncb_poppup_page4().click();

				Thread.sleep(6000);

				ls.getHere_your_plan_info_page4().click();

				 Thread.sleep(2000);

				ls.getHere_your_plan_info_closebtn_page4().click();

				 Thread.sleep(2000);

				ls.getExtra_protection_info_btn_page4().click();

				 Thread.sleep(2000);

				ls.getExtra_protection_popup_closebtn_page4().click();

				 Thread.sleep(2000);
				
				ls.getElectrical_accs_radio_btn_page4().click();

				driver.findElement(By.xpath("(//button[@class='primary-btn modal-close-btn mx-auto mt-20 x-icon'])[2]")).click();
				
				Thread.sleep(2000);
				
				 ls.getElectrical_accs_radio_btn_page4().click();

				 Thread.sleep(2000);

				WebElement electrical_accs_name_txtbox_page4_ii = ls.getElectrical_accs_name_txtbox_page4_ii();
				
				electrical_accs_name_txtbox_page4_ii.sendKeys(Ea_Enter_accessories_name);

				Thread.sleep(2000);

				WebElement electrical_accs_amount_textbox_page4_ii = ls.getElectrical_accs_amount_textbox_page4_ii();

				electrical_accs_amount_textbox_page4_ii.sendKeys(Ea_Enter_accessories_amount);

				Thread.sleep(2000);

				WebElement electrical_accs_submit_btn_page4_ii = ls.getElectrical_accs_submit_btn_page4_ii();

				electrical_accs_submit_btn_page4_ii.click();

				Thread.sleep(8000);

				ls.getNon_electrical_accs_radio_btn_page4().click();

				Thread.sleep(2000);

				WebElement non_electrrical_accs_name_textbox_page4_ii = ls.getNon_electrrical_accs_name_textbox_page4_ii();

				Thread.sleep(2000);

				non_electrrical_accs_name_textbox_page4_ii.sendKeys(NEa_Enter_accessories_name);

				Thread.sleep(2000);
				
				WebElement non_electrrical_accs_amount_textbox_page4_ii = ls.getNon_electrrical_accs_amount_textbox_page4_ii();

				Thread.sleep(2000);

				non_electrrical_accs_amount_textbox_page4_ii.sendKeys(NEa_Enter_accessories_amount);

				Thread.sleep(2000);

				WebElement non_electrical_accs_submit_btn_page4_ii = ls.getNon_electrical_accs_submit_btn_page4_ii();

				non_electrical_accs_submit_btn_page4_ii.click();

				Thread.sleep(8000);

				ls.getLpg_Cng_accs_radio_btn_page4().click();

				Thread.sleep(2000);

				WebElement fuel_type_lpg_cng_drpdwn_page4_ii = ls.getFuel_type_lpg_cng_drpdwn_page4_ii();

				fuel_type_lpg_cng_drpdwn_page4_ii.click();

				Thread.sleep(2000);

				lb.pindropselect();

				Thread.sleep(4000);
				
				WebElement enter_amount_lpg_cng_page4_ii = ls.getEnter_amount_lpg_cng_page4_ii();

				enter_amount_lpg_cng_page4_ii.sendKeys(Enter_amount);

				Thread.sleep(2000);

				WebElement lpg_cng_submit_btn_page4_ii = ls.getLpg_cng_submit_btn_page4_ii();

				lb.btnClick(lpg_cng_submit_btn_page4_ii);

				Thread.sleep(8000);
				
				ls.getInsured_value_infobtn_page4().click();
				
				Thread.sleep(2000);
				
				WebElement idvpopup_closebtn_page4 = ls.getIdvpopup_closebtn_page4();
			
				lb.btnClick(idvpopup_closebtn_page4);
			
				Thread.sleep(2000);

				WebElement slider_page4 = ls.getSlider_page4();
				
				JavascriptExecutor js = (JavascriptExecutor) driver;

				js.executeScript("arguments[0].value='25000';", slider_page4);
				
				 Thread.sleep(2000);

				 ls.getAdd_extra_coverage_infobtn_page4().click();
			
				 Thread.sleep(2000);

				 ls.getAdd_extra_coverage_popup_closebtn_page4().click();

				 Thread.sleep(2000);
				 
				 ls.getRsa_btn_page4().click();
				 
				 Thread.sleep(3000);
				 
				 WebElement viewmore_covereage_btn_page4 = ls.getViewmore_covereage_btn_page4();

				 Thread.sleep(2000);
				 
				 lb.scrollDown(viewmore_covereage_btn_page4);
				 
				 Thread.sleep(2000);
				 
				 viewmore_covereage_btn_page4.click();

				 Thread.sleep(2000);
				 
		 		ls.getAdd_btn_1_ciew_more_coverage_popup_page4_ii().click();

				Thread.sleep(2000);

				ls.getAdd_btn_2_ciew_more_coverage_popup_page4_ii().click();

				Thread.sleep(2000);

				ls.getAdd_btn_3_ciew_more_coverage_popup_page4_ii().click();

				Thread.sleep(2000);

				ls.getAdd_btn_4_ciew_more_coverage_popup_page4_ii().click();

				Thread.sleep(2000);

				ls.getAdd_btn_5_ciew_more_coverage_popup_page4_ii().click();

				Thread.sleep(2000);

				WebElement view_more_coverage_confirm_continue_btn_page_4_ii = ls.getView_more_coverage_confirm_continue_btn_page_4_ii();

				view_more_coverage_confirm_continue_btn_page_4_ii.click();

				Thread.sleep(2000);
				 
				WebElement continue_btn_page4 = ls.getContinue_btn_page4();

				lb.btnClick(continue_btn_page4);
				
				Thread.sleep(4000);
				
				WebElement addressline1_page5 = ls.getAddressline1_page5();
				
				boolean displayed = addressline1_page5.isDisplayed();
				
				String text = addressline1_page5.getText();
				System.out.println(text);
				
				if (displayed==false) {
					
					WebElement rcfullname_page5 = ls.getRcfullname_page5();
					
					rcfullname_page5.clear();
					
					rcfullname_page5.sendKeys(Full_name);

					Thread.sleep(2000);

					WebElement email_page5 = ls.getEmail_page5();
					
					email_page5.clear();

					email_page5.sendKeys(Email);

					Thread.sleep(2000);

					addressline1_page5.clear();

					addressline1_page5.sendKeys(Ad_line1);

					Thread.sleep(2000);

					WebElement addressline2_page5 = ls.getAddressline2_page5();
					
					addressline2_page5.clear();

					addressline2_page5.sendKeys(Ad_line2);

					Thread.sleep(2000);

					WebElement pincode_page5 = ls.getPincode_page5();
					
					pincode_page5.clear();

					pincode_page5.sendKeys(Pincode);

					Thread.sleep(4000);

					WebElement nominee_name_page5 = ls.getNominee_name_page5();
					
					nominee_name_page5.clear();

					nominee_name_page5.sendKeys(Nominee_name);

					Thread.sleep(2000);

					WebElement relationship_page5 = ls.getRelationship_page5();

					lb.pindropselect();
					
					Thread.sleep(2000);
					
					WebElement nomineeage_page5 = ls.getNomineeage_page5();
					
					nomineeage_page5.clear();

					nomineeage_page5.sendKeys(Nominee_age);

					Thread.sleep(2000);
					
					WebElement continue_btn_ownerinfo_page5 = ls.getContinue_btn_ownerinfo_page5();

					lb.btnClick(continue_btn_ownerinfo_page5);

					Thread.sleep(2000);
					
					WebElement chassisno_edit_btn_page5_ii = ls.getChassisno_edit_btn_page5_ii();

					String text3 = chassisno_edit_btn_page5_ii.getText();
					
					if (text3.isEmpty()) {
						
						lb.btnClick(chassisno_edit_btn_page5_ii);

						Thread.sleep(2000);

						WebElement chasis_no_page5_ii = ls.getChasis_no_page5_ii();

						chasis_no_page5_ii.sendKeys(Chassis_Number);

						Thread.sleep(2000);

						WebElement edited_engine_no_page5_ii = ls.getEdited_engine_no_page5_ii();

						edited_engine_no_page5_ii.sendKeys(Engine_Number);

						Thread.sleep(2000);

						WebElement got_it_btn_page_5_ii = ls.getGot_it_btn_page_5_ii();

						lb.btnClick(got_it_btn_page_5_ii);

						Thread.sleep(2000);

						WebElement toggleswitch_page5_ii = ls.getToggleswitch_page5_ii();

						lb.btnClick(toggleswitch_page5_ii);

						Thread.sleep(2000);

						WebElement hypothecation_loan_page5_ii = ls.getHypothecation_loan_page5_ii();

						hypothecation_loan_page5_ii.click();

						Thread.sleep(2000);

						lb.pindropselect4();

						WebElement loan_provider_page_5_ii = ls.getLoan_provider_page_5_ii();

						loan_provider_page_5_ii.sendKeys(Loan_Provider);

						Thread.sleep(1500);

						lb.pindropselect();

						Thread.sleep(3500);

						lb.pindropselectSingleClick();

						WebElement financier_name_page_5_ii = ls.getFinancier_name_page_5_ii();

						financier_name_page_5_ii.sendKeys(Financier_Branch);

						Thread.sleep(2000);

						WebElement insurer_page5_ii = ls.getInsurer_page5_ii();

						insurer_page5_ii.sendKeys(Insurer);

						Thread.sleep(1500);

						lb.pindropselect1();

						Thread.sleep(3500);

						WebElement policyno_page5_ii = ls.getPolicyno_page5_ii();

						policyno_page5_ii.sendKeys(Policy_Number);

						Thread.sleep(2000);

						WebElement policyexpdate_page5_ii = ls.getPolicyexpdate_page5_ii();

						policyexpdate_page5_ii.click();

						Thread.sleep(1500);

						lb.selectOptionByText(datepicker_year_page_3_ii, "2022");

						Thread.sleep(1500);

						lb.selectOptionByText(datepicker_month_page_3_ii, "May");

						Thread.sleep(1500);

						WebElement datepicker_date_previous_policy_date_page5 = ls.getDatepicker_date_previous_policy_date_page5();

						datepicker_date_previous_policy_date_page5.click();

						WebElement paynow_btn_page5_ii = ls.getPaynow_btn_page5_ii();

						lb.Click(paynow_btn_page5_ii);
						
						WebElement policy_breakup = driver.findElement(By.xpath("//a[@id='viewPolicy_breakup']"));
						
						policy_breakup.click();
						
						Thread.sleep(1500);
						
						lb.navigateBack();
						
						WebElement checkbox_page_6 = ls.getCheckbox_page_6();

						lb.Click(checkbox_page_6);

						Thread.sleep(2000);

						WebElement paynow_btn_page_6 = ls.getPaynow_btn_page_6();

						lb.btnClick(paynow_btn_page_6);
						
						Thread.sleep(2000);
						
						driver.findElement(By.xpath("(//div[@class='_3-zL border-global'])[3]")).click();
						
						Thread.sleep(2000);
						
						driver.findElement(By.xpath("//button[@class='btn btn-primary w100 pos-r _2fNU   ']")).click();
						
						Thread.sleep(2000);
						
						driver.findElement(By.xpath("//button[@class='btn btnd']")).click();
						
						Thread.sleep(2000);
						
						driver.findElement(By.xpath("//button[@class='secondary-button small-link']")).click();
						
						Thread.sleep(2000);
						
						ls.getStarrating4_btn_page6().click();
						
						Thread.sleep(2000);
						
						ls.getDownload_policy_btn_page6().click();
					} 

			}
				
				else {

					WebElement email_page5 = ls.getEmail_page5();
					
					email_page5.clear();

					email_page5.sendKeys(Email);

					Thread.sleep(2000);
					
					WebElement addressline2_page5 = ls.getAddressline2_page5();
					
					addressline2_page5.clear();

					addressline2_page5.sendKeys(Ad_line2);

					Thread.sleep(2000);
					
					WebElement nominee_name_page5 = ls.getNominee_name_page5();
					
					nominee_name_page5.clear();

					nominee_name_page5.sendKeys(Nominee_name);

					Thread.sleep(2000);

					WebElement relationship_page5 = ls.getRelationship_page5();

					relationship_page5.sendKeys(Keys.ARROW_DOWN);
					
					relationship_page5.sendKeys(Keys.ENTER);

//					lb.pindropselect();
					
					Thread.sleep(2000);
					
					WebElement nomineeage_page5 = ls.getNomineeage_page5();
					
					nomineeage_page5.clear();

					nomineeage_page5.sendKeys(Nominee_age);

					Thread.sleep(2000);
					
					WebElement continue_btn_ownerinfo_page5 = ls.getContinue_btn_ownerinfo_page5();

					lb.btnClick(continue_btn_ownerinfo_page5);
					
					WebElement chasis = driver.findElement(By.xpath("(//span[@class='previewveh_chasis_number'])[1]"));
					
					if (chasis.isDisplayed()==false) {
						
						WebElement chassisno_edit_btn_page5_ii = ls.getChassisno_edit_btn_page5_ii();
						
						lb.btnClick(chassisno_edit_btn_page5_ii);

						Thread.sleep(2000);

						WebElement chasis_no_page5_ii = ls.getChasis_no_page5_ii();

						chasis_no_page5_ii.sendKeys(Chassis_Number);

						Thread.sleep(2000);

						WebElement edited_engine_no_page5_ii = ls.getEdited_engine_no_page5_ii();

						edited_engine_no_page5_ii.sendKeys(Engine_Number);

						Thread.sleep(2000);

						WebElement got_it_btn_page_5_ii = ls.getGot_it_btn_page_5_ii();

						lb.btnClick(got_it_btn_page_5_ii);

						Thread.sleep(2000);

						WebElement toggleswitch_page5_ii = ls.getToggleswitch_page5_ii();

						lb.btnClick(toggleswitch_page5_ii);

						Thread.sleep(2000);

						WebElement hypothecation_loan_page5_ii = ls.getHypothecation_loan_page5_ii();

						hypothecation_loan_page5_ii.click();

						Thread.sleep(2000);

						lb.pindropselect();

						WebElement loan_provider_page_5_ii = ls.getLoan_provider_page_5_ii();

						loan_provider_page_5_ii.sendKeys(Loan_Provider);

						Thread.sleep(1500);
						
						lb.pindropselect();

						Thread.sleep(3500);

						lb.pindropselectSingleClick();
						
						Thread.sleep(2000);

						WebElement financier_name_page_5_ii = ls.getFinancier_name_page_5_ii();

						financier_name_page_5_ii.sendKeys(Financier_Branch);

						Thread.sleep(2000);

						WebElement insurer_page5_ii = ls.getInsurer_page5_ii();

						insurer_page5_ii.sendKeys(Insurer);

						Thread.sleep(1500);

						lb.pindropselect1();

						Thread.sleep(3500);

						WebElement policyno_page5_ii = ls.getPolicyno_page5_ii();

						policyno_page5_ii.sendKeys(Policy_Number);

						Thread.sleep(2000);

						WebElement policyexpdate_page5_ii = ls.getPolicyexpdate_page5_ii();

						policyexpdate_page5_ii.click();

						Thread.sleep(1500);

						lb.selectOptionByText(datepicker_year_page_3_ii, "2022");

						Thread.sleep(1500);

						lb.selectOptionByText(datepicker_month_page_3_ii, "May");

						Thread.sleep(1500);

						WebElement datepicker_date_previous_policy_date_page5 = ls.getDatepicker_date_previous_policy_date_page5();

						datepicker_date_previous_policy_date_page5.click();

						WebElement paynow_btn_page5_ii = ls.getPaynow_btn_page5_ii();

						lb.Click(paynow_btn_page5_ii);
						
						WebElement policy_breakup = driver.findElement(By.xpath("//a[@id='viewPolicy_breakup']"));
						
						policy_breakup.click();
						
						Thread.sleep(1500);
						
						lb.navigateBack();
						
						Thread.sleep(2000);
						
						WebElement checkbox_page_6 = ls.getCheckbox_page_6();

						lb.scrollDown(checkbox_page_6);
						
						Thread.sleep(2000);
						
						lb.Click(checkbox_page_6);

						Thread.sleep(2000);

						WebElement paynow_btn_page_6 = ls.getPaynow_btn_page_6();

						lb.btnClick(paynow_btn_page_6);
						
						Thread.sleep(2000);
						
						driver.findElement(By.xpath("(//div[@class='_3-zL border-global'])[3]")).click();
						
						Thread.sleep(2000);
						
						driver.findElement(By.xpath("//button[@class='btn btn-primary w100 pos-r _2fNU   ']")).click();
						
						Thread.sleep(2000);
						
						driver.findElement(By.xpath("//button[@class='btn btnd']")).click();
						
						Thread.sleep(2000);
						
						driver.findElement(By.xpath("//button[@class='secondary-button small-link']")).click();
						
						Thread.sleep(2000);
						
						ls.getStarrating4_btn_page6().click();
						
						Thread.sleep(2000);
						
						ls.getDownload_policy_btn_page6().click();
					} 
					
					else {
						
						WebElement paynow_btn_page5_ii = ls.getPaynow_btn_page5_ii();

						lb.Click(paynow_btn_page5_ii);
						
						Thread.sleep(3000);
						
						WebElement policy_breakup = driver.findElement(By.xpath("//a[@id='viewPolicy_breakup']"));
						
						lb.scrollDown(policy_breakup);
						
						Thread.sleep(2500);
						
						policy_breakup.click();
						
						Thread.sleep(1500);
						
						driver.findElement(By.xpath("//a[@class='navBack']")).click();
						
						Thread.sleep(2500);
						
						WebElement checkbox_page_6 = ls.getCheckbox_page_6();

						lb.Click(checkbox_page_6);

						Thread.sleep(2000);

						WebElement paynow_btn_page_6 = ls.getPaynow_btn_page_6();

						lb.btnClick(paynow_btn_page_6);
						
						Thread.sleep(2000);
						
						driver.findElement(By.xpath("(//div[@class='_3-zL border-global'])[3]")).click();
						
						Thread.sleep(2000);
						
						driver.findElement(By.xpath("//button[@class='btn btn-primary w100 pos-r _2fNU   ']")).click();
						
						Thread.sleep(2000);
						
						driver.findElement(By.xpath("//button[@class='btn btnd']")).click();
						
						Thread.sleep(2000);
						
						driver.findElement(By.xpath("//button[@class='secondary-button small-link']")).click();
						
						Thread.sleep(2000);
						
						ls.getStarrating4_btn_page6().click();
						
						Thread.sleep(2000);
						
						ls.getDownload_policy_btn_page6().click();
						
						
						
					}

					
				}
				
			}

			else if (s.equals("Own Damage")) {
				
				WebElement datepicker_year_page_3_ii1 = ls.getDatepicker_year_page_3_ii();

				WebElement datepicker_month_page_3_ii1 = ls.getDatepicker_month_page_3_ii();
				
				driver.findElement(By.xpath("//label[@for='vd_OwnDamage']")).click();
				
				Thread.sleep(3000);
				
				WebElement policy_start_date = driver.findElement(By.xpath("//label[@for='vd_od_tpPolicyStartDate']"));
				
				lb.scrollDown(policy_start_date);
				
				policy_start_date.click();
				
				Thread.sleep(2000);

				lb.selectOptionByText(datepicker_year_page_3_ii1, "2021");

				Thread.sleep(2000);

				lb.selectOptionByText(datepicker_month_page_3_ii1, "May");

				Thread.sleep(2000);
				
				WebElement datepicker_previous_policy_date_page3_ii1 = ls.getDatepicker_previous_policy_date_page3_ii();

				datepicker_previous_policy_date_page3_ii1.click();

				driver.findElement(By.xpath("//label[@for='vd_od_ownDamagPolicyStartDate']")).click();

				Thread.sleep(3000);

				lb.selectOptionByText(datepicker_year_page_3_ii1, "2021");

				Thread.sleep(3000);

				lb.selectOptionByText(datepicker_month_page_3_ii1, "May");

				Thread.sleep(3000);

				WebElement datepicker_previous_policy_date_page3_ii11 = ls.getDatepicker_previous_policy_date_page3_ii();

				datepicker_previous_policy_date_page3_ii11.click();

				Thread.sleep(3000);

				driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
				
				Thread.sleep(9000);

			}

			else if (s.equals("Third Party")) {
				
				WebElement datepicker_year_page_3_ii1 = ls.getDatepicker_year_page_3_ii();

				WebElement datepicker_month_page_3_ii1 = ls.getDatepicker_month_page_3_ii();

				driver.findElement(By.xpath("//label[@for='vd_ThirdParty']")).click();
				
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//label[@for='vd_tp_ppEpiryDate']")).click();

				Thread.sleep(3000);

				lb.selectOptionByText(datepicker_year_page_3_ii1, "2022");

				Thread.sleep(3000);

				lb.selectOptionByText(datepicker_month_page_3_ii1, "May");

				driver.findElement(By.xpath("(//a[@class='ui-state-default'])[16]")).click();

				Thread.sleep(3000);

				driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();

				Thread.sleep(9000);

			}

		}
		
		else {
			
			ls.getVehicle_no_page3_ii().clear();

			Thread.sleep(1500);

			ls.getVehicle_no_page3_ii().sendKeys(Vehicle_number);

			Thread.sleep(4000);

			WebElement makeandmodel_drpdwn_page3_ii2 = ls.getMakeandmodel_drpdwn_page3_ii();

			makeandmodel_drpdwn_page3_ii2.click();

			makeandmodel_drpdwn_page3_ii2.sendKeys(Make_and_model);

			lb.pindropselect();

			Thread.sleep(3000);

			WebElement variant_drpdwn_page3_ii = ls.getVariant_drpdwn_page3_ii();

			Thread.sleep(3000);

			variant_drpdwn_page3_ii.click();

			Thread.sleep(3000);

			variant_drpdwn_page3_ii.sendKeys(Variant);

			Thread.sleep(3000);

			lb.pindropselect();

			Thread.sleep(3500);

			WebElement reg_date_drpdwn_page3_ii = ls.getReg_date_drpdwn_page3_ii();

			reg_date_drpdwn_page3_ii.click();

			Thread.sleep(3000);

			WebElement datepicker_year_page_3_ii = ls.getDatepicker_year_page_3_ii();

			lb.selectOptionByText(datepicker_year_page_3_ii, "2015");

			Thread.sleep(3000);

			WebElement datepicker_month_page_3_ii = ls.getDatepicker_month_page_3_ii();

			lb.selectOptionByText(datepicker_month_page_3_ii, "Jun");

			Thread.sleep(3000);

			ls.getDatepicker_date_page_3_ii().click();

			Thread.sleep(3000);

			ls.getCity_of_reg_page3_ii().sendKeys(city_of_registration);

			Thread.sleep(3000);

			lb.pindropselect();

			WebElement individual_radio_btn_page3_ii = ls.getIndividual_radio_btn_page3_ii();

			Thread.sleep(3500);

			WebElement comapny_btn_page3_ii = ls.getComapny_btn_page3_ii();

			String text = ls.getCompany_text_page3().getText();

			System.out.println(Select_registration);

			if (Select_registration.contentEquals("Individual")) {

				lb.btnClick(individual_radio_btn_page3_ii);

			} else if (Select_registration.contentEquals("Company")) {

				lb.btnClick(comapny_btn_page3_ii);

				ls.getEnter_company_name_page3_ii().sendKeys(Enter_company_name);

				ls.getEnter_gst_no_page3_ii().sendKeys(Enter_GST_number);

			}
			
			String s1 = select_previous_policy_type;

			System.out.println(s1);

			if (s1.equals("Comprehensive")) {
				
				
				WebElement datepicker_year_page_3_ii1 = ls.getDatepicker_year_page_3_ii();

				WebElement datepicker_month_page_3_ii1 = ls.getDatepicker_month_page_3_ii();

				ls.getComprehensive_radiobtn_page3().click();

				Thread.sleep(3000);

				WebElement previous_policy_exp_date_page_3_ii = ls.getPrevious_policy_exp_date_page_3_ii();

				Thread.sleep(3000);

				previous_policy_exp_date_page_3_ii.click();

				Thread.sleep(3000);

				lb.selectOptionByText(datepicker_year_page_3_ii1, "2022");

				Thread.sleep(3000);

				lb.selectOptionByText(datepicker_month_page_3_ii1, "May");

				Thread.sleep(3000);

				WebElement datepicker_previous_policy_date_page3_ii = ls.getDatepicker_previous_policy_date_page3_ii();

				datepicker_previous_policy_date_page3_ii.click();

				Thread.sleep(3000);

				WebElement confirm_continue_btn_page3 = ls.getConfirm_continue_btn_page3();

				lb.btnClick(confirm_continue_btn_page3);

				Thread.sleep(9000);
				
				WebElement ncbeditbtn_page4 = ls.getNcbeditbtn_page4();

				ncbeditbtn_page4.click();

				 Thread.sleep(2000);
				
				 ls.getClosebtn_ncb_poppup_page4().click();
				
				 ncbeditbtn_page4.click();

				 Thread.sleep(2000);

				WebElement togswitch_ownership_transfer_page4 = ls.getTogswitch_ownership_transfer_page4();
				
				togswitch_ownership_transfer_page4.click();

				 Thread.sleep(2000);

				togswitch_ownership_transfer_page4.click();

				 Thread.sleep(2000);

				ls.getMake_claim_in_previous_policy_yesbtn_page4().click();

				 Thread.sleep(2000);

				ls.getMake_claim_in_previous_policy_nobtn_page4().click();

				 Thread.sleep(2000);

				ls.getNcbbonus_50btn().click();

				 Thread.sleep(2000);

				ls.getNcbbonus_45btn().click();

				 Thread.sleep(2000);

				ls.getNcbbonus_35btn().click();

				 Thread.sleep(2000);

				ls.getNcbbonus_25btn().click();

				 Thread.sleep(2000);

				ls.getNcbbonus_20btn().click();

				 Thread.sleep(2000);

				ls.getNcbbonus_0btn().click();

				 Thread.sleep(2000);

				ls.getNcbbonus_45btn().click();

				 Thread.sleep(2000);

				ls.getConfirmandcontinuebtn_ncb_poppup_page4().click();

				Thread.sleep(6000);

				ls.getHere_your_plan_info_page4().click();

				 Thread.sleep(2000);

				ls.getHere_your_plan_info_closebtn_page4().click();

				 Thread.sleep(2000);

				ls.getExtra_protection_info_btn_page4().click();

				 Thread.sleep(2000);

				ls.getExtra_protection_popup_closebtn_page4().click();

				 Thread.sleep(2000);

				ls.getInsured_value_infobtn_page4().click();

				Thread.sleep(2000);

				ls.getIdvpopup_closebtn_page4().click();

				Thread.sleep(2000);

				ls.getElectrical_accs_radio_btn_page4().click();

				 WebElement electrical_non_electrical_lpg_cng_accs_popup_close_btn_page4_ii = ls.getElectrical_non_electrical_lpg_cng_accs_popup_close_btn_page4_ii();
				
				  lb.btnClick(electrical_non_electrical_lpg_cng_accs_popup_close_btn_page4_ii);
				
				 ls.getElectrical_accs_radio_btn_page4().click();

				 Thread.sleep(2000);

				WebElement electrical_accs_name_txtbox_page4_ii = ls.getElectrical_accs_name_txtbox_page4_ii();

				 Thread.sleep(2000);

				electrical_accs_name_txtbox_page4_ii.sendKeys(Ea_Enter_accessories_name);

				Thread.sleep(2000);

				WebElement electrical_accs_amount_textbox_page4_ii = ls.getElectrical_accs_amount_textbox_page4_ii();

				Thread.sleep(2000);

				electrical_accs_amount_textbox_page4_ii.sendKeys(Ea_Enter_accessories_amount);

				Thread.sleep(2000);

				WebElement electrical_accs_submit_btn_page4_ii = ls.getElectrical_accs_submit_btn_page4_ii();

				Thread.sleep(2000);

				electrical_accs_submit_btn_page4_ii.click();

				Thread.sleep(6000);

				ls.getNon_electrical_accs_radio_btn_page4().click();

				Thread.sleep(2000);

				WebElement non_electrrical_accs_name_textbox_page4_ii = ls.getNon_electrrical_accs_name_textbox_page4_ii();

				Thread.sleep(2000);

				non_electrrical_accs_name_textbox_page4_ii.sendKeys(NEa_Enter_accessories_name);

				Thread.sleep(2000);

				WebElement non_electrrical_accs_amount_textbox_page4_ii = ls.getNon_electrrical_accs_amount_textbox_page4_ii();

				Thread.sleep(2000);

				non_electrrical_accs_amount_textbox_page4_ii.sendKeys(NEa_Enter_accessories_amount);

				Thread.sleep(2000);

				WebElement non_electrical_accs_submit_btn_page4_ii = ls.getNon_electrical_accs_submit_btn_page4_ii();

				Thread.sleep(2000);

				non_electrical_accs_submit_btn_page4_ii.click();

				Thread.sleep(6000);

				ls.getLpg_Cng_accs_radio_btn_page4().click();

				Thread.sleep(2000);

				WebElement fuel_type_lpg_cng_drpdwn_page4_ii = ls.getFuel_type_lpg_cng_drpdwn_page4_ii();

				Thread.sleep(2000);

				fuel_type_lpg_cng_drpdwn_page4_ii.click();

				Thread.sleep(2000);

				lb.pindropselect1();

				Thread.sleep(2000);

				WebElement enter_amount_lpg_cng_page4_ii = ls.getEnter_amount_lpg_cng_page4_ii();

				enter_amount_lpg_cng_page4_ii.sendKeys(Enter_amount);

				Thread.sleep(2000);

				WebElement lpg_cng_submit_btn_page4_ii = ls.getLpg_cng_submit_btn_page4_ii();

				lb.btnClick(lpg_cng_submit_btn_page4_ii);

				Thread.sleep(6000);
				
				ls.getInsured_value_infobtn_page4().click();
				
				Thread.sleep(2000);
				
				WebElement idvpopup_closebtn_page4 = ls.getIdvpopup_closebtn_page4();
			
				lb.btnClick(idvpopup_closebtn_page4);
			
				Thread.sleep(2000);

				WebElement slider_page4 = ls.getSlider_page4();
				
				JavascriptExecutor js = (JavascriptExecutor) driver;

				js.executeScript("arguments[0].value='25000';", slider_page4);
				
				 Thread.sleep(2000);

				 ls.getAdd_extra_coverage_infobtn_page4().click();
			
				 Thread.sleep(2000);

				 ls.getAdd_extra_coverage_popup_closebtn_page4().click();

				 Thread.sleep(2000);
				 
				 ls.getPac_btn_page4().click();

				Thread.sleep(4000);
				
				WebElement continue_btn_page4 = ls.getContinue_btn_page4();

				lb.btnClick(continue_btn_page4);
				
				Thread.sleep(4000);
				
				WebElement rcfullname_page5 = ls.getRcfullname_page5();
				
				String text2 = rcfullname_page5.getText();
				
				if (text2.isEmpty()) {
					
					rcfullname_page5.clear();
					
					rcfullname_page5.sendKeys(Full_name);

					Thread.sleep(2000);

					WebElement email_page5 = ls.getEmail_page5();
					
					email_page5.clear();

					email_page5.sendKeys(Email);

					Thread.sleep(2000);

					WebElement addressline1_page5 = ls.getAddressline1_page5();
					
					addressline1_page5.clear();

					addressline1_page5.sendKeys(Ad_line1);

					Thread.sleep(2000);

					WebElement addressline2_page5 = ls.getAddressline2_page5();
					
					addressline2_page5.clear();

					addressline2_page5.sendKeys(Ad_line2);

					Thread.sleep(2000);

					WebElement pincode_page5 = ls.getPincode_page5();
					
					pincode_page5.clear();

					pincode_page5.sendKeys(Pincode);

					Thread.sleep(4000);

					WebElement nominee_name_page5 = ls.getNominee_name_page5();
					
					nominee_name_page5.clear();

					nominee_name_page5.sendKeys(Nominee_name);

					Thread.sleep(2000);

					WebElement relationship_page5 = ls.getRelationship_page5();

					lb.selectOptionByText(relationship_page5, Relationship);

					WebElement nomineeage_page5 = ls.getNomineeage_page5();
					
					nomineeage_page5.clear();

					nomineeage_page5.sendKeys(Nominee_age);

					Thread.sleep(2000);
					
					WebElement continue_btn_ownerinfo_page5 = ls.getContinue_btn_ownerinfo_page5();

					lb.btnClick(continue_btn_ownerinfo_page5);

					Thread.sleep(2000);
					
					WebElement chassisno_edit_btn_page5_ii = ls.getChassisno_edit_btn_page5_ii();

					String text3 = chassisno_edit_btn_page5_ii.getText();
					
					
					
					if (text3.isEmpty()) {
						
						lb.btnClick(chassisno_edit_btn_page5_ii);

						Thread.sleep(2000);

						WebElement chasis_no_page5_ii = ls.getChasis_no_page5_ii();

						chasis_no_page5_ii.sendKeys(Chassis_Number);

						Thread.sleep(2000);

						WebElement edited_engine_no_page5_ii = ls.getEdited_engine_no_page5_ii();

						edited_engine_no_page5_ii.sendKeys(Engine_Number);

						Thread.sleep(2000);

						WebElement got_it_btn_page_5_ii = ls.getGot_it_btn_page_5_ii();

						lb.btnClick(got_it_btn_page_5_ii);

						Thread.sleep(2000);

						WebElement toggleswitch_page5_ii = ls.getToggleswitch_page5_ii();

						lb.btnClick(toggleswitch_page5_ii);

						Thread.sleep(2000);

						WebElement hypothecation_loan_page5_ii = ls.getHypothecation_loan_page5_ii();

						hypothecation_loan_page5_ii.click();

						Thread.sleep(2000);

						lb.pindropselect4();

						WebElement loan_provider_page_5_ii = ls.getLoan_provider_page_5_ii();

						loan_provider_page_5_ii.sendKeys(Loan_Provider);

						Thread.sleep(1500);

						lb.pindropselect();

						Thread.sleep(3500);

						lb.pindropselectSingleClick();

						WebElement financier_name_page_5_ii = ls.getFinancier_name_page_5_ii();

						financier_name_page_5_ii.sendKeys(Financier_Branch);

						Thread.sleep(2000);

						WebElement insurer_page5_ii = ls.getInsurer_page5_ii();

						insurer_page5_ii.sendKeys(Insurer);

						Thread.sleep(1500);

						lb.pindropselect1();

						Thread.sleep(3500);

						WebElement policyno_page5_ii = ls.getPolicyno_page5_ii();

						policyno_page5_ii.sendKeys(Policy_Number);

						Thread.sleep(2000);

						WebElement policyexpdate_page5_ii = ls.getPolicyexpdate_page5_ii();

						policyexpdate_page5_ii.click();

						Thread.sleep(1500);

						lb.selectOptionByText(datepicker_year_page_3_ii, "2022");

						Thread.sleep(1500);

						lb.selectOptionByText(datepicker_month_page_3_ii, "May");

						Thread.sleep(1500);

						WebElement datepicker_date_previous_policy_date_page5 = ls.getDatepicker_date_previous_policy_date_page5();

						datepicker_date_previous_policy_date_page5.click();

						WebElement paynow_btn_page5_ii = ls.getPaynow_btn_page5_ii();

						lb.Click(paynow_btn_page5_ii);
						
						WebElement policy_breakup = driver.findElement(By.xpath("//a[@id='viewPolicy_breakup']"));
						
						policy_breakup.click();
						
						Thread.sleep(1500);
						
						lb.navigateBack();
						
						WebElement checkbox_page_6 = ls.getCheckbox_page_6();

						lb.Click(checkbox_page_6);

						Thread.sleep(2000);

						WebElement paynow_btn_page_6 = ls.getPaynow_btn_page_6();

						lb.btnClick(paynow_btn_page_6);
						
						Thread.sleep(2000);
						
						driver.findElement(By.xpath("(//div[@class='_3-zL border-global'])[3]")).click();
						
						Thread.sleep(2000);
						
						driver.findElement(By.xpath("//button[@class='btn btn-primary w100 pos-r _2fNU   ']")).click();
						
						Thread.sleep(2000);
						
						driver.findElement(By.xpath("//button[@class='btn btnd']")).click();
						
						Thread.sleep(2000);
						
						driver.findElement(By.xpath("//button[@class='secondary-button small-link']")).click();
						
						Thread.sleep(2000);
						
						ls.getStarrating4_btn_page6().click();
						
						Thread.sleep(2000);
						
						ls.getDownload_policy_btn_page6().click();
					} 
					
					else {

						WebElement paynow_btn_page5_ii = ls.getPaynow_btn_page5_ii();

						lb.Click(paynow_btn_page5_ii);
						
						WebElement policy_breakup = driver.findElement(By.xpath("//a[@id='viewPolicy_breakup']"));
						
						policy_breakup.click();
						
						Thread.sleep(1500);
						
						lb.navigateBack();
						
						WebElement checkbox_page_6 = ls.getCheckbox_page_6();

						lb.Click(checkbox_page_6);

						Thread.sleep(2000);

						WebElement paynow_btn_page_6 = ls.getPaynow_btn_page_6();

						lb.btnClick(paynow_btn_page_6);
						
						Thread.sleep(2000);
						
						driver.findElement(By.xpath("(//div[@class='_3-zL border-global'])[3]")).click();
						
						Thread.sleep(2000);
						
						driver.findElement(By.xpath("//button[@class='btn btn-primary w100 pos-r _2fNU   ']")).click();
						
						Thread.sleep(2000);
						
						driver.findElement(By.xpath("//button[@class='btn btnd']")).click();
						
						Thread.sleep(2000);
						
						driver.findElement(By.xpath("//button[@class='secondary-button small-link']")).click();
						
						Thread.sleep(2000);
						
						ls.getStarrating4_btn_page6().click();
						
						Thread.sleep(2000);
						
						ls.getDownload_policy_btn_page6().click();
						
						
						
					}
					
				} 
				
				else {

					WebElement email_page5 = ls.getEmail_page5();
					
					email_page5.clear();

					email_page5.sendKeys(Email);

					Thread.sleep(2000);
					
					WebElement addressline2_page5 = ls.getAddressline2_page5();
					
					addressline2_page5.clear();

					addressline2_page5.sendKeys(Ad_line2);

					Thread.sleep(2000);
					
					WebElement nominee_name_page5 = ls.getNominee_name_page5();
					
					nominee_name_page5.clear();

					nominee_name_page5.sendKeys(Nominee_name);

					Thread.sleep(2000);

					WebElement relationship_page5 = ls.getRelationship_page5();

					lb.selectOptionByText(relationship_page5, Relationship);

					WebElement nomineeage_page5 = ls.getNomineeage_page5();
					
					nomineeage_page5.clear();

					nomineeage_page5.sendKeys(Nominee_age);

					Thread.sleep(2000);
					
					WebElement continue_btn_ownerinfo_page5 = ls.getContinue_btn_ownerinfo_page5();

					lb.btnClick(continue_btn_ownerinfo_page5);

					Thread.sleep(2000);
					
					WebElement chassisno_edit_btn_page5_ii = ls.getChassisno_edit_btn_page5_ii();

					lb.btnClick(chassisno_edit_btn_page5_ii);

					Thread.sleep(2000);

					WebElement chasis_no_page5_ii = ls.getChasis_no_page5_ii();

					chasis_no_page5_ii.sendKeys(Chassis_Number);

					Thread.sleep(2000);

					WebElement edited_engine_no_page5_ii = ls.getEdited_engine_no_page5_ii();

					edited_engine_no_page5_ii.sendKeys(Engine_Number);

					Thread.sleep(2000);

					WebElement got_it_btn_page_5_ii = ls.getGot_it_btn_page_5_ii();

					lb.btnClick(got_it_btn_page_5_ii);

					Thread.sleep(2000);

					WebElement toggleswitch_page5_ii = ls.getToggleswitch_page5_ii();

					lb.btnClick(toggleswitch_page5_ii);

					Thread.sleep(2000);

					WebElement hypothecation_loan_page5_ii = ls.getHypothecation_loan_page5_ii();

					hypothecation_loan_page5_ii.click();

					Thread.sleep(2000);

					lb.pindropselect4();

					WebElement loan_provider_page_5_ii = ls.getLoan_provider_page_5_ii();

					loan_provider_page_5_ii.sendKeys(Loan_Provider);

					Thread.sleep(1500);

					lb.pindropselect();

					Thread.sleep(3500);

					lb.pindropselectSingleClick();

					WebElement financier_name_page_5_ii = ls.getFinancier_name_page_5_ii();

					financier_name_page_5_ii.sendKeys(Financier_Branch);

					Thread.sleep(2000);

					WebElement insurer_page5_ii = ls.getInsurer_page5_ii();

					insurer_page5_ii.sendKeys(Insurer);

					Thread.sleep(1500);

					lb.pindropselect1();

					Thread.sleep(3500);

					WebElement policyno_page5_ii = ls.getPolicyno_page5_ii();

					policyno_page5_ii.sendKeys(Policy_Number);

					Thread.sleep(2000);

					WebElement policyexpdate_page5_ii = ls.getPolicyexpdate_page5_ii();

					policyexpdate_page5_ii.click();

					Thread.sleep(1500);

					lb.selectOptionByText(datepicker_year_page_3_ii, "2022");

					Thread.sleep(1500);

					lb.selectOptionByText(datepicker_month_page_3_ii, "May");

					Thread.sleep(1500);

					WebElement datepicker_date_previous_policy_date_page5 = ls.getDatepicker_date_previous_policy_date_page5();

					datepicker_date_previous_policy_date_page5.click();

					WebElement paynow_btn_page5_ii = ls.getPaynow_btn_page5_ii();

					lb.Click(paynow_btn_page5_ii);
					
				}
				
				
				
			}
			
			

			else if (s1.equals("Own Damage")) {
				
				WebElement datepicker_year_page_3_ii1 = ls.getDatepicker_year_page_3_ii();

				WebElement datepicker_month_page_3_ii1 = ls.getDatepicker_month_page_3_ii();

				ls.getOwndamage_radiobtn_page3().click();

				Thread.sleep(3000);

				WebElement owndamage_thirdparty_policy_startdate_page3 = ls.getOwndamage_thirdparty_policy_startdate_page3();

				owndamage_thirdparty_policy_startdate_page3.click();

				Thread.sleep(3000);

				lb.selectOptionByText(datepicker_year_page_3_ii1, "2021");

				Thread.sleep(3000);

				lb.selectOptionByText(datepicker_month_page_3_ii1, "May");

				Thread.sleep(3000);

				WebElement datepicker_previous_policy_date_page3_ii = ls.getDatepicker_previous_policy_date_page3_ii();

				datepicker_previous_policy_date_page3_ii.click();

				Thread.sleep(3000);

				WebElement confirm_continue_btn_page3 = ls.getConfirm_continue_btn_page3();

				lb.btnClick(confirm_continue_btn_page3);

				Thread.sleep(2000);

				WebElement owndamage_thirdparty_policy_enddate_page3 = ls.getOwndamage_thirdparty_policy_enddate_page3();

				owndamage_thirdparty_policy_enddate_page3.click();

				Thread.sleep(3000);

				lb.selectOptionByText(datepicker_year_page_3_ii1, "2021");

				Thread.sleep(3000);

				lb.selectOptionByText(datepicker_month_page_3_ii1, "May");

				Thread.sleep(3000);

				WebElement datepicker_previous_policy_date_page3_ii1 = ls.getDatepicker_previous_policy_date_page3_ii();

				datepicker_previous_policy_date_page3_ii1.click();

				Thread.sleep(3000);

				WebElement confirm_continue_btn_page31 = ls.getConfirm_continue_btn_page3();

				lb.btnClick(confirm_continue_btn_page31);

				Thread.sleep(9000);

			}

			else if (s1.equals("Third Party")) {
				
				WebElement datepicker_year_page_3_ii1 = ls.getDatepicker_year_page_3_ii();

				WebElement datepicker_month_page_3_ii1 = ls.getDatepicker_month_page_3_ii();

				ls.getThrirdparty_radiobtn_page3().click();

				Thread.sleep(3000);

				WebElement thirdparty_previous_policy_expiry_date_page3 = ls.getThirdparty_previous_policy_expiry_date_page3();

				thirdparty_previous_policy_expiry_date_page3.click();

				Thread.sleep(3000);

				lb.selectOptionByText(datepicker_year_page_3_ii1, "2022");

				Thread.sleep(3000);

				lb.selectOptionByText(datepicker_month_page_3_ii1, "May");

				WebElement datepicker_previous_policy_date_page3_ii1 = ls.getDatepicker_previous_policy_date_page3_ii();

				datepicker_previous_policy_date_page3_ii1.click();

				Thread.sleep(3000);

				WebElement confirm_continue_btn_page31 = ls.getConfirm_continue_btn_page3();

				lb.btnClick(confirm_continue_btn_page31);

				Thread.sleep(9000);

			}

			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}		
		
		
		
		
		
	

}

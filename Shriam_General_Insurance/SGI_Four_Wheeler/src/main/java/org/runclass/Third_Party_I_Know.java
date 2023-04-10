package org.runclass;

import org.apache.log4j.Logger;
import org.baseclass.BaseClass;
import org.elements.Locators;
import org.excel.ExcelUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Third_Party_I_Know {

    static Logger log = Logger.getLogger(Third_Party_I_Know.class);


    public static  void td_Flow(String select_previous_policy_type,
                                String Full_name, String Email, String Ad_line1,
                                String Ad_line2, String Pincode, String Nominee_name,
                                String Nominee_age, String Chassis_Number, String Engine_Number,
                                String Loan_Provider, String Financier_Branch, String Insurer,
                                String Policy_Number, String Policy_Expiry_Date, String Vehicle_number,
                                String Make_and_model, String Variant, String city_of_registration,
                                String Select_registration, String Enter_company_name, String Enter_GST_number, String INDEX, String Iteration,
                                String Car_no, String Mobile_Number, String OTP_1, String OTP_2, String OTP_3, String OTP_4, String previous_policy_expiry_date, String Registration_date, String Relationship) throws Exception {

        System.out.println("TP-flow");

        try {

            BaseClass lb=new BaseClass();

            Locators ls=new Locators();

            WebDriver driver = lb.driver;

            // ***********************************************************_Page 1_******************************************************************

            WebElement carno_page1 = ls.getCarno_page1();

            Thread.sleep(2000);

            carno_page1.clear();

            Thread.sleep(2000);

            carno_page1.sendKeys(Car_no);

            log.info("******************** Vehicle number passed in 1st page ************************");

            WebElement mobno_page1 = ls.getMobno_page1();

            Thread.sleep(2000);

            mobno_page1.clear();

            Thread.sleep(2000);

            mobno_page1.sendKeys(Mobile_Number);

            Thread.sleep(2000);

            log.info("******************** Mobile number passed in 1st page ************************");

            ls.getTandc_page1().click();

            WebElement tandcclosebtn_page1 = ls.getTandcclosebtn_page1();

            Thread.sleep(2000);

            lb.btnClick(tandcclosebtn_page1);

            Thread.sleep(2000);

            ls.getTandc_page1().click();

            Thread.sleep(2000);

            ls.getTandcgotitbtn_page1().click();

            WebElement checkbox_page1 = ls.getCheckbox_page1();

            Thread.sleep(2000);

            lb.Click(checkbox_page1);

            Thread.sleep(2000);

            ls.getGetquotebtn_page1().click();

            log.info("******************** Get quote button clicked in 1st page ************************");

            Thread.sleep(2000);

            // ***********************************************************_Page 2_******************************************************************

            ls.getOtp1_page2().sendKeys(OTP_1);

            Thread.sleep(2000);

            ls.getOtp2_page2().sendKeys(OTP_2);

            Thread.sleep(2000);

//			System.out.println(OTP_2);

            WebElement otp3_page2 = ls.getOtp3_page2();

            Thread.sleep(2000);

            otp3_page2.sendKeys(OTP_3);

            WebElement otp4_page2 = ls.getOtp4_page2();

            Thread.sleep(2000);

            otp4_page2.sendKeys(OTP_4);

            log.info("******************** Four OTP's passed in 2nd page ************************");

            Thread.sleep(2000);

            ls.getOtpverifybtn_page2().click();

            log.info("******************** OTP Verify button clicked in 2nd page ************************");

            Thread.sleep(4000);

            WebElement editbtn_page3 = ls.getEditbtn_page3();

            if (editbtn_page3.isDisplayed()) {

                Thread.sleep(2000);

                String s = select_previous_policy_type;

                System.out.println(s);

                if (s.equals("Third Party")) {

                    Thread.sleep(2500);

                    WebElement datepicker_year_page_3_ii1 = ls.getDatepicker_year_page_3_ii();

                    WebElement datepicker_month_page_3_ii1 = ls.getDatepicker_month_page_3_ii();

                    ls.getThrirdparty_radiobtn_page3().click();

                    Thread.sleep(3000);

                    WebElement Previous_Policy_Expiry_Date1 = driver.findElement(By.id("vd_tp_ppEpiryDate"));

                    Previous_Policy_Expiry_Date1.click();

                    Thread.sleep(2000);

                    Previous_Policy_Expiry_Date1.clear();

                    Thread.sleep(2000);

                    Previous_Policy_Expiry_Date1.sendKeys(previous_policy_expiry_date);


//			WebElement thirdparty_previous_policy_expiry_date_page3 = ls.getThirdparty_previous_policy_expiry_date_page3();
//
//			thirdparty_previous_policy_expiry_date_page3.click();
//
//			Thread.sleep(3000);
//
//			lb.selectOptionByText(datepicker_year_page_3_ii1, "2022");
//
//			Thread.sleep(3000);
//
//			lb.selectOptionByText(datepicker_month_page_3_ii1, "May");
//
//			WebElement datepicker_previous_policy_date_page3_ii1 = ls.getDatepicker_previous_policy_date_page3_ii();
//
//			datepicker_previous_policy_date_page3_ii1.click();
//
                    Thread.sleep(3000);

                    driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();

                    Thread.sleep(9000);

                    ls.getHere_your_plan_info_page4().click();

                    Thread.sleep(2000);

                    ls.getHere_your_plan_info_closebtn_page4().click();

                    Thread.sleep(2000);

                    ls.getAdd_extra_coverage_infobtn_page4().click();

                    Thread.sleep(2000);

                    ls.getAdd_extra_coverage_popup_closebtn_page4().click();

                    Thread.sleep(2000);

                    ls.getContinue_btn_page4().click();

                    Thread.sleep(4500);

                    WebElement addressline1_page5 = ls.getAddressline1_page5();

                    WebElement state_textbox = driver.findElement(By.xpath("(//div[@class='form-b p-relative focused'])[14]"));

//			boolean displayed = addressline1_page5.isDisplayed();

                    Thread.sleep(2000);

//			String text = addressline1_page5.getText();

//			Thread.sleep(2000);

//			System.out.println(text);

                    if (state_textbox.isDisplayed()) {

                        WebElement email_page5 = ls.getEmail_page5();

                        Thread.sleep(2000);

                        email_page5.clear();

                        Thread.sleep(2000);

                        email_page5.sendKeys(Email);

                        Thread.sleep(2000);

                        WebElement addressline2_page5 = ls.getAddressline2_page5();

                        addressline2_page5.clear();

                        Thread.sleep(2000);

                        addressline2_page5.sendKeys(Ad_line2);

                        Thread.sleep(2000);

                        WebElement nominee_name_page5 = ls.getNominee_name_page5();

                        nominee_name_page5.clear();

                        Thread.sleep(2000);

                        nominee_name_page5.sendKeys(Nominee_name);

                        Thread.sleep(2000);

                        WebElement relationship_page5 = ls.getRelationship_page5();

                        relationship_page5.sendKeys(Keys.ARROW_DOWN);

                        Thread.sleep(2000);

                        relationship_page5.sendKeys(Keys.ENTER);

//			lb.pindropselect();

                        Thread.sleep(2000);

                        WebElement nomineeage_page5 = ls.getNomineeage_page5();

                        nomineeage_page5.clear();

                        Thread.sleep(2000);

                        nomineeage_page5.sendKeys(Nominee_age);

                        Thread.sleep(2000);

                        WebElement continue_btn_ownerinfo_page5 = ls.getContinue_btn_ownerinfo_page5();

                        lb.btnClick(continue_btn_ownerinfo_page5);

                        Thread.sleep(6000);

                        WebElement chasis = driver.findElement(By.xpath("(//span[@class='previewveh_chasis_number'])[1]"));

                        if (chasis.isDisplayed()) {

                            WebElement toggleswitch_page5_ii = ls.getToggleswitch_page5_ii();

                            lb.btnClick(toggleswitch_page5_ii);

                            Thread.sleep(2000);

                            WebElement hypothecation_loan_page5_ii = ls.getHypothecation_loan_page5_ii();

                            hypothecation_loan_page5_ii.click();

                            Thread.sleep(2000);

                            for (int i = 0; i <3; i++) {

                                hypothecation_loan_page5_ii.sendKeys(Keys.ARROW_DOWN);

                                Thread.sleep(2000);
                            }

                            hypothecation_loan_page5_ii.sendKeys(Keys.ENTER);

//					lb.pindropselect4();

                            Thread.sleep(2000);

                            WebElement loan_provider_page_5_ii = ls.getLoan_provider_page_5_ii();

                            loan_provider_page_5_ii.sendKeys(Loan_Provider);

                            Thread.sleep(2000);

                            for (int i = 0; i <4; i++) {

                                loan_provider_page_5_ii.sendKeys(Keys.ARROW_DOWN);

                                Thread.sleep(2000);
                            }

                            loan_provider_page_5_ii.sendKeys(Keys.ENTER);

//					lb.pindropselect();

                            Thread.sleep(3500);

//					lb.pindropselectSingleClick();

//					Thread.sleep(2000);

                            WebElement financier_name_page_5_ii = ls.getFinancier_name_page_5_ii();

                            financier_name_page_5_ii.sendKeys(Financier_Branch);

                            Thread.sleep(2000);

                            WebElement insurer_page5_ii = ls.getInsurer_page5_ii();

                            insurer_page5_ii.clear();

                            Thread.sleep(2000);

                            insurer_page5_ii.sendKeys(Insurer);

                            Thread.sleep(2000);

                            for (int i = 0; i <3; i++) {

                                insurer_page5_ii.sendKeys(Keys.ARROW_DOWN);

                                Thread.sleep(2000);
                            }

                            insurer_page5_ii.sendKeys(Keys.ENTER);

//					lb.pindropselect1();

                            Thread.sleep(3500);

                            WebElement policyno_page5_ii = ls.getPolicyno_page5_ii();

                            policyno_page5_ii.clear();

                            Thread.sleep(2000);

                            policyno_page5_ii.sendKeys(Policy_Number);

                            Thread.sleep(2000);

                            WebElement policyexpdate_page5_ii = ls.getPolicyexpdate_page5_ii();

//					policyexpdate_page5_ii.click();
//
//					Thread.sleep(2000);
//
//					WebElement findElement3 = driver.findElement(By.id("pp_ExpiryDate"));
//
//					findElement3.click();
//
//					Thread.sleep(2000);
//
//					findElement3.clear();
//
//					Thread.sleep(2000);
//
//					findElement3.sendKeys(Policy_Expiry_Date);
//
                            Thread.sleep(2000);

                            driver.findElement(By.xpath("(//button[@class='align-item-center'])[2]")).click();

                            Thread.sleep(5000);

                            WebElement paynow_btn_page5_ii = ls.getPaynow_btn_page5_ii();

                            Thread.sleep(2000);

                            lb.Click(paynow_btn_page5_ii);

                            Thread.sleep(3000);

                            WebElement policy_breakup = driver.findElement(By.xpath("//a[@id='viewPolicy_breakup']"));

                            lb.scrollDown(policy_breakup);

                            Thread.sleep(2500);

                            policy_breakup.click();

                            Thread.sleep(2000);

                            driver.findElement(By.xpath("//a[@class='navBack']")).click();

                            Thread.sleep(2500);

                            WebElement checkbox_page_6 = ls.getCheckbox_page_6();

                            lb.Click(checkbox_page_6);

                            Thread.sleep(2000);

                            WebElement paynow_btn_page_6 = ls.getPaynow_btn_page_6();

                            lb.btnClick(paynow_btn_page_6);

                            Thread.sleep(2000);

                            driver.findElement(By.xpath("(//span[@class='innerpanel-text innerpanel-bg border right-arrow paymentOption'])[3]")).click();

                            Thread.sleep(2000);

                            WebElement findElement21 = driver.findElement(By.id("netBankingBank"));

                            findElement21.click();

                            Thread.sleep(2000);

                            findElement21.sendKeys(Keys.ARROW_DOWN);

                            Thread.sleep(2000);

                            findElement21.sendKeys(Keys.ENTER);

                            Thread.sleep(2000);

                            driver.findElement(By.xpath("(//span[@class='primary-button-text'])[7]")).click();

                            Thread.sleep(5000);

                            driver.findElement(By.xpath("//input[@type='submit']")).click();

                            Thread.sleep(3000);

                            driver.findElement(By.id("proceed-button")).click();

                            Thread.sleep(15000);

                            ls.getDownload_policy_btn_page6().click();

                            Thread.sleep(4000);

                            ls.getStarrating4_btn_page6().click();

                            Thread.sleep(2000);
                        }

                        else {



                            WebElement chassisno_edit_btn_page5_ii = ls.getChassisno_edit_btn_page5_ii();

                            Thread.sleep(2000);

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

                            for (int i = 0; i <3; i++) {

                                hypothecation_loan_page5_ii.sendKeys(Keys.ARROW_DOWN);

                            }

                            Thread.sleep(2000);

                            hypothecation_loan_page5_ii.sendKeys(Keys.ENTER);

//					lb.pindropselect();

                            Thread.sleep(2000);

                            WebElement loan_provider_page_5_ii = ls.getLoan_provider_page_5_ii();

                            loan_provider_page_5_ii.sendKeys(Loan_Provider);

                            Thread.sleep(2000);

                            for (int i = 0; i <4; i++) {

                                loan_provider_page_5_ii.sendKeys(Keys.ARROW_DOWN);
                            }

                            Thread.sleep(2000);

                            loan_provider_page_5_ii.sendKeys(Keys.ENTER);


//					lb.pindropselect();

                            Thread.sleep(3500);

//					lb.pindropselectSingleClick();

//					Thread.sleep(2000);

                            WebElement financier_name_page_5_ii = ls.getFinancier_name_page_5_ii();

                            financier_name_page_5_ii.sendKeys(Financier_Branch);

                            Thread.sleep(2000);

                            WebElement insurer_page5_ii = ls.getInsurer_page5_ii();

                            insurer_page5_ii.sendKeys(Insurer);

                            Thread.sleep(2000);

                            for (int i = 0; i <3; i++) {

                                insurer_page5_ii.sendKeys(Keys.ARROW_DOWN);
                            }

                            Thread.sleep(2000);

                            insurer_page5_ii.sendKeys(Keys.ENTER);

//					lb.pindropselect1();

                            Thread.sleep(3500);

                            WebElement policyno_page5_ii = ls.getPolicyno_page5_ii();

                            policyno_page5_ii.sendKeys(Policy_Number);

                            Thread.sleep(2000);

                            WebElement policyexpdate_page5_ii = ls.getPolicyexpdate_page5_ii();
//
//					policyexpdate_page5_ii.click();
//
//					Thread.sleep(2000);
//
//					WebElement findElement3 = driver.findElement(By.id("pp_ExpiryDate"));
//
//					findElement3.click();
//
//					Thread.sleep(2000);
//
//					findElement3.clear();
//
//					Thread.sleep(2000);
//
//					findElement3.sendKeys(Policy_Expiry_Date);

                            Thread.sleep(2000);

                            driver.findElement(By.xpath("(//button[@class='align-item-center'])[2]")).click();

                            Thread.sleep(4000);
//
//					lb.selectOptionByText(datepicker_year_page_3_ii, "2022");
//
//					Thread.sleep(2000);
//
//					lb.selectOptionByText(datepicker_month_page_3_ii, "May");
//
//					Thread.sleep(2000);
//
//					WebElement datepicker_date_previous_policy_date_page5 = ls.getDatepicker_date_previous_policy_date_page5();
//
//					datepicker_date_previous_policy_date_page5.click();

                            WebElement paynow_btn_page5_ii = ls.getPaynow_btn_page5_ii();

                            lb.Click(paynow_btn_page5_ii);

                            Thread.sleep(2000);

                            WebElement policy_breakup = driver.findElement(By.xpath("//a[@id='viewPolicy_breakup']"));

                            policy_breakup.click();

                            Thread.sleep(2000);

                            lb.navigateBack();

                            Thread.sleep(6000);

                            WebElement checkbox_page_6 = ls.getCheckbox_page_6();

                            lb.scrollDown(checkbox_page_6);

                            Thread.sleep(2000);

                            lb.Click(checkbox_page_6);

                            Thread.sleep(2000);

                            WebElement paynow_btn_page_6 = ls.getPaynow_btn_page_6();

                            lb.btnClick(paynow_btn_page_6);

                            Thread.sleep(2000);

                            driver.findElement(By.xpath("(//span[@class='innerpanel-text innerpanel-bg border right-arrow paymentOption'])[3]")).click();

                            Thread.sleep(2000);

                            WebElement findElement21 = driver.findElement(By.id("netBankingBank"));

                            findElement21.click();

                            Thread.sleep(2000);

                            findElement21.sendKeys(Keys.ARROW_DOWN);

                            Thread.sleep(2000);

                            findElement21.sendKeys(Keys.ENTER);

                            Thread.sleep(2000);

                            driver.findElement(By.xpath("(//span[@class='primary-button-text'])[7]")).click();

                            Thread.sleep(5000);

                            driver.findElement(By.xpath("//input[@type='submit']")).click();

                            Thread.sleep(3000);

                            driver.findElement(By.id("proceed-button")).click();

                            Thread.sleep(15000);

                            ls.getDownload_policy_btn_page6().click();

                            Thread.sleep(4000);

                            ls.getStarrating4_btn_page6().click();

                            Thread.sleep(2000);

                        }

                    }

                    else {

                        WebElement rcfullname_page5 = ls.getRcfullname_page5();

                        Thread.sleep(2000);

                        rcfullname_page5.clear();

                        Thread.sleep(2000);

                        rcfullname_page5.sendKeys(Full_name);

                        Thread.sleep(2000);

                        WebElement email_page5 = ls.getEmail_page5();

                        email_page5.clear();

                        Thread.sleep(2000);

                        email_page5.sendKeys(Email);

                        Thread.sleep(2000);

                        addressline1_page5.clear();

                        Thread.sleep(2000);

                        addressline1_page5.sendKeys(Ad_line1);

                        Thread.sleep(2000);

                        WebElement addressline2_page5 = ls.getAddressline2_page5();

                        addressline2_page5.clear();

                        Thread.sleep(2000);

                        addressline2_page5.sendKeys(Ad_line2);

                        Thread.sleep(2000);

                        WebElement pincode_page5 = ls.getPincode_page5();

                        pincode_page5.clear();

                        Thread.sleep(2000);

                        pincode_page5.sendKeys(Pincode);

                        Thread.sleep(4000);

                        WebElement nominee_name_page5 = ls.getNominee_name_page5();

                        nominee_name_page5.clear();

                        Thread.sleep(2000);

                        nominee_name_page5.sendKeys(Nominee_name);

                        Thread.sleep(2000);

                        WebElement relationship_page5 = ls.getRelationship_page5();

//				lb.pindropselect();

                        relationship_page5.sendKeys(Keys.ARROW_DOWN);

                        Thread.sleep(2000);

                        relationship_page5.sendKeys(Keys.ENTER);

                        Thread.sleep(2000);

                        WebElement nomineeage_page5 = ls.getNomineeage_page5();

                        nomineeage_page5.clear();

                        Thread.sleep(2000);

                        nomineeage_page5.sendKeys(Nominee_age);

                        Thread.sleep(2000);

                        WebElement continue_btn_ownerinfo_page5 = ls.getContinue_btn_ownerinfo_page5();

                        lb.btnClick(continue_btn_ownerinfo_page5);

                        Thread.sleep(7000);

                        WebElement chassisno_edit_btn_page5_ii = ls.getChassisno_edit_btn_page5_ii();

//				String text3 = chassisno_edit_btn_page5_ii.getText();

                        String text3 = driver.findElement(By.xpath("//span[@class='previewveh_chasis_number']")).getText();

                        if (text3.isEmpty()) {

                            Thread.sleep(2000);

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

                            for (int i = 0; i <3; i++) {

                                hypothecation_loan_page5_ii.sendKeys(Keys.ARROW_DOWN);

                                Thread.sleep(2000);
                            }

                            hypothecation_loan_page5_ii.sendKeys(Keys.ENTER);

//					lb.pindropselect4();

                            Thread.sleep(2000);

                            WebElement loan_provider_page_5_ii = ls.getLoan_provider_page_5_ii();

                            loan_provider_page_5_ii.sendKeys(Loan_Provider);

                            Thread.sleep(2000);

                            for (int i = 0; i <4; i++) {

                                loan_provider_page_5_ii.sendKeys(Keys.ARROW_DOWN);

                                Thread.sleep(2000);
                            }

                            loan_provider_page_5_ii.sendKeys(Keys.ENTER);

//					lb.pindropselect();

                            Thread.sleep(3500);

//					lb.pindropselectSingleClick();

//					Thread.sleep(2000);

                            WebElement financier_name_page_5_ii = ls.getFinancier_name_page_5_ii();

                            financier_name_page_5_ii.sendKeys(Financier_Branch);

                            Thread.sleep(2000);

                            WebElement insurer_page5_ii = ls.getInsurer_page5_ii();

                            insurer_page5_ii.sendKeys(Insurer);

                            Thread.sleep(2000);

                            for (int i = 0; i <3; i++) {

                                insurer_page5_ii.sendKeys(Keys.ARROW_DOWN);

                                Thread.sleep(2000);
                            }

                            insurer_page5_ii.sendKeys(Keys.ENTER);

//					lb.pindropselect1();

                            Thread.sleep(3500);

                            WebElement policyno_page5_ii = ls.getPolicyno_page5_ii();

                            policyno_page5_ii.sendKeys(Policy_Number);

                            Thread.sleep(2000);

                            WebElement policyexpdate_page5_ii = ls.getPolicyexpdate_page5_ii();

//					policyexpdate_page5_ii.click();
//
//					Thread.sleep(2000);
//
//					WebElement findElement3 = driver.findElement(By.id("pp_ExpiryDate"));
//
//					findElement3.click();
//
//					Thread.sleep(2000);
//
//					findElement3.clear();
//
//					Thread.sleep(2000);
//
//					findElement3.sendKeys(Policy_Expiry_Date);
//
//					Thread.sleep(2000);

                            driver.findElement(By.xpath("(//button[@class='align-item-center'])[2]")).click();

                            Thread.sleep(5000);

//					lb.selectOptionByText(datepicker_year_page_3_ii, "2022");
//
//					Thread.sleep(2000);
//
//					lb.selectOptionByText(datepicker_month_page_3_ii, "May");
//
//					Thread.sleep(2000);
//
//					WebElement datepicker_date_previous_policy_date_page5 = ls.getDatepicker_date_previous_policy_date_page5();
//
//					datepicker_date_previous_policy_date_page5.click();

                            WebElement paynow_btn_page5_ii = ls.getPaynow_btn_page5_ii();

                            lb.Click(paynow_btn_page5_ii);

                            Thread.sleep(2000);

                            WebElement policy_breakup = driver.findElement(By.xpath("//a[@id='viewPolicy_breakup']"));

                            policy_breakup.click();

                            Thread.sleep(2000);

                            lb.navigateBack();

                            Thread.sleep(6000);

                            WebElement checkbox_page_6 = ls.getCheckbox_page_6();

                            lb.Click(checkbox_page_6);

                            Thread.sleep(2000);

                            WebElement paynow_btn_page_6 = ls.getPaynow_btn_page_6();

                            lb.btnClick(paynow_btn_page_6);

                            Thread.sleep(2000);

                            driver.findElement(By.xpath("(//span[@class='innerpanel-text innerpanel-bg border right-arrow paymentOption'])[3]")).click();

                            Thread.sleep(2000);

                            WebElement findElement21 = driver.findElement(By.id("netBankingBank"));

                            findElement21.click();

                            Thread.sleep(2000);

                            findElement21.sendKeys(Keys.ARROW_DOWN);

                            Thread.sleep(2000);

                            findElement21.sendKeys(Keys.ENTER);

                            Thread.sleep(2000);

                            driver.findElement(By.xpath("(//span[@class='primary-button-text'])[7]")).click();

                            Thread.sleep(5000);

                            driver.findElement(By.xpath("//input[@type='submit']")).click();

                            Thread.sleep(3000);

                            driver.findElement(By.id("proceed-button")).click();

                            Thread.sleep(15000);

                            ls.getDownload_policy_btn_page6().click();

                            Thread.sleep(4000);

                            ls.getStarrating4_btn_page6().click();

                            Thread.sleep(2000);

                        }


                    }

                }

            }

            else {

                Thread.sleep(2000);

                ls.getVehicle_no_page3_ii().clear();

                Thread.sleep(2000);

                ls.getVehicle_no_page3_ii().sendKeys(Vehicle_number);

                Thread.sleep(4000);

                WebElement makeandmodel_drpdwn_page3_ii2 = ls.getMakeandmodel_drpdwn_page3_ii();

                makeandmodel_drpdwn_page3_ii2.click();

                Thread.sleep(2000);

                makeandmodel_drpdwn_page3_ii2.sendKeys(Make_and_model);

                Thread.sleep(2000);

                makeandmodel_drpdwn_page3_ii2.sendKeys(Keys.ARROW_DOWN);

                Thread.sleep(2000);

                makeandmodel_drpdwn_page3_ii2.sendKeys(Keys.ENTER);

//				lb.pindropselect();

                Thread.sleep(3000);

                WebElement variant_drpdwn_page3_ii = ls.getVariant_drpdwn_page3_ii();

                Thread.sleep(3000);

                variant_drpdwn_page3_ii.click();

                Thread.sleep(3000);

                variant_drpdwn_page3_ii.sendKeys(Variant);

                Thread.sleep(3000);

                variant_drpdwn_page3_ii.sendKeys(Keys.ARROW_DOWN);

                Thread.sleep(2000);

                variant_drpdwn_page3_ii.sendKeys(Keys.ENTER);

//				lb.pindropselect();

                Thread.sleep(3500);

                WebElement reg_date_drpdwn_page3_ii = ls.getReg_date_drpdwn_page3_ii();

                reg_date_drpdwn_page3_ii.click();

                Thread.sleep(3000);

                WebElement findElement2 = driver.findElement(By.id("c_vd_RegistrationDate"));

                findElement2.click();

                Thread.sleep(2000);

                findElement2.sendKeys(Registration_date);
//
//				findElement2.clear();
//
//				Thread.sleep(2000);
//
//				findElement2.sendKeys(Date_of_reg);

//                WebElement datepicker_year_page_3_ii = ls.getDatepicker_year_page_3_ii();
//
//                lb.selectOptionByText(datepicker_year_page_3_ii, "2015");
//
//                Thread.sleep(3000);
//
//                WebElement datepicker_month_page_3_ii = ls.getDatepicker_month_page_3_ii();
//
//                lb.selectOptionByText(datepicker_month_page_3_ii, "Jun");
//
//                Thread.sleep(3000);
//
//                ls.getDatepicker_date_page_3_ii().click();
//
////up2  this----------------------------->
//
//                Thread.sleep(3000);
//
////                driver.findElement(By.xpath("//div[@class='col-md-6 col-lg-6 layout-left hide-md']")).click();

                Thread.sleep(2000);

                WebElement city_of_reg_page3_ii = ls.getCity_of_reg_page3_ii();

                driver.findElement(By.xpath("//label[@for='c_vd_CityOfRegistration']")).click();

                Thread.sleep(3000);

                city_of_reg_page3_ii.sendKeys(city_of_registration);

                Thread.sleep(2000);

                city_of_reg_page3_ii.sendKeys(Keys.ARROW_DOWN);

                Thread.sleep(2000);

                city_of_reg_page3_ii.sendKeys(Keys.ENTER);

//				lb.pindropselect();

                Thread.sleep(3500);

                WebElement individual_radio_btn_page3_ii = ls.getIndividual_radio_btn_page3_ii();

                WebElement comapny_btn_page3_ii = ls.getComapny_btn_page3_ii();

                String text = ls.getCompany_text_page3().getText();

                System.out.println(Select_registration);

                if (Select_registration.contentEquals("Individual")) {

                    Thread.sleep(2000);

                    lb.btnClick(individual_radio_btn_page3_ii);

                } else if (Select_registration.contentEquals("Company")) {

                    Thread.sleep(2000);

                    lb.btnClick(comapny_btn_page3_ii);

                    WebElement company_name_gst = driver.findElement(By.id("c_vd_companyName"));

                    WebElement Gst_no = driver.findElement(By.id("c_vd_GSTNumber"));

                    Thread.sleep(2000);

                    company_name_gst.sendKeys(Enter_company_name);

                    Thread.sleep(2000);

                    Gst_no.sendKeys(Enter_GST_number);

                }

                String s = select_previous_policy_type;

                System.out.println(s);

                if (s.equals("Third Party")) {

                    Thread.sleep(2500);

                    WebElement datepicker_year_page_3_ii1 = ls.getDatepicker_year_page_3_ii();

                    WebElement datepicker_month_page_3_ii1 = ls.getDatepicker_month_page_3_ii();

                    ls.getThrirdparty_radiobtn_page3().click();

                    Thread.sleep(3000);

                    driver.findElement(By.xpath("//label[@for='c_vd_tp_ppEpiryDate']")).click();

                    Thread.sleep(2000);

                    WebElement Previous_Policy_Expiry_Date1 = driver.findElement(By.id("c_vd_tp_ppEpiryDate"));

                    Thread.sleep(2000);

					Previous_Policy_Expiry_Date1.sendKeys(previous_policy_expiry_date);



//					WebElement thirdparty_previous_policy_expiry_date_page3 = ls.getThirdparty_previous_policy_expiry_date_page3();
                    //
//					thirdparty_previous_policy_expiry_date_page3.click();
                    //
//					Thread.sleep(3000);
                    //
//					lb.selectOptionByText(datepicker_year_page_3_ii1, "2022");
                    //
//					Thread.sleep(3000);
                    //
//					lb.selectOptionByText(datepicker_month_page_3_ii1, "May");
                    //
//					WebElement datepicker_previous_policy_date_page3_ii1 = ls.getDatepicker_previous_policy_date_page3_ii();
                    //
//					datepicker_previous_policy_date_page3_ii1.click();
                    //
                    Thread.sleep(3000);

                    driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();

                    Thread.sleep(9000);

                    ls.getHere_your_plan_info_page4().click();

                    Thread.sleep(2000);

                    driver.findElement(By.xpath("(//button[@class='primary-btn modal-close-btn mx-auto mt-20 x-icon'])[11]")).click();
//                    ls.getHere_your_plan_info_closebtn_page4().click();

                    Thread.sleep(2000);

                    ls.getAdd_extra_coverage_infobtn_page4().click();

                    Thread.sleep(2000);

                    driver.findElement(By.xpath("(//button[@class='primary-btn modal-close-btn mx-auto mt-20 x-icon'])[13]")).click();
//                    ls.getAdd_extra_coverage_popup_closebtn_page4().click();

                    Thread.sleep(2000);

                    driver.findElement(By.xpath("//button[@class='view-more-btn hide-e modal-btn']")).click();

                    Thread.sleep(2000);

                    driver.findElement(By.xpath("//label[@for='add4']")).click();

                    Thread.sleep(9000);

                    driver.findElement(By.xpath("//label[@for='add5']")).click();

                    Thread.sleep(9000);

                    driver.findElement(By.xpath("//a[@class='align-item-center modal-close-btn d-flex']")).click();

                    Thread.sleep(3000);

                    ls.getContinue_btn_page4().click();

                    Thread.sleep(10000);

                    WebElement addressline1_page5 = ls.getAddressline1_page5();

//                    WebElement state_textbox = driver.findElement(By.xpath("(//div[@class='form-b p-relative focused'])[11]"));

//					boolean displayed = addressline1_page5.isDisplayed();

//					Thread.sleep(2000);

//					String text1 = addressline1_page5.getText();

                    Thread.sleep(2000);

//					System.out.println(text1);

//                    if (state_textbox.isDisplayed()) {
//
//
//
//
//                        WebElement email_page5 = ls.getEmail_page5();
//
//                        Thread.sleep(2000);
//
//                        email_page5.clear();
//
//                        Thread.sleep(2000);
//
//                        email_page5.sendKeys(Email);
//
//                        Thread.sleep(2000);
//
//                        WebElement addressline2_page5 = ls.getAddressline2_page5();
//
//                        addressline2_page5.clear();
//
//                        Thread.sleep(2000);
//
//                        addressline2_page5.sendKeys(Ad_line2);
//
//                        Thread.sleep(2000);
//
//                        WebElement nominee_name_page5 = ls.getNominee_name_page5();
//
//                        nominee_name_page5.clear();
//
//                        Thread.sleep(2000);
//
//                        nominee_name_page5.sendKeys(Nominee_name);
//
//                        Thread.sleep(2000);
//
//                        WebElement relationship_page5 = ls.getRelationship_page5();
//
//                        relationship_page5.sendKeys(Keys.ARROW_DOWN);
//
//                        Thread.sleep(2000);
//
//                        relationship_page5.sendKeys(Keys.ENTER);
//
////					lb.pindropselect();
//
//                        Thread.sleep(2000);
//
//                        WebElement nomineeage_page5 = ls.getNomineeage_page5();
//
//                        nomineeage_page5.clear();
//
//                        Thread.sleep(2000);
//
//                        nomineeage_page5.sendKeys(Nominee_age);
//
//                        Thread.sleep(2000);
//
//                        WebElement continue_btn_ownerinfo_page5 = ls.getContinue_btn_ownerinfo_page5();
//
//                        lb.btnClick(continue_btn_ownerinfo_page5);
//
//                        Thread.sleep(6000);
//
//                        WebElement chasis = driver.findElement(By.xpath("(//span[@class='previewveh_chasis_number'])[1]"));
//
//                        if (chasis.isDisplayed()) {
//
//                            WebElement toggleswitch_page5_ii = ls.getToggleswitch_page5_ii();
//
//                            lb.btnClick(toggleswitch_page5_ii);
//
//                            Thread.sleep(2000);
//
//                            WebElement hypothecation_loan_page5_ii = ls.getHypothecation_loan_page5_ii();
//
//                            hypothecation_loan_page5_ii.click();
//
//                            Thread.sleep(2000);
//
//                            for (int i = 0; i <3; i++) {
//
//                                hypothecation_loan_page5_ii.sendKeys(Keys.ARROW_DOWN);
//
//                                Thread.sleep(2000);
//                            }
//
//                            hypothecation_loan_page5_ii.sendKeys(Keys.ENTER);
//
////							lb.pindropselect4();
//
//                            Thread.sleep(2000);
//
//                            WebElement loan_provider_page_5_ii = ls.getLoan_provider_page_5_ii();
//
//                            loan_provider_page_5_ii.sendKeys(Loan_Provider);
//
//                            Thread.sleep(2000);
//
//                            for (int i = 0; i <4; i++) {
//
//                                loan_provider_page_5_ii.sendKeys(Keys.ARROW_DOWN);
//
//                                Thread.sleep(2000);
//                            }
//
//                            loan_provider_page_5_ii.sendKeys(Keys.ENTER);
//
////							lb.pindropselect();
//
//                            Thread.sleep(3500);
//
////							lb.pindropselectSingleClick();
//
////							Thread.sleep(2000);
//
//                            WebElement financier_name_page_5_ii = ls.getFinancier_name_page_5_ii();
//
//                            financier_name_page_5_ii.sendKeys(Financier_Branch);
//
//                            Thread.sleep(2000);
//
//                            WebElement insurer_page5_ii = ls.getInsurer_page5_ii();
//
//                            insurer_page5_ii.sendKeys(Insurer);
//
//                            Thread.sleep(2000);
//
//                            for (int i = 0; i <3; i++) {
//
//                                insurer_page5_ii.sendKeys(Keys.ARROW_DOWN);
//
//                                Thread.sleep(2000);
//                            }
//
//                            insurer_page5_ii.sendKeys(Keys.ENTER);
//
////							lb.pindropselect1();
//
//                            Thread.sleep(3500);
//
//                            WebElement policyno_page5_ii = ls.getPolicyno_page5_ii();
//
//                            policyno_page5_ii.sendKeys(Policy_Number);
//
//                            Thread.sleep(2000);
//
//                            WebElement policyexpdate_page5_ii = ls.getPolicyexpdate_page5_ii();
//
////							policyexpdate_page5_ii.click();
////
////							Thread.sleep(2000);
////
////							WebElement findElement3 = driver.findElement(By.id("pp_ExpiryDate"));
////
////							findElement3.click();
////
////							Thread.sleep(2000);
////
////							findElement3.clear();
////
////							Thread.sleep(2000);
////
////							findElement3.sendKeys(Policy_Expiry_Date);
////
//                            Thread.sleep(2000);
//
//                            driver.findElement(By.xpath("(//button[@class='align-item-center'])[2]")).click();
//
//                            Thread.sleep(5000);
//
//                            WebElement paynow_btn_page5_ii = ls.getPaynow_btn_page5_ii();
//
//                            Thread.sleep(2000);
//
//                            lb.Click(paynow_btn_page5_ii);
//
//                            Thread.sleep(3000);
//
//                            WebElement policy_breakup = driver.findElement(By.xpath("//a[@id='viewPolicy_breakup']"));
//
//                            lb.scrollDown(policy_breakup);
//
//                            Thread.sleep(2500);
//
//                            policy_breakup.click();
//
//                            Thread.sleep(2000);
//
//                            driver.findElement(By.xpath("//a[@class='navBack']")).click();
//
//                            Thread.sleep(2500);
//
//                            WebElement checkbox_page_6 = ls.getCheckbox_page_6();
//
//                            lb.Click(checkbox_page_6);
//
//                            Thread.sleep(2000);
//
//                            WebElement paynow_btn_page_6 = ls.getPaynow_btn_page_6();
//
//                            lb.btnClick(paynow_btn_page_6);
//
//                            Thread.sleep(2000);
//
//                            driver.findElement(By.xpath("(//span[@class='innerpanel-text innerpanel-bg border right-arrow paymentOption'])[3]")).click();
//
//                            Thread.sleep(2000);
//
//                            WebElement findElement21 = driver.findElement(By.id("netBankingBank"));
//
//                            findElement21.click();
//
//                            Thread.sleep(2000);
//
//                            findElement21.sendKeys(Keys.ARROW_DOWN);
//
//                            Thread.sleep(2000);
//
//                            findElement21.sendKeys(Keys.ENTER);
//
//                            Thread.sleep(2000);
//
//                            driver.findElement(By.xpath("(//span[@class='primary-button-text'])[7]")).click();
//
//                            Thread.sleep(5000);
//
//                            driver.findElement(By.xpath("//input[@type='submit']")).click();
//
//                            Thread.sleep(3000);
//
//                            driver.findElement(By.id("proceed-button")).click();
//
//                            Thread.sleep(15000);
//
//                            ls.getDownload_policy_btn_page6().click();
//
//                            Thread.sleep(4000);
//
//                            ls.getStarrating4_btn_page6().click();
//
//                            Thread.sleep(2000);
//                        }
//
//                        else {
//
//                            WebElement chassisno_edit_btn_page5_ii = ls.getChassisno_edit_btn_page5_ii();
//
//                            Thread.sleep(2000);
//
//                            lb.btnClick(chassisno_edit_btn_page5_ii);
//
//                            Thread.sleep(2000);
//
//                            WebElement chasis_no_page5_ii = ls.getChasis_no_page5_ii();
//
//                            chasis_no_page5_ii.sendKeys(Chassis_Number);
//
//                            Thread.sleep(2000);
//
//                            WebElement edited_engine_no_page5_ii = ls.getEdited_engine_no_page5_ii();
//
//                            edited_engine_no_page5_ii.sendKeys(Engine_Number);
//
//                            Thread.sleep(2000);
//
//                            WebElement got_it_btn_page_5_ii = ls.getGot_it_btn_page_5_ii();
//
//                            lb.btnClick(got_it_btn_page_5_ii);
//
//                            Thread.sleep(2000);
//
//                            WebElement toggleswitch_page5_ii = ls.getToggleswitch_page5_ii();
//
//                            lb.btnClick(toggleswitch_page5_ii);
//
//                            Thread.sleep(2000);
//
//                            WebElement hypothecation_loan_page5_ii = ls.getHypothecation_loan_page5_ii();
//
//                            hypothecation_loan_page5_ii.click();
//
//                            Thread.sleep(2000);
//
//                            for (int i = 0; i <3; i++) {
//
//                                hypothecation_loan_page5_ii.sendKeys(Keys.ARROW_DOWN);
//
//                            }
//
//                            Thread.sleep(2000);
//
//                            hypothecation_loan_page5_ii.sendKeys(Keys.ENTER);
//
////							lb.pindropselect();
//
//                            Thread.sleep(2000);
//
//                            WebElement loan_provider_page_5_ii = ls.getLoan_provider_page_5_ii();
//
//                            loan_provider_page_5_ii.sendKeys(Loan_Provider);
//
//                            Thread.sleep(2000);
//
//                            for (int i = 0; i <4; i++) {
//
//                                loan_provider_page_5_ii.sendKeys(Keys.ARROW_DOWN);
//                            }
//
//                            Thread.sleep(2000);
//
//                            loan_provider_page_5_ii.sendKeys(Keys.ENTER);
//
//
////							lb.pindropselect();
//
//                            Thread.sleep(3500);
//
////							lb.pindropselectSingleClick();
//
////							Thread.sleep(2000);
//
//                            WebElement financier_name_page_5_ii = ls.getFinancier_name_page_5_ii();
//
//                            financier_name_page_5_ii.sendKeys(Financier_Branch);
//
//                            Thread.sleep(2000);
//
//                            WebElement insurer_page5_ii = ls.getInsurer_page5_ii();
//
//                            insurer_page5_ii.sendKeys(Insurer);
//
//                            Thread.sleep(2000);
//
//                            for (int i = 0; i <3; i++) {
//
//                                insurer_page5_ii.sendKeys(Keys.ARROW_DOWN);
//                            }
//
//                            Thread.sleep(2000);
//
//                            insurer_page5_ii.sendKeys(Keys.ENTER);
//
////							lb.pindropselect1();
//
//                            Thread.sleep(3500);
//
//                            WebElement policyno_page5_ii = ls.getPolicyno_page5_ii();
//
//                            policyno_page5_ii.sendKeys(Policy_Number);
//
//                            Thread.sleep(2000);
//
//                            WebElement policyexpdate_page5_ii = ls.getPolicyexpdate_page5_ii();
//
////							policyexpdate_page5_ii.click();
////
////							Thread.sleep(2000);
////
////							WebElement findElement3 = driver.findElement(By.id("pp_ExpiryDate"));
////
////							findElement3.click();
////
////							Thread.sleep(2000);
////
////							findElement3.clear();
////
////							Thread.sleep(2000);
////
////							findElement3.sendKeys(Policy_Expiry_Date);
////
//                            Thread.sleep(2000);
//
//                            driver.findElement(By.xpath("(//button[@class='align-item-center'])[2]")).click();
//
//                            Thread.sleep(4000);
//                            //
////							lb.selectOptionByText(datepicker_year_page_3_ii, "2022");
//                            //
////							Thread.sleep(2000);
//                            //
////							lb.selectOptionByText(datepicker_month_page_3_ii, "May");
//                            //
////							Thread.sleep(2000);
//                            //
////							WebElement datepicker_date_previous_policy_date_page5 = ls.getDatepicker_date_previous_policy_date_page5();
//                            //
////							datepicker_date_previous_policy_date_page5.click();
//
//                            WebElement paynow_btn_page5_ii = ls.getPaynow_btn_page5_ii();
//
//                            lb.Click(paynow_btn_page5_ii);
//
//                            Thread.sleep(2000);
//
//                            WebElement policy_breakup = driver.findElement(By.xpath("//a[@id='viewPolicy_breakup']"));
//
//                            policy_breakup.click();
//
//                            Thread.sleep(2000);
//
//                            lb.navigateBack();
//
//                            Thread.sleep(6000);
//
//                            WebElement checkbox_page_6 = ls.getCheckbox_page_6();
//
//                            lb.scrollDown(checkbox_page_6);
//
//                            Thread.sleep(2000);
//
//                            lb.Click(checkbox_page_6);
//
//                            Thread.sleep(2000);
//
//                            WebElement paynow_btn_page_6 = ls.getPaynow_btn_page_6();
//
//                            lb.btnClick(paynow_btn_page_6);
//
//                            Thread.sleep(2000);
//
//                            driver.findElement(By.xpath("(//span[@class='innerpanel-text innerpanel-bg border right-arrow paymentOption'])[3]")).click();
//
//                            Thread.sleep(2000);
//
//                            WebElement findElement21 = driver.findElement(By.id("netBankingBank"));
//
//                            findElement21.click();
//
//                            Thread.sleep(2000);
//
//                            findElement21.sendKeys(Keys.ARROW_DOWN);
//
//                            Thread.sleep(2000);
//
//                            findElement21.sendKeys(Keys.ENTER);
//
//                            Thread.sleep(2000);
//
//                            driver.findElement(By.xpath("(//span[@class='primary-button-text'])[7]")).click();
//
//                            Thread.sleep(5000);
//
//                            driver.findElement(By.xpath("//input[@type='submit']")).click();
//
//                            Thread.sleep(3000);
//
//                            driver.findElement(By.id("proceed-button")).click();
//
//                            Thread.sleep(15000);
//
//                            ls.getDownload_policy_btn_page6().click();
//
//                            Thread.sleep(4000);
//
//                            ls.getStarrating4_btn_page6().click();
//
//                            Thread.sleep(2000);
//                        }
//
//                    }

//                    else {



                        WebElement rcfullname_page5 = ls.getRcfullname_page5();

                        Thread.sleep(2000);

                        rcfullname_page5.clear();

                        Thread.sleep(2000);

                        rcfullname_page5.sendKeys(Full_name);

                        Thread.sleep(2000);

                        WebElement email_page5 = ls.getEmail_page5();

                        email_page5.clear();

                        Thread.sleep(2000);

                        email_page5.sendKeys(Email);

                        Thread.sleep(2000);

                        addressline1_page5.clear();

                        Thread.sleep(2000);

                        addressline1_page5.sendKeys(Ad_line1);

                        Thread.sleep(2000);

                        WebElement addressline2_page5 = ls.getAddressline2_page5();

                        addressline2_page5.clear();

                        Thread.sleep(2000);

                        addressline2_page5.sendKeys(Ad_line2);

                        Thread.sleep(2000);

                        WebElement pincode_page5 = ls.getPincode_page5();

                        pincode_page5.clear();

                        Thread.sleep(2000);

                        pincode_page5.sendKeys(Pincode);

                        Thread.sleep(4000);

                        WebElement nominee_name_page5 = ls.getNominee_name_page5();

                        nominee_name_page5.clear();

                        Thread.sleep(2000);

                        nominee_name_page5.sendKeys(Nominee_name);

                        Thread.sleep(2000);

                        WebElement relationship_page5 = ls.getRelationship_page5();

//						lb.pindropselect();

                        driver.findElement(By.xpath("//label[@for='ow_nomineeRel']")).click();

                        Thread.sleep(2000);

                        relationship_page5.sendKeys(Relationship);

                        Thread.sleep(1500);

                        relationship_page5.sendKeys(Keys.ARROW_DOWN);

                        Thread.sleep(2000);

                        relationship_page5.sendKeys(Keys.ENTER);

                        Thread.sleep(2000);

                        WebElement nomineeage_page5 = ls.getNomineeage_page5();

                        nomineeage_page5.clear();

                        Thread.sleep(2000);

                        nomineeage_page5.sendKeys(Nominee_age);

                        Thread.sleep(2000);

                        WebElement continue_btn_ownerinfo_page5 = ls.getContinue_btn_ownerinfo_page5();

                        lb.btnClick(continue_btn_ownerinfo_page5);

                        Thread.sleep(7000);

                            driver.findElement(By.xpath("//label[@for='new_chassisNumber']")).click();

                            Thread.sleep(2000);

                            driver.findElement(By.id("new_chassisNumber")).sendKeys(Chassis_Number);

                            Thread.sleep(2000);

                            driver.findElement(By.xpath("//label[@for='new_enginNumber']")).click();

                            Thread.sleep(2000);

                            driver.findElement(By.id("new_enginNumber")).sendKeys(Engine_Number);

                            Thread.sleep(2000);

                            WebElement toggleswitch_page5_ii = ls.getToggleswitch_page5_ii();

                            lb.btnClick(toggleswitch_page5_ii);

                            Thread.sleep(2000);

                            WebElement hypothecation_loan_page5_ii = ls.getHypothecation_loan_page5_ii();

                            hypothecation_loan_page5_ii.click();

                            Thread.sleep(2000);

                            for (int i = 0; i <3; i++) {

                                hypothecation_loan_page5_ii.sendKeys(Keys.ARROW_DOWN);

                                Thread.sleep(2000);
                            }

                            hypothecation_loan_page5_ii.sendKeys(Keys.ENTER);

//							lb.pindropselect4();

                            Thread.sleep(2000);

                            WebElement loan_provider_page_5_ii = ls.getLoan_provider_page_5_ii();

                            loan_provider_page_5_ii.sendKeys(Loan_Provider);

                            Thread.sleep(2000);

                            for (int i = 0; i <4; i++) {

                                loan_provider_page_5_ii.sendKeys(Keys.ARROW_DOWN);

                                Thread.sleep(2000);
                            }

                            loan_provider_page_5_ii.sendKeys(Keys.ENTER);

//							lb.pindropselect();

                            Thread.sleep(3500);

//							lb.pindropselectSingleClick();

//							Thread.sleep(2000);

                            WebElement financier_name_page_5_ii = ls.getFinancier_name_page_5_ii();

                            financier_name_page_5_ii.sendKeys(Financier_Branch);

                            Thread.sleep(2000);

                            driver.findElement(By.xpath("(//label[@for='pp_Insurer'])[1]")).click();

                            Thread.sleep(2000);

                            WebElement insurer_page5_ii = ls.getInsurer_page5_ii();

                            driver.findElement(By.xpath("(//label[@for='pp_Insurer'])[1]")).click();

                            Thread.sleep(2000);

                            insurer_page5_ii.sendKeys(Loan_Provider);

                            Thread.sleep(2000);

//                            for (int i = 0; i <3; i++) {

                                insurer_page5_ii.sendKeys(Keys.ARROW_DOWN);

                                Thread.sleep(2000);
//                            }

                            insurer_page5_ii.sendKeys(Keys.ENTER);

//							lb.pindropselect1();

                            Thread.sleep(3500);

                            WebElement policyno_page5_ii = ls.getPolicyno_page5_ii();

                            policyno_page5_ii.sendKeys(Policy_Number);

                            Thread.sleep(2000);

                            WebElement policyexpdate_page5_ii = ls.getPolicyexpdate_page5_ii();

//							policyexpdate_page5_ii.click();
//
//							Thread.sleep(2000);
//
//							WebElement findElement3 = driver.findElement(By.id("pp_ExpiryDate"));
//
//							findElement3.click();
//
//							Thread.sleep(2000);
//
//							findElement3.clear();
//
//							Thread.sleep(2000);
//
//							findElement3.sendKeys(Policy_Expiry_Date);
//
                            Thread.sleep(2000);

                            driver.findElement(By.xpath("(//button[@class='align-item-center'])[2]")).click();

                            Thread.sleep(5000);

//							lb.selectOptionByText(datepicker_year_page_3_ii, "2022");
                            //
//							Thread.sleep(2000);
                            //
//							lb.selectOptionByText(datepicker_month_page_3_ii, "May");
                            //
//							Thread.sleep(2000);
                            //
//							WebElement datepicker_date_previous_policy_date_page5 = ls.getDatepicker_date_previous_policy_date_page5();
                            //
//							datepicker_date_previous_policy_date_page5.click();

                            WebElement paynow_btn_page5_ii = ls.getPaynow_btn_page5_ii();

                            lb.Click(paynow_btn_page5_ii);

                            Thread.sleep(2000);

                            WebElement policy_breakup = driver.findElement(By.xpath("//a[@id='viewPolicy_breakup']"));

                            policy_breakup.click();

                            Thread.sleep(2000);

                            driver.findElement(By.xpath("//a[@class='navBack']")).click();

//                            lb.navigateBack();

                            Thread.sleep(6000);

                            WebElement checkbox_page_6 = ls.getCheckbox_page_6();

                            lb.Click(checkbox_page_6);

                            Thread.sleep(2000);

                            WebElement paynow_btn_page_6 = ls.getPaynow_btn_page_6();

                            lb.btnClick(paynow_btn_page_6);

                            Thread.sleep(2000);

                            driver.findElement(By.xpath("(//span[@class='innerpanel-text innerpanel-bg border right-arrow paymentOption'])[3]")).click();

                            Thread.sleep(2000);

                            WebElement findElement21 = driver.findElement(By.id("netBankingBank"));

                            findElement21.click();

                            Thread.sleep(2000);

                            findElement21.sendKeys(Keys.ARROW_DOWN);

                            Thread.sleep(2000);

                            findElement21.sendKeys(Keys.ENTER);

                            Thread.sleep(2000);

                            driver.findElement(By.xpath("(//span[@class='primary-button-text'])[7]")).click();

                            Thread.sleep(5000);

                            driver.findElement(By.xpath("//input[@type='submit']")).click();

                            Thread.sleep(3000);

                            driver.findElement(By.id("proceed-button")).click();

                            Thread.sleep(15000);

                            ls.getDownload_policy_btn_page6().click();

                            Thread.sleep(4000);

                            ls.getStarrating4_btn_page6().click();

                            Thread.sleep(2000);

//                        }


//                    }

                }

            }


            Thread.sleep(2000);
            int parseInt = Integer.parseInt(INDEX);
            Thread.sleep(2000);
            ExcelUtils.writeinexcel("PASS", parseInt);
            String s="Comprehensive Flow is Working Fine in ";
            String s1=Iteration;
            String concat = s.concat(s1);
            Thread.sleep(2000);
            ExcelUtils.writeinexcelForReasons(concat, parseInt);

        }

        catch (Exception e) {
            e.printStackTrace();
            int parseInt = Integer.parseInt(INDEX);
            Thread.sleep(2000);
            ExcelUtils.writeinexcel("FAIL", parseInt);
            String s="Comprehensive Flow isn't Working in ";
            String s1=Iteration;
            String concat = s.concat(s1);
            Thread.sleep(2000);
            ExcelUtils.writeinexcelForReasons(concat, parseInt);




        }













    }


}

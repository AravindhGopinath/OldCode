package org.runclass;

import org.apache.log4j.Logger;
import org.baseclass.BaseClass;
import org.elements.Locators;
import org.excel.ExcelUtils;
import org.openqa.selenium.*;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Own_Damage_I_know {


    static Logger log = Logger.getLogger(Own_Damage_I_know.class);

    public static void Owd_Flow(String Car_no, String Mobile_Number, String OTP_1, String OTP_2, String OTP_3, String OTP_4, String Vehicle_number, String Make_and_model, String Variant, String Select_registration,String  Registration_date, String city_of_registration, String Enter_company_name,
                                String Enter_GST_number, String select_previous_policy_type, String previous_policy_expiry_date, String Ea_Enter_accessories_name, String Ea_Enter_accessories_amount,
                                String NEa_Enter_accessories_name, String NEa_Enter_accessories_amount, String Enter_amount, String Full_name, String Email, String Ad_line1, String Ad_line2, String Pincode,
                                String Nominee_name, String Nominee_age, String Chassis_Number, String Engine_Number, String Loan_Provider, String Financier_Branch, String Insurer, String Policy_Number,
                                String Policy_Expiry_Date, String Iteration, String INDEX, String Third_Party_Insurer, String Third_Party_Policy_Start_Date, String Own_Damage_Policy_Start_Date, String Third_Party_Policy_Number,
                                String Own_Damage_Insurer, String Own_Damage_Policy_Number) throws Exception {

        System.out.println("OD-flow");
        System.out.println(Third_Party_Insurer);

        try {

            System.out.println(Own_Damage_Policy_Start_Date);

            BaseClass lb = new BaseClass();

            Locators ls = new Locators();

            WebDriver driver = lb.driver;

            // ***********************************************************_Page1_******************************************************************

            Thread.sleep(2000);

            WebElement carno_page1 = ls.getCarno_page1();

            carno_page1.clear();

            Thread.sleep(2000);

            carno_page1.sendKeys(Car_no);

            Thread.sleep(2000);

            log.info("******************** Vehicle number passed in 1st page ************************");

            WebElement mobno_page1 = ls.getMobno_page1();

            mobno_page1.clear();

            Thread.sleep(2000);

            mobno_page1.sendKeys(Mobile_Number);

            // System.out.println(Mobile_Number);

            Thread.sleep(2000);

            log.info("******************** Mobile number passed in 1st page ************************");

            ls.getTandc_page1().click();

            Thread.sleep(3500);

            WebElement tandcclosebtn_page1 = ls.getTandcclosebtn_page1();

            lb.btnClick(tandcclosebtn_page1);

            Thread.sleep(2500);

            ls.getTandc_page1().click();

            Thread.sleep(3000);

            ls.getTandcgotitbtn_page1().click();

            WebElement checkbox_page1 = ls.getCheckbox_page1();

            Thread.sleep(2000);

            lb.Click(checkbox_page1);

            Thread.sleep(2000);

            ls.getGetquotebtn_page1().click();

            log.info("******************** Get quote button clicked in 1st page ************************");

            Thread.sleep(2000);

            // ***********************************************************_Page
            // 2_******************************************************************

            ls.getOtp1_page2().sendKeys(OTP_1);

            Thread.sleep(2000);

            ls.getOtp2_page2().sendKeys(OTP_2);

            // System.out.println(OTP_2);

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

                Thread.sleep(1500);

                String s = select_previous_policy_type;

                System.out.println(s);

                if (s.equals("Own Damage")) {

                    Thread.sleep(2500);

                    WebElement datepicker_year_page_3_ii1 = ls.getDatepicker_year_page_3_ii();

                    WebElement datepicker_month_page_3_ii1 = ls.getDatepicker_month_page_3_ii();

                    ls.getOwndamage_radiobtn_page3().click();

                    log.info("******************** Own damage radio button clicked ************************");

                    Thread.sleep(3000);

                    WebElement owndamage_thirdparty_policy_startdate_page3 = ls
                            .getOwndamage_thirdparty_policy_startdate_page3();

                    owndamage_thirdparty_policy_startdate_page3.click();

                    Thread.sleep(2000);

                    owndamage_thirdparty_policy_startdate_page3.sendKeys(Third_Party_Policy_Start_Date);

                    Thread.sleep(1500);

                    owndamage_thirdparty_policy_startdate_page3.sendKeys(Keys.ENTER);

                    log.info("******************** Date picker passed in [OD] third party ************************");

                    Thread.sleep(3000);

                    WebElement owndamage_policy_startdate_page3 = ls.getOwndamage_policy_startdate_page3();

                    owndamage_policy_startdate_page3.click();

                    Thread.sleep(2000);

                    owndamage_policy_startdate_page3.sendKeys(Own_Damage_Policy_Start_Date);

                    Thread.sleep(1500);

                    owndamage_policy_startdate_page3.sendKeys(Keys.ENTER);
                    log.info(
                            "******************** Date picker passed in [OD] Own damage start date  ************************");

                    Thread.sleep(3000);

                    driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();

                    Thread.sleep(10000);

                    log.info("******************** Submit button clicked ************************");

                    WebElement ncbeditbtn_page4 = ls.getNcbeditbtn_page4();

                    ncbeditbtn_page4.click();

                    log.info("******************** NCB edit button clicked ************************");

                    Thread.sleep(2000);

                    ls.getClosebtn_ncb_poppup_page4().click();

                    Thread.sleep(2000);

                    log.info("******************** NCB close button clicked ************************");

                    ncbeditbtn_page4.click();

                    log.info("******************** NCB edit button clicked ************************");

                    Thread.sleep(2000);

                    WebElement togswitch_ownership_transfer_page4 = ls.getTogswitch_ownership_transfer_page4();

                    togswitch_ownership_transfer_page4.click();

                    log.info("******************** tog switch clicked ************************");

                    Thread.sleep(2000);

                    togswitch_ownership_transfer_page4.click();

                    log.info("******************** tog switch clicked ************************");

                    Thread.sleep(2000);

                    ls.getMake_claim_in_previous_policy_yesbtn_page4().click();

                    log.info(
                            "******************** claim in previous policy yes button clicked ************************");

                    Thread.sleep(2000);

                    ls.getMake_claim_in_previous_policy_nobtn_page4().click();

                    log.info(
                            "******************** claim in previous policy no button clicked ************************");

                    Thread.sleep(2000);

                    ls.getNcbbonus_50btn().click();

                    log.info("******************** NCB-50% clicked ************************");

                    Thread.sleep(2000);

                    ls.getNcbbonus_45btn().click();

                    log.info("******************** NCB-45% clicked ************************");

                    Thread.sleep(2000);

                    ls.getNcbbonus_35btn().click();

                    log.info("******************** NCB-35% clicked ************************");

                    Thread.sleep(2000);

                    ls.getNcbbonus_25btn().click();

                    log.info("******************** NCB-25% clicked ************************");

                    Thread.sleep(2000);

                    ls.getNcbbonus_20btn().click();

                    log.info("******************** NCB-20% clicked ************************");

                    Thread.sleep(2000);

                    ls.getNcbbonus_0btn().click();

                    log.info("******************** NCB-0% clicked ************************");

                    Thread.sleep(2000);

                    ls.getNcbbonus_45btn().click();

                    log.info("******************** NCB-45% clicked ************************");

                    Thread.sleep(2000);

                    ls.getConfirmandcontinuebtn_ncb_poppup_page4().click();

                    log.info("******************** Confirm & continue button clicked ************************");

                    Thread.sleep(6000);

                    ls.getHere_your_plan_info_page4().click();

                    log.info("******************** Here's your plan info button clicked ************************");

                    Thread.sleep(2000);

                    ls.getHere_your_plan_info_closebtn_page4().click();

                    log.info(
                            "******************** Here's your plan info close button clicked ************************");

                    Thread.sleep(2000);

                    ls.getExtra_protection_info_btn_page4().click();

                    log.info("******************** Extra_protection_info_button clicked ************************");

                    Thread.sleep(2000);

                    ls.getExtra_protection_popup_closebtn_page4().click();

                    log.info(
                            "******************** Extra_protection_popup_close_button clicked ************************");

                    Thread.sleep(2000);

                    ls.getElectrical_accs_radio_btn_page4().click();

                    Thread.sleep(2000);

                    log.info("******************** Electrical_accs_radio_button clicked ************************");

                    driver.findElement(
                                    By.xpath("(//button[@class='primary-btn modal-close-btn mx-auto mt-20 x-icon'])[2]"))
                            .click();

                    log.info(
                            "******************** Electrical_accs_radio_close_button_clicked ************************");

                    Thread.sleep(2000);

                    log.info("******************** Electrical_accs_radio_button clicked ************************");

                    ls.getElectrical_accs_radio_btn_page4().click();

                    Thread.sleep(2000);

                    WebElement electrical_accs_name_txtbox_page4_ii = ls.getElectrical_accs_name_txtbox_page4_ii();

                    electrical_accs_name_txtbox_page4_ii.sendKeys(Ea_Enter_accessories_name);

                    log.info("******************** Electrical_accs_values_passed************************");

                    Thread.sleep(2000);

                    WebElement electrical_accs_amount_textbox_page4_ii = ls
                            .getElectrical_accs_amount_textbox_page4_ii();

                    electrical_accs_amount_textbox_page4_ii.sendKeys(Ea_Enter_accessories_amount);

                    Thread.sleep(2000);

                    WebElement electrical_accs_submit_btn_page4_ii = ls.getElectrical_accs_submit_btn_page4_ii();

                    electrical_accs_submit_btn_page4_ii.click();

                    Thread.sleep(8000);

                    ls.getNon_electrical_accs_radio_btn_page4().click();

                    Thread.sleep(2000);

                    WebElement non_electrrical_accs_name_textbox_page4_ii = ls
                            .getNon_electrrical_accs_name_textbox_page4_ii();

                    non_electrrical_accs_name_textbox_page4_ii.sendKeys(NEa_Enter_accessories_name);

                    Thread.sleep(2000);

                    WebElement non_electrrical_accs_amount_textbox_page4_ii = ls
                            .getNon_electrrical_accs_amount_textbox_page4_ii();

                    non_electrrical_accs_amount_textbox_page4_ii.sendKeys(NEa_Enter_accessories_amount);

                    Thread.sleep(2000);

                    WebElement non_electrical_accs_submit_btn_page4_ii = ls
                            .getNon_electrical_accs_submit_btn_page4_ii();

                    non_electrical_accs_submit_btn_page4_ii.click();

                    Thread.sleep(8000);

                    ls.getLpg_Cng_accs_radio_btn_page4().click();

                    Thread.sleep(2000);

                    WebElement fuel_type_lpg_cng_drpdwn_page4_ii = ls.getFuel_type_lpg_cng_drpdwn_page4_ii();

                    fuel_type_lpg_cng_drpdwn_page4_ii.click();

                    Thread.sleep(2000);

                    fuel_type_lpg_cng_drpdwn_page4_ii.sendKeys(Keys.ARROW_DOWN);

                    Thread.sleep(2000);

                    fuel_type_lpg_cng_drpdwn_page4_ii.sendKeys(Keys.ENTER);

                    // lb.pindropselect();

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

                    js.executeScript("arguments[0].value='100000';", slider_page4);

                    Thread.sleep(2000);

                    ls.getAdd_extra_coverage_infobtn_page4().click();

                    Thread.sleep(2000);

                    ls.getAdd_extra_coverage_popup_closebtn_page4().click();

                    Thread.sleep(2000);

                    ls.getZerodep_btn_page4().click();

                    // ls.getRsa_btn_page4().click();

                    Thread.sleep(7000);

                    WebElement viewmore_covereage_btn_page4 = ls.getViewmore_covereage_btn_page4();

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

                    WebElement view_more_coverage_confirm_continue_btn_page_4_ii = ls
                            .getView_more_coverage_confirm_continue_btn_page_4_ii();

                    view_more_coverage_confirm_continue_btn_page_4_ii.click();

                    Thread.sleep(4000);

                    WebElement continue_btn_page4 = ls.getContinue_btn_page4();

                    lb.btnClick(continue_btn_page4);

                    Thread.sleep(4000);

                    WebElement addressline1_page5 = ls.getAddressline1_page5();

                    WebElement state_textbox = driver
                            .findElement(By.xpath("(//div[@class='form-b p-relative focused'])[19]"));

                    Thread.sleep(2000);

                    // boolean displayed = addressline1_page5.isDisplayed();

                    Thread.sleep(2000);

                    // String text = addressline1_page5.getText();

                    Thread.sleep(2000);

                    // System.out.println(text);

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

                        WebElement continue_btn_ownerinfo_page5 = ls.getContinue_btn_ownerinfo_page5();

                        lb.btnClick(continue_btn_ownerinfo_page5);

                        Thread.sleep(6000);

                        WebElement chasis = driver
                                .findElement(By.xpath("(//span[@class='previewveh_chasis_number'])[1]"));

                        if (chasis.isDisplayed() == false) {

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

                            for (int i = 0; i < 1; i++) {

                                hypothecation_loan_page5_ii.sendKeys(Keys.ARROW_DOWN);

                                Thread.sleep(2000);
                            }

                            hypothecation_loan_page5_ii.sendKeys(Keys.ENTER);

                            // lb.pindropselect();

                            Thread.sleep(2000);

                            driver.findElement(By.xpath("//label[@for='pi_hypo_LoanProvider']")).click();

                            WebElement loan_provider_page_5_ii = ls.getLoan_provider_page_5_ii();

                            Thread.sleep(1500);

                            loan_provider_page_5_ii.sendKeys(Loan_Provider);

                            Thread.sleep(1500);

                            loan_provider_page_5_ii.sendKeys(Keys.ARROW_DOWN);

                            Thread.sleep(1500);

                            loan_provider_page_5_ii.sendKeys(Keys.ENTER);

                            Thread.sleep(1500);

                            driver.findElement(By.xpath("//label[@for='pi_hypo_FinancierBank']")).click();

                            WebElement financier_name_page_5_ii = ls.getFinancier_name_page_5_ii();

                            Thread.sleep(1500);

                            financier_name_page_5_ii.sendKeys(Financier_Branch);

                            Thread.sleep(1500);

                            driver.findElement(By.xpath("(//label[@for='pp_Insurer'])[2]")).click();

                            Thread.sleep(1500);

                            WebElement Third_Party_Insurer2 = driver.findElement(By.id("insurers_tp"));

                            Third_Party_Insurer2.click();

                            Thread.sleep(2000);

                            Third_Party_Insurer2.sendKeys(Third_Party_Insurer);

                            Thread.sleep(2000);

                            Third_Party_Insurer2.sendKeys(Keys.ARROW_DOWN);

                            Thread.sleep(2000);

                            Third_Party_Insurer2.sendKeys(Keys.ENTER);

                            // lb.pindropselect();

                            Thread.sleep(2000);

                            driver.findElement(By.xpath("(//label[@for='pp_PolicyNumber_tp'])")).click();

                            Thread.sleep(1500);

                            WebElement Third_Party_Policy_Number1 = driver.findElement(By.id("pp_PolicyNumber_tp"));

                            Third_Party_Policy_Number1.sendKeys(Third_Party_Policy_Number);

                            Thread.sleep(2000);

                            driver.findElement(By.xpath("(//label[@for='insurers_od'])")).click();

                            Thread.sleep(1500);

                            WebElement Own_Damage_Insurer1 = driver.findElement(By.id("insurers_od"));

                            Own_Damage_Insurer1.sendKeys(Own_Damage_Insurer);

                            Thread.sleep(2000);

                            Own_Damage_Insurer1.sendKeys(Keys.ARROW_DOWN);

                            Thread.sleep(2000);

                            Own_Damage_Insurer1.sendKeys(Keys.ENTER);

                            // lb.pindropselect();

                            Thread.sleep(2000);

                            driver.findElement(By.xpath("(//label[@for='pp_PolicyNumber_od'])")).click();

                            Thread.sleep(1500);

                            WebElement Own_Damage_Policy_Number1 = driver.findElement(By.id("pp_PolicyNumber_od"));

                            Own_Damage_Policy_Number1.sendKeys(Own_Damage_Policy_Number);

                            Thread.sleep(2000);

                            driver.findElement(By.xpath("(//button[@class='align-item-center'])[2]")).click();

                            Thread.sleep(8000);

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

                            driver.findElement(By.xpath(
                                            "(//span[@class='innerpanel-text innerpanel-bg border right-arrow paymentOption'])[3]"))
                                    .click();

                            Thread.sleep(2000);

                            WebElement findElement2 = driver.findElement(By.id("netBankingBank"));

                            findElement2.click();

                            Thread.sleep(2000);

                            findElement2.sendKeys(Keys.ARROW_DOWN);

                            Thread.sleep(2000);

                            findElement2.sendKeys(Keys.ENTER);

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

                            Thread.sleep(2000);

                            WebElement toggleswitch_page5_ii = ls.getToggleswitch_page5_ii();

                            lb.btnClick(toggleswitch_page5_ii);

                            Thread.sleep(2000);

                            WebElement hypothecation_loan_page5_ii = ls.getHypothecation_loan_page5_ii();

                            hypothecation_loan_page5_ii.click();

                            Thread.sleep(2000);

                            for (int i = 0; i < 3; i++) {

                                hypothecation_loan_page5_ii.sendKeys(Keys.ARROW_DOWN);

                                Thread.sleep(2000);
                            }

                            hypothecation_loan_page5_ii.sendKeys(Keys.ENTER);

                            // lb.pindropselect();

                            Thread.sleep(2000);


                            driver.findElement(By.xpath("//label[@for='pi_hypo_LoanProvider']")).click();

                            WebElement loan_provider_page_5_ii = ls.getLoan_provider_page_5_ii();

                            Thread.sleep(1500);

                            loan_provider_page_5_ii.sendKeys(Loan_Provider);

                            Thread.sleep(1500);

                            loan_provider_page_5_ii.sendKeys(Keys.ARROW_DOWN);

                            Thread.sleep(1500);

                            loan_provider_page_5_ii.sendKeys(Keys.ENTER);

                            Thread.sleep(1500);

                            driver.findElement(By.xpath("//label[@for='pi_hypo_FinancierBank']")).click();

                            WebElement financier_name_page_5_ii = ls.getFinancier_name_page_5_ii();

                            Thread.sleep(1500);

                            financier_name_page_5_ii.sendKeys(Financier_Branch);

                            Thread.sleep(1500);

                            driver.findElement(By.xpath("(//label[@for='pp_Insurer'])[2]")).click();

                            WebElement Third_Party_Insurer2 = driver.findElement(By.id("insurers_tp"));

                            Thread.sleep(2000);

                            Third_Party_Insurer2.sendKeys(Third_Party_Insurer);

                            Thread.sleep(2000);

                            Third_Party_Insurer2.sendKeys(Keys.ARROW_DOWN);

                            Thread.sleep(2000);

                            Third_Party_Insurer2.sendKeys(Keys.ENTER);

                            // lb.pindropselect();

                            Thread.sleep(2000);

                            driver.findElement(By.xpath("(//label[@for='pp_PolicyNumber_tp'])")).click();

                            WebElement Third_Party_Policy_Number1 = driver.findElement(By.id("pp_PolicyNumber_tp"));

                            Thread.sleep(2000);

                            Third_Party_Policy_Number1.sendKeys(Third_Party_Policy_Number);

                            Thread.sleep(2000);

                            driver.findElement(By.xpath("(//label[@for='insurers_od'])")).click();

                            Thread.sleep(2000);

                            WebElement Own_Damage_Insurer1 = driver.findElement(By.id("insurers_od"));

                            Own_Damage_Insurer1.sendKeys(Own_Damage_Insurer);

                            Thread.sleep(2000);

                            Own_Damage_Insurer1.sendKeys(Keys.ARROW_DOWN);

                            Thread.sleep(2000);

                            Own_Damage_Insurer1.sendKeys(Keys.ENTER);

                            // lb.pindropselect();

                            Thread.sleep(2000);

                            driver.findElement(By.xpath("(//label[@for='pp_PolicyNumber_od'])")).click();

                            WebElement Own_Damage_Policy_Number1 = driver.findElement(By.id("pp_PolicyNumber_od"));

                            Thread.sleep(2000);

                            Own_Damage_Policy_Number1.sendKeys(Own_Damage_Policy_Number);

                            Thread.sleep(2000);

                            driver.findElement(By.xpath("(//button[@class='align-item-center'])[2]")).click();

                            Thread.sleep(8000);

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

                            driver.findElement(By.xpath(
                                            "(//span[@class='innerpanel-text innerpanel-bg border right-arrow paymentOption'])[3]"))
                                    .click();

                            Thread.sleep(2000);

                            WebElement findElement2 = driver.findElement(By.id("netBankingBank"));

                            findElement2.click();

                            Thread.sleep(2000);

                            findElement2.sendKeys(Keys.ARROW_DOWN);

                            Thread.sleep(2000);

                            findElement2.sendKeys(Keys.ENTER);

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

                    } else {

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

                        WebElement continue_btn_ownerinfo_page5 = ls.getContinue_btn_ownerinfo_page5();

                        lb.btnClick(continue_btn_ownerinfo_page5);

                        Thread.sleep(7000);

                        String text2 = driver.findElement(By.xpath("//span[@class='previewveh_chasis_number']")).getText();

                        Thread.sleep(2000);

                        if (text2.isEmpty()) {

                            Thread.sleep(2000);

                            ls.getChassisno_edit_btn_page5_ii().click();

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

                            for (int i = 0; i < 3; i++) {

                                hypothecation_loan_page5_ii.sendKeys(Keys.ARROW_DOWN);

                                Thread.sleep(2000);
                            }

                            hypothecation_loan_page5_ii.sendKeys(Keys.ENTER);

                            // lb.pindropselect4();

                            Thread.sleep(2000);

                            driver.findElement(By.xpath("//label[@for='pi_hypo_LoanProvider']")).click();

                            WebElement loan_provider_page_5_ii = ls.getLoan_provider_page_5_ii();

                            Thread.sleep(1500);

                            loan_provider_page_5_ii.sendKeys(Loan_Provider);

                            Thread.sleep(1500);

                            loan_provider_page_5_ii.sendKeys(Keys.ARROW_DOWN);

                            Thread.sleep(1500);

                            loan_provider_page_5_ii.sendKeys(Keys.ENTER);

                            Thread.sleep(1500);

                            driver.findElement(By.xpath("//label[@for='pi_hypo_FinancierBank']")).click();

                            WebElement financier_name_page_5_ii = ls.getFinancier_name_page_5_ii();

                            Thread.sleep(1500);

                            financier_name_page_5_ii.sendKeys(Financier_Branch);

                            Thread.sleep(1500);

                            driver.findElement(By.xpath("(//label[@for='pp_Insurer'])[2]")).click();

                            Thread.sleep(1500);

                            WebElement Third_Party_Insurer1 = driver.findElement(By.id("insurers_tp"));

                            Third_Party_Insurer1.sendKeys(Third_Party_Insurer);

                            Thread.sleep(2000);

                            Third_Party_Insurer1.sendKeys(Keys.ARROW_DOWN);

                            Thread.sleep(2000);

                            Third_Party_Insurer1.sendKeys(Keys.ENTER);

                            // lb.pindropselect();

                            Thread.sleep(2000);

                            driver.findElement(By.xpath("(//label[@for='pp_PolicyNumber_tp'])")).click();

                            WebElement Third_Party_Policy_Number1 = driver.findElement(By.id("pp_PolicyNumber_tp"));

                            Thread.sleep(2000);

                            Third_Party_Policy_Number1.sendKeys(Third_Party_Policy_Number);

                            Thread.sleep(2000);

                            driver.findElement(By.xpath("(//label[@for='insurers_od'])")).click();

                            WebElement Own_Damage_Insurer1 = driver.findElement(By.id("insurers_od"));

                            Thread.sleep(2000);

                            Own_Damage_Insurer1.sendKeys(Own_Damage_Insurer);

                            Thread.sleep(2000);

                            Own_Damage_Insurer1.sendKeys(Keys.ARROW_DOWN);

                            Thread.sleep(2000);

                            Own_Damage_Insurer1.sendKeys(Keys.ENTER);

                            // lb.pindropselect();

                            Thread.sleep(2000);

                            driver.findElement(By.xpath("(//label[@for='pp_PolicyNumber_od'])")).click();

                            WebElement Own_Damage_Policy_Number1 = driver.findElement(By.id("pp_PolicyNumber_od"));

                            Thread.sleep(2000);

                            Own_Damage_Policy_Number1.sendKeys(Own_Damage_Policy_Number);

                            Thread.sleep(2000);

                            driver.findElement(By.xpath("(//button[@class='align-item-center'])[2]")).click();

                            Thread.sleep(8000);

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

                            driver.findElement(By.xpath(
                                            "(//span[@class='innerpanel-text innerpanel-bg border right-arrow paymentOption'])[3]"))
                                    .click();

                            Thread.sleep(2000);

                            WebElement findElement2 = driver.findElement(By.id("netBankingBank"));

                            findElement2.click();

                            Thread.sleep(2000);

                            findElement2.sendKeys(Keys.ARROW_DOWN);

                            Thread.sleep(2000);

                            findElement2.sendKeys(Keys.ENTER);

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

            // _________________________________________I-Know-Reg-Flow[Without Zoopdata]________________________________________________

            else {

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

                // lb.pindropselect();

                Thread.sleep(3000);

                WebElement variant_drpdwn_page3_ii = ls.getVariant_drpdwn_page3_ii();

                Thread.sleep(3000);

                driver.findElement(By.xpath("//label[@for='c_vd_Variant']")).click();

                Thread.sleep(3000);

                variant_drpdwn_page3_ii.sendKeys(Variant);

                Thread.sleep(2000);

                variant_drpdwn_page3_ii.sendKeys(Keys.ARROW_DOWN);

                Thread.sleep(2000);

                variant_drpdwn_page3_ii.sendKeys(Keys.ENTER);

                // lb.pindropselect();

                Thread.sleep(3500);

                WebElement reg_date_drpdwn_page3_ii = ls.getReg_date_drpdwn_page3_ii();

                reg_date_drpdwn_page3_ii.click();

                Thread.sleep(3000);

                WebElement findElement2 = driver.findElement(By.id("c_vd_RegistrationDate"));

                findElement2.click();

                Thread.sleep(2000);
                //
                findElement2.clear();

                Thread.sleep(2000);

                findElement2.sendKeys(Registration_date);

                // WebElement datepicker_year_page_3_ii = ls.getDatepicker_year_page_3_ii();
                //
                // lb.selectOptionByText(datepicker_year_page_3_ii, "2015");
                //
                // Thread.sleep(3000);
                //
                // WebElement datepicker_month_page_3_ii = ls.getDatepicker_month_page_3_ii();
                //
                // lb.selectOptionByText(datepicker_month_page_3_ii, "Jun");
                //
                // Thread.sleep(3000);
                //
                // ls.getDatepicker_date_page_3_ii().click();

                // up2 this----------------------------->

                Thread.sleep(3000);

                driver.findElement(By.xpath("//section[@class='body-wrapper']")).click();

                Thread.sleep(2000);

                WebElement city_of_reg_page3_ii = ls.getCity_of_reg_page3_ii();

                Thread.sleep(2000);

                driver.findElement(By.xpath("//label[@for='c_vd_CityOfRegistration']")).click();

                Thread.sleep(2000);

                city_of_reg_page3_ii.sendKeys(city_of_registration);

                Thread.sleep(1500);

                city_of_reg_page3_ii.sendKeys(Keys.ARROW_DOWN);

                Thread.sleep(1500);

                city_of_reg_page3_ii.sendKeys(Keys.ENTER);

                // lb.pindropselect();

                WebElement individual_radio_btn_page3_ii = ls.getIndividual_radio_btn_page3_ii();

                Thread.sleep(3500);

                WebElement comapny_btn_page3_ii = ls.getComapny_btn_page3_ii();

                String text = ls.getCompany_text_page3().getText();

                System.out.println(Select_registration);

                if (Select_registration.contentEquals("Individual")) {

                    lb.btnClick(individual_radio_btn_page3_ii);

                } else if (Select_registration.contentEquals("Company")) {

                    lb.btnClick(comapny_btn_page3_ii);

                    WebElement company_name_gst = driver.findElement(By.id("c_vd_companyName"));

                    WebElement Gst_no = driver.findElement(By.id("c_vd_GSTNumber"));

                    company_name_gst.sendKeys(Enter_company_name);

                    Thread.sleep(2000);

                    Gst_no.sendKeys(Enter_GST_number);

                }

                String s1 = select_previous_policy_type;

                System.out.println(s1);

                if (s1.equals("Own Damage")) {

                    Thread.sleep(2500);

                    WebElement datepicker_year_page_3_ii1 = ls.getDatepicker_year_page_3_ii();

                    WebElement datepicker_month_page_3_ii1 = ls.getDatepicker_month_page_3_ii();

                    ls.getOwndamage_radiobtn_page3().click();

                    log.info("******************** Own damage radio button clicked ************************");

                    Thread.sleep(3000);

                    driver.findElement(By.xpath("//label[@for='c_vd_od_tpPolicyStartDate']")).click();

                    WebElement owndamage_thirdparty_policy_startdate_page3 = ls.getOwndamage_thirdparty_policy_startdate_page3();

                    // owndamage_thirdparty_policy_startdate_page3.click();

                    Thread.sleep(2000);

                    owndamage_thirdparty_policy_startdate_page3.sendKeys(Third_Party_Policy_Start_Date);

                    Thread.sleep(1500);

                    owndamage_thirdparty_policy_startdate_page3.sendKeys(Keys.ENTER);

                    log.info("******************** Date picker passed in [OD] third party ************************");

                    Thread.sleep(3000);

                    WebElement findElement = driver
                            .findElement(By.xpath("//label[@for='c_vd_od_ownDamagPolicyStartDate']"));

                    findElement.click();

                    Thread.sleep(2000);

                    WebElement owndamage_policy_startdate_page3 = ls.getOwndamage_policy_startdate_page3();

                    owndamage_policy_startdate_page3.sendKeys(Third_Party_Policy_Start_Date);

                    Thread.sleep(1500);

                    owndamage_policy_startdate_page3.sendKeys(Keys.ENTER);

                    log.info(
                            "******************** Date picker passed in [OD] Own damage start date  ************************");

                    Thread.sleep(3000);

                    driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();

                    Thread.sleep(12000);

                    driver.navigate().refresh();

                    Thread.sleep(8000);

                    log.info("******************** Submit button clicked ************************");

                    WebElement ncbeditbtn_page4 = ls.getNcbeditbtn_page4();

                    if (ncbeditbtn_page4.isDisplayed()) {

                        ncbeditbtn_page4.click();

                        log.info("******************** NCB edit button clicked ************************");

                        Thread.sleep(2000);

                        ls.getClosebtn_ncb_poppup_page4().click();

                        Thread.sleep(2000);

                        log.info("******************** NCB close button clicked ************************");

                        ncbeditbtn_page4.click();

                        log.info("******************** NCB edit button clicked ************************");

                        Thread.sleep(2000);

                        WebElement togswitch_ownership_transfer_page4 = ls.getTogswitch_ownership_transfer_page4();

                        togswitch_ownership_transfer_page4.click();

                        log.info("******************** tog switch clicked ************************");

                        Thread.sleep(2000);

                        togswitch_ownership_transfer_page4.click();

                        log.info("******************** tog switch clicked ************************");

                        Thread.sleep(2000);

                        ls.getMake_claim_in_previous_policy_yesbtn_page4().click();

                        log.info(
                                "******************** claim in previous policy yes button clicked ************************");

                        Thread.sleep(2000);

                        ls.getMake_claim_in_previous_policy_nobtn_page4().click();

                        log.info(
                                "******************** claim in previous policy no button clicked ************************");

                        Thread.sleep(2000);

                        ls.getNcbbonus_50btn().click();

                        log.info("******************** NCB-50% clicked ************************");

                        Thread.sleep(2000);

                        ls.getNcbbonus_45btn().click();

                        log.info("******************** NCB-45% clicked ************************");

                        Thread.sleep(2000);

                        ls.getNcbbonus_35btn().click();

                        log.info("******************** NCB-35% clicked ************************");

                        Thread.sleep(2000);

                        ls.getNcbbonus_25btn().click();

                        log.info("******************** NCB-25% clicked ************************");

                        Thread.sleep(2000);

                        ls.getNcbbonus_20btn().click();

                        log.info("******************** NCB-20% clicked ************************");

                        Thread.sleep(2000);

                        ls.getNcbbonus_0btn().click();

                        log.info("******************** NCB-0% clicked ************************");

//                        Thread.sleep(2000);
//
//                        ls.getNcbbonus_45btn().click();

                        log.info("******************** NCB-45% clicked ************************");

                        Thread.sleep(2000);

                        ls.getConfirmandcontinuebtn_ncb_poppup_page4().click();

                        log.info("******************** Confirm & continue button clicked ************************");

                        Thread.sleep(9000);

                        ls.getHere_your_plan_info_page4().click();

                        log.info("******************** Here's your plan info button clicked ************************");

                        Thread.sleep(2000);

                        ls.getHere_your_plan_info_closebtn_page4().click();

                        log.info(
                                "******************** Here's your plan info close button clicked ************************");

                        Thread.sleep(2000);

                        ls.getExtra_protection_info_btn_page4().click();

                        log.info("******************** Extra_protection_info_button clicked ************************");

                        Thread.sleep(2000);

                        ls.getExtra_protection_popup_closebtn_page4().click();

                        log.info(
                                "******************** Extra_protection_popup_close_button clicked ************************");

                        Thread.sleep(2000);

                        ls.getElectrical_accs_radio_btn_page4().click();

                        Thread.sleep(2000);

                        log.info("******************** Electrical_accs_radio_button clicked ************************");

                        driver.findElement(
                                        By.xpath("(//button[@class='primary-btn modal-close-btn mx-auto mt-20 x-icon'])[2]"))
                                .click();

                        log.info(
                                "******************** Electrical_accs_radio_close_button_clicked ************************");

                        Thread.sleep(2000);

                        log.info("******************** Electrical_accs_radio_button clicked ************************");

                        ls.getElectrical_accs_radio_btn_page4().click();

                        Thread.sleep(2000);

                        WebElement electrical_accs_name_txtbox_page4_ii = ls.getElectrical_accs_name_txtbox_page4_ii();

                        electrical_accs_name_txtbox_page4_ii.sendKeys(Ea_Enter_accessories_name);

                        log.info("******************** Electrical_accs_values_passed************************");

                        Thread.sleep(2000);

                        WebElement electrical_accs_amount_textbox_page4_ii = ls
                                .getElectrical_accs_amount_textbox_page4_ii();

                        electrical_accs_amount_textbox_page4_ii.sendKeys(Ea_Enter_accessories_amount);

                        Thread.sleep(2000);

                        WebElement electrical_accs_submit_btn_page4_ii = ls.getElectrical_accs_submit_btn_page4_ii();

                        electrical_accs_submit_btn_page4_ii.click();

                        Thread.sleep(10000);

                        ls.getNon_electrical_accs_radio_btn_page4().click();

                        Thread.sleep(2000);

                        WebElement non_electrrical_accs_name_textbox_page4_ii = ls
                                .getNon_electrrical_accs_name_textbox_page4_ii();

                        non_electrrical_accs_name_textbox_page4_ii.sendKeys(NEa_Enter_accessories_name);

                        Thread.sleep(2000);

                        WebElement non_electrrical_accs_amount_textbox_page4_ii = ls
                                .getNon_electrrical_accs_amount_textbox_page4_ii();

                        non_electrrical_accs_amount_textbox_page4_ii.sendKeys(NEa_Enter_accessories_amount);

                        Thread.sleep(2000);

                        WebElement non_electrical_accs_submit_btn_page4_ii = ls
                                .getNon_electrical_accs_submit_btn_page4_ii();

                        non_electrical_accs_submit_btn_page4_ii.click();

                        Thread.sleep(10000);

                        ls.getLpg_Cng_accs_radio_btn_page4().click();

                        Thread.sleep(2000);

                        WebElement fuel_type_lpg_cng_drpdwn_page4_ii = ls.getFuel_type_lpg_cng_drpdwn_page4_ii();

                        fuel_type_lpg_cng_drpdwn_page4_ii.click();

                        Thread.sleep(2000);

                        fuel_type_lpg_cng_drpdwn_page4_ii.sendKeys(Keys.ARROW_DOWN);

                        Thread.sleep(2000);

                        fuel_type_lpg_cng_drpdwn_page4_ii.sendKeys(Keys.ENTER);

                        // lb.pindropselect();

                        Thread.sleep(4000);

                        WebElement enter_amount_lpg_cng_page4_ii = ls.getEnter_amount_lpg_cng_page4_ii();

                        enter_amount_lpg_cng_page4_ii.sendKeys(Enter_amount);

                        Thread.sleep(2000);

                        WebElement lpg_cng_submit_btn_page4_ii = ls.getLpg_cng_submit_btn_page4_ii();

                        lb.btnClick(lpg_cng_submit_btn_page4_ii);

                        Thread.sleep(14000);

                        ls.getInsured_value_infobtn_page4().click();

                        Thread.sleep(2000);

//                        WebElement idvpopup_closebtn_page4 = ls.getIdvpopup_closebtn_page4();
//
//                        lb.btnClick(idvpopup_closebtn_page4);

                        driver.findElement(By.xpath("(//button[@class='primary-btn modal-close-btn mx-auto mt-20 x-icon'])[14]")).click();

                        Thread.sleep(2000);

                        WebElement slider_page4 = ls.getSlider_page4();

                        JavascriptExecutor js = (JavascriptExecutor) driver;

                        js.executeScript("arguments[0].value='100000';", slider_page4);

                        Thread.sleep(2000);

                        ls.getAdd_extra_coverage_infobtn_page4().click();

                        Thread.sleep(2000);

                        ls.getAdd_extra_coverage_popup_closebtn_page4().click();

                        Thread.sleep(2000);

//                        ls.getZerodep_btn_page4().click();

                        // ls.getRsa_btn_page4().click();

                        Thread.sleep(7000);

                        WebElement viewmore_covereage_btn_page4 = ls.getViewmore_covereage_btn_page4();

                        lb.scrollDown(viewmore_covereage_btn_page4);

                        Thread.sleep(2000);

                        viewmore_covereage_btn_page4.click();

                        Thread.sleep(2000);

//                        ls.getAdd_btn_1_ciew_more_coverage_popup_page4_ii().click();
//
//                        Thread.sleep(2000);

                        ls.getAdd_btn_2_ciew_more_coverage_popup_page4_ii().click();

                        Thread.sleep(10000);

                        ls.getAdd_btn_3_ciew_more_coverage_popup_page4_ii().click();

                        Thread.sleep(10000);

//                        ls.getAdd_btn_4_ciew_more_coverage_popup_page4_ii().click();
//
//                        Thread.sleep(2000);

                        ls.getAdd_btn_5_ciew_more_coverage_popup_page4_ii().click();

                        Thread.sleep(10000);

                        WebElement view_more_coverage_confirm_continue_btn_page_4_ii = ls
                                .getView_more_coverage_confirm_continue_btn_page_4_ii();

                        view_more_coverage_confirm_continue_btn_page_4_ii.click();

                        Thread.sleep(8000);

                        WebElement continue_btn_page4 = ls.getContinue_btn_page4();

                        lb.btnClick(continue_btn_page4);

                        Thread.sleep(10000);

                        WebElement addressline1_page5 = ls.getAddressline1_page5();

                        WebElement state_textbox = driver
                                .findElement(By.xpath("(//div[@class='form-b p-relative focused'])[19]"));

                        Thread.sleep(2000);

                        // boolean displayed = addressline1_page5.isDisplayed();

                        // String text1 = addressline1_page5.getText();

                        // System.out.println(text1);

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

                            WebElement continue_btn_ownerinfo_page5 = ls.getContinue_btn_ownerinfo_page5();

                            lb.btnClick(continue_btn_ownerinfo_page5);

                            Thread.sleep(6000);

                            WebElement chasis = driver
                                    .findElement(By.xpath("(//span[@class='previewveh_chasis_number'])[1]"));

                            if (chasis.isDisplayed() == false) {

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

                                for (int i = 0; i < 1; i++) {

                                    hypothecation_loan_page5_ii.sendKeys(Keys.ARROW_DOWN);

                                    Thread.sleep(2000);
                                }

                                hypothecation_loan_page5_ii.sendKeys(Keys.ENTER);

                                // lb.pindropselect();

                                Thread.sleep(2000);


                                driver.findElement(By.xpath("//label[@for='pi_hypo_LoanProvider']")).click();

                                WebElement loan_provider_page_5_ii = ls.getLoan_provider_page_5_ii();

                                Thread.sleep(1500);

                                loan_provider_page_5_ii.sendKeys(Loan_Provider);

                                Thread.sleep(1500);

                                loan_provider_page_5_ii.sendKeys(Keys.ARROW_DOWN);

                                Thread.sleep(1500);

                                loan_provider_page_5_ii.sendKeys(Keys.ENTER);

                                Thread.sleep(1500);

                                driver.findElement(By.xpath("//label[@for='pi_hypo_FinancierBank']")).click();

                                WebElement financier_name_page_5_ii = ls.getFinancier_name_page_5_ii();

                                Thread.sleep(1500);

                                financier_name_page_5_ii.sendKeys(Financier_Branch);

                                Thread.sleep(1500);

                                driver.findElement(By.xpath("(//label[@for='pp_Insurer'])[2]")).click();

                                WebElement Third_Party_Insurer2 = driver.findElement(By.id("insurers_tp"));

                                Thread.sleep(2000);

                                Third_Party_Insurer2.sendKeys(Third_Party_Insurer);

                                Thread.sleep(2000);

                                Third_Party_Insurer2.sendKeys(Keys.ARROW_DOWN);

                                Thread.sleep(2000);

                                Third_Party_Insurer2.sendKeys(Keys.ENTER);

                                // lb.pindropselect();

                                Thread.sleep(2000);

                                driver.findElement(By.xpath("(//label[@for='pp_PolicyNumber_tp'])")).click();

                                WebElement Third_Party_Policy_Number1 = driver.findElement(By.id("pp_PolicyNumber_tp"));

                                Thread.sleep(2000);

                                Third_Party_Policy_Number1.sendKeys(Third_Party_Policy_Number);

                                Thread.sleep(2000);

                                driver.findElement(By.xpath("(//label[@for='insurers_od'])")).click();

                                WebElement Own_Damage_Insurer1 = driver.findElement(By.id("insurers_od"));

                                Thread.sleep(2000);

                                Own_Damage_Insurer1.sendKeys(Own_Damage_Insurer);

                                Thread.sleep(2000);

                                Own_Damage_Insurer1.sendKeys(Keys.ARROW_DOWN);

                                Thread.sleep(2000);

                                Own_Damage_Insurer1.sendKeys(Keys.ENTER);

                                // lb.pindropselect();

                                Thread.sleep(2000);

                                driver.findElement(By.xpath("(//label[@for='pp_PolicyNumber_od'])")).click();

                                WebElement Own_Damage_Policy_Number1 = driver.findElement(By.id("pp_PolicyNumber_od"));

                                Thread.sleep(2000);

                                Own_Damage_Policy_Number1.sendKeys(Own_Damage_Policy_Number);

                                Thread.sleep(2000);

                                driver.findElement(By.xpath("(//button[@class='align-item-center'])[2]")).click();

                                Thread.sleep(8000);

                                WebElement paynow_btn_page5_ii = ls.getPaynow_btn_page5_ii();

                                lb.Click(paynow_btn_page5_ii);

                                Thread.sleep(2000);

                                WebElement policy_breakup = driver
                                        .findElement(By.xpath("//a[@id='viewPolicy_breakup']"));

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

                                driver.findElement(By.xpath(
                                                "(//span[@class='innerpanel-text innerpanel-bg border right-arrow paymentOption'])[3]"))
                                        .click();

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

                                Thread.sleep(2000);

                                WebElement toggleswitch_page5_ii = ls.getToggleswitch_page5_ii();

                                lb.btnClick(toggleswitch_page5_ii);

                                Thread.sleep(2000);

                                WebElement hypothecation_loan_page5_ii = ls.getHypothecation_loan_page5_ii();

                                hypothecation_loan_page5_ii.click();

                                Thread.sleep(2000);

                                for (int i = 0; i < 3; i++) {

                                    hypothecation_loan_page5_ii.sendKeys(Keys.ARROW_DOWN);

                                    Thread.sleep(2000);
                                }

                                hypothecation_loan_page5_ii.sendKeys(Keys.ENTER);

                                // lb.pindropselect();

                                Thread.sleep(2000);

                                driver.findElement(By.xpath("//label[@for='pi_hypo_LoanProvider']")).click();

                                WebElement loan_provider_page_5_ii = ls.getLoan_provider_page_5_ii();

                                Thread.sleep(1500);

                                loan_provider_page_5_ii.sendKeys(Loan_Provider);

                                Thread.sleep(1500);

                                loan_provider_page_5_ii.sendKeys(Keys.ARROW_DOWN);

                                Thread.sleep(1500);

                                loan_provider_page_5_ii.sendKeys(Keys.ENTER);

                                Thread.sleep(1500);

                                driver.findElement(By.xpath("//label[@for='pi_hypo_FinancierBank']")).click();

                                WebElement financier_name_page_5_ii = ls.getFinancier_name_page_5_ii();

                                Thread.sleep(1500);

                                financier_name_page_5_ii.sendKeys(Financier_Branch);

                                Thread.sleep(1500);

                                driver.findElement(By.xpath("(//label[@for='pp_Insurer'])[2]")).click();

                                WebElement Third_Party_Insurer2 = driver.findElement(By.id("insurers_tp"));

                                Thread.sleep(2000);

                                Third_Party_Insurer2.sendKeys(Third_Party_Insurer);

                                Thread.sleep(2000);

                                Third_Party_Insurer2.sendKeys(Keys.ARROW_DOWN);

                                Thread.sleep(2000);

                                Third_Party_Insurer2.sendKeys(Keys.ENTER);

                                // lb.pindropselect();

                                Thread.sleep(2000);

                                driver.findElement(By.xpath("(//label[@for='pp_PolicyNumber_tp'])")).click();

                                WebElement Third_Party_Policy_Number1 = driver.findElement(By.id("pp_PolicyNumber_tp"));

                                Thread.sleep(2000);

                                Third_Party_Policy_Number1.sendKeys(Third_Party_Policy_Number);

                                Thread.sleep(2000);

                                driver.findElement(By.xpath("(//label[@for='insurers_od'])")).click();

                                WebElement Own_Damage_Insurer1 = driver.findElement(By.id("insurers_od"));

                                Thread.sleep(2000);

                                Own_Damage_Insurer1.sendKeys(Own_Damage_Insurer);

                                Thread.sleep(2000);

                                Own_Damage_Insurer1.sendKeys(Keys.ARROW_DOWN);

                                Thread.sleep(2000);

                                Own_Damage_Insurer1.sendKeys(Keys.ENTER);

                                // lb.pindropselect();

                                Thread.sleep(2000);

                                driver.findElement(By.xpath("(//label[@for='pp_PolicyNumber_od'])")).click();

                                WebElement Own_Damage_Policy_Number1 = driver.findElement(By.id("pp_PolicyNumber_od"));

                                Thread.sleep(2000);

                                Own_Damage_Policy_Number1.sendKeys(Own_Damage_Policy_Number);

                                Thread.sleep(2000);

                                driver.findElement(By.xpath("(//button[@class='align-item-center'])[2]")).click();

                                Thread.sleep(8000);

                                WebElement paynow_btn_page5_ii = ls.getPaynow_btn_page5_ii();

                                Thread.sleep(2000);

                                lb.Click(paynow_btn_page5_ii);

                                Thread.sleep(3000);

                                WebElement policy_breakup = driver
                                        .findElement(By.xpath("//a[@id='viewPolicy_breakup']"));

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

                                driver.findElement(By.xpath(
                                                "(//span[@class='innerpanel-text innerpanel-bg border right-arrow paymentOption'])[3]"))
                                        .click();

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

                            WebElement continue_btn_ownerinfo_page5 = ls.getContinue_btn_ownerinfo_page5();

                            lb.btnClick(continue_btn_ownerinfo_page5);

                            Thread.sleep(7000);

//                            String text2 = driver.findElement(By.xpath("//span[@class='previewveh_chasis_number']"))
//                                    .getText();
//
//                            Thread.sleep(2000);
//
//                            if (text2.isEmpty()) {

                            WebElement Chassis_click = driver.findElement(By.xpath("//label[@for='new_chassisNumber']"));

                            Chassis_click.click();

                            Thread.sleep(2000);

                            WebElement Engine_no = driver.findElement(By.xpath("//label[@for='new_enginNumber']"));


                            WebElement new_chassisNumber = driver.findElement(By.id("new_chassisNumber"));


                            Thread.sleep(2000);

                            new_chassisNumber.sendKeys(Chassis_Number);

                            Thread.sleep(2000);

                            WebElement new_enginNumber = driver.findElement(By.id("new_enginNumber"));

                            Engine_no.click();

                            Thread.sleep(2000);

                            new_enginNumber.sendKeys(Engine_Number);

                            Thread.sleep(2000);

                            WebElement Scroll_element = driver.findElement(By.xpath("(//button[@class='align-item-center'])[2]"));

                            lb.scrollDown(Scroll_element);

                            WebElement toggleswitch_page5_ii = ls.getToggleswitch_page5_ii();

                            lb.btnClick(toggleswitch_page5_ii);

                            Thread.sleep(2000);

                            WebElement hypothecation_loan_page5_ii = ls.getHypothecation_loan_page5_ii();

                            hypothecation_loan_page5_ii.click();

                            Thread.sleep(2000);

                            for (int i = 0; i < 3; i++) {

                                hypothecation_loan_page5_ii.sendKeys(Keys.ARROW_DOWN);

                                Thread.sleep(2000);
                            }

                            hypothecation_loan_page5_ii.sendKeys(Keys.ENTER);

                            // lb.pindropselect4();

                            Thread.sleep(2000);

                            driver.findElement(By.xpath("//label[@for='pi_hypo_LoanProvider']")).click();

                            WebElement loan_provider_page_5_ii = ls.getLoan_provider_page_5_ii();

                            Thread.sleep(1500);

                            loan_provider_page_5_ii.sendKeys(Loan_Provider);

                            Thread.sleep(1500);

                            loan_provider_page_5_ii.sendKeys(Keys.ARROW_DOWN);

                            Thread.sleep(1500);

                            loan_provider_page_5_ii.sendKeys(Keys.ENTER);

                            Thread.sleep(1500);

                            driver.findElement(By.xpath("//label[@for='pi_hypo_FinancierBank']")).click();

                            WebElement financier_name_page_5_ii = ls.getFinancier_name_page_5_ii();

                            Thread.sleep(1500);

                            financier_name_page_5_ii.sendKeys(Financier_Branch);

                            Thread.sleep(1500);

                            WebElement Third_Party_Insurer1 = driver.findElement(By.id("insurers_tp"));

                            Thread.sleep(1500);

//                            driver.findElement(By.xpath("(//label[@for='pp_Insurer'])[2]")).click();

                            driver.findElement(By.xpath("(//label[@for='pp_Insurer'])[2]")).click();

                            Thread.sleep(3000);

                            Robot rt =new Robot();

                            Third_Party_Insurer1.sendKeys(Loan_Provider);

                            Thread.sleep(2000);

//                            rt.keyPress(KeyEvent.VK_DOWN);
//                            rt.keyRelease(KeyEvent.VK_DOWN);
//                            Thread.sleep(2000);
//                            rt.keyPress(KeyEvent.VK_ENTER);
//                            rt.keyRelease(KeyEvent.VK_ENTER);

                            Third_Party_Insurer1.sendKeys(Keys.ARROW_DOWN);

                            Thread.sleep(2000);

                            Third_Party_Insurer1.sendKeys(Keys.ENTER);

                            Thread.sleep(2000);

                            String text1 = Third_Party_Insurer1.getText();

                            System.out.println(text1+"No_data");

//                             lb.pindropselect();

//                            Thread.sleep(2000);

                            driver.findElement(By.xpath("(//label[@for='pp_PolicyNumber_tp'])")).click();

                            WebElement Third_Party_Policy_Number1 = driver.findElement(By.id("pp_PolicyNumber_tp"));

                            Thread.sleep(2000);

                            Third_Party_Policy_Number1.sendKeys(Third_Party_Policy_Number);

                            Thread.sleep(2000);

                            if (Third_Party_Insurer1.isDisplayed()==false){

                                driver.findElement(By.xpath("(//label[@for='pp_Insurer'])[2]")).click();

                                Thread.sleep(3000);

                                Third_Party_Insurer1.sendKeys(Loan_Provider);

                                Thread.sleep(2000);

//                            rt.keyPress(KeyEvent.VK_DOWN);
//                            rt.keyRelease(KeyEvent.VK_DOWN);
//                            Thread.sleep(2000);
//                            rt.keyPress(KeyEvent.VK_ENTER);
//                            rt.keyRelease(KeyEvent.VK_ENTER);

                                Third_Party_Insurer1.sendKeys(Keys.ARROW_DOWN);

                                Thread.sleep(2000);

                                Third_Party_Insurer1.sendKeys(Keys.ENTER);
                            }

                            Thread.sleep(2000);

                            driver.findElement(By.xpath("(//label[@for='insurers_od'])")).click();

                            WebElement Own_Damage_Insurer1 = driver.findElement(By.id("insurers_od"));

                            Thread.sleep(2000);

                            Own_Damage_Insurer1.sendKeys(Own_Damage_Insurer);

                            Thread.sleep(2000);

//                            rt.keyPress(KeyEvent.VK_DOWN);
//                            rt.keyRelease(KeyEvent.VK_DOWN);
//                            Thread.sleep(2000);
//                            rt.keyPress(KeyEvent.VK_ENTER);
//                            rt.keyRelease(KeyEvent.VK_ENTER);

                            Own_Damage_Insurer1.sendKeys(Keys.ARROW_DOWN);

                            Thread.sleep(2000);

                            Own_Damage_Insurer1.sendKeys(Keys.ENTER);

                            // lb.pindropselect();

//                            Thread.sleep(2000);

                            driver.findElement(By.xpath("(//label[@for='pp_PolicyNumber_od'])")).click();

                            WebElement Own_Damage_Policy_Number1 = driver.findElement(By.id("pp_PolicyNumber_od"));

                            Thread.sleep(2000);

                            Own_Damage_Policy_Number1.sendKeys(Own_Damage_Policy_Number);

                            Thread.sleep(2000);

                            driver.findElement(By.xpath("(//button[@class='align-item-center'])[2]")).click();

                            Thread.sleep(8000);

                            WebElement paynow_btn_page5_ii = ls.getPaynow_btn_page5_ii();

                            lb.Click(paynow_btn_page5_ii);

                            Thread.sleep(6000);

                            WebElement policy_breakup = driver
                                    .findElement(By.xpath("//a[@id='viewPolicy_breakup']"));

                            policy_breakup.click();

                            Thread.sleep(2000);

                            driver.findElement(By.xpath("//a[@class='navBack']")).click();

//                            lb.navigateBack();

                            Thread.sleep(6000);

                            WebElement checkbox_page_6 = ls.getCheckbox_page_6();

                            lb.scrollDown(checkbox_page_6);

                            Thread.sleep(2000);

                            lb.Click(checkbox_page_6);

                            Thread.sleep(2000);

                            WebElement paynow_btn_page_6 = ls.getPaynow_btn_page_6();

                            lb.btnClick(paynow_btn_page_6);

                            Thread.sleep(2000);

                            driver.findElement(By.xpath(
                                            "(//span[@class='innerpanel-text innerpanel-bg border right-arrow paymentOption'])[3]"))
                                    .click();

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

//                            }

                        }
                    }

                    else {

                        Thread.sleep(2500);

                        ls.getHere_your_plan_info_page4().click();

                        log.info("******************** Here's your plan info button clicked ************************");

                        Thread.sleep(2000);

                        driver.findElement(
                                        By.xpath("(//button[@class='primary-btn modal-close-btn mx-auto mt-20 x-icon'])[10]"))
                                .click();

                        log.info(
                                "******************** Here's your plan info close button clicked ************************");

                        Thread.sleep(2000);

                        ls.getExtra_protection_info_btn_page4().click();

                        log.info("******************** Extra_protection_info_button clicked ************************");

                        Thread.sleep(2000);

                        driver.findElement(
                                        By.xpath("(//button[@class='primary-btn modal-close-btn mx-auto mt-20 x-icon'])[12]"))
                                .click();

                        // ls.getExtra_protection_popup_closebtn_page4().click();

                        log.info(
                                "******************** Extra_protection_popup_close_button clicked ************************");

                        Thread.sleep(2000);

                        ls.getElectrical_accs_radio_btn_page4().click();

                        Thread.sleep(2000);

                        log.info("******************** Electrical_accs_radio_button clicked ************************");

                        driver.findElement(
                                        By.xpath("(//button[@class='primary-btn modal-close-btn mx-auto mt-20 x-icon'])[2]"))
                                .click();

                        log.info(
                                "******************** Electrical_accs_radio_close_button_clicked ************************");

                        Thread.sleep(2000);

                        log.info("******************** Electrical_accs_radio_button clicked ************************");

                        ls.getElectrical_accs_radio_btn_page4().click();

                        Thread.sleep(2000);

                        WebElement electrical_accs_name_txtbox_page4_ii = ls.getElectrical_accs_name_txtbox_page4_ii();

                        electrical_accs_name_txtbox_page4_ii.sendKeys(Ea_Enter_accessories_name);

                        log.info("******************** Electrical_accs_values_passed************************");

                        Thread.sleep(2000);

                        WebElement electrical_accs_amount_textbox_page4_ii = ls
                                .getElectrical_accs_amount_textbox_page4_ii();

                        electrical_accs_amount_textbox_page4_ii.sendKeys(Ea_Enter_accessories_amount);

                        Thread.sleep(2000);

                        WebElement electrical_accs_submit_btn_page4_ii = ls.getElectrical_accs_submit_btn_page4_ii();

                        electrical_accs_submit_btn_page4_ii.click();

                        Thread.sleep(8000);

                        ls.getNon_electrical_accs_radio_btn_page4().click();

                        Thread.sleep(2000);

                        WebElement non_electrrical_accs_name_textbox_page4_ii = ls.getNon_electrrical_accs_name_textbox_page4_ii();

                        non_electrrical_accs_name_textbox_page4_ii.sendKeys(NEa_Enter_accessories_name);

                        Thread.sleep(2000);

                        WebElement non_electrrical_accs_amount_textbox_page4_ii = ls.getNon_electrrical_accs_amount_textbox_page4_ii();

                        non_electrrical_accs_amount_textbox_page4_ii.sendKeys(NEa_Enter_accessories_amount);

                        Thread.sleep(2000);

                        WebElement non_electrical_accs_submit_btn_page4_ii = ls.getNon_electrical_accs_submit_btn_page4_ii();

                        non_electrical_accs_submit_btn_page4_ii.click();

                        Thread.sleep(10000);

                        ls.getLpg_Cng_accs_radio_btn_page4().click();

                        Thread.sleep(2000);

                        WebElement fuel_type_lpg_cng_drpdwn_page4_ii = ls.getFuel_type_lpg_cng_drpdwn_page4_ii();

                        fuel_type_lpg_cng_drpdwn_page4_ii.click();

                        Thread.sleep(2000);

                        for (int i = 0; i < 2; i++) {

                            fuel_type_lpg_cng_drpdwn_page4_ii.sendKeys(Keys.ARROW_DOWN);

                        }
                        Thread.sleep(2000);

                        fuel_type_lpg_cng_drpdwn_page4_ii.sendKeys(Keys.ENTER);

                        // lb.pindropselect();

                        Thread.sleep(4000);

                        WebElement enter_amount_lpg_cng_page4_ii = ls.getEnter_amount_lpg_cng_page4_ii();

                        enter_amount_lpg_cng_page4_ii.sendKeys(Enter_amount);

                        Thread.sleep(2000);

                        WebElement lpg_cng_submit_btn_page4_ii = ls.getLpg_cng_submit_btn_page4_ii();

                        lb.btnClick(lpg_cng_submit_btn_page4_ii);

                        Thread.sleep(8000);

                        ls.getInsured_value_infobtn_page4().click();

                        Thread.sleep(2000);

                        driver.findElement(
                                        By.xpath("(//button[@class='primary-btn modal-close-btn mx-auto mt-20 x-icon'])[14]"))
                                .click();

                        // WebElement idvpopup_closebtn_page4 = ls.getIdvpopup_closebtn_page4();
                        //
                        // lb.btnClick(idvpopup_closebtn_page4);
                        //
                        Thread.sleep(2000);

                        WebElement slider_page4 = ls.getSlider_page4();

                        JavascriptExecutor js = (JavascriptExecutor) driver;

                        js.executeScript("arguments[0].value='100000';", slider_page4);

                        Thread.sleep(2000);

                        ls.getAdd_extra_coverage_infobtn_page4().click();

                        Thread.sleep(2000);

                        ls.getAdd_extra_coverage_popup_closebtn_page4().click();

                        Thread.sleep(2000);

                        ls.getZerodep_btn_page4().click();

                        // ls.getRsa_btn_page4().click();

                        Thread.sleep(7000);

                        WebElement viewmore_covereage_btn_page4 = ls.getViewmore_covereage_btn_page4();

                        lb.scrollDown(viewmore_covereage_btn_page4);

                        Thread.sleep(2000);

                        viewmore_covereage_btn_page4.click();

                        Thread.sleep(2000);

//                        ls.getAdd_btn_1_ciew_more_coverage_popup_page4_ii().click();

//                        Thread.sleep(10000);

                        ls.getAdd_btn_2_ciew_more_coverage_popup_page4_ii().click();

                        Thread.sleep(8000);

//                        WebElement add_btn_3_ciew_more_coverage_popup_page4_ii = ls.getAdd_btn_3_ciew_more_coverage_popup_page4_ii();
//
//                        lb.btnClick(add_btn_3_ciew_more_coverage_popup_page4_ii);
//
//                        Thread.sleep(8000);

//                        ls.getAdd_btn_4_ciew_more_coverage_popup_page4_ii().click();

//                        Thread.sleep(10000);

                        ls.getAdd_btn_5_ciew_more_coverage_popup_page4_ii().click();

                        Thread.sleep(8000);

                        ls.getAdd_btn_6_ciew_more_coverage_popup_page4_ii().click();

                        Thread.sleep(8000);
//
//                        ls.getAdd_btn_7_ciew_more_coverage_popup_page4_ii().click();
//
//                        Thread.sleep(10000);
//
//                        ls.getAdd_btn_8_ciew_more_coverage_popup_page4_ii().click();
//
//                        Thread.sleep(10000);
//
//                        ls.getAdd_btn_9_ciew_more_coverage_popup_page4_ii().click();
//
//                        Thread.sleep(10000);
//
//                        ls.getAdd_btn_10_ciew_more_coverage_popup_page4_ii().click();
//
//                        Thread.sleep(10000);
//
//                        ls.getAdd_btn_11_ciew_more_coverage_popup_page4_ii().click();

//                        Thread.sleep(10000);

                        WebElement view_more_coverage_confirm_continue_btn_page_4_ii = ls
                                .getView_more_coverage_confirm_continue_btn_page_4_ii();

                        view_more_coverage_confirm_continue_btn_page_4_ii.click();

                        Thread.sleep(6000);

                        WebElement continue_btn_page4 = ls.getContinue_btn_page4();

                        lb.btnClick(continue_btn_page4);

                        Thread.sleep(6000);

                        WebElement addressline1_page5 = ls.getAddressline1_page5();

                        WebElement state_textbox = driver
                                .findElement(By.xpath("(//div[@class='form-b p-relative focused'])[19]"));

                        // boolean displayed = addressline1_page5.isDisplayed();

                        // String text1 = addressline1_page5.getText();

                        // System.out.println(text1);

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

                            WebElement continue_btn_ownerinfo_page5 = ls.getContinue_btn_ownerinfo_page5();

                            lb.btnClick(continue_btn_ownerinfo_page5);

                            Thread.sleep(6000);

                            WebElement chasis = driver
                                    .findElement(By.xpath("(//span[@class='previewveh_chasis_number'])[1]"));

                            if (chasis.isDisplayed() == false) {

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

                                for (int i = 0; i < 3; i++) {

                                    hypothecation_loan_page5_ii.sendKeys(Keys.ARROW_DOWN);

                                    Thread.sleep(2000);
                                }

                                hypothecation_loan_page5_ii.sendKeys(Keys.ENTER);

                                // lb.pindropselect();

                                Thread.sleep(2000);


                                driver.findElement(By.xpath("//label[@for='pi_hypo_LoanProvider']")).click();

                                WebElement loan_provider_page_5_ii = ls.getLoan_provider_page_5_ii();

                                Thread.sleep(1500);

                                loan_provider_page_5_ii.sendKeys(Loan_Provider);

                                Thread.sleep(1500);

                                loan_provider_page_5_ii.sendKeys(Keys.ARROW_DOWN);

                                Thread.sleep(1500);

                                loan_provider_page_5_ii.sendKeys(Keys.ENTER);

                                Thread.sleep(1500);

                                driver.findElement(By.xpath("//label[@for='pi_hypo_FinancierBank']")).click();

                                WebElement financier_name_page_5_ii = ls.getFinancier_name_page_5_ii();

                                Thread.sleep(1500);

                                financier_name_page_5_ii.sendKeys(Financier_Branch);

                                Thread.sleep(1500);

                                driver.findElement(By.xpath("(//label[@for='pp_Insurer'])[2]")).click();

                                WebElement Third_Party_Insurer2 = driver.findElement(By.id("insurers_tp"));

                                Thread.sleep(2000);

                                Third_Party_Insurer2.sendKeys(Third_Party_Insurer);

                                Thread.sleep(2000);

                                Third_Party_Insurer2.sendKeys(Keys.ARROW_DOWN);

                                Thread.sleep(2000);

                                Third_Party_Insurer2.sendKeys(Keys.ENTER);

                                // lb.pindropselect();

                                Thread.sleep(2000);

                                driver.findElement(By.xpath("(//label[@for='pp_PolicyNumber_tp'])")).click();

                                WebElement Third_Party_Policy_Number1 = driver.findElement(By.id("pp_PolicyNumber_tp"));

                                Thread.sleep(2000);

                                Third_Party_Policy_Number1.sendKeys(Third_Party_Policy_Number);

                                Thread.sleep(2000);

                                driver.findElement(By.xpath("(//label[@for='insurers_od'])")).click();

                                WebElement Own_Damage_Insurer1 = driver.findElement(By.id("insurers_od"));

                                Thread.sleep(2000);

                                Own_Damage_Insurer1.sendKeys(Own_Damage_Insurer);

                                Thread.sleep(2000);

                                Own_Damage_Insurer1.sendKeys(Keys.ARROW_DOWN);

                                Thread.sleep(2000);

                                Own_Damage_Insurer1.sendKeys(Keys.ENTER);

                                // lb.pindropselect();

                                Thread.sleep(2000);

                                driver.findElement(By.xpath("(//label[@for='pp_PolicyNumber_od'])")).click();

                                WebElement Own_Damage_Policy_Number1 = driver.findElement(By.id("pp_PolicyNumber_od"));

                                Thread.sleep(2000);

                                Own_Damage_Policy_Number1.sendKeys(Own_Damage_Policy_Number);

                                Thread.sleep(2000);

                                driver.findElement(By.xpath("(//button[@class='align-item-center'])[2]")).click();

                                Thread.sleep(8000);

                                WebElement paynow_btn_page5_ii = ls.getPaynow_btn_page5_ii();

                                lb.Click(paynow_btn_page5_ii);

                                Thread.sleep(2000);

                                WebElement policy_breakup = driver
                                        .findElement(By.xpath("//a[@id='viewPolicy_breakup']"));

                                policy_breakup.click();

                                Thread.sleep(2000);

                                lb.navigateBack();

                                Thread.sleep(6000);

                                WebElement checkbox_page_6 = ls.getCheckbox_page_6();

                                lb.scrollDown(checkbox_page_6);

                                Thread.sleep(2000);

                                lb.Click(checkbox_page_6);

                                Thread.sleep(2000);

                                driver.findElement(By.xpath("//button[@class='align-item-center modal-btn']")).click();

//                                WebElement paynow_btn_page_6 = ls.getPaynow_btn_page_6();
//
//                                lb.btnClick(paynow_btn_page_6);

                                Thread.sleep(2000);

                                driver.findElement(By.xpath(
                                                "(//span[@class='innerpanel-text innerpanel-bg border right-arrow paymentOption'])[3]"))
                                        .click();

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

                                Thread.sleep(2000);

                                WebElement toggleswitch_page5_ii = ls.getToggleswitch_page5_ii();

                                lb.btnClick(toggleswitch_page5_ii);

                                Thread.sleep(2000);

                                WebElement hypothecation_loan_page5_ii = ls.getHypothecation_loan_page5_ii();

                                hypothecation_loan_page5_ii.click();

                                Thread.sleep(2000);

                                for (int i = 0; i < 3; i++) {

                                    hypothecation_loan_page5_ii.sendKeys(Keys.ARROW_DOWN);

                                    Thread.sleep(2000);
                                }

                                hypothecation_loan_page5_ii.sendKeys(Keys.ENTER);

                                // lb.pindropselect();

                                Thread.sleep(2000);


                                driver.findElement(By.xpath("//label[@for='pi_hypo_LoanProvider']")).click();

                                WebElement loan_provider_page_5_ii = ls.getLoan_provider_page_5_ii();

                                Thread.sleep(1500);

                                loan_provider_page_5_ii.sendKeys(Loan_Provider);

                                Thread.sleep(1500);

                                loan_provider_page_5_ii.sendKeys(Keys.ARROW_DOWN);

                                Thread.sleep(1500);

                                loan_provider_page_5_ii.sendKeys(Keys.ENTER);

                                Thread.sleep(1500);

                                driver.findElement(By.xpath("//label[@for='pi_hypo_FinancierBank']")).click();

                                WebElement financier_name_page_5_ii = ls.getFinancier_name_page_5_ii();

                                Thread.sleep(1500);

                                financier_name_page_5_ii.sendKeys(Financier_Branch);

                                Thread.sleep(1500);

                                driver.findElement(By.xpath("(//label[@for='pp_Insurer'])[2]")).click();

                                WebElement Third_Party_Insurer2 = driver.findElement(By.id("insurers_tp"));

                                Thread.sleep(2000);

                                Third_Party_Insurer2.sendKeys(Third_Party_Insurer);

                                Thread.sleep(2000);

                                Third_Party_Insurer2.sendKeys(Keys.ARROW_DOWN);

                                Thread.sleep(2000);

                                Third_Party_Insurer2.sendKeys(Keys.ENTER);

                                // lb.pindropselect();

                                Thread.sleep(2000);

                                driver.findElement(By.xpath("(//label[@for='pp_PolicyNumber_tp'])")).click();

                                WebElement Third_Party_Policy_Number1 = driver.findElement(By.id("pp_PolicyNumber_tp"));

                                Thread.sleep(2000);

                                Third_Party_Policy_Number1.sendKeys(Third_Party_Policy_Number);

                                Thread.sleep(2000);

                                driver.findElement(By.xpath("(//label[@for='insurers_od'])")).click();

                                WebElement Own_Damage_Insurer1 = driver.findElement(By.id("insurers_od"));

                                Thread.sleep(2000);

                                Own_Damage_Insurer1.sendKeys(Own_Damage_Insurer);

                                Thread.sleep(2000);

                                Own_Damage_Insurer1.sendKeys(Keys.ARROW_DOWN);

                                Thread.sleep(2000);

                                Own_Damage_Insurer1.sendKeys(Keys.ENTER);

                                // lb.pindropselect();

                                Thread.sleep(2000);

                                driver.findElement(By.xpath("(//label[@for='pp_PolicyNumber_od'])")).click();

                                WebElement Own_Damage_Policy_Number1 = driver.findElement(By.id("pp_PolicyNumber_od"));

                                Thread.sleep(2000);

                                Own_Damage_Policy_Number1.sendKeys(Own_Damage_Policy_Number);

                                Thread.sleep(2000);

                                driver.findElement(By.xpath("(//button[@class='align-item-center'])[2]")).click();

                                Thread.sleep(8000);

                                WebElement paynow_btn_page5_ii = ls.getPaynow_btn_page5_ii();

                                Thread.sleep(2000);

                                lb.Click(paynow_btn_page5_ii);

                                Thread.sleep(3000);

                                WebElement policy_breakup = driver
                                        .findElement(By.xpath("//a[@id='viewPolicy_breakup']"));

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

                                driver.findElement(By.xpath(
                                                "(//span[@class='innerpanel-text innerpanel-bg border right-arrow paymentOption'])[3]"))
                                        .click();

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

                            WebElement continue_btn_ownerinfo_page5 = ls.getContinue_btn_ownerinfo_page5();

                            lb.btnClick(continue_btn_ownerinfo_page5);

                            Thread.sleep(7000);

//                            String text2 = driver.findElement(By.xpath("//span[@class='previewveh_chasis_number']"))
//                                    .getText();

//                            WebElement Chassis_no_textbox = driver.findElement(By.xpath("(//div[@class='hide-e'])[6]"));

//                            if (Chassis_no_textbox.isDisplayed()) {

                            WebElement Chassis_click = driver.findElement(By.xpath("//label[@for='new_chassisNumber']"));

                            Chassis_click.click();

                            Thread.sleep(2000);

                            WebElement Engine_no = driver.findElement(By.xpath("//label[@for='new_enginNumber']"));


                            WebElement new_chassisNumber = driver.findElement(By.id("new_chassisNumber"));


                                Thread.sleep(2000);

                                new_chassisNumber.sendKeys(Chassis_Number);

                                Thread.sleep(2000);

                                WebElement new_enginNumber = driver.findElement(By.id("new_enginNumber"));

                                Engine_no.click();

                                Thread.sleep(2000);

                                new_enginNumber.sendKeys(Engine_Number);

                                Thread.sleep(2000);

                                WebElement Scroll_element = driver.findElement(By.xpath("(//button[@class='align-item-center'])[2]"));

                                lb.scrollDown(Scroll_element);

                                WebElement toggleswitch_page5_ii = ls.getToggleswitch_page5_ii();

                                lb.btnClick(toggleswitch_page5_ii);

                                Thread.sleep(2000);

                                WebElement hypothecation_loan_page5_ii = ls.getHypothecation_loan_page5_ii();

                                hypothecation_loan_page5_ii.click();

                                Thread.sleep(2000);

                                for (int i = 0; i < 3; i++) {

                                    hypothecation_loan_page5_ii.sendKeys(Keys.ARROW_DOWN);

                                    Thread.sleep(2000);
                                }

                                hypothecation_loan_page5_ii.sendKeys(Keys.ENTER);

                                // lb.pindropselect4();

                            Thread.sleep(2000);

                            driver.findElement(By.xpath("//label[@for='pi_hypo_LoanProvider']")).click();

                            WebElement loan_provider_page_5_ii = ls.getLoan_provider_page_5_ii();

                            Thread.sleep(1500);

                            loan_provider_page_5_ii.sendKeys(Loan_Provider);

                            Thread.sleep(1500);

                            loan_provider_page_5_ii.sendKeys(Keys.ARROW_DOWN);

                            Thread.sleep(1500);

                            loan_provider_page_5_ii.sendKeys(Keys.ENTER);

                            Thread.sleep(1500);

                            driver.findElement(By.xpath("//label[@for='pi_hypo_FinancierBank']")).click();

                            WebElement financier_name_page_5_ii = ls.getFinancier_name_page_5_ii();

                            Thread.sleep(1500);

                            financier_name_page_5_ii.sendKeys(Financier_Branch);

                            Thread.sleep(1500);

                            driver.findElement(By.xpath("(//label[@for='pp_Insurer'])[2]")).click();

                                WebElement Third_Party_Insurer1 = driver.findElement(By.id("insurers_tp"));

                                Thread.sleep(2000);

                                Third_Party_Insurer1.sendKeys(Loan_Provider);

                                Thread.sleep(2000);

                                Third_Party_Insurer1.sendKeys(Keys.ARROW_DOWN);

                                Thread.sleep(2000);

                                Third_Party_Insurer1.sendKeys(Keys.ENTER);

                                // lb.pindropselect();

                                Thread.sleep(2000);

                                driver.findElement(By.xpath("(//label[@for='pp_PolicyNumber_tp'])")).click();

                                WebElement Third_Party_Policy_Number1 = driver.findElement(By.id("pp_PolicyNumber_tp"));

                                Thread.sleep(2000);

                                Third_Party_Policy_Number1.sendKeys(Third_Party_Policy_Number);

                                Thread.sleep(2000);

                                driver.findElement(By.xpath("(//label[@for='insurers_od'])")).click();

                                WebElement Own_Damage_Insurer1 = driver.findElement(By.id("insurers_od"));

                                Thread.sleep(2000);

                                Own_Damage_Insurer1.sendKeys(Own_Damage_Insurer);

                                Thread.sleep(2000);

                                Own_Damage_Insurer1.sendKeys(Keys.ARROW_DOWN);

                                Thread.sleep(2000);

                                Own_Damage_Insurer1.sendKeys(Keys.ENTER);

                                // lb.pindropselect();

                                Thread.sleep(2000);

                                driver.findElement(By.xpath("(//label[@for='pp_PolicyNumber_od'])")).click();

                                WebElement Own_Damage_Policy_Number1 = driver.findElement(By.id("pp_PolicyNumber_od"));

                                Thread.sleep(2000);

                                Own_Damage_Policy_Number1.sendKeys(Own_Damage_Policy_Number);

                                Thread.sleep(2000);

                                driver.findElement(By.xpath("(//button[@class='align-item-center'])[2]")).click();

                                Thread.sleep(8000);

                                WebElement paynow_btn_page5_ii = ls.getPaynow_btn_page5_ii();

                                lb.Click(paynow_btn_page5_ii);

                                Thread.sleep(2000);

                                WebElement policy_breakup = driver
                                        .findElement(By.xpath("//a[@id='viewPolicy_breakup']"));

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

                                driver.findElement(By.xpath(
                                                "(//span[@class='innerpanel-text innerpanel-bg border right-arrow paymentOption'])[3]"))
                                        .click();

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


//                            }



                        }
                    }

                }
            }

            Thread.sleep(2000);
            int parseInt = Integer.parseInt(INDEX);
            Thread.sleep(2000);
            ExcelUtils.writeinexcel("PASS", parseInt);
            String s = "Comprehensive Flow is Working Fine in ";
            String s1 = Iteration;
            String concat = s.concat(s1);
            Thread.sleep(2000);
            ExcelUtils.writeinexcelForReasons(concat, parseInt);

        }

        catch (Exception e) {
            e.printStackTrace();
            int parseInt = Integer.parseInt(INDEX);
            Thread.sleep(2000);
            ExcelUtils.writeinexcel("FAIL", parseInt);
            String s = "Comprehensive Flow isn't Working in ";
            String s1 = Iteration;
            String concat = s.concat(s1);
            Thread.sleep(2000);
            ExcelUtils.writeinexcelForReasons(concat, parseInt);

        }

    }


}

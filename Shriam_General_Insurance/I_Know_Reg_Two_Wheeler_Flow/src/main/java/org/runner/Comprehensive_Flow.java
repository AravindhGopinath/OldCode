package org.runner;

import WebElements.*;
import baseclass.BaseClass;
import excel.ExcelUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Comprehensive_Flow extends BaseClass {


    static void landingPage(String Bike_Number, String Mobile_Number, String OTP_1, String OTP_2, String OTP_3,
                            String OTP_4, String INDEX, String Iteration) throws Exception {

        try {


            String currentUrl = driver.getCurrentUrl();

            if (currentUrl.contains("automation")) {

                System.out.println(currentUrl + " = URL Verified");

            } else {

                System.out.println("URL mismatched");

            }

            Landing_Page_Xpaths lp = new Landing_Page_Xpaths();

            wait_Click(lp.getBike_no_Page1());

            wait_Sendkeys(lp.getBike_no_Page1(), Bike_Number);

            wait_Click(lp.getMob_no_page1());

            wait_Sendkeys(lp.getMob_no_page1(), Mobile_Number);

            wait_Click(lp.getTandc_link_click_page1());

            String Title = lp.getShriram_title().getText();

            hold(2500);

            wait_Click(lp.getTandc_link_close_page1());

            if (Title.contains("PRIVACY")) {

                System.out.println("Terms and conditions shown");

            }

            WebElement tandc_checkbox_page1 = lp.getTandc_checkbox_page1();

            Click(tandc_checkbox_page1);

            wait_Click(lp.getInsure_now_btn_page1());

            wait_Sendkeys(lp.getOtp_1_page2(), OTP_1);

            wait_Sendkeys(lp.getOtp_2_page2(), OTP_2);

            wait_Sendkeys(lp.getOtp_3_page2(), OTP_3);

            wait_Sendkeys(lp.getOtp_4_page2(), OTP_4);

            wait_Click(lp.getOtp_send_button_page2());




        } catch (Exception e) {
            int parseInt = Integer.parseInt(INDEX);
            Thread.sleep(2000);
            ExcelUtils.writeinexcel("FAIL", parseInt);
            String s=e+"in Landing page ";
            String s1=Iteration;
            String concat = s.concat(s1);
            Thread.sleep(2000);
            ExcelUtils.writeinexcelForReasons(concat, parseInt);
            System.out.println(e);

        }
        }

    static void editScreen(String Make, String Variant, String Policy_status, String Date_of_Registration, String INDEX, String Iteration) throws Exception {

        try {
            Edit_screen_Xpaths es = new Edit_screen_Xpaths();

            wait_Click(es.getMake_field_click_page3());

            boolean displayed = es.getMake_field_sendkeys_page3().isDisplayed();


            if (displayed) {


                es.getMake_field_sendkeys_page3().clear();

                wait_Sendkeys(es.getMake_field_sendkeys_page3(), Make);

                es.getMake_field_sendkeys_page3().sendKeys(Keys.ARROW_DOWN);

                es.getMake_field_sendkeys_page3().sendKeys(Keys.ENTER);


            } else {

                wait_Sendkeys(es.getMake_field_sendkeys_page3(), Make);

                es.getMake_field_sendkeys_page3().sendKeys(Keys.ARROW_DOWN);

                es.getMake_field_sendkeys_page3().sendKeys(Keys.ENTER);


            }

            wait_Click(es.getVariant_field_click_page3());

            boolean displayed1 = es.getVariant_field_sendkeys_page3().isDisplayed();

            if (displayed1) {

                es.getVariant_field_sendkeys_page3().clear();

                wait_Sendkeys(es.getVariant_field_sendkeys_page3(), Variant);

                es.getVariant_field_sendkeys_page3().sendKeys(Keys.ARROW_DOWN);

                es.getVariant_field_sendkeys_page3().sendKeys(Keys.ENTER);


            } else {

                wait_Sendkeys(es.getVariant_field_sendkeys_page3(), Variant);

                es.getVariant_field_sendkeys_page3().sendKeys(Keys.ARROW_DOWN);

                es.getVariant_field_sendkeys_page3().sendKeys(Keys.ENTER);
            }


            boolean displayed3 = es.getDate_of_reg_sendkeys_page3().isDisplayed();

            if (displayed3) {

                wait_Click(es.getDate_of_reg_click_page3());

                es.getDate_of_reg_sendkeys_page3().clear();

                wait_Sendkeys(es.getDate_of_reg_sendkeys_page3(), Date_of_Registration);


            } else {

                wait_Click(es.getDate_of_reg_click_page3());

                wait_Sendkeys(es.getDate_of_reg_sendkeys_page3(), Date_of_Registration);


            }


            boolean displayed2 = es.getPolicy_status_sendkeys_page3().isDisplayed();

            if (displayed2) {

                wait_Click(es.getPolicy_status_click_page3());

                es.getPolicy_status_sendkeys_page3().clear();

                wait_Sendkeys(es.getPolicy_status_sendkeys_page3(), Policy_status);

                es.getPolicy_status_sendkeys_page3().sendKeys(Keys.ARROW_DOWN);

                es.getPolicy_status_sendkeys_page3().sendKeys(Keys.ENTER);


            } else {

                wait_Sendkeys(es.getPolicy_status_sendkeys_page3(), Policy_status);

                es.getPolicy_status_sendkeys_page3().sendKeys(Keys.ARROW_DOWN);

                es.getPolicy_status_sendkeys_page3().sendKeys(Keys.ENTER);


            }

            wait_Click(es.getConfirm_and_continue_button_page3());

        } catch (Exception e) {

            System.out.println(e);
            int parseInt = Integer.parseInt(INDEX);
            Thread.sleep(2000);
            ExcelUtils.writeinexcel("FAIL", parseInt);
            String s=e+"in edit page ";
            String s1=Iteration;
            String concat = s.concat(s1);
            Thread.sleep(2000);
            ExcelUtils.writeinexcelForReasons(concat, parseInt);
        }

    }

    static void premiumScreen(String Cover_Type, String Year, String INDEX, String Iteration) throws Exception {

        try {
            hold(12000);

            driver.navigate().refresh();

            Premium_Page_Xpaths px = new Premium_Page_Xpaths();

//        WebDriverWait wait =new WebDriverWait(driver,15);
//
//        WebElement until = wait.until(ExpectedConditions.elementToBeClickable(px.getNcb_get_value_premium_page4()));
//
            wait_Click(px.getNcb_get_value_premium_page4());

            String NCB_API_value = px.getNcb_get_value_premium_page4().getText();

            System.out.println(NCB_API_value);

            wait_Click(px.getNcb_edit_button_premium_page4());

            wait_Click(px.getNcb_edit_popup_close_button_page4());

            wait_Click(px.getNcb_edit_button_premium_page4());

            wait_Click(px.getTogswitch_ncb_popup_page4());

            wait_Click(px.getTogswitch_ncb_popup_page4());

            wait_Click(px.getMake_claim_yes_button_ncb_popup_page4());

            wait_Click(px.getMake_claim_no_button_ncb_popup_page4());

            wait_Click(px.getNcb_50_popup_page4());

            wait_Click(px.getNcb_45_popup_page4());

            wait_Click(px.getNcb_35_popup_page4());

            wait_Click(px.getNcb_25_popup_page4());

            wait_Click(px.getNcb_20_popup_page4());

            wait_Click(px.getNcb_0_popup_page4());

            if (NCB_API_value.equals("50 %")||NCB_API_value.equals("50%")) {

                wait_Click(px.getNcb_50_popup_page4());

            } else if (NCB_API_value.equals("45 %")||NCB_API_value.equals("45%")) {

                wait_Click(px.getNcb_45_popup_page4());

            } else if (NCB_API_value.equals("35 %")||NCB_API_value.equals("35%")) {

                wait_Click(px.getNcb_35_popup_page4());

            } else if (NCB_API_value.equals("25 %")||NCB_API_value.equals("25%")) {

                wait_Click(px.getNcb_25_popup_page4());

            } else if (NCB_API_value.equals("20 %")||NCB_API_value.equals("20%")) {

                wait_Click(px.getNcb_20_popup_page4());

            } else if (NCB_API_value.equals("0 %")||NCB_API_value.equals("0%")) {

                wait_Click(px.getNcb_0_popup_page4());

            }

            wait_Click(px.getConfirm_and_continue_button_ncb_popup_page4());

            hold(10000);

            String c = Cover_Type;

            if (c.equals("Comprehensive_Cover")) {

                wait_Click(px.getComprehensive_info_btn_premium_page4());

                wait_Click(px.getComprehensive_info_close_btn_page4());

                wait_Click(px.getInsure_your_bike_for_info_btn_premium_page4());

                wait_Click(px.getInsure_your_bike_for_info_close_btn_premium_page4());

                String y = Year;

                if (y.equals("1")) {

                    wait_Click(px.getOne_year_btn_premium_page4());

                } else if (y.equals("2")) {

                    wait_Click(px.getTwo_year_btn_premium_page4());

                } else if (y.equals("3")) {

                    wait_Click(px.getThree_year_btn_premium_page4());

                }

                wait_Click(px.getIdv_info_btn_premium_page4());

                wait_Click(px.getIdv_popup_close_btn_page4());

                String IDV_Value = px.getMin_idv_get_value_premium_page4().getText();

                System.out.println(IDV_Value);

                String s3 = IDV_Value.replaceAll("[,₹ ]", "");

                System.out.println(s3);

                WebElement idv_slider_pointer_premium_page4 = px.getIdv_slider_pointer_premium_page4();

                JavascriptExecutor js = (JavascriptExecutor) driver;

                js.executeScript("arguments[0].value='" + s3 + "';", idv_slider_pointer_premium_page4);

                wait_Sendkeys(idv_slider_pointer_premium_page4, String.valueOf(Keys.ARROW_RIGHT));

                hold(9000);

                wait_Click(px.getAdd_ons_info_btn_premium_page4());

                wait_Click(px.getAdd_ons_popup_close_btn_premium_page4());

                wait_Click(px.getView_more_coverage_button_premium_page4());

                wait_Click(px.getAdd_extra_coverage_info_btn_premium_page4());

                wait_Click(px.getAdd_extra_coverage_info_close_btn_premium_page4());

                String text = driver.findElement(By.xpath("//label[@for='add4']")).getText();

                System.out.println(text);

                boolean displayed1 = driver.findElement(By.xpath("//label[@for='add4']")).isDisplayed();

                if (text.contains("+₹")) {

                    wait_Click(px.getCover_for_loss_of_driving_license_and_registration_certificate_btn_premium_page4());

                    System.out.println("if clicked");
                } else if (displayed1) {

                    WebElement element = driver.findElement(By.xpath("//label[@for='add4']"));

                    wait_Click(element);

                    System.out.println("else if clicked");
                }

                wait_Click(px.getConfirm_and_continue_btn_premium_page4());

                hold(5000);

                wait_Click(px.getContinue_final_btn_premium_page4());

            }
        } catch (Exception e) {
            System.out.println(e);
            int parseInt = Integer.parseInt(INDEX);
            Thread.sleep(2000);
            ExcelUtils.writeinexcel("FAIL", parseInt);
            String s=e+"in premium page ";
            String s1=Iteration;
            String concat = s.concat(s1);
            Thread.sleep(2000);
            ExcelUtils.writeinexcelForReasons(concat, parseInt);
        }

    }

    static void saveAndProposalSreenOne(String Full_Name, String Email, String Address_Line_1,
                                        String Address_Line_2, String pincode, String Nominee_name,
                                        String relationship, String Nominee_age, String INDEX, String Iteration) throws Exception {

        try {
            hold(5000);

            driver.navigate().refresh();

            Save_and_proposal_screen_Xpaths sp = new Save_and_proposal_screen_Xpaths();

            wait_Click(sp.getFull_name_click());

            boolean fullname = sp.getFull_name_sendkeys().isDisplayed();

            if (fullname) {

                sp.getFull_name_sendkeys().clear();

                wait_Sendkeys(sp.getFull_name_sendkeys(), Full_Name);

            } else {

                wait_Sendkeys(sp.getFull_name_sendkeys(), Full_Name);

            }

            wait_Click(sp.getEmail_field_click());

            boolean email = sp.getEmail_sendkeys().isDisplayed();

            if (email) {

                sp.getEmail_sendkeys().clear();

                wait_Sendkeys(sp.getEmail_sendkeys(), Email);
            } else {

                wait_Sendkeys(sp.getEmail_sendkeys(), Email);
            }


            wait_Click(sp.getAddress_line1_click());

            boolean Address_1 = sp.getAddress_line1_sendkeys().isDisplayed();

            if (Address_1) {

                sp.getAddress_line1_sendkeys().clear();

                wait_Sendkeys(sp.getAddress_line1_sendkeys(), Address_Line_1);

            } else {

                wait_Sendkeys(sp.getAddress_line1_sendkeys(), Address_Line_1);
            }

            wait_Click(sp.getAddresss_line2_click());

            boolean Address_2 = sp.getAddress_line2_sendkeys().isDisplayed();

            if (Address_2) {

                sp.getAddress_line2_sendkeys().clear();

                wait_Sendkeys(sp.getAddress_line2_sendkeys(), Address_Line_2);

            } else {

                wait_Sendkeys(sp.getAddress_line2_sendkeys(), Address_Line_2);
            }

            wait_Click(sp.getPincode_field_click());

            boolean Pincode = sp.getPincode_field_sendkeys().isDisplayed();

            if (Pincode){

                sp.getPincode_field_sendkeys().clear();

                wait_Sendkeys(sp.getPincode_field_sendkeys(), pincode);
            }

            else {

                wait_Sendkeys(sp.getPincode_field_sendkeys(), pincode);
            }

            wait_Click(sp.getNominee_name_field_click());

            boolean Nominee_Name = sp.getNominee_name_field_sendkeys().isDisplayed();

            if (Nominee_Name){

                sp.getNominee_name_field_sendkeys().clear();

                wait_Sendkeys(sp.getNominee_name_field_sendkeys(), Nominee_name);

            }
            else {

                wait_Sendkeys(sp.getNominee_name_field_sendkeys(), Nominee_name);
            }

            wait_Click(sp.getRelationship_field_click());

            boolean Relationship = sp.getRelationship_field_sendkeys().isDisplayed();

            if (Relationship){

                sp.getRelationship_field_sendkeys().clear();

                wait_Sendkeys(sp.getRelationship_field_sendkeys(), relationship);

                wait_Sendkeys(sp.getRelationship_field_sendkeys(), String.valueOf(Keys.ARROW_DOWN));

                wait_Sendkeys(sp.getRelationship_field_sendkeys(), String.valueOf(Keys.ENTER));

            }

            else {

                wait_Sendkeys(sp.getRelationship_field_sendkeys(), relationship);

                wait_Sendkeys(sp.getRelationship_field_sendkeys(), String.valueOf(Keys.ARROW_DOWN));

                wait_Sendkeys(sp.getRelationship_field_sendkeys(), String.valueOf(Keys.ENTER));


            }

            wait_Click(sp.getNominee_age_field_click());

            boolean Nominee_Age = sp.getNominee_age_field_sendkeys().isDisplayed();

            if (Nominee_Age){

                sp.getNominee_age_field_sendkeys().clear();

                wait_Sendkeys(sp.getNominee_age_field_sendkeys(), Nominee_age);

            }
            else {

                wait_Sendkeys(sp.getNominee_age_field_sendkeys(), Nominee_age);
            }

            wait_Click(sp.getContinue_btn_save_and_proposal_screen());
        } catch (Exception e) {
            System.out.println(e);
            int parseInt = Integer.parseInt(INDEX);
            Thread.sleep(2000);
            ExcelUtils.writeinexcel("FAIL", parseInt);
            String s=e+"in save and proposal screen one page ";
            String s1=Iteration;
            String concat = s.concat(s1);
            Thread.sleep(2000);
            ExcelUtils.writeinexcelForReasons(concat, parseInt);
        }
    }

    static void saveAndProposalSreenTwo(String Chassis_Number, String Engine_Number, String Hypothecation,
                                        String Loan, String Financier_Branch, String Insurer_Name,
                                        String Policy_Number, String Policy_Expiry_Date, String INDEX, String Iteration) throws Exception {

        try {
            hold(5000);

//        driver.navigate().refresh();

            Save_and_proposal_screen_Xpaths sp = new Save_and_proposal_screen_Xpaths();

            wait_Click(sp.getChassis_number_field_click());

            boolean Chassis = sp.getChasssis_number_field_sendkeys().isDisplayed();

            if (Chassis){

                sp.getChasssis_number_field_sendkeys().clear();

                wait_Sendkeys(sp.getChasssis_number_field_sendkeys(), Chassis_Number);
            }
            else {

                wait_Sendkeys(sp.getChasssis_number_field_sendkeys(), Chassis_Number);
            }

            wait_Click(sp.getEngine_number_field_click());

            boolean Engine = sp.getEngine_number_field_sendkeys().isDisplayed();

            if (Engine){

                sp.getEngine_number_field_sendkeys().clear();

                wait_Sendkeys(sp.getEngine_number_field_sendkeys(), Engine_Number);

            }

            else {

                wait_Sendkeys(sp.getEngine_number_field_sendkeys(), Engine_Number);
            }

            wait_Click(sp.getHypothecation_loan_tog_switch());

            wait_Click(sp.getSelect_hypothecation_click());

            boolean Hypothecation_Loan = sp.getSelect_hypothecation_sendkeys().isDisplayed();

            if (Hypothecation_Loan) {

                sp.getSelect_hypothecation_sendkeys().clear();

                wait_Sendkeys(sp.getSelect_hypothecation_sendkeys(), Hypothecation);

                wait_Sendkeys(sp.getSelect_hypothecation_sendkeys(), String.valueOf(Keys.ARROW_DOWN));

                wait_Sendkeys(sp.getSelect_hypothecation_sendkeys(), String.valueOf(Keys.ENTER));

            }
            else {

                wait_Sendkeys(sp.getSelect_hypothecation_sendkeys(), Hypothecation);

                wait_Sendkeys(sp.getSelect_hypothecation_sendkeys(), String.valueOf(Keys.ARROW_DOWN));

                wait_Sendkeys(sp.getSelect_hypothecation_sendkeys(), String.valueOf(Keys.ENTER));

            }

            wait_Click(sp.getLoan_provider_click());

            boolean Loan_Provider = sp.getLoan_provider_sendkeys().isDisplayed();

            if (Loan_Provider){

                sp.getLoan_provider_sendkeys().clear();

                wait_Sendkeys(sp.getLoan_provider_sendkeys(), Loan);

    //            hold(1000);

    //            wait_Sendkeys(sp.getLoan_provider_sendkeys(), String.valueOf(Keys.ARROW_DOWN));

                hold(1000);

                wait_Sendkeys(sp.getLoan_provider_sendkeys(), String.valueOf(Keys.ENTER));

            }

            else {

                wait_Sendkeys(sp.getLoan_provider_sendkeys(), Loan);

    //            hold(1000);

    //            wait_Sendkeys(sp.getLoan_provider_sendkeys(), String.valueOf(Keys.ARROW_DOWN));

                hold(1000);

                wait_Sendkeys(sp.getLoan_provider_sendkeys(), String.valueOf(Keys.ENTER));

            }

            wait_Click(sp.getFinancier_click());

            boolean Financier  = sp.getFinancier_sendkeys().isDisplayed();

            if (Financier){

                sp.getFinancier_sendkeys().clear();

                wait_Sendkeys(sp.getFinancier_sendkeys(), Financier_Branch);

            }

            else {

                wait_Sendkeys(sp.getFinancier_sendkeys(), Financier_Branch);
            }

            wait_Click(sp.getComprehensive_radio_btn());

            wait_Click(sp.getInsurer_comprehensive_click());

            boolean Insurer = sp.getInsurer_comprehensive_sendkeys().isDisplayed();

            if (Insurer){

                sp.getInsurer_comprehensive_sendkeys().clear();

                wait_Sendkeys(sp.getInsurer_comprehensive_sendkeys(), Insurer_Name);

                wait_Sendkeys(sp.getInsurer_comprehensive_sendkeys(), String.valueOf(Keys.ARROW_DOWN));

                wait_Sendkeys(sp.getInsurer_comprehensive_sendkeys(), String.valueOf(Keys.ENTER));

            }

            else {

                wait_Sendkeys(sp.getInsurer_comprehensive_sendkeys(), Insurer_Name);

                wait_Sendkeys(sp.getInsurer_comprehensive_sendkeys(), String.valueOf(Keys.ARROW_DOWN));

                wait_Sendkeys(sp.getInsurer_comprehensive_sendkeys(), String.valueOf(Keys.ENTER));
            }

            wait_Click(sp.getPolicy_number_comprehensive_click());

            boolean Policy_No = sp.getPolicy_number_comprehensicve_sendkeys().isDisplayed();

            if (Policy_No){

                sp.getPolicy_number_comprehensicve_sendkeys().clear();

                wait_Sendkeys(sp.getPolicy_number_comprehensicve_sendkeys(), Policy_Number);
            }

            else {

                wait_Sendkeys(sp.getPolicy_number_comprehensicve_sendkeys(), Policy_Number);
            }

            wait_Click(sp.getPolicy_exp_date_comprehensive_click());

            boolean Policy_date = sp.getPolicy_exp_date_comprehensive_sendkeys().isDisplayed();

            if (Policy_date){

                sp.getPolicy_exp_date_comprehensive_sendkeys().clear();

                wait_Sendkeys(sp.getPolicy_exp_date_comprehensive_sendkeys(), Policy_Expiry_Date);

                wait_Click(sp.getPolicy_number_comprehensive_click());


            }

            else {

                wait_Sendkeys(sp.getPolicy_exp_date_comprehensive_sendkeys(), Policy_Expiry_Date);

                wait_Click(sp.getPolicy_number_comprehensive_click());


            }

            wait_Click(sp.getContinue_btn_save_and_proposal_screen2());

            hold(9000);
        } catch (Exception e) {
            System.out.println(e);
            int parseInt = Integer.parseInt(INDEX);
            Thread.sleep(2000);
            ExcelUtils.writeinexcel("FAIL", parseInt);
            String s=e+"in save and proposal screen two page ";
            String s1=Iteration;
            String concat = s.concat(s1);
            Thread.sleep(2000);
            ExcelUtils.writeinexcelForReasons(concat, parseInt);
        }


    }

    static void saveAndProposalScreenThree(String INDEX, String Iteration) throws Exception {

        try {
            Save_and_proposal_screen_Xpaths sp =new Save_and_proposal_screen_Xpaths();

            wait_Click(sp.getView_policy_breakup_button());

            wait_Click(sp.getView_policy_breakup_back_button());

            WebElement tandc_checkbox = sp.getTandc_checkbox();

            Click(tandc_checkbox);

            wait_Click(sp.getFinal_paynow_btn());
        } catch (Exception e) {
            System.out.println(e);
            int parseInt = Integer.parseInt(INDEX);
            Thread.sleep(2000);
            ExcelUtils.writeinexcel("FAIL", parseInt);
            String s=e+"in save and proposal screen three page ";
            String s1=Iteration;
            String concat = s.concat(s1);
            Thread.sleep(2000);
            ExcelUtils.writeinexcelForReasons(concat, parseInt);
        }

    }

    static void paymentScreen(String Star_Rating, String INDEX, String Iteration) throws Exception {

        try {
            Payment_and_download_policy_screen ps =new Payment_and_download_policy_screen();

            wait_Click(ps.getNetbankibng_payment_btn());

            wait_Click(ps.getSelect_bank_drop_down());

            wait_Sendkeys(ps.getSelect_bank_drop_down(), String.valueOf(Keys.ARROW_DOWN));

            wait_Sendkeys(ps.getSelect_bank_drop_down(), String.valueOf(Keys.ENTER));

            wait_Click(ps.getMake_payment_btn());

            wait_Click(ps.getReturn_to_merchant_site_btn());

            wait_Click(ps.getSend_anyway_btn());

//        wait_Click(ps.getDownload_policy_btn());

            hold(4000);

            String Rating =Star_Rating;

            if (Rating.equals("1")){

                wait_Click(ps.getOne_star_rating_btn());
            }
            else if (Rating.equals("2")) {

                wait_Click(ps.getTwo_star_rating_btn());
            }
            else if (Rating.equals("3")) {

                wait_Click(ps.getThree_star_rating_btn());

            }
            else if (Rating.equals("4")) {

                wait_Click(ps.getFour_star_rating_btn());
            }
            else if (Rating.equals("5")) {

                wait_Click(ps.getFive_star_rating_btn());
            }
        } catch (Exception e) {
            System.out.println(e);
            int parseInt = Integer.parseInt(INDEX);
            Thread.sleep(2000);
            ExcelUtils.writeinexcel("FAIL", parseInt);
            String s=e+"in download and payment page ";
            String s1=Iteration;
            String concat = s.concat(s1);
            Thread.sleep(2000);
            ExcelUtils.writeinexcelForReasons(concat, parseInt);
        }

    }





}




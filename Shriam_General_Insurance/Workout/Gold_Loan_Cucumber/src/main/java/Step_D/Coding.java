package Step_D;

import BaseClass.Baseclass;
import WebElements.Landing_Page_Xpaths;
import WebElements.User_credentials_Third_page_Xpaths;
import WebElements.User_credentials_page_Xpaths;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;

public class Coding extends Baseclass {


    @Before
    public void browserLaunch() {

        launchBrowser("chrome");

        loadUrl("https://uat.shriramcity.in/");

    }

    @Given("user lands on uat.shriramcity.in")
    public void user_lands_on_uat_shriramcity_in(String INDEX, String Iteration) throws Exception {


        try {
                Landing_Page_Xpaths lp = new Landing_Page_Xpaths();

                wait_Click(lp.getNotice_close_btn());

                scrollDown(lp.getGoldloan_calculator_btn());

                wait_Click(lp.getGoldloan_calculator_btn());

                Actions slider_automate = new Actions(driver);

                slider_automate.dragAndDropBy(lp.getLoanamount_slider(), 220, 0).perform();

                slider_automate.dragAndDropBy(lp.getAnnualized_rate_of_ineterest_slider(), 150, 0).perform();

                slider_automate.dragAndDropBy(lp.getLoan_tenure_slider(), 30, 0).perform();

                wait_Click(lp.getCalculator_applynow_btn());

        }

        catch (Exception e) {
//
//            int parseInt = Integer.parseInt(INDEX);
//            Thread.sleep(2000);
//            Excel_Utility.writeinexcel("FAIL", parseInt);
//            String s=e+"in_Landing_page ";
//            String s1=Iteration;
//            String concat = s.concat(s1);
//            Thread.sleep(2000);
//            Excel_Utility.writeinexcelForReasons(concat, parseInt);
//            System.out.println(e);

    }

}


    @When("user verifies the gold loan calculator")
    public void user_verifies_the_gold_loan_calculator() {

        User_credentials_page_Xpaths uc =new User_credentials_page_Xpaths();

        wait_Click(uc.getApplicant_name_field());

        wait_Sendkeys(uc.getApplicant_name_field(), "Applicant_Name");

        wait_Click(uc.getMobile_number_field());

        wait_Sendkeys(uc.getMobile_number_field(), "Mobile_Number");

        wait_Click(uc.getEmail_field_textbox());

        wait_Sendkeys(uc.getEmail_field_textbox(), "Email");

        wait_Click(uc.getEnter_button());
    }
    @When("user applies gold loan")
    public void user_applies_gold_loan() {

        User_credentials_Third_page_Xpaths uc3 =new User_credentials_Third_page_Xpaths();

        wait_Click(uc3.getDate_of_birth_field());

        wait_Sendkeys(uc3.getDate_of_birth_field(), "DOB");

        wait_Click(uc3.getDummy_click_post_dob());

        String s = "Gender";

        System.out.println(s);

        if (s.equals("Male")){

            Click(uc3.getMale_radio_btn());

            //            wait_Click(uc3.getMale_radio_btn());



        } else if (s.equals("Female")) {

            Click(uc3.getFemale_radio_btn());

            //            wait_Click(uc3.getFemale_radio_btn());



        }

        String s1= "Marital_Status";
        System.out.println(s1);

        if (s1.equals("Single")){

            Click(uc3.getSingle_radio_btn_marital_status());
            //            wait_Click(uc3.getSingle_radio_btn_marital_status());

        } else if (s1.equals("Married")) {

            Click(uc3.getMarried_radio_btn_marital_status());
            //            wait_Click(uc3.getMarried_radio_btn_marital_status());
        }

        wait_Click(uc3.getPan_number());

        wait_Sendkeys(uc3.getPan_number(), "PAN_Number");

        wait_Click(uc3.getLoan_amount_required());

        wait_Sendkeys(uc3.getLoan_amount_required(), "Loan_Amount");

        wait_Click(uc3.getResidence_pincode());

        wait_Sendkeys(uc3.getResidence_pincode(), "Pincode");

        wait_Click(uc3.getCity_field_textbox());

        wait_Sendkeys(uc3.getCity_field_textbox(), "City");

        wait_Click(uc3.getState_field_textbox());

        wait_Sendkeys(uc3.getState_field_textbox(), "State");

        wait_Click(uc3.getCheckbox_click());

        wait_Click(uc3.getFinal_apply_now_btn());
    }
}

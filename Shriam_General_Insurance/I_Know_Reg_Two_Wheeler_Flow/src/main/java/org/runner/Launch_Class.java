package org.runner;

import WebElements.Edit_screen_Xpaths;
import WebElements.Premium_Page_Xpaths;
import WebElements.Save_and_proposal_screen_Xpaths;
import baseclass.BaseClass;
import excel.ExcelUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;

public class Launch_Class extends BaseClass {

    @DataProvider
    public Iterator<Object[]> getTestData() {

        ArrayList<Object[]> testData = ExcelUtils.getDataFromexcel();
        return testData.iterator();

    }

    @Test(dataProvider = "getTestData")

    public void execution(String INDEX, String Iteration,String Flow_Type, String Bike_Number, String Mobile_Number, String OTP_1,
                          String OTP_2, String OTP_3, String OTP_4, String Make, String Variant,
                          String Policy_status, String Date_of_Registration, String Cover_Type,
                          String Year, String Full_Name, String Email, String Address_Line_1,
                          String Address_Line_2, String pincode, String Nominee_name,
                          String relationship, String Nominee_age, String Chassis_Number, String Engine_Number, String Hypothecation,
                          String Loan, String Financier_Branch, String Insurer_Name,
                          String Policy_Number, String Policy_Expiry_Date, String Star_Rating ) throws Exception {

        try {
            launchBrowser("chrome");

            loadUrl("http://sittw.shriramgi.com/bike-insurance-online/?utm_source=automation");

            String s = Flow_Type;

            Edit_screen_Xpaths es = new Edit_screen_Xpaths();

            Premium_Page_Xpaths px = new Premium_Page_Xpaths();

            Save_and_proposal_screen_Xpaths sp =new Save_and_proposal_screen_Xpaths();

            if (s.equals("Comprehensive"))
                {


                        Comprehensive_Flow.landingPage(Bike_Number, Mobile_Number, OTP_1, OTP_2, OTP_3, OTP_4,  INDEX,Iteration);

                        hold(5000);

                        String text = es.getDrop_off_handle_edit_screen().getText();

                        System.out.println(text);

                        boolean displayed = es.getDrop_off_handle_edit_screen().isDisplayed();

                        System.out.println(displayed);

                    boolean premium_screen_drop_off_handle = px.getPremium_screen_drop_off_handle().isDisplayed();

                    System.out.println(premium_screen_drop_off_handle);

                    boolean save_and_proposal_drop_off_handle = sp.getSave_and_proposal_screen_one_drop_off_handle().isDisplayed();

                    boolean save_and_proposal_drop_off_two_handle = sp.getSave_and_proposal_screen_two_drop_off_handle().isDisplayed();

                    boolean save_and_proposal_drop_off_three_handle = sp.getSave_and_proposal_screen_three_drop_off_handle().isDisplayed();

                    if (displayed) {

                            Comprehensive_Flow.editScreen(Make, Variant, Policy_status, Date_of_Registration, INDEX, Iteration);

                            Comprehensive_Flow.premiumScreen(Cover_Type, Year, INDEX, Iteration);

                            Comprehensive_Flow.saveAndProposalSreenOne(Full_Name,Email,Address_Line_1,Address_Line_2,pincode,
                            Nominee_name,relationship,Nominee_age, INDEX, Iteration);

                            Comprehensive_Flow.saveAndProposalSreenTwo(Chassis_Number,Engine_Number,
                            Hypothecation,Loan, Financier_Branch,Insurer_Name,Policy_Number,Policy_Expiry_Date, INDEX, Iteration);

                            Comprehensive_Flow.saveAndProposalScreenThree(INDEX, Iteration);

                            Comprehensive_Flow.paymentScreen(Star_Rating, INDEX, Iteration);


                        }else if (premium_screen_drop_off_handle) {

                            Comprehensive_Flow.premiumScreen(Cover_Type, Year, INDEX, Iteration);

                            Comprehensive_Flow.saveAndProposalSreenOne(Full_Name,Email,Address_Line_1,Address_Line_2,pincode,
                            Nominee_name,relationship,Nominee_age, INDEX, Iteration);

                            Comprehensive_Flow.saveAndProposalSreenTwo(Chassis_Number,Engine_Number,
                            Hypothecation,Loan, Financier_Branch,Insurer_Name,Policy_Number,Policy_Expiry_Date, INDEX, Iteration);

                            Comprehensive_Flow.saveAndProposalScreenThree(INDEX, Iteration);

                            Comprehensive_Flow.paymentScreen(Star_Rating, INDEX, Iteration);


                        }else if (save_and_proposal_drop_off_handle){

                            Comprehensive_Flow.saveAndProposalSreenOne(Full_Name,Email,Address_Line_1,Address_Line_2,
                            pincode,Nominee_name,relationship,Nominee_age, INDEX, Iteration);

                            Comprehensive_Flow.saveAndProposalSreenTwo(Chassis_Number,Engine_Number,
                            Hypothecation,Loan, Financier_Branch,Insurer_Name,Policy_Number,Policy_Expiry_Date, INDEX, Iteration);

                            Comprehensive_Flow.saveAndProposalScreenThree(INDEX, Iteration);

                            Comprehensive_Flow.paymentScreen(Star_Rating, INDEX, Iteration);
                        }else if (save_and_proposal_drop_off_two_handle){

                           Comprehensive_Flow.saveAndProposalSreenTwo(Chassis_Number,Engine_Number,
                           Hypothecation,Loan, Financier_Branch,Insurer_Name,Policy_Number,Policy_Expiry_Date, INDEX, Iteration);

                           Comprehensive_Flow.saveAndProposalScreenThree(INDEX, Iteration);

                           Comprehensive_Flow.paymentScreen(Star_Rating, INDEX, Iteration);

                        }else if (save_and_proposal_drop_off_three_handle){

                            Comprehensive_Flow.saveAndProposalScreenThree(INDEX, Iteration);

                            Comprehensive_Flow.paymentScreen(Star_Rating, INDEX, Iteration);

                        }




                    }
                    int parseInt = Integer.parseInt(INDEX);
                    Thread.sleep(2000);
                    ExcelUtils.writeinexcel("PASS", parseInt);
                    String s3="Comprehensive flow is executed in ";
                    String s1=Iteration;
                    String concat = s3.concat(s1);
                    Thread.sleep(2000);
                    ExcelUtils.writeinexcelForReasons(concat, parseInt);

                    quitBrowser();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

    }











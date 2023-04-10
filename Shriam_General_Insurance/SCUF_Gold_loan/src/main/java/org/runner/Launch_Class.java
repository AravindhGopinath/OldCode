package org.runner;

import org.baseclass.BaseClass;
import org.excel.utility.Excel_Utility;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;

public class Launch_Class extends BaseClass {

    @DataProvider
    public Iterator<Object[]> getTestData() {

        ArrayList<Object[]> testData = Excel_Utility.getDataFromexcel();
        return testData.iterator();

    }

    @Test(dataProvider = "getTestData")

    public void execution(String INDEX,String Iteration,String Applicant_Name, String Mobile_Number, String Email,
                          String DOB, String Gender, String Marital_Status, String PAN_Number, String Loan_Amount, String Pincode,
                          String City, String State, String OTP) throws Exception {

        try {
            launchBrowser("chrome");

            loadUrl("https://uat.shriramcity.in/");

            Coded.landingPage(INDEX, Iteration);

            Coded.userCredentialsSecondPage(Applicant_Name, Mobile_Number, Email, INDEX, Iteration);

            Coded.userCredentialsThirdPage( DOB,  Gender,  Marital_Status,  PAN_Number,  Loan_Amount,  Pincode,
            City, State, INDEX, Iteration);

            Coded.otpPage(OTP, INDEX, Iteration);

            int parseInt = Integer.parseInt(INDEX);
            Thread.sleep(2000);
            Excel_Utility.writeinexcel("PASS", parseInt);
            String s3=" Flow successfully executed in ";
            String s1=Iteration;
            String concat = s3.concat(s1);
            Thread.sleep(2000);
            Excel_Utility.writeinexcelForReasons(concat, parseInt);

            quitBrowser();

        } catch (Exception e) {

            System.out.println(e);

        }

    }

}

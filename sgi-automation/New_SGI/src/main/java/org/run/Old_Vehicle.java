package org.run;

import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.base.BaseClass;
import org.excel.owndamage.ExcelUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.webelements.Locators;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Old_Vehicle {

	static ExtentTest test;
	static ExtentReports report;

	@DataProvider
	public Iterator<Object[]> getTestData() {

		ArrayList<Object[]> testData = ExcelUtils.getDataFromexcel();
		return testData.iterator();

	}

	@Test(dataProvider = "getTestData")
	public void row1(String Car_no, String Mobile_Number, String OTP_1, String OTP_2, String OTP_3, String OTP_4, String OTP_5,
			String OTP_6, String Vehicle_number,String Make_and_model, String Variant, String Registration_date,
			String Select_registration, String city_of_registration, String Enter_company_name, String Enter_GST_number,
			String select_previous_policy_type, String previous_policy_expiry_date, String Ea_Enter_accessories_name,
			String Ea_Enter_accessories_amount, String NEa_Enter_accessories_name, String NEa_Enter_accessories_amount,
			String Fuel_Type, String Enter_amount, String Full_name, String Mob_no1, String Email, String Ad_line1,
			String Ad_line2, String Pincode, String Nominee_name, String Nominee_age, String Relationship,
			String Chassis_Number, String Engine_Number, String Hypothecation, String Loan_Provider,
			String Financier_Branch, String Insurer, String Policy_Number, String Policy_Expiry_Date, String Iteration,
			String INDEX,  String Third_Party_Insurer, String Third_Party_Policy_Start_Date,String Own_Damage_Policy_Start_Date,
			String Third_Party_Policy_Number, String Own_Damage_Insurer, String Own_Damage_Policy_Number, String Flow_type) throws Exception {

		BaseClass lb = new BaseClass();

		WebDriver driver = lb.launchBrowser("chrome");

		lb.loadUrl("http://sitfw.shriramgi.com/car-insurance-online/?utm_source=automation");
	
		String flow =Flow_type;
		
//		"Own Damage"
		
//		"Third Party"
		
		if (flow.equals("Comprehensive")) {
			

			Comprenhensive_I_Know.testCase(Car_no, Mobile_Number, OTP_1, OTP_2, OTP_3, OTP_4, OTP_5, OTP_6, Vehicle_number,
					Make_and_model, Variant, Registration_date, Select_registration, city_of_registration,
					Enter_company_name, Enter_GST_number, select_previous_policy_type, previous_policy_expiry_date,
					Ea_Enter_accessories_name, Ea_Enter_accessories_amount, NEa_Enter_accessories_name,
					NEa_Enter_accessories_amount, Fuel_Type, Enter_amount, Full_name, Mob_no1, Email, Ad_line1, Ad_line2,
					Pincode, Nominee_name, Nominee_age, Relationship, Chassis_Number, Engine_Number, Hypothecation,
					Loan_Provider, Financier_Branch, Insurer, Policy_Number, Policy_Expiry_Date, INDEX, Iteration);

			Thread.sleep(6000);

//			lb.quitBrowser();

			
		} 
		
		else if (flow.equals("Own Damage")) {
			
			Own_Damage_I_know.Owd_Flow(select_previous_policy_type, Enter_amount, NEa_Enter_accessories_amount,
					NEa_Enter_accessories_name, NEa_Enter_accessories_amount, NEa_Enter_accessories_name, Full_name, 
					Email, Ad_line1, Ad_line2, Pincode, Loan_Provider, Financier_Branch, Chassis_Number, Engine_Number,
					Nominee_name, Nominee_age, Insurer, Policy_Number, Policy_Expiry_Date, Vehicle_number, Make_and_model, 
					Variant, city_of_registration, Select_registration, Enter_company_name, Enter_GST_number, Third_Party_Insurer,
					Third_Party_Policy_Start_Date, Own_Damage_Policy_Start_Date, Third_Party_Policy_Number, Own_Damage_Insurer, 
					Own_Damage_Policy_Number, previous_policy_expiry_date, INDEX, Iteration, OTP_1, OTP_2, OTP_3, OTP_4, Car_no, 
					Mobile_Number);
			
			
			Thread.sleep(6000);
			
//			lb.quitBrowser();
			
			
		}
		
		else if(flow.equals("Third Party")) {
			
		Third_Party_I_Know.td_Flow(select_previous_policy_type, 
				Full_name, Email, Ad_line1, Ad_line2, Pincode, Nominee_name, 
				Nominee_age, Chassis_Number, Engine_Number, Loan_Provider, Financier_Branch, 
				Own_Damage_Insurer, Own_Damage_Policy_Number, Policy_Expiry_Date, Vehicle_number, 
				Make_and_model, Variant, city_of_registration, Select_registration, Enter_company_name, 
				Enter_GST_number, INDEX, Iteration, Car_no, Mobile_Number, OTP_1, OTP_2, OTP_3, OTP_4,previous_policy_expiry_date);	
		

			
			Thread.sleep(6000);

//			lb.quitBrowser();
			

		}


	}

}

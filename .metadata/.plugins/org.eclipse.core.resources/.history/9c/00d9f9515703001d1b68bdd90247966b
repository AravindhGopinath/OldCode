package org.run;

import java.awt.AWTException;
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

public class Old_Vehicle   {

	

	static ExtentTest test;
	static ExtentReports report;
	

	@DataProvider
	public Iterator<Object[]> getTestData() {

		ArrayList<Object[]> testData = ExcelUtils.getDataFromexcel();
		return testData.iterator();

	}

	@Test(dataProvider = "getTestData")
	private void row1(String Car_no, String Mob_no, String OTP_1, String Vehicle_number,
			String Make_and_model,String Variant, String Registration_date, String Select_registration,
			String city_of_registration, String Enter_company_name,
		  	String Enter_GST_number, String select_previous_policy_type,
			String previous_policy_expiry_date, String Ea_Enter_accessories_name,
		  	String Ea_Enter_accessories_amount, String NEa_Enter_accessories_name,
		  	String NEa_Enter_accessories_amount, String Fuel_Type, String Enter_amount,
			String Full_name, String Mob_no1, String Email, String Ad_line1, String Ad_line2,
			String Pincode, String Nominee_name, String Nominee_age,String Relationship,
			String Chassis_Number,String Engine_Number,String Hypothecation,
			String Loan_Provider,String Financier_Branch,String Insurer,String Policy_Number,
			String Policy_Expiry_Date) throws InterruptedException, IOException, AWTException {
		
		System.out.println("New_SGI_Launching...");
		
		BaseClass lb = new BaseClass();
		 
		WebDriver driver = lb.launchBrowser("chrome");
		
		lb.loadUrl("https://www.facebook.com/");
		
//		https://experience.novactech.in/digital/sgi/fwl/login.html
		
//		https://experience.novactech.in/digital/sgi/fwl/login.html
		
//		http://sitfw.shriramgi.com/car-insurance-online/
		
		
		Old_Vehicle_Internal.testCase(Car_no, Mob_no, OTP_1,Vehicle_number,Make_and_model,Variant,
				Registration_date,Select_registration,city_of_registration,Enter_company_name,Enter_GST_number,
				select_previous_policy_type,previous_policy_expiry_date,Ea_Enter_accessories_name,
				Ea_Enter_accessories_amount,NEa_Enter_accessories_name,NEa_Enter_accessories_amount,
				Fuel_Type,Enter_amount,  Full_name,  Mob_no1,  Email,  Ad_line1,  Ad_line2,  Pincode,
				Nominee_name,  Nominee_age,Relationship,Chassis_Number,Engine_Number,Hypothecation,
				Loan_Provider,Financier_Branch,Insurer,Policy_Number,Policy_Expiry_Date);
		
		Thread.sleep(2500);
		
		lb.closeBrowser();
		
		
	}

//	@AfterTest
//	private void closeBrowser() {
//		
//		BaseClass lb = new BaseClass();
//		
//		Locators ls  =new Locators();
//		
//		WebDriver driver = new ChromeDriver();
//		
//		WebElement findElement = driver.findElement(By.name("sdjgsj"));
//		
//		findElement.sendKeys("Fail");
//		
//		System.out.println("Fail");
//		
//	}
	
}


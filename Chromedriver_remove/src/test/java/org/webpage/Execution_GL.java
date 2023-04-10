package org.webpage;

import java.io.IOException;

import org.libglobal.LibGlobal;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.run.gl.LoginPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Execution_GL {
	WebDriver driver;
	static ExtentTest test;
	static ExtentReports report;
//
@BeforeTest
	public void startTest() {
//
		report = new ExtentReports("C:\\Users\\a1354\\eclipse-workspace\\Shriram_Gold_Loan\\test-output.html");
		//report.startTest("Is browser launching", "Gold loan Browser checking in chrome");
		LibGlobal libglobal = new LibGlobal();
		libglobal.launchBrowser("chrome");
		libglobal.loadUrl("https://digital.novactech.in/");
		 //test.log(LogStatus.PASS, "chrome launched successfully");

	}

	@Test(priority = 0)
	public void f() throws IOException, InterruptedException {
		
		test = report.startTest("Is URL launching", "Gold loan URL checking");

		test.log(LogStatus.PASS, "URL launched successfully");

		LibGlobal libglobal = new LibGlobal();
		
		LoginPage loginpage = new LoginPage();

		WebElement noticeCloseButton = loginpage.getNoticeCloseButton();
		
		libglobal.Click(noticeCloseButton);

		WebElement applynow = loginpage.getApplynow();
		
		libglobal.Click(applynow);

		WebElement clickbutton = loginpage.getClickbutton();
		
		libglobal.Click(clickbutton);
		
		Thread.sleep(2000);
		
		WebElement finalapply = loginpage.getFinalapply();
		
		libglobal.btnClick(finalapply);

		Thread.sleep(2000);

		libglobal.failScreenCapture();

		Thread.sleep(2000);
	}

// **********************************************Applicant_Name******************************************************************
	@Test(priority = 1)

	public void nameValidation() throws IOException, InterruptedException {

		test = report.startTest("Name validation");

		LibGlobal libglobal = new LibGlobal();

		LoginPage loginpage = new LoginPage();

		WebElement applicantname = loginpage.getApplicantname();

		libglobal.setText(applicantname, libglobal.getDataFromExcel("GL_Data", 2, 0));

		test.log(LogStatus.PASS, "Entered valid name");

		libglobal.updateDataInExcel("GL_Data", 2, 1, "Entered Applicant Name is Passed");

		Thread.sleep(1000);

	}
// ********************************************Mobile_Number*********************************************************************

	@Test(priority = 2)

	public void MobileValidation1() throws IOException {

		test = report.startTest("Mno.1 validation");

		LibGlobal libglobal = new LibGlobal();

		LoginPage loginpage = new LoginPage();

		WebElement mobileno = loginpage.getMobileno();

		libglobal.doubleClick(mobileno);

		libglobal.setText(mobileno, libglobal.getDataFromExcel("GL_Data", 4, 0));

		WebElement mobilenoError = loginpage.getMobilenoError();

		if (libglobal.displayed(mobilenoError)) {
 
			test.log(LogStatus.FAIL, "Invalid MNo");

			libglobal.updateDataInExcel("GL_Data", 4, 1, "Entered invalid mobile no. is failed");

		}

		else {

			test.log(LogStatus.PASS, "Invalid MNo");

			libglobal.updateDataInExcel("GL_Data", 4, 1, "Entered invalid mobile no. is passed");

		}

		mobileno.clear();

	}

	@Test(priority = 3)

	private void mobileValidation2() throws IOException {

		test = report.startTest("Mno.2 validation");

		LibGlobal libglobal = new LibGlobal();

		LoginPage loginpage = new LoginPage();

		WebElement mobileno = loginpage.getMobileno();

		libglobal.doubleClick(mobileno);

		libglobal.setText(mobileno, libglobal.getDataFromExcel("GL_Data", 5, 0));

		WebElement mobilenoError = loginpage.getMobilenoError();

		if (libglobal.displayed(mobilenoError)) {

			libglobal.updateDataInExcel("GL_Data", 5, 1, "Entered invalid mobile no. is failed");

			test.log(LogStatus.FAIL, "Invalid MobNo.");
		}

		else {

			libglobal.updateDataInExcel("GL_Data", 5, 1, "Entered invalid mobile no. is passed");

			test.log(LogStatus.PASS, "Invalid MobNo.");
		}

		mobileno.clear();

	}

	@Test(priority = 4)

	private void mobileValidation3() throws IOException {

		test = report.startTest("Mno. validation");

		LibGlobal libglobal = new LibGlobal();

		LoginPage loginpage = new LoginPage();

		WebElement mobileno = loginpage.getMobileno();

		libglobal.doubleClick(mobileno);

		libglobal.setText(mobileno, libglobal.getDataFromExcel("GL_Data", 6, 0));

		WebElement mobilenoError = loginpage.getMobilenoError();

		if (libglobal.displayed(mobilenoError)) {

			libglobal.updateDataInExcel("GL_Data", 6, 1, "Entered valid mobile no. is failed");

			test.log(LogStatus.FAIL, "Valid MobNo.");
		}

		else {

			test.log(LogStatus.PASS, "Valid MobNo.");

			libglobal.updateDataInExcel("GL_Data", 6, 1, "Entered valid mobile no. is passed");
		}
	}

// ************************************************Mail_Id******************************************************************
	@Test(priority = 5)

	private void invalidEmailValidatio() throws IOException {

		test = report.startTest("Invalid email validation");

		LibGlobal libglobal = new LibGlobal();

		LoginPage loginpage = new LoginPage();

		WebElement email = loginpage.getEmail();

		libglobal.doubleClick(email);

		libglobal.setText(email, libglobal.getDataFromExcel("GL_Data", 8, 0));

		WebElement mailerror = loginpage.getMailerror();

		if (libglobal.displayed(mailerror)) {

			libglobal.updateDataInExcel("GL_Data", 8, 1, "Entered invalid email is failed");

			test.log(LogStatus.FAIL, "Valid MobNo.");

			System.out.println("Test Case is failed");

		}

		else {

			libglobal.updateDataInExcel("GL_Data", 8, 1, "Entered invalid email is Passed");

			test.log(LogStatus.PASS, "Valid MobNo.");

			System.out.println("Test Case is Passed");

		}

		email.clear();
	}

	@Test(priority = 6)

	private void emailValidation() throws IOException {

		test = report.startTest("Valid email validation");

		LibGlobal libglobal = new LibGlobal();

		LoginPage loginpage = new LoginPage();

		WebElement email = loginpage.getEmail();

		libglobal.doubleClick(email);

		WebElement mailerror = loginpage.getMailerror();

		libglobal.setText(email, libglobal.getDataFromExcel("GL_Data", 9, 0));

		if (libglobal.displayed(mailerror)) {

			libglobal.updateDataInExcel("GL_Data", 9, 1, "Entered valid email is failed");

			test.log(LogStatus.FAIL, "Valid MobNo.");

			System.out.println("Test Case is Failed");

		}

		else {

			libglobal.updateDataInExcel("GL_Data", 9, 1, "Entered valid email is Passed");

			test.log(LogStatus.PASS, "Valid MobNo.");

			System.out.println("Test Case is Passed");

		}

	}

// **********************************************Date_Of_Birth***************************************************************
	@Test(priority = 7)

	private void dateOfBirth() {

		test = report.startTest("Date picker validation");

		LibGlobal libglobal = new LibGlobal();

		LoginPage loginpage = new LoginPage();

		WebElement dob = loginpage.getDOB();

		libglobal.Click(dob);

		WebElement yeardatepicker = loginpage.getYeardatepicker();

		libglobal.selectOptionByText(yeardatepicker, "1999");

		WebElement monthdatepicker = loginpage.getMonthdatepicker();

		libglobal.selectOptionByText(monthdatepicker, "Feb");

		WebElement datedatepicker = loginpage.getDatedatepicker();

		libglobal.btnClick(datedatepicker);

		test.log(LogStatus.PASS, "Date picker picked by automation");

	}

// *************************************************Gender*****************************************************************
	@Test(priority = 8)

	private void gender() {

		test = report.startTest("Gender field radio button click validation");

		LibGlobal libglobal = new LibGlobal();

		LoginPage loginpage = new LoginPage();

		WebElement gender = loginpage.getGender();

		libglobal.Click(gender);

		test.log(LogStatus.PASS, "Radio button clicked successfully");

	}

// *************************************************Marital_Status*****************************************************************
	@Test(priority = 9)

	private void maritalStatus() {

		test = report.startTest("click validation of Marital Status field radio button ");

		LibGlobal libglobal = new LibGlobal();

		LoginPage loginpage = new LoginPage();

		WebElement maritalstatus = loginpage.getMaritalstatus();

		libglobal.Click(maritalstatus);

		test.log(LogStatus.PASS, "Radio button clicked successfully");

	}

// *************************************************PAN_Number*****************************************************************
	@Test(priority = 10)

	private void panNo() throws IOException {

		test = report.startTest("validation of Invalid PAN No. field");

		LibGlobal libglobal = new LibGlobal();

		LoginPage loginpage = new LoginPage();

		WebElement panno = loginpage.getPanno();

		libglobal.setText(panno, libglobal.getDataFromExcel("GL_Data", 11, 0));

		libglobal.updateDataInExcel("GL_Data", 11, 1, "Entered invalid PAN No. is passed");

		libglobal.updateDataInExcel("GL_Data", 11, 2, "Bug");

		test.log(LogStatus.FAIL, "Invalid PAN No. is passed");

		panno.clear();
	}

	@Test(priority = 11)

	private void panNo1() throws IOException {

		test = report.startTest("validation of PAN No. field");

		LibGlobal libglobal = new LibGlobal();

		LoginPage loginpage = new LoginPage();

		WebElement panno = loginpage.getPanno();

		libglobal.setText(panno, libglobal.getDataFromExcel("GL_Data", 12, 0));

		libglobal.updateDataInExcel("GL_Data", 12, 1, "Entered invalid 9 digit PAN No. is passed ");

		libglobal.updateDataInExcel("GL_Data", 12, 2, "Bug");

		test.log(LogStatus.FAIL, "Invalid PanNo. is Passed");

		panno.clear();
	}

	@Test(priority = 12)

	private void PanNo2() throws IOException {

		test = report.startTest("validation of PAN No. field");

		LibGlobal libglobal = new LibGlobal();

		LoginPage loginpage = new LoginPage();

		WebElement panno = loginpage.getPanno();

		libglobal.setText(panno, libglobal.getDataFromExcel("GL_Data", 13, 0));

		libglobal.updateDataInExcel("GL_Data", 13, 1, "Entered valid PAN No. is passed");

		test.log(LogStatus.PASS, "Invalid PanNo. is Passed");

	}

// *************************************************Loan_Amount*****************************************************************
	@Test(priority = 13)

	private void loanAmt() throws IOException {

		test = report.startTest("validation of Loan Amount field");

		LibGlobal libglobal = new LibGlobal();

		LoginPage loginpage = new LoginPage();

		WebElement loanamount = loginpage.getLoanamount();

		libglobal.setText(loanamount, libglobal.getDataFromExcel("GL_Data", 15, 0));

		WebElement loanamounterror = loginpage.getLoanamounterror();

		if (libglobal.displayed(loanamounterror)) {

			libglobal.updateDataInExcel("GL_Data", 15, 1, "Entered invalid loan amount is failed");

			test.log(LogStatus.FAIL, "Invalid loan amount");

			System.out.println("Test Case is failed");

		}

		else {

			libglobal.updateDataInExcel("GL_Data", 15, 1, "Entered invalid loan amount is Passed");

			test.log(LogStatus.PASS, "Invalid loan amount");

			System.out.println("Test Case is Passed");

		}

		loanamount.clear();
	}

	@Test(priority = 14)

	private void loanAmt1() throws IOException {

		test = report.startTest("validation of Loan Amount field");

		LibGlobal libglobal = new LibGlobal();

		LoginPage loginpage = new LoginPage();

		WebElement loanamount = loginpage.getLoanamount();

		libglobal.setText(loanamount, libglobal.getDataFromExcel("GL_Data", 16, 0));

		WebElement loanamounterror = loginpage.getLoanamounterror();

		if (libglobal.displayed(loanamounterror)) {

			libglobal.updateDataInExcel("GL_Data", 16, 1, "Entered invalid loan amount is failed");

			test.log(LogStatus.FAIL, "Invalid loan amount");

			System.out.println("Test Case is failed");

		}

		else {

			libglobal.updateDataInExcel("GL_Data", 16, 1, "Entered invalid loan amount is Passed");

			test.log(LogStatus.PASS, "Invalid loan amount");

			System.out.println("Test Case is Passed");

		}

		loanamount.clear();
	}

	@Test(priority = 15)

	private void loanAmt2() throws IOException {

		test = report.startTest("validation of Loan Amount field");

		LibGlobal libglobal = new LibGlobal();

		LoginPage loginpage = new LoginPage();

		WebElement loanamount = loginpage.getLoanamount();

		libglobal.setText(loanamount, libglobal.getDataFromExcel("GL_Data", 17, 0));

		WebElement loanamounterror = loginpage.getLoanamounterror();

		if (libglobal.displayed(loanamounterror)) {

			libglobal.updateDataInExcel("GL_Data", 17, 1, "Entered valid loan amount is failed");

			test.log(LogStatus.FAIL, "Valid Loan Amount");

			System.out.println("Test Case is failed");

		}

		else {

			libglobal.updateDataInExcel("GL_Data", 17, 1, "Entered valid loan amount is Passed");

			test.log(LogStatus.PASS, "Valid Loan Amount");

			System.out.println("Test Case is Passed");

		}

		loanamount.clear();
	}

	@Test(priority = 16)

	private void loanAmt3() throws IOException {

		test = report.startTest("validation of Loan Amount field");

		LibGlobal libglobal = new LibGlobal();

		LoginPage loginpage = new LoginPage();

		WebElement loanamount = loginpage.getLoanamount();

		libglobal.setText(loanamount, libglobal.getDataFromExcel("GL_Data", 18, 0));

		WebElement loanamounterror = loginpage.getLoanamounterror();
		
		if (libglobal.displayed(loanamounterror)) {

			libglobal.updateDataInExcel("GL_Data", 18, 1, "Entered valid loan amount is failed");

			test.log(LogStatus.FAIL, "Valid loan amount");

			System.out.println("Test Case is failed");

		}

		else {

			libglobal.updateDataInExcel("GL_Data", 18, 1, "Entered valid loan amount is Passed");

			test.log(LogStatus.PASS, "Valid loan amount");

			System.out.println("Test Case is Passed");

		}

	}

// *************************************************Pincode*****************************************************************
	@Test(priority = 17)

	private void pincode0() throws IOException {

		test = report.startTest("validation of Pincode field");

		LibGlobal libglobal = new LibGlobal();

		LoginPage loginpage = new LoginPage();

		WebElement pincode = loginpage.getPincode();

		libglobal.doubleClick(pincode);

		libglobal.setText(pincode, libglobal.getDataFromExcel("GL_Data", 20, 0));

		WebElement pincodeerror = loginpage.getPincodeerror();

		if (libglobal.displayed(pincodeerror)) {

			libglobal.updateDataInExcel("GL_Data", 20, 1, "Entered valid 6 digits pincode is failed");

			test.log(LogStatus.FAIL, "Valid Pincode");

			System.out.println("Test Case is failed");

		}

		else {

			libglobal.updateDataInExcel("GL_Data", 20, 1, "Entered valid 6 digits pincode is Passed");

			test.log(LogStatus.PASS, "Valid Pincode");

			System.out.println("Test Case is Passed");

		}

	}

// *****************************************************CheckBox******************************************************************

	@Test(priority = 18)

	private void checkbox() throws InterruptedException, IOException {

		test = report.startTest("validation of Checkbox field");

		LibGlobal libglobal = new LibGlobal();

		LoginPage loginpage = new LoginPage();

		WebElement checkmark = loginpage.getCheckmark();

		libglobal.btnClick(checkmark);

		Thread.sleep(2000);

		boolean displayed = checkmark.isDisplayed();

		Thread.sleep(2000);

		if (displayed) {

			System.out.println("Checkbox is selected ,Test case is Passed");

			test.log(LogStatus.PASS, "Checkbox is selected");

		}

		else {

			System.out.println("Checkbox is not selected ,Test case is Failed");

			test.log(LogStatus.FAIL, "Checkbox isn't selected");

		}

		Thread.sleep(2000);

		libglobal.passScreenCapture();

		Thread.sleep(1000);

	}

// *************************************************Apply_Now*****************************************************************
	@Test(priority = 19)

	private void applynow() {

		test = report.startTest("Validation Of apply now button field");

		LibGlobal libglobal = new LibGlobal();

		LoginPage loginpage = new LoginPage();

		WebElement finalapply1 = loginpage.getFinalapply();

		libglobal.btnClick(finalapply1);

		test.log(LogStatus.PASS, "Apply button clicked properly");

	}

	@AfterTest
	public void closeBrowser() throws Exception {
		LibGlobal libglobal = new LibGlobal();

		report.endTest(test);

		report.flush();
		
		Thread.sleep(5000);
		//libglobal.emailSent();
		

		libglobal.closeBrowser();
	}


	
	
	
	
	
	
	
	
	
	
	
// *****************************************************Done******************************************************************

	//
	// //
	// *************************************************Residence_City*****************************************************************
	// //
	// // WebElement residencecity = loginpage.getResidencecity();
	// //
	// // libglobal.doubleClick(residencecity);
	// //
	// // libglobal.setText(residencecity, libglobal.getDataFromExcel("GL_Data", 22,
	// // 0));
	// //
	// // WebElement residencecityerror = loginpage.getResidencecityerror();
	// //
	// // String resicityerror = residencecityerror.getText();
	// //
	// // if (resicityerror == resicityerror) {
	// //
	// // libglobal.updateDataInExcel("GL_Data", 22, 1, "Entered invalid data is
	// // failed");
	// // System.out.println("Test Case is failed");
	// //
	// // } else {
	// //
	// // libglobal.updateDataInExcel("GL_Data", 22, 1, "Entered invalid data is
	// // Passed");
	// // System.out.println("Test Case is Passed");
	// //
	// // }
	// //
	// // residencecity.clear();
	// //
	// // libglobal.doubleClick(residencecity);
	// //
	// // libglobal.setText(residencecity, libglobal.getDataFromExcel("GL_Data", 23,
	// // 0));
	// //
	// // if (resicityerror == resicityerror) {
	// //
	// // libglobal.updateDataInExcel("GL_Data", 23, 1, "Entered invalid data is
	// // failed");
	// // System.out.println("Test Case is failed");
	// //
	// // } else {
	// //
	// // libglobal.updateDataInExcel("GL_Data", 23, 1, "Entered invalid data is
	// // Passed");
	// // System.out.println("Test Case is Passed");
	// //
	// // }
	// //
	// // residencecity.clear();
	// //
	// // libglobal.doubleClick(residencecity);
	// //
	// // libglobal.setText(residencecity, libglobal.getDataFromExcel("GL_Data", 24,
	// // 0));
	// //
	// // if (resicityerror == resicityerror) {
	// //
	// // libglobal.updateDataInExcel("GL_Data", 24, 1, "Failed - Accepts maximum 50
	// // chars. ");
	// // System.out.println("Test Case is failed");
	// //
	// // } else {
	// //
	// // libglobal.updateDataInExcel("GL_Data", 24, 1, "Passed - Accepts more than
	// 50
	// // chars.");
	// // System.out.println("Test Case is Passed");
	// //
	// // }
	// //
	// // residencecity.clear();
	// //
	// // libglobal.doubleClick(residencecity);
	// //
	// // libglobal.setText(residencecity, libglobal.getDataFromExcel("GL_Data", 25,
	// // 0));
	// //
	// // if (resicityerror.isEmpty()) {
	// //
	// // libglobal.updateDataInExcel("GL_Data", 25, 1, "Entered valid alphabets
	// data
	// // is failed");
	// // System.out.println("Test Case is failed");
	// //
	// // } else {
	// //
	// // libglobal.updateDataInExcel("GL_Data", 25, 1, "Entered valid alphabets
	// data
	// // is passed");
	// // System.out.println("Test Case is Passed");
	// //
	// // }
	// //
	// // //
	// //
	// *************************************************State*****************************************************************
	// //
	// // WebElement state = loginpage.getState();
	// //
	// // libglobal.doubleClick(state);
	// //
	// // libglobal.setText(state, libglobal.getDataFromExcel("GL_Data", 27, 0));
	// //
	// // WebElement stateerror = loginpage.getStateerror();
	// //
	// // String sterror = stateerror.getText();
	// //
	// // if (sterror == sterror) {
	// //
	// // libglobal.updateDataInExcel("GL_Data", 27, 1, "Entered invalid data is
	// // failed");
	// // System.out.println("Test Case is failed");
	// //
	// // } else {
	// //
	// // libglobal.updateDataInExcel("GL_Data", 27, 1, "Entered invalid data is
	// // Passed");
	// // System.out.println("Test Case is Passed");
	// //
	// // }
	// //
	// // state.clear();
	// //
	// // libglobal.doubleClick(state);
	// //
	// // libglobal.setText(state, libglobal.getDataFromExcel("GL_Data", 28, 0));
	// //
	// // if (sterror == sterror) {
	// //
	// // libglobal.updateDataInExcel("GL_Data", 28, 1, "Entered invalid data is
	// // failed");
	// // System.out.println("Test Case is failed");
	// //
	// // } else {
	// //
	// // libglobal.updateDataInExcel("GL_Data", 28, 1, "Entered invalid data is
	// // Passed");
	// // System.out.println("Test Case is Passed");
	// //
	// // }
	// //
	// // state.clear();
	// //
	// // libglobal.doubleClick(state);
	// //
	// // libglobal.setText(state, libglobal.getDataFromExcel("GL_Data", 29, 0));
	// //
	// // if (sterror == sterror) {
	// //
	// // libglobal.updateDataInExcel("GL_Data", 29, 1, "Failed - Accepts maximum 50
	// // chars. ");
	// // System.out.println("Test Case is failed");
	// //
	// // } else {
	// //
	// // libglobal.updateDataInExcel("GL_Data", 29, 1, "Passed - Accepts more than
	// 50
	// // chars.");
	// // System.out.println("Test Case is Passed");
	// //
	// // }
	// //
	// // state.clear();
	// //
	// // libglobal.doubleClick(state);
	// //
	// // libglobal.setText(state, libglobal.getDataFromExcel("GL_Data", 30, 0));
	// //
	// // if (sterror.isEmpty()) {
	// //
	// // libglobal.updateDataInExcel("GL_Data", 30, 1, "Entered valid alphabets
	// data
	// // is failed");
	// // System.out.println("Test Case is failed");
	// //
	// // } else {
	// //
	// // libglobal.updateDataInExcel("GL_Data", 30, 1, "Entered valid alphabets
	// data
	// // is passed");
	// // System.out.println("Test Case is Passed");
	// //
	// // }
	//
	// //
	// *************************************************Apply_Now*****************************************************************
	//
	// //
	// *****************************************************Done******************************************************************
	//
	//
	// //}

}

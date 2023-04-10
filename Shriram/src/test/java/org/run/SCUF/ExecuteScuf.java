package org.run.SCUF;

import java.io.IOException;

import org.libglobal.LibGlobal;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.pages.LoginPage;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExecuteScuf  {
	@BeforeTest
	public void launchBrowser() {
		ExtentReports extentreport;
		ExtentHtmlReporter htmlreport;
		ExtentTest test;

		extentreport = new ExtentReports();

		htmlreport = new ExtentHtmlReporter("Reporter.html");

		extentreport.attachReporter(htmlreport);

		extentreport.createTest("Scuf Gold loan Flow");

		extentreport.flush();

		LibGlobal libglobal = new LibGlobal();

		WebDriver launchBrowser = libglobal.launchBrowser("chrome");

		libglobal.loadUrl("https://uatnew.stfc.in");

	}

	@Test
	public void f() throws IOException, InterruptedException {
		Reporter.log("Aravindh");

		LibGlobal libglobal = new LibGlobal();
		LoginPage loginpage = new LoginPage();

		WebElement careers = loginpage.getCareers();
		
		libglobal.btnClick(careers);

		WebElement queries = loginpage.getQueries();
		
		libglobal.btnClick(queries);

		WebElement username = loginpage.getUsername();
		
		libglobal.setText(username, libglobal.getDataFromExcel("Sheet1", 0, 0));

		WebElement email = loginpage.getEmail();
		
		libglobal.setText(email, libglobal.getDataFromExcel("Sheet1", 1, 0));

		WebElement mobileno = loginpage.getMobileno();
		
		libglobal.setText(mobileno, libglobal.getDataFromExcel("Sheet1", 2, 0));

		WebElement pincode = loginpage.getPincode();
		
		libglobal.setText(pincode, libglobal.getDataFromExcel("Sheet1", 3, 0));

		WebElement city = loginpage.getCity();
		
		libglobal.setText(city, libglobal.getDataFromExcel("Sheet1", 4, 0));

		WebElement state = loginpage.getState();
		
		libglobal.setText(state, libglobal.getDataFromExcel("Sheet1", 5, 0));

		WebElement productType = loginpage.getProductType();
		
		libglobal.scrollDown(productType);
		
		libglobal.selectOptionByValue(productType, 1);

		WebElement requestType = loginpage.getRequestType();
		
		libglobal.scrollDown(requestType);
		
		libglobal.selectOptionByIndex(requestType, 1);

		WebElement feedback = loginpage.getFeedback();
		
		libglobal.setText(feedback, libglobal.getDataFromExcel("Sheet1", 6, 0));

		WebElement submitButton = loginpage.getSubmitButton();
		
		libglobal.Click(submitButton);

		WebElement pincode1 = loginpage.getpincode1();
		
		libglobal.setText(pincode1, libglobal.getDataFromExcel("Sheet1", 7, 0));

		WebElement getstate = loginpage.getstate();
		
		libglobal.Click(getstate);

		WebElement clkdrpdwn = loginpage.getstate();
		
		libglobal.scrollDown(clkdrpdwn);
		
		libglobal.selectOptionByText(clkdrpdwn, "Tamil Nadu");

		WebElement city2 = loginpage.getLocatorcity();
		
		libglobal.scrollDown(city2);
		
		libglobal.selectOptionByText(city2, "Coimbatore");

		WebElement locatorbranch = loginpage.getLocatorbranch();
		
		libglobal.scrollDown(locatorbranch);
		
		libglobal.selectOptionByIndex(locatorbranch, 1);

	}
	// @AfterTest
	// public void afterTest() {
	// LibGlobal libglobal = new LibGlobal();
	// libglobal.closeBrowser();
	// }

}

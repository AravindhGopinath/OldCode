package org.execution;

import java.io.IOException;

import org.baseclass.BaseClass;
import org.elements.Elements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class RunExecution {

	static ExtentTest test;
	static ExtentReports report;

	@BeforeTest
	public void startTest() {

		report = new ExtentReports("C:\\Users\\a1354\\eclipse-workspace\\EmailSent\\test-output.html");
		// report.startTest("Is browser launching", "Gold loan Browser checking in
		// chrome");
		BaseClass bc = new BaseClass();
		WebDriver driver = bc.launchBrowser("chrome");
		bc.loadUrl("https://digital.novactech.in/");
		// test.log(LogStatus.PASS, "chrome launched successfully");

	}

	@Test
	public void f() throws IOException, InterruptedException {

		System.out.println("yes");

		test = report.startTest("Is URL launching", "Gold loan URL checking");

		 test.log(LogStatus.PASS, "URL launched successfully");

		BaseClass bc = new BaseClass();
		WebDriver driver = bc.driver;

		Elements ec = new Elements();

		WebElement noticeCloseButton = ec.getNoticeCloseButton();

		bc.Click(noticeCloseButton);

		WebElement applynow = ec.getApplynow();

		bc.btnClick(applynow);

		WebElement clickbutton = ec.getClickbutton();

		bc.Click(clickbutton);

		Thread.sleep(2000);

		WebElement finalapply = ec.getFinalapply();
		// bc.scrollDown(finalapply);
		bc.btnClick(finalapply);

		Thread.sleep(2000);

		bc.failScreenCapture();

		Thread.sleep(2000);
	}

}

package org.run;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.elements.Locators;
import org.elements.Page_2_OTP;
import org.elements.Page_3;
import org.libglobal.LibGlobal;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableBiMap.Builder;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class GL_Run {

	WebDriver driver;
	static ExtentTest test;
	static ExtentReports report;

	@BeforeTest
	public void startTest() {

		report = new ExtentReports("C:\\Users\\a1354\\eclipse-workspace\\GoldLoan\\test-output.html");

		LibGlobal lb = new LibGlobal();

		lb.launchBrowser("chrome");

		lb.loadUrl("https://digital.novactech.in/gold-loan-apply-online?token=91a1f7bf6d524d068291227ff5cd7cfc");

	}

	@Test(priority = 0)

	private void disabled() {

		test = report.startTest("Validation of checkbox isn't selected while URL launched_&_",
				"Validation of get your loan button isn't enabled while URL launched");

		LibGlobal lb = new LibGlobal();

		Locators ls = new Locators();

		WebElement disabledbtn = ls.getDisabledbtn();

		boolean displayed = disabledbtn.isDisplayed();

		WebElement checkbox = ls.getCheckbox();

		if (displayed = false) {

			test.log(LogStatus.FAIL, "test case is failed");
		}

		else if (checkbox.isSelected()) {

			test.log(LogStatus.FAIL, "test case is failed");
		}

		else {

			test.log(LogStatus.PASS, "test case is passed");
		}

	}

	@Test(priority = 1)

	private void btnavail() {

		test = report.startTest("Validation of know how and terms and conditions buttons are avilable in the screen");

		LibGlobal lb = new LibGlobal();

		Locators ls = new Locators();

		WebElement knowhowbtn = ls.getKnowhowbtn();

		WebElement tandcbtn = ls.getTandcbtn();

		if (knowhowbtn.isDisplayed()) {

			test.log(LogStatus.PASS, "test case is passed");

		}

		else if (tandcbtn.isDisplayed()) {

			test.log(LogStatus.PASS, "test case is passed");

		}

		else {

			test.log(LogStatus.FAIL, "test case is failed");

		}

	}

	@Test(priority = 2)

	public void btnClick() throws InterruptedException {

		test = report.startTest("Validation of clicking know how button");

		LibGlobal lb = new LibGlobal();

		Locators ls = new Locators();

		WebElement knowhowbtn = ls.getKnowhowbtn();

		knowhowbtn.click();

		Thread.sleep(2000);

		WebElement gotitbtn = ls.getGotitbtn();

		lb.scrollDown(gotitbtn);

		Thread.sleep(2500);

		test.log(LogStatus.PASS, "User able to click know-how button");
	}

	@Test(priority = 3)

	private void reortbtn() throws InterruptedException {

		test = report.startTest("Validation of user able to report a problem ");

		WebDriver driver = LibGlobal.driver;

		LibGlobal lb = new LibGlobal();

		Locators ls = new Locators();

		String webpage = "Contact Us | Toll Free Number - Shriram City";

		WebElement reportproblem = ls.getReportproblem();

		reportproblem.click();

		String parent = driver.getWindowHandle();

		Set<String> s = driver.getWindowHandles();

		Iterator<String> I1 = s.iterator();

		while (I1.hasNext()) {

			String child_window = I1.next();

			if (!parent.equals(child_window)) {

			driver.switchTo().window(child_window);

			System.out.println(driver.switchTo().window(child_window).getTitle());
			
			Thread.sleep(3000);
			
			test.log(LogStatus.PASS, "User ables to report a problem");
			
			driver.close();

			}
			
			else if (webpage.isEmpty()) {
				
				test.log(LogStatus.FAIL, "User can't able to report a problem");
			}
			}

		driver.switchTo().window(parent);

		ls.getGotitbtn().click();

	}
	
	@Test(priority=4)
	
	private void tandcbutton() throws InterruptedException {
		
		test=report.startTest("Validation of terms and conditions button");
		
		WebDriver driver = LibGlobal.driver;

		LibGlobal lb = new LibGlobal();

		Locators ls = new Locators();
		
		WebElement tandcbtn = ls.getTandcbtn();
		
		WebElement tandcscroll = ls.getTandcscroll();
		
		WebElement tandcshriramlinkbtn = ls.getTandcshriramlinkbtn();
		
		tandcbtn.click();
		
		Thread.sleep(2500);
		
		String parent1 = driver.getWindowHandle();
		
		Set<String> s1 = driver.getWindowHandles();
		
		lb.scrollDown(tandcscroll);
		
		lb.scrollUp(tandcshriramlinkbtn);
		
		lb.btnClick(tandcshriramlinkbtn);
		
		String parent = driver.getWindowHandle();

		Set<String> s = driver.getWindowHandles();

		Iterator<String> I1 = s.iterator();

		while (I1.hasNext()) {

			String child_window = I1.next();

			if (!parent.equals(child_window)) {

			driver.switchTo().window(child_window);

			System.out.println(driver.switchTo().window(child_window).getTitle());
			
			Thread.sleep(3000);
			
			test.log(LogStatus.PASS, "User ables to report a problem");
			
			driver.close();

			}
			
			driver.switchTo().window(parent);
			
		}
			ls.getTandcclosebtn().click();	
		}
	
	@Test(priority=5)
	
	private void checkBoxSelect() {

		test=report.startTest("Validation of clicking checkbox and Get your loan now! button");
		
		WebDriver driver = LibGlobal.driver;

		LibGlobal lb = new LibGlobal();

		Locators ls = new Locators();
		
		WebElement checkbox = ls.getCheckbox();
		
		WebElement disabledbtn = ls.getDisabledbtn();
		
		checkbox.click();
		
		disabledbtn.click();
		
		test.log(LogStatus.PASS, "User able to click Get your loan now! Button");
	
	}

	@Test(priority=6)
	
	private void verifybtnDisabled() {
		
		test=report.startTest("Validation of verify now button is disabled");
		
		WebDriver driver = LibGlobal.driver;

		LibGlobal lb = new LibGlobal();
		
		Page_2_OTP otp = new Page_2_OTP();
		
		WebElement verifydisbalebtn = otp.getVerifybtn();
		
		if (verifydisbalebtn.isSelected()) {
			
			test.log(LogStatus.FAIL, "test case is failed");
			
			
		} else {
			
			test.log(LogStatus.PASS, "test case is passed");

		}
		
		lb.btnClick(verifydisbalebtn);
	}
	
	@Test(priority=7)	
	
	private void otpValidation() throws IOException, InterruptedException {
		
		test=report.startTest("Invalid OTP Validation");
		
		WebDriver driver = LibGlobal.driver;

		LibGlobal lb = new LibGlobal();

		Locators ls = new Locators();
		
		Page_2_OTP otp = new Page_2_OTP();
  
		WebElement otp1 = otp.getOtp1();

		lb.setText(otp1, lb.getDataFromExcel("Sheet1", 0, 0));
		
		WebElement verifybtn = otp.getVerifybtn();
		
		verifybtn.click();

		WebDriverWait w = new WebDriverWait(driver, 10);
		 
		WebElement otpOK = otp.getOkbtn();
		 
		 w.until(ExpectedConditions.visibilityOf(otpOK));
		 
		 lb.btnClick(otpOK);
		
		 List<WebElement> findElements = driver.findElements(By.name("otp[]"));

		System.out.println(findElements);

		for (int i = 0; i < findElements.size(); i++) {

			// loading text of each element in to array all_elements_text_all_elements_text

			findElements.get(i).clear();

			System.out.println(findElements.get(i).getText());
		}
		test.log(LogStatus.FAIL, "Invalid_OTP_ is Failed");
	}
	
	@Test(priority=8)
	
	private void validOtpValidation() throws IOException {
		
		test=report.startTest("Valid OTP validation");
		
		WebDriver driver = LibGlobal.driver;

		LibGlobal lb = new LibGlobal();

		Page_2_OTP otp = new Page_2_OTP();
		
		WebElement otp1 = otp.getOtp1();

		lb.setText(otp1, lb.getDataFromExcel("Sheet1", 1, 0));
		
		WebElement verifybtn = otp.getVerifybtn();
		
		verifybtn.click();
		
		test.log(LogStatus.PASS, "Valid_OTP_is passed");
		
	}
	
	@Test(priority=9)
	
	private void loanChangeClick() {

		test=report.startTest("Validation of loan change amount button");
		
		LibGlobal lb = new LibGlobal();
		
		Page_3 pg3 = new Page_3();
		
		WebElement changeloanamtbtn = pg3.getChangeloanamtbtn();
		
		changeloanamtbtn.click();

		
		test.log(LogStatus.PASS, "User able to click loan amount change button");
		
		
	}
	
		
	@Test(priority=10)
	
	private void sliderAction() throws InterruptedException {

		test=report.startTest("Validation of slider bar");
		
		LibGlobal lb = new LibGlobal();
		
		WebDriver driver =lb.driver;
		
		Page_3 pg3 = new Page_3();
		
		Thread.sleep(2500);
		
		WebElement viewloanamount = pg3.getViewloanamount();
		
		Actions move = new Actions(driver);
		
		WebElement findElement = driver.findElement(By.xpath("//*[@id=\"amount\"]/div[1]/div[2]/div"));
		
		for (int i = 0; i <10; i++) {
			
			findElement.sendKeys(Keys.RIGHT);

		}
		
		Thread.sleep(1000);
		
		WebElement confirmbutton = pg3.getConfirmbutton();
		
		lb.btnClick(confirmbutton);
		
		test.log(LogStatus.PASS, "User able to change loan amount using slider bar");
		
	}
	
	@Test(priority=11)
	
	private void acceptbtn() {
		
		test=report.startTest("Validation of Accept now button");
		
		LibGlobal lb = new LibGlobal();
		
		WebDriver driver =lb.driver;
		
		Page_3 pg3 = new Page_3();
		
		pg3.getAcptbtn().click();
		
		test.log(LogStatus.PASS, "User able to click accept button");
		
	}
	
	@Test(priority=12)

	private void editBankAc() throws InterruptedException, IOException {

		test=report.startTest("Validation of edit bank A/c details button ");
		

		LibGlobal lb = new LibGlobal();
		
		WebDriver driver =lb.driver;
		
		Page_3 pg3 = new Page_3();
		
		WebElement bankacbtn = pg3.getBankacbtn();
		
		WebElement bankacbtn2 = pg3.getBankacbtn2();
		
		WebElement bankacbtn3 = pg3.getBankacbtn3();
		
		WebElement bankpopupclose = pg3.getBankpopupclose();
		
		WebElement bankname = pg3.getBankname();
		
		WebElement bankname2 = pg3.getBankacno();
		
		WebElement rebankacno = pg3.getRebankacno();
		
		WebElement bankifsc = pg3.getBankifsc();
		
		WebElement savebtn = pg3.getSavebtn();
		
		lb.Click(bankacbtn2);
		
		lb.Click(bankpopupclose);
		
		lb.Click(bankacbtn2);
		
		lb.Click(bankpopupclose);
		
		lb.Click(bankacbtn3);
		
		Thread.sleep(7000);
		
		lb.setText(bankifsc, lb.getDataFromExcel("Sheet1", 0, 4));
		
		Thread.sleep(7000);

		lb.setText(bankname, lb.getDataFromExcel("Sheet1", 0, 1));
		
		Thread.sleep(2000);

		lb.setText(rebankacno, lb.getDataFromExcel("Sheet1", 0, 3));
		
		Thread.sleep(2000);

		lb.setText(bankname2, lb.getDataFromExcel("Sheet1", 0, 2));
		
		savebtn.click();
		
		}
	
	
	
	
	
	@AfterTest
	public void closeBrowser() throws Exception {

		LibGlobal libglobal = new LibGlobal();

		report.endTest(test);

		report.flush();

		// Thread.sleep(5000);
		// libglobal.emailSent();

		//libglobal.closeBrowser();
	}

}

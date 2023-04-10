package org.run.gl;

import org.libglobal.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends LibGlobal {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@CacheLookup
	
	//String = "Please enter a valid 10 digit mobile number";
	//private WebElement Mobnoerror;


	@FindBy(xpath = "//a[@class='close-btn']")
	private WebElement NoticeCloseButton;

	@FindBy(xpath = "(//a[@class='apply-now'])[3]")
	private WebElement applynow;

	@FindBy(xpath= "//*[@id=\"AFName\"]")
	private WebElement Applicantname;

	@FindBy(xpath= "//*[@id=\"AFMobile\"]")
	private WebElement Mobileno;

	@FindBy(xpath="//*[@id=\"AFName-error\"]")
	private WebElement Applicantnameerror;
	
	@FindBy(xpath= "//label[text()='Please enter a valid 10 digit mobile number']")
	private WebElement MobilenoError;
	
	@FindBy(id = "AFEmail")
	private WebElement Email;

	@FindBy(xpath = "(//button[@class='btn btn-sm pr2 qkcopy'])")
	private WebElement Clickbutton;

	@FindBy(xpath = "//*[@id=\"qkgoldloandetsubmitform\"]/div[2]/div[2]/div/label")
	private WebElement DOB;

	@FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/div/div/select[2]")
	private WebElement yeardatepicker;

	@FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/div/div/select[1]")
	private WebElement monthdatepicker;

	@FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[5]/a")
	private WebElement datedatepicker;

	@FindBy(id = "AFGenderMale")
	private WebElement Gender;

	@FindBy(id = "AFMaritalSingle")
	private WebElement maritalstatus;

	@FindBy(id = "AFPAN")
	private WebElement Panno;

	@FindBy(id = "AFLoan_amount")
	private WebElement loanamount;
	
	@FindBy(xpath="//label[text()='Please enter loan amount between 1K to 20L.']")
	private WebElement loanamounterror;

	@FindBy(id = "AFResidencePincode")
	private WebElement pincode;
	
	@FindBy(xpath="//*[@id=\"AFResidencePincode-error\"]")
	private WebElement  pincodeerror;

	@FindBy(xpath = "//span[@class='checkmark']")
	private WebElement checkbox;

	@FindBy(xpath = "//button[@class='t-btn t-btn-primary e-right qkgoldloandetsubmit']")
	private WebElement finalapply;
	
	@FindBy(xpath="//label[text()='Please enter a valid email id']")
	private WebElement mailerror;
	
	@FindBy(xpath="(//label[@class=\"error\"])[10]")
	private WebElement Residencecityerror;
	
	@FindBy(id="AFResidenceCity")
	private WebElement Residencecity;
	
	@FindBy(id="AFState")
	private WebElement state;
	
	@FindBy(xpath="(//label[@class='error'])[10]")
	private WebElement stateerror;
	
	@FindBy(xpath="//*[@id=\"qkgoldloandetsubmitform\"]/div[8]/div[1]/div/label/span")
	private WebElement checkmark;
	
	
	public WebElement getCheckmark() {
		return checkmark;
	}

	public WebElement getStateerror() {
		return stateerror;
	}

	public WebElement getResidencecity() {
		return Residencecity;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getResidencecityerror() {
		return Residencecityerror;
	}

	public WebElement getPincodeerror() {
		return pincodeerror;
	}
	
	public WebElement getLoanamounterror() {
		return loanamounterror;
	}

	public WebElement getMailerror() {
		return mailerror;
	}

	public WebElement getNoticeCloseButton() {
		return NoticeCloseButton;
	}

	public WebElement getClickbutton() {
		return Clickbutton;
	}

	public WebElement getEmail() {
		return Email;
	}

	public WebElement getMobileno() {
		return Mobileno;
	}

	public WebElement getApplynow() {
		return applynow;
	}

	public WebElement getApplicantname() {
		return Applicantname;
	}

	public WebElement getDatedatepicker() {
		return datedatepicker;
	}

	public WebElement getMobilenoError() {
		return MobilenoError;
	}
	public WebElement getYeardatepicker() {
		return yeardatepicker;
	}

	public WebElement getMonthdatepicker() {
		return monthdatepicker;
	}

	public WebElement getDOB() {
		return DOB;
	}

	public WebElement getGender() {
		return Gender;
	}

	public WebElement getMaritalstatus() {
		return maritalstatus;
	}

	public WebElement getPanno() {
		return Panno;
	}

	public WebElement getLoanamount() {
		return loanamount;
	}

	public WebElement getPincode() {
		return pincode;
	}

	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getFinalapply() {
		return finalapply;
	}
	public WebElement getApplicantnameerror() {
		return Applicantnameerror;
	}
	
	//public WebElement getMobnoerror() {
		//return Mobnoerror;
	



}


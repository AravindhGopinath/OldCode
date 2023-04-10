package org.pages;
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
	@FindBy(xpath = "(//a[@class='contactid'])[2]")
	private WebElement careers;
	
	@FindBy(xpath = "(//a[@class='complainact'])")
	private WebElement queries;

	
	@FindBy(id="name")
	private WebElement username;
	
	@FindBy(id="email")
	private WebElement Email;
	
	@FindBy(id="mobileNo")
	private WebElement mobileno;
	
	@FindBy(id="pincode")
	private WebElement pincode;
	
	@FindBy(id="city")
	private WebElement city;
	
	@FindBy(id="state")
	private WebElement state;
	
	
	@FindBy(id="//select[@id='productType']")
	private WebElement QueryType;
	
	@FindBy(id="Feedback")
	private WebElement Feedback;
	
	@FindBy(id="contactSubmit")
	private WebElement contactSubmit;
	
	@FindBy (id="locator-pincode")
	private WebElement Pincode1;
	
	@FindBy (id="locator-state")
	private WebElement locatorstate;
	
	@FindBy(xpath="(//option[@value='Andhra Pradesh'])[1]")
	private WebElement Andhara;

	@FindBy(id="productType")
	private WebElement ProductType;
	
	@FindBy (id="reqType")
	private WebElement RequestType;
	
	@FindBy (id="locator-city")
	private WebElement Locatorcity;
	
	@FindBy (id="locator-branch")
	private WebElement locatorbranch;
	
	
	public WebElement getLocatorbranch() {
		return locatorbranch;
	}

	public WebElement getLocatorcity() {
		return Locatorcity;
	}

	public WebElement getRequestType() {
		return RequestType;
	}

	public WebElement getContactSubmit() {
		return contactSubmit;
	}

	public WebElement getPincode1() {
		return Pincode1;
	}

	public WebElement getLocatorstate() {
		return locatorstate;
	}

	public WebElement getAndhara() {
		return Andhara;
	}

	public WebElement getCareers() {
		return careers;
	}

	public WebElement getQueries() {
		return queries;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getEmail() {
		return Email;
	}

	public WebElement getMobileno() {
		return mobileno;
	}

	public WebElement getPincode() {
		return pincode;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getState() {
		return state;
	}
	
	public WebElement getQueryType() {
		return QueryType;
	}

	public WebElement getFeedback() {
		return Feedback;
	}
	
	public WebElement getSubmitButton() {
		return contactSubmit; 
	}
	
	public WebElement getpincode1() {
		return Pincode1;
	}
	
	public WebElement getstate() {
		return locatorstate;
	}
	
	public WebElement getProductType() {
		return ProductType;
	}
}

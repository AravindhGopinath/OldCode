package WebElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static baseclass.BaseClass.driver;

public class Payment_and_download_policy_screen {

    public Payment_and_download_policy_screen() {

        PageFactory.initElements(driver, this);
    }

    @CacheLookup

    @FindBy(xpath = "(//span[@class='innerpanel-text innerpanel-bg border right-arrow paymentOption'])[3]")

    private WebElement netbankibng_payment_btn;

    @FindBy(id="netBankingBank")

    private WebElement select_bank_drop_down;

    @FindBy(xpath = "(//span[@class='primary-button-text'])[7]")

    private WebElement make_payment_btn;

    @FindBy(xpath = "(//span[@class='primary-button-text'])[8]")

    private WebElement payment_cancel_btn;

    @FindBy(xpath = "//input[@type='submit']")

    private WebElement return_to_merchant_site_btn;

    @FindBy(id = "proceed-button")

    private WebElement send_anyway_btn;

    @FindBy(id="policyUrl")

    private WebElement download_policy_btn;

    @FindBy(xpath = "//label[@for='star1']")

    private WebElement one_star_rating_btn;

    @FindBy(xpath = "//label[@for='star']")

    private WebElement two_star_rating_btn;

    @FindBy(xpath = "//label[@for='star3']")

    private WebElement three_star_rating_btn;

    @FindBy(xpath = "//label[@for='star4']")

    private WebElement four_star_rating_btn;

    @FindBy(xpath = "//label[@for='star5']")

    private WebElement five_star_rating_btn;

    public WebElement getNetbankibng_payment_btn() {
        return netbankibng_payment_btn;
    }

    public WebElement getSelect_bank_drop_down() {
        return select_bank_drop_down;
    }

    public WebElement getMake_payment_btn() {
        return make_payment_btn;
    }

    public WebElement getPayment_cancel_btn() {
        return payment_cancel_btn;
    }

    public WebElement getReturn_to_merchant_site_btn() {
        return return_to_merchant_site_btn;
    }

    public WebElement getSend_anyway_btn() {
        return send_anyway_btn;
    }

    public WebElement getDownload_policy_btn() {
        return download_policy_btn;
    }

    public WebElement getOne_star_rating_btn() {
        return one_star_rating_btn;
    }

    public WebElement getTwo_star_rating_btn() {
        return two_star_rating_btn;
    }

    public WebElement getThree_star_rating_btn() {
        return three_star_rating_btn;
    }

    public WebElement getFour_star_rating_btn() {
        return four_star_rating_btn;
    }

    public WebElement getFive_star_rating_btn() {
        return five_star_rating_btn;
    }
}

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionResult {

	static WebDriver driver;

	public static void method(WebElement element, String value) {

		try {
			WebDriverWait wait_sendkeys = new WebDriverWait(driver, 20);

			wait_sendkeys.until(ExpectedConditions.visibilityOf(element)).sendKeys(value);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void method1(WebElement element) {

		try {
			WebDriverWait waitclick = new WebDriverWait(driver, 20);

			waitclick.until(ExpectedConditions.visibilityOf(element)).click();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void selectByText(WebElement element, String Value) {

		try {
			WebDriverWait waitclick = new WebDriverWait(driver, 20);
			WebElement until = waitclick.until(ExpectedConditions.visibilityOf(element));
			Select s = new Select(until);
			s.selectByVisibleText(Value);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void selectByIndex(WebElement element, int index) {

		try {
			WebDriverWait waitclick = new WebDriverWait(driver, 20);
			WebElement until = waitclick.until(ExpectedConditions.visibilityOf(element));
			Select s = new Select(until);
			s.selectByIndex(index);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void selectByValue(WebElement element, String Value) {

		try {
			WebDriverWait waitclick = new WebDriverWait(driver, 20);
			WebElement until = waitclick.until(ExpectedConditions.visibilityOf(element));
			Select s = new Select(until);
			s.selectByValue(Value);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void waitScrollDown(WebElement e) {

		try {
			WebDriverWait waitclick = new WebDriverWait(driver, 20);
			WebElement until = waitclick.until(ExpectedConditions.visibilityOf(e));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true)", until);
		} catch (Exception e1) {
			e1.printStackTrace();
		}

	}

}

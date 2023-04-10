package org.libglobal;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
public class LibGlobal {
	public static WebDriver driver;

	public WebDriver launchBrowser(String browserName) {
		try {
			if (browserName.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			} else if (browserName.equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();

			} else if (browserName.equalsIgnoreCase("ie")) {
				WebDriverManager.iedriver().setup();
				driver = new InternetExplorerDriver();
			}

			driver.manage().window().maximize();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return driver;

	}

	public void loadUrl(String Url) {
		try {
			driver.get(Url);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public String getPageText(WebElement e) {
		String txt = null;
		try {
			txt = e.getText();
		} catch (Exception e2) {
			System.out.println(e2.getMessage());
		}
		return txt;
	}

	public String getAttributeValue(WebElement e) {
		String value = null;
		try {
			value = e.getAttribute("value");
		} catch (Exception e2) {
			System.out.println(e2.getMessage());
		}
		return value;
	}

	public boolean displayed(WebElement button) {
		boolean displayed = false;
		try {
			displayed = button.isDisplayed();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return displayed;

	}

	public boolean enabled(WebElement button) {
		boolean enabled = false;
		try {
			enabled = button.isEnabled();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return enabled;
	}

	public boolean selected(WebElement text) {
		boolean selected = false;
		try {
			selected = text.isSelected();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return selected;

	}

	public void setText(WebElement e, String data) {
		try {
			if (enabled(e) && displayed(e)) {
				e.sendKeys(data);
			}

		} catch (Exception e2) {
			System.out.println(e2.getMessage());
		}

	}

	public void btnClick(WebElement element) {
		try {
			if (enabled(element) && displayed(element)) {
				element.click();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void quitBrowser() {
		try {
			driver.quit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public String getPageUrl() {
		String Url = null;
		try {
			Url = driver.getCurrentUrl();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return Url;

	}

	public String getPageTitle() {
		String title = null;
		try {
			title = driver.getTitle();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return title;

	}

	public void closeBrowser() {
		try {
			driver.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void manageNavigate() {
		try {
			driver.navigate();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void manageWindow() {
		try {
			driver.manage();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public String getWindowHandle() {
		String next = null;
		try {
			next = driver.getWindowHandle();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return next;
	}

	public Set<String> getWindowHandles() {
		Set<String> allWindow = null;
		try {
			allWindow = driver.getWindowHandles();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return allWindow;

	}

	public Alert switchToAlert() {
		Alert al = null;
		try {
			al = switchToTargetElement().alert();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return al;
	}

	public void acceptAlert() {
		try {
			Alert al = switchToAlert();
			al.accept();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void dismissAlert() {
		try {
			Alert al = switchToAlert();
			al.dismiss();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public String setValue() {
		String text = null;
		try {
			Alert al = switchToAlert();
			text = al.getText();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return text;
	}

	public void sendKeys(String data) {
		try {
			Alert al = switchToAlert();
			al.sendKeys(data);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void mouseOver(WebElement e) {
		try {
			Actions ac = new Actions(driver);
			ac.moveToElement(e).perform();
		} catch (Exception e2) {
			System.out.println(e2.getMessage());
		}
	}

	public void dragAndDropAction(WebElement src, WebElement dest) {
		try {
			Actions ac = new Actions(driver);
			ac.dragAndDrop(src, dest).perform();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void rightClick(WebElement gmail) {
		try {
			Actions ac = new Actions(driver);
			ac.contextClick(gmail).perform();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void doubleClick(WebElement page) {
		try {
			Actions ac = new Actions(driver);
			ac.doubleClick(page).perform();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void performAction() {
		try {
			Actions ac = new Actions(driver);
			ac.perform();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void selectOptionByIndex(WebElement ele, int index) {
		try {
			Select s = new Select(ele);
			s.selectByIndex(index);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void selectOptionByValue(WebElement ele, int value) {
		try {
			Select s = new Select(ele);
			s.selectByIndex(value);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void selectOptionByText(WebElement ele, String text) {
		try {
			Select s = new Select(ele);
			s.selectByVisibleText(text);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void deselectOptionByIndex(WebElement ele, int index) {
		try {
			Select s = new Select(ele);
			s.deselectByIndex(index);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void deselectOptionByValue(WebElement ele, int value) {
		try {
			Select s = new Select(ele);
			s.deselectByIndex(value);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void deselectOptionByVisibleText(WebElement ele, String text) {
		try {
			Select s = new Select(ele);
			s.deselectByVisibleText(text);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public List<WebElement> getOptionsFromDropDown(WebElement ele) {
		List<WebElement> options = null;
		try {
			Select s = new Select(ele);
			options = s.getOptions();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return options;
	}

	public void getFirstSelectedOption(WebElement ele) {
		Select s = new Select(ele);
		s.getFirstSelectedOption();
	}

	public List<WebElement> getAllSlectedOptions(WebElement ele) {
		List<WebElement> option = null;
		try {
			Select s = new Select(ele);
			option = s.getAllSelectedOptions();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return option;
	}

	public void deselectAllOptions(WebElement ele) {
		try {
			Select s = new Select(ele);
			s.deselectAll();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public boolean isMultipleSelect(WebElement mulSelect) {
		boolean multiple = false;
		try {
			Select s = new Select(mulSelect);
			multiple = s.isMultiple();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return multiple;
	}

	public Navigation navigate() {
		Navigation navigate = null;
		try {
			navigate = driver.navigate();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return navigate;
	}

	public void navigateToUrl(String Url) {
		try {
			navigate().to(Url);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void navigateBack() {
		try {
			navigate().back();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void navigateRefersh() {
		try {
			navigate().refresh();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void navigateForward() {
		try {
			navigate().forward();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public TargetLocator switchToTargetElement() {
		TargetLocator switchTo = null;
		try {
			switchTo = driver.switchTo();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return switchTo;
	}

	public void switchTopParentFrame() {
		try {
			switchToTargetElement().parentFrame();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void switchToDirectWebPage() {
		try {
			switchToTargetElement().defaultContent();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void switchToFrameById(String id) {
		try {
			switchToTargetElement().frame(id);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void switchToFrameByName(String name) {
		try {
			switchToTargetElement().frame(name);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void switchToFrameByIndex(int index) {
		try {
			switchToTargetElement().frame(index);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void switchToFrameByWebElement(WebElement frame1) {
		try {
			switchToTargetElement().frame(frame1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void jsSetText(String data, WebElement e) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('value','" + data + "')", e);
		} catch (Exception e2) {
			System.out.println(e2.getMessage());
		}

	}

	public void Click(WebElement e) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", e);
		} catch (Exception e2) {
			System.out.println(e2.getMessage());
		}

	}

	public void getAttribute(String s) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("return arguments[0].getAttribute('value')", s);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void scrollDown(WebElement e) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true)", e);

		} catch (Exception e2) {
			System.out.println(e2.getMessage());
		}
	}

	public void scrollUp(WebElement e) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(false)", e);
		} catch (Exception e2) {
			System.out.println(e2.getMessage());
		}

	}

	public String getDataFromExcel(String sheet, int row, int cell) throws IOException {
		String value = null;
		try {
			File excelLoc = new File("C:\\Users\\a1354\\eclipse-workspace\\Shriram\\Excel_File\\Pl_Data_Sheet.xlsx");
			FileInputStream stream = new FileInputStream(excelLoc);
			Workbook w = new XSSFWorkbook(stream);
			Sheet s = w.getSheet(sheet);
			Row r = s.getRow(row);
			Cell c = r.getCell(cell);
			int type = c.getCellType();
			if (type == 1) {
				value = c.getStringCellValue();

			}
			if (type == 0) {
				boolean b = DateUtil.isCellDateFormatted(c);
				if (b) {
					Date d = c.getDateCellValue();
					SimpleDateFormat sim = new SimpleDateFormat("dd-MM-yyyy");
					value = sim.format(d);

				} else {
					double d = c.getNumericCellValue();
					long l = (long) d;
					value = String.valueOf(l);

				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return value;

	}

	public void updateDataInExcel(String sheet, int row, int cell, String value) throws IOException {
		try {
			File excelLoc = new File("C:\\Users\\a1354\\eclipse-workspace\\Shriram\\Excel_File\\Pl_Data_Sheet.xlsx");
			FileInputStream stream = new FileInputStream(excelLoc);
			Workbook w = new XSSFWorkbook(stream);
			Sheet s = w.getSheet(sheet);
			Row r = s.createRow(row);
			Cell c = r.createCell(cell);
			c.setCellValue(value);
			FileOutputStream outputstream = new FileOutputStream(excelLoc);
			w.write(outputstream);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void ExtentReport() {
		try {
			String REPORTPATH = "C:\\Users\\a1306\\eclipse-workspace\\uatnew.stfc.in\\test-output";
			ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(REPORTPATH);

			ExtentReports reports = new ExtentReports();
			reports.attachReporter(htmlReporter);
			htmlReporter.flush(null);

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
	}

	public void passScreenCapture() throws IOException {
		Date d = new Date();
		System.out.println(d.toString());

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile,
				new File("C:\\Users\\a1306\\eclipse-workspace\\uatnew.stfc.in\\test-output" + sdf.format(d) + ".png"));
	}

	public void failScreenCapture() throws IOException {
		Date d = new Date();
		System.out.println(d.toString());

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HHmmss");
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		FileUtils.copyFile(scrFile,
				new File("C:\\Users\\a1306\\eclipse-workspace\\uatnew.stfc.in\\test-output" + sdf.format(d) + ".png"));

	}

}

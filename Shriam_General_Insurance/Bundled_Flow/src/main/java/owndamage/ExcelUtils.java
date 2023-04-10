package owndamage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelUtils {

	static ReadExcel reader;

	public static ArrayList<Object[]> getDataFromexcel() {
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		try {
			String Excel_Name="C:\\Users\\a1354\\eclipse-workspace\\sgi-automation\\New_car_flow\\Excel\\SGI_New_Fw.xlsx";
			reader = new ReadExcel(Excel_Name);
			System.out.println(Excel_Name);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (int rowNum = 2; rowNum <= reader.getRowCount("Sheet1"); rowNum++) {
			
			
			String INDEX = reader.getCellData("Sheet1", "INDEX", rowNum);
			String Iteration = reader.getCellData("Sheet1", "Iteration", rowNum);
			String City = reader.getCellData("Sheet1", "City", rowNum);
			String Mobile_No = reader.getCellData("Sheet1", "Mobile_No", rowNum);
			String TandC_Checkbox = reader.getCellData("Sheet1", "TandC_Checkbox", rowNum);
			String Insure_Now_Button = reader.getCellData("Sheet1", "Insure_Now_Button", rowNum);
			String Resend_OTP = reader.getCellData("Sheet1", "Resend_OTP", rowNum);
			String OTP_1 = reader.getCellData("Sheet1", "OTP_1", rowNum);
			String OTP_2 = reader.getCellData("Sheet1", "OTP_2", rowNum);
			String OTP_3 = reader.getCellData("Sheet1", "OTP_3", rowNum);
			String OTP_4 = reader.getCellData("Sheet1", "OTP_4", rowNum);
			String Make = reader.getCellData("Sheet1", "Make", rowNum);
			String Variant = reader.getCellData("Sheet1", "Variant", rowNum);
			String Date_of_reg = reader.getCellData("Sheet1", "Date_of_reg", rowNum);
			String Year_of_manufacture = reader.getCellData("Sheet1", "Year_of_manufacture", rowNum);
			String Select_registration = reader.getCellData("Sheet1", "Select_registration", rowNum);
			String Enter_company_name = reader.getCellData("Sheet1", "Enter_company_name", rowNum);
			String Enter_GST_number = reader.getCellData("Sheet1", "Enter_GST_number", rowNum);
			String Confirm_continue_button = reader.getCellData("Sheet1", "Confirm_continue_button", rowNum);


			


			
			
				

			Object ob[] = {City, Mobile_No,  TandC_Checkbox, 
					 Insure_Now_Button,  Resend_OTP,  OTP_1,  OTP_2, 
					 OTP_3,  OTP_4, Make,  Variant,  Date_of_reg, 
						 Year_of_manufacture,  Select_registration,  Enter_company_name, 
						 Enter_GST_number,  Confirm_continue_button};
			myData.add(ob);
		}
		return myData;

	}
	public static void writeinexcel(String value, int INDEX) throws Exception {
		Thread.sleep(2000);
        File fis = new File(
                "C:\\Users\\a1354\\eclipse-workspace\\sgi-automation\\New_car_flow\\Excel\\SGI_New_Fw.xlsx");
        FileInputStream excelloc = new FileInputStream(fis);
        XSSFWorkbook wb = new XSSFWorkbook(excelloc);
        XSSFSheet s = wb.getSheetAt(0);
        XSSFRow row = s.getRow(INDEX);
        XSSFCell c = row.createCell(45);
        c.setCellValue(value);
        FileOutputStream out = new FileOutputStream(fis);
        wb.write(out);
        out.close();
    }

    public static void writeinexcelForReasons(String value, int INDEX) throws Exception {
    	Thread.sleep(2000);
        File fis = new File(
                "C:\\Users\\a1354\\eclipse-workspace\\sgi-automation\\New_car_flow\\Excel\\SGI_New_Fw.xlsx");
        FileInputStream excelloc = new FileInputStream(fis);
        XSSFWorkbook wb = new XSSFWorkbook(excelloc);
        XSSFSheet s = wb.getSheetAt(0);
        XSSFRow row = s.getRow(INDEX);
        XSSFCell c = row.createCell(46);
        c.setCellValue(value);
        FileOutputStream out = new FileOutputStream(fis);
        wb.write(out);
        out.close();
    }

}



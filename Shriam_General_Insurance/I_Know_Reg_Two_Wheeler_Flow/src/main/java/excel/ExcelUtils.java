package excel;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class ExcelUtils {

    static ReadExcel reader;

    public static ArrayList<Object[]> getDataFromexcel() {
        ArrayList<Object[]> myData = new ArrayList<Object[]>();
        try {
            String Excel_Name="C:\\Users\\a1354\\eclipse-workspace\\Shriam_General_Insurance\\I_Know_Reg_Two_Wheeler_Flow\\Excel\\Two_wheeler_test_data.xlsx";
            reader = new ReadExcel(Excel_Name);
            System.out.println(Excel_Name);

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        for (int rowNum = 2; rowNum <= reader.getRowCount("Sheet1"); rowNum++) {
            String INDEX = reader.getCellData("Sheet1", "INDEX", rowNum);
            String Iteration = reader.getCellData("Sheet1", "Iteration", rowNum);
            String Flow_Type = reader.getCellData("Sheet1", "Flow_Type", rowNum);
            String Bike_Number = reader.getCellData("Sheet1", "Bike_Number", rowNum);
            String Mobile_Number = reader.getCellData("Sheet1", "Mobile_Number", rowNum);
            String OTP_1 = reader.getCellData("Sheet1", "OTP_1", rowNum);
            String OTP_2 = reader.getCellData("Sheet1", "OTP_2", rowNum);
            String OTP_3 = reader.getCellData("Sheet1", "OTP_3", rowNum);
            String OTP_4 = reader.getCellData("Sheet1", "OTP_4", rowNum);
            String Make = reader.getCellData("Sheet1", "Make", rowNum);
            String Variant = reader.getCellData("Sheet1", "Variant", rowNum);
            String Policy_status = reader.getCellData("Sheet1", "Policy_status", rowNum);
            String Date_of_Registration = reader.getCellData("Sheet1", "Date_of_Registration", rowNum);
            String Cover_Type = reader.getCellData("Sheet1", "Cover_Type", rowNum);
            String Year = reader.getCellData("Sheet1", "Year", rowNum);
            String Full_Name = reader.getCellData("Sheet1", "Full_Name", rowNum);
            String Email = reader.getCellData("Sheet1", "Email", rowNum);
            String Address_Line_1 = reader.getCellData("Sheet1", "Address_Line_1", rowNum);
            String Address_Line_2 = reader.getCellData("Sheet1", "Address_Line_2", rowNum);
            String pincode = reader.getCellData("Sheet1", "pincode", rowNum);
            String Nominee_name = reader.getCellData("Sheet1", "Nominee_name", rowNum);
            String relationship = reader.getCellData("Sheet1", "relationship", rowNum);
            String Nominee_age = reader.getCellData("Sheet1", "Nominee_age", rowNum);
            String Chassis_Number = reader.getCellData("Sheet1", "Chassis_Number", rowNum);
            String Engine_Number = reader.getCellData("Sheet1", "Engine_Number", rowNum);
            String Hypothecation = reader.getCellData("Sheet1", "Hypothecation", rowNum);
            String Loan = reader.getCellData("Sheet1", "Loan", rowNum);
            String Financier_Branch = reader.getCellData("Sheet1", "Financier_Branch", rowNum);
            String Insurer_Name = reader.getCellData("Sheet1", "Insurer_Name", rowNum);
            String Policy_Number = reader.getCellData("Sheet1", "Policy_Number", rowNum);
            String Policy_Expiry_Date = reader.getCellData("Sheet1", "Policy_Expiry_Date", rowNum);
            String Star_Rating = reader.getCellData("Sheet1", "Star_Rating", rowNum);


            Object ob[] = {INDEX,Iteration,Flow_Type, Bike_Number,Mobile_Number,OTP_1,OTP_2,OTP_3,OTP_4,
                    Make,Variant,Policy_status,Date_of_Registration,Cover_Type,Year, Full_Name,
                     Email,  Address_Line_1, Address_Line_2,  pincode,  Nominee_name,
                     relationship,  Nominee_age, Chassis_Number,  Engine_Number,  Hypothecation,
                     Loan,  Financier_Branch,  Insurer_Name, Policy_Number,  Policy_Expiry_Date,Star_Rating};
            myData.add(ob);
        }
        return myData;

    }
    public static void writeinexcel(String value, int INDEX) throws Exception {
        Thread.sleep(2000);
        File fis = new File(
                "C:\\Users\\a1354\\eclipse-workspace\\Shriam_General_Insurance\\I_Know_Reg_Two_Wheeler_Flow\\Excel\\Two_wheeler_test_data.xlsx");
        FileInputStream excelloc = new FileInputStream(fis);
        XSSFWorkbook wb = new XSSFWorkbook(excelloc);
        XSSFSheet s = wb.getSheetAt(0);
        XSSFRow row = s.getRow(INDEX);
        XSSFCell c = row.createCell(32);
        c.setCellValue(value);
        FileOutputStream out = new FileOutputStream(fis);
        wb.write(out);
        out.close();
    }

    public static void writeinexcelForReasons(String value, int INDEX) throws Exception {
        Thread.sleep(2000);
        File fis = new File(
                "C:\\Users\\a1354\\eclipse-workspace\\Shriam_General_Insurance\\I_Know_Reg_Two_Wheeler_Flow\\Excel\\Two_wheeler_test_data.xlsx");
        FileInputStream excelloc = new FileInputStream(fis);
        XSSFWorkbook wb = new XSSFWorkbook(excelloc);
        XSSFSheet s = wb.getSheetAt(0);
        XSSFRow row = s.getRow(INDEX);
        XSSFCell c = row.createCell(33);
        c.setCellValue(value);
        FileOutputStream out = new FileOutputStream(fis);
        wb.write(out);
        out.close();
    }



}

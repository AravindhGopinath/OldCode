package org.excel.utility;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class Excel_Utility {



    static Excel_Reader reader;

    public static ArrayList<Object[]> getDataFromexcel() {
        ArrayList<Object[]> myData = new ArrayList<Object[]>();
        try {
            String Excel_Name="C:\\Users\\a1354\\eclipse-workspace\\Shriam_General_Insurance\\SCUF_Gold_loan\\Excel\\Gold_Loan_Testdata.xlsx";
            reader = new Excel_Reader(Excel_Name);
            System.out.println(Excel_Name);

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        for (int rowNum = 2; rowNum <= reader.getRowCount("Sheet1"); rowNum++) {

        String INDEX = reader.getCellData("Sheet1", "INDEX", rowNum);
        String Iteration = reader.getCellData("Sheet1", "Iteration", rowNum);
        String Applicant_Name = reader.getCellData("Sheet1", "Applicant_Name", rowNum);
        String Mobile_Number = reader.getCellData("Sheet1", "Mobile_Number", rowNum);
        String Email = reader.getCellData("Sheet1", "Email", rowNum);
        String DOB = reader.getCellData("Sheet1", "DOB", rowNum);
        String Gender = reader.getCellData("Sheet1", "Gender", rowNum);
        String Marital_Status = reader.getCellData("Sheet1", "Marital_Status", rowNum);
        String PAN_Number = reader.getCellData("Sheet1", "PAN_Number", rowNum);
        String Loan_Amount = reader.getCellData("Sheet1", "Loan_Amount", rowNum);
        String Pincode = reader.getCellData("Sheet1", "Pincode", rowNum);
        String City = reader.getCellData("Sheet1", "City", rowNum);
        String State = reader.getCellData("Sheet1", "State", rowNum);
        String OTP = reader.getCellData("Sheet1", "OTP", rowNum);
            Object ob[] = {INDEX,Iteration,Applicant_Name,Mobile_Number,Email, DOB,  Gender,  Marital_Status,  PAN_Number,
                    Loan_Amount,  Pincode, City,  State,OTP};
            myData.add(ob);
        }
        return myData;

    }
    public static void writeinexcel(String value, int INDEX) throws Exception {
        Thread.sleep(2000);
        File fis = new File(
                "C:\\Users\\a1354\\eclipse-workspace\\Shriam_General_Insurance\\SCUF_Gold_loan\\Excel\\Gold_Loan_Testdata.xlsx");
        FileInputStream excelloc = new FileInputStream(fis);
        XSSFWorkbook wb = new XSSFWorkbook(excelloc);
        XSSFSheet s = wb.getSheetAt(0);
        XSSFRow row = s.getRow(INDEX);
        XSSFCell c = row.createCell(14);
        c.setCellValue(value);
        FileOutputStream out = new FileOutputStream(fis);
        wb.write(out);
        out.close();
    }

    public static void writeinexcelForReasons(String value, int INDEX) throws Exception {
        Thread.sleep(2000);
        File fis = new File(
                "C:\\Users\\a1354\\eclipse-workspace\\Shriam_General_Insurance\\SCUF_Gold_loan\\Excel\\Gold_Loan_Testdata.xlsx");
        FileInputStream excelloc = new FileInputStream(fis);
        XSSFWorkbook wb = new XSSFWorkbook(excelloc);
        XSSFSheet s = wb.getSheetAt(0);
        XSSFRow row = s.getRow(INDEX);
        XSSFCell c = row.createCell(15);
        c.setCellValue(value);
        FileOutputStream out = new FileOutputStream(fis);
        wb.write(out);
        out.close();
    }



}


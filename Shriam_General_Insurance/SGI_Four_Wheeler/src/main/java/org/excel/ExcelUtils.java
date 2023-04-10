package org.excel;

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
            String Excel_Name="C:\\Users\\a1354\\eclipse-workspace\\Shriam_General_Insurance\\SGI_Four_Wheeler\\Excel\\Sit_Sgi.xlsx";
            reader = new ReadExcel(Excel_Name);
            System.out.println(Excel_Name);

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        for (int rowNum = 2; rowNum <= reader.getRowCount("Sheet1"); rowNum++) {
            String Car_no = reader.getCellData("Sheet1", "Car_no", rowNum);
            String Mobile_Number = reader.getCellData("Sheet1", "Mobile_Number", rowNum);
            String OTP_1 = reader.getCellData("Sheet1", "OTP_1", rowNum);
            String OTP_2 = reader.getCellData("Sheet1", "OTP_2", rowNum);
            String OTP_3 = reader.getCellData("Sheet1", "OTP_3", rowNum);
            String OTP_4 = reader.getCellData("Sheet1", "OTP_4", rowNum);
            String OTP_5 = reader.getCellData("Sheet1", "OTP_5", rowNum);
            String OTP_6 = reader.getCellData("Sheet1", "OTP_6", rowNum);
            String Vehicle_number = reader.getCellData("Sheet1", "Vehicle_number", rowNum);
            String Make_and_model = reader.getCellData("Sheet1", "Make_and_model", rowNum);
            String Variant = reader.getCellData("Sheet1", "Variant", rowNum);
            String Registration_date = reader.getCellData("Sheet1", "Registration_date", rowNum);
            String Select_registration = reader.getCellData("Sheet1", "Select_registration", rowNum);
            String city_of_registration = reader.getCellData("Sheet1", "city_of_registration", rowNum);
            String Enter_company_name = reader.getCellData("Sheet1", "Enter_company_name", rowNum);
            String Enter_GST_number = reader.getCellData("Sheet1", "Enter_GST_number", rowNum);
            String select_previous_policy_type = reader.getCellData("Sheet1", "select_previous_policy_type", rowNum);
            String previous_policy_expiry_date = reader.getCellData("Sheet1", "previous_policy_expiry_date", rowNum);
            String Ea_Enter_accessories_name = reader.getCellData("Sheet1", "Ea_Enter_accessories_name", rowNum);
            String Ea_Enter_accessories_amount = reader.getCellData("Sheet1", "Ea_Enter_accessories_amount", rowNum);
            String NEa_Enter_accessories_name = reader.getCellData("Sheet1", "NEa_Enter_accessories_name", rowNum);
            String NEa_Enter_accessories_amount = reader.getCellData("Sheet1", "NEa_Enter_accessories_amount", rowNum);
            String Fuel_Type = reader.getCellData("Sheet1", "Fuel_Type", rowNum);
            String Enter_amount = reader.getCellData("Sheet1", "Enter_amount", rowNum);
            String Full_name = reader.getCellData("Sheet1", "Full_name", rowNum);
            String Mob_no1 = reader.getCellData("Sheet1", "Mob_no1", rowNum);
            String Email = reader.getCellData("Sheet1", "Email", rowNum);
            String Ad_line1 = reader.getCellData("Sheet1", "Ad_line1", rowNum);
            String Ad_line2 = reader.getCellData("Sheet1", "Ad_line2", rowNum);
            String Pincode = reader.getCellData("Sheet1", "Pincode", rowNum);
            String Nominee_name = reader.getCellData("Sheet1", "Nominee_name", rowNum);
            String Nominee_age = reader.getCellData("Sheet1", "Nominee_age", rowNum);
            String Relationship = reader.getCellData("Sheet1", "Relationship", rowNum);
            String Chassis_Number = reader.getCellData("Sheet1", "Chassis_Number", rowNum);
            String Engine_Number = reader.getCellData("Sheet1", "Engine_Number", rowNum);
            String Hypothecation = reader.getCellData("Sheet1", "Hypothecation", rowNum);
            String Loan_Provider = reader.getCellData("Sheet1", "Loan_Provider", rowNum);
            String Financier_Branch = reader.getCellData("Sheet1", "Financier_Branch", rowNum);
            String Insurer = reader.getCellData("Sheet1", "Insurer", rowNum);
            String Policy_Number = reader.getCellData("Sheet1", "Policy_Number", rowNum);
            String Policy_Expiry_Date = reader.getCellData("Sheet1", "Policy_Expiry_Date", rowNum);
            String Iteration = reader.getCellData("Sheet1", "Iteration", rowNum);
            String INDEX = reader.getCellData("Sheet1", "INDEX", rowNum);
            String Third_Party_Policy_Start_Date = reader.getCellData("Sheet1", "Third_Party_Policy_Start_Date", rowNum);
            String Own_Damage_Policy_Start_Date = reader.getCellData("Sheet1", "Own_Damage_Policy_Start_Date", rowNum);
            String Third_Party_Insurer = reader.getCellData("Sheet1", "Third_Party_Insurer", rowNum);
            String Third_Party_Policy_Number = reader.getCellData("Sheet1", "Third_Party_Policy_Number", rowNum);
            String Own_Damage_Insurer = reader.getCellData("Sheet1", "Own_Damage_Insurer", rowNum);
            String Own_Damage_Policy_Number = reader.getCellData("Sheet1", "Own_Damage_Policy_Number", rowNum);
            String Flow_type = reader.getCellData("Sheet1", "Flow_type", rowNum);





            Object ob[] = { Car_no,  Mobile_Number,  OTP_1,  OTP_2,  OTP_3,  OTP_4,  OTP_5,
                    OTP_6,  Vehicle_number, Make_and_model,  Variant,  Registration_date,
                    Select_registration,  city_of_registration,  Enter_company_name,  Enter_GST_number,
                    select_previous_policy_type,  previous_policy_expiry_date,  Ea_Enter_accessories_name,
                    Ea_Enter_accessories_amount,  NEa_Enter_accessories_name,  NEa_Enter_accessories_amount,
                    Fuel_Type,  Enter_amount,  Full_name,  Mob_no1,  Email,  Ad_line1,
                    Ad_line2,  Pincode,  Nominee_name,  Nominee_age,  Relationship,
                    Chassis_Number,  Engine_Number,  Hypothecation,  Loan_Provider,
                    Financier_Branch,  Insurer,  Policy_Number,  Policy_Expiry_Date,  Iteration,
                    INDEX,Third_Party_Policy_Start_Date, Own_Damage_Policy_Start_Date, Third_Party_Insurer, Third_Party_Policy_Number,
                    Own_Damage_Insurer,  Own_Damage_Policy_Number,  Flow_type};
            myData.add(ob);
        }
        return myData;

    }
    public static void writeinexcel(String value, int INDEX) throws Exception {
        Thread.sleep(2000);
        File fis = new File(
                "C:\\Users\\a1354\\eclipse-workspace\\Shriam_General_Insurance\\SGI_Four_Wheeler\\Excel\\Sit_Sgi.xlsx");
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
                "C:\\Users\\a1354\\eclipse-workspace\\Shriam_General_Insurance\\SGI_Four_Wheeler\\Excel\\Sit_Sgi.xlsx");
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

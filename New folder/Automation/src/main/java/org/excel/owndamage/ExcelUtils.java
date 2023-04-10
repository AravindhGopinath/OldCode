package org.excel.owndamage;

import java.util.ArrayList;

public class ExcelUtils {
    
        
        static ReadExcel reader;
        
        public static  ArrayList<Object[]> getDataFromexcel() {
            ArrayList<Object[]> myData=new ArrayList<Object[]>();
            try {
            
                reader=new ReadExcel("C:\\Users\\a1354\\eclipse-workspace\\New_SGI\\Excel\\Sgi.xlsx");
                
                    
                
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
            for (int rowNum =2 ; rowNum <= reader.getRowCount("Sheet1");rowNum++ ) {
                String Car_no = reader.getCellData("Sheet1", "Car_no", rowNum);             
                String Mob_no = reader.getCellData("Sheet1", "Mob_no", rowNum);
                String OTP_1 = reader.getCellData("Sheet1", "OTP_1", rowNum);
                String Vehicle_number = reader.getCellData("Sheet1", "Vehicle_number", rowNum);
                String Make_and_model  = reader.getCellData("Sheet1", "Make_and_model", rowNum);
                String Variant  = reader.getCellData("Sheet1", "Variant", rowNum);
                String Registration_date  = reader.getCellData("Sheet1", "Registration_date", rowNum);
                String Select_registration  = reader.getCellData("Sheet1", "Select_registration", rowNum);
                String city_of_registration  = reader.getCellData("Sheet1", "city_of_registration", rowNum);
                String Enter_company_name  = reader.getCellData("Sheet1", "Enter_company_name", rowNum);
                String Enter_GST_number  = reader.getCellData("Sheet1", "Enter_GST_number", rowNum);
                String select_previous_policy_type  = reader.getCellData("Sheet1", "select_previous_policy_type", rowNum);
                String previous_policy_expiry_date  = reader.getCellData("Sheet1", "previous_policy_expiry_date", rowNum);
                String Ea_Enter_accessories_name  = reader.getCellData("Sheet1", "Ea_Enter_accessories_name", rowNum);
                String Ea_Enter_accessories_amount  = reader.getCellData("Sheet1", "Ea_Enter_accessories_amount", rowNum);
                String NEa_Enter_accessories_name  = reader.getCellData("Sheet1", "NEa_Enter_accessories_name", rowNum);
                String NEa_Enter_accessories_amount  = reader.getCellData("Sheet1", "NEa_Enter_accessories_amount", rowNum);
                String Fuel_Type  = reader.getCellData("Sheet1", "Fuel_Type", rowNum);
                String Enter_amount  = reader.getCellData("Sheet1", "Enter_amount", rowNum);
                String Full_name  = reader.getCellData("Sheet1", "Full_name", rowNum);
                String Mob_no1  = reader.getCellData("Sheet1", "Mob_no1", rowNum);
                String Email  = reader.getCellData("Sheet1", "Email", rowNum);
                String Ad_line1  = reader.getCellData("Sheet1", "Ad_line1", rowNum);
                String Ad_line2  = reader.getCellData("Sheet1", "Ad_line2", rowNum);
                String Pincode  = reader.getCellData("Sheet1", "Pincode", rowNum);
                String Nominee_name  = reader.getCellData("Sheet1", "Nominee_name", rowNum);
                String Nominee_age  = reader.getCellData("Sheet1", "Nominee_age", rowNum);
                String Relationship  = reader.getCellData("Sheet1", "Relationship", rowNum);
                String Chassis_Number  = reader.getCellData("Sheet1", "Chassis_Number", rowNum);
                String Engine_Number  = reader.getCellData("Sheet1", "Engine_Number", rowNum);
                String Hypothecation  = reader.getCellData("Sheet1", "Hypothecation", rowNum);
                String Loan_Provider  = reader.getCellData("Sheet1", "Loan_Provider", rowNum);
                String Financier_Branch  = reader.getCellData("Sheet1", "Financier_Branch", rowNum);
                String Insurer  = reader.getCellData("Sheet1", "Insurer", rowNum);
                String Policy_Number  = reader.getCellData("Sheet1", "Policy_Number", rowNum);
                String Policy_Expiry_Date  = reader.getCellData("Sheet1", "Policy_Expiry_Date", rowNum);






                

                
                Object ob[]= {Car_no,Mob_no,OTP_1,Vehicle_number,Make_and_model,Variant,Registration_date,Select_registration,
                		city_of_registration,Enter_company_name,Enter_GST_number,select_previous_policy_type,
                		previous_policy_expiry_date,Ea_Enter_accessories_name,Ea_Enter_accessories_amount,
                		NEa_Enter_accessories_name,NEa_Enter_accessories_amount,Fuel_Type,Enter_amount, Full_name,  
                		Mob_no1,  Email,  Ad_line1,  Ad_line2,  Pincode,  Nominee_name,  Nominee_age,Relationship,
                		Chassis_Number,Engine_Number,Hypothecation,Loan_Provider,Financier_Branch,Insurer,Policy_Number,Policy_Expiry_Date};       
                myData.add(ob);
            }
            return myData;
            
        }
        
    }

package DemoExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.lib.LibGlobal;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelLaunch extends LibGlobal {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a1354\\eclipse-workspace\\Exceldemo\\Chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		LibGlobal lb = new LibGlobal();
		
		try {
		    FileInputStream file=new FileInputStream(new File("C:\\Users\\a1354\\eclipse-workspace\\Exceldemo\\Excel\\Excel_demo.xlsx"));
		    FileOutputStream outFile=new FileOutputStream(new File("C:\\Users\\a1354\\eclipse-workspace\\Exceldemo\\Excel\\Excel_demo.xlsx"));
		    XSSFWorkbook workbook=new XSSFWorkbook(file);
		    XSSFSheet sheet=workbook.getSheetAt(0);
		    XSSFCell cell=null;     
		    int s=sheet.getLastRowNum()+1;
		    for(int i=0; i<s; i++){
		        cell=sheet.getRow(i).getCell(0);
		        String url=cell.toString();
		        driver.get(url);
		        Thread.sleep(5000);
		        String urlnew=driver.getCurrentUrl().toString();
		        XSSFRow row=sheet.getRow(i);
		        XSSFCell cellresult=row.createCell(1);
		        if(url==urlnew){
		            cellresult.setCellValue("Pass");
		        }else{
		            cellresult.setCellValue("fail");
		        }
		        workbook.write(outFile);
		    }    
		    file.close();  
		    outFile.close();
		} 
		
		finally  {
			System.out.println("final");
		}
		
	
		
		
		
		
	}

}

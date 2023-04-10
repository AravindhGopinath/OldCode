package pkg;

import java.io.File;
import java.util.List;

import org.testng.TestNG;
import org.testng.collections.Lists;

public class RunClass {
	
	public static void main(String[] args) {
		TestNG testng =new TestNG();
		List<String> suites = Lists.newArrayList();
		
		File xml = new File("C:\\Users\\a1354\\eclipse-workspace\\New_SGI\\src\\main\\resources\\testng.xml");
		suites.add(xml.getAbsolutePath());
		
		testng.setTestSuites(suites);
		testng.run();
		
	}
	

}

package org.run;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class Demo_SGI  {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		// Create object of TestNG Class
		TestNG runner=new TestNG();

		// Create a list of String 
		List<String> suitefiles=new ArrayList<String>();

		// Add xml file which you have to execute
		suitefiles.add("testng.xml");

		// now set xml file for execution
		runner.setTestSuites(suitefiles);

		// finally execute the runner using run method
		runner.run();
		}
	}



package org.runnerclass;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\a1354\\eclipse-workspace\\Shriam_General_Insurance\\Workout\\Gold_Loan_Cucumber\\src\\main\\resources\\Feature_Files\\Demo.feature",
        glue = "org.step.definitions",
        dryRun = false,plugin = "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:")

public class RunnerClass {


}

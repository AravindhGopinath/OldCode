package Runner_Class;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\a1354\\eclipse-workspace\\Shriam_General_Insurance\\Workout\\Gold_Loan_Cucumber\\src\\main\\resources\\Feature_Files\\feature_file.feature",
glue = "Step_D",dryRun = false)
public class Run {

}

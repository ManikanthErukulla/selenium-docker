package parallel;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		plugin = {"pretty",
  				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
			"timeline:test-output-thread/"
				}, 
		monochrome = true,
		glue = { "parallel" },
		features = { "classpath:features" }
)

public class ParallelRun extends AbstractTestNGCucumberTests {
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}
}

//java -cp target/selenium-docker.jar:target/selenium-docker-tests.jar:target/libs/* org.testng.TestNG testng.xml

//java -cp target/selenium-docker.jar:target/selenium-docker-tests.jar:target/libs/* -Dcucumber.options="classpath:features" org.testng.TestNG testng.xml

//java -cp selenium-docker.jar:selenium-docker-tests.jar:libs/* org.testng.TestNG testng.xml
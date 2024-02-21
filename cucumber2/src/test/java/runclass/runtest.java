package runclass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\kbnav\\eclipse-workspace6\\cucumber2\\src\\test\\java\\featurefile\\data.feature",glue={"stepdefnition"},monochrome= true,

plugin= {"pretty","junit:target/jUnit1reports/report.xml"}	
		)

public class runtest {

}

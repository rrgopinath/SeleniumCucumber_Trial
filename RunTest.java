package annotation; 

import org.junit.runner.RunWith; 

import cucumber.junit.Cucumber; 

@RunWith(Cucumber.class) 
@Cucumber.Options(format = {"pretty", "html:target/cucumber"}) 
//@Cucumber.Options(features)

public class RunTest { }
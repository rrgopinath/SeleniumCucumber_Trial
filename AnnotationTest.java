package annotation;
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver; 

import cucumber.annotation.en.Given; 
import cucumber.annotation.en.Then; 
import cucumber.annotation.en.When; 

public class AnnotationTest { 
   WebDriver driver = null; 
   @Given("^I am on Facebook login page$") 
	//WebDriver driver = new ChromeDriver();
   public void goToFacebook() { 
      //driver = new FirefoxDriver();
	   System.setProperty("webdriver.chrome.driver","C:\\Learn Hadoop\\Selenium Driver\\chromedriver_win32\\chromedriver.exe");
	   driver = new ChromeDriver();
       //driver.navigate().to("https://www.facebook.com/");
	   String baseUrl = "https://www.facebook.com/";
	   // launch Fire fox and direct it to the Base URL
	   driver.get(baseUrl);

   }
	
   @When("^I enter username as \"(.*)\"$") 
   public void enterUsername(String arg1) {   
      driver.findElement(By.id("email")).sendKeys(arg1); 
   }
	
   @When ("^I enter password as \"(.*)\"$") 
   public void enterPassword(String arg1) {
      driver.findElement(By.id("pass")).sendKeys(arg1);
      driver.findElement(By.id("u_0_2")).click();
      
   } 
	
   @Then("^Login should fail$") 
   public void checkFail() {  
      if(driver.getCurrentUrl().equalsIgnoreCase(
         "https://www.facebook.com/login.php?login_attempt=1&lwv=110")){ 
            System.out.println("Test1 Pass"); 
      } else { 
         System.out.println("Test1 Failed"); 
      } 
      driver.close(); 
   }
	
   @Then("^Relogin option should be available$") 
   public void checkRelogin() { 
      if(driver.getCurrentUrl().equalsIgnoreCase(
         "https://www.facebook.com/login.php?login_attempt=1&lwv=110")){ 
            System.out.println("Test2 Pass"); 
      } else { 
         System.out.println("Test2 Failed"); 
      } 
      driver.close(); 
   }
} 

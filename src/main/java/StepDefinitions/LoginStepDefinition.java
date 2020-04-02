/*package StepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {
	
	WebDriver driver;
	
	@Given("^user is available on login Page$")
	public void user_already_on_login_page() {
		System.setProperty("webdriver.chrome.driver", "/Users/binu/Downloads/chromedriver");
		driver= new ChromeDriver();
		driver.get("http://demo.guru99.com/v4/index.php");
	}
	
	@When("^title of login page is Guru99 Bank Manager HomePage$")
	public void title_of_login_page_is_Guru_Bank_Manager_HomePage()  {
	   
	   String title= driver.getTitle();
	   System.out.println(title);
	   Assert.assertEquals("Guru99 Bank Home Page", title);
	}
	
	
	 @Then("^user enter \"(.*)\" and \"(.*)\"$")
	 public void user_enters_username_and_password(String username, String password){
		 driver.findElement(By.name("uid")).sendKeys(username);
		 driver.findElement(By.name("password")).sendKeys(password);
	 }
	
	@Then("^user click on login button$")
	public void user_click_on_login_button()  {
		driver.findElement(By.name("btnLogin")).click();
	    
	}
	
	@Then("^user is on home page$")
	public void user_is_on_home_page(){
	  Boolean b= driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")).isDisplayed();
	  System.out.println(b);
	  Assert.assertTrue(b);
	}

	@Then("^close the browser$")
	public void close_the_browser() {
		driver.quit();
	}
}*/

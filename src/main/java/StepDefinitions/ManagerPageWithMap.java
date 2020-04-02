package StepDefinitions;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ManagerPageWithMap {
WebDriver driver;

	@Before()
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "/Users/binu/Downloads/chromedriver");
		driver= new ChromeDriver();
	}
	
	@After()
	public void tearDown() {
		driver.quit();
	}
	
	@Given("^user is available on login Page$")
	public void user_already_on_login_page() {
		
		driver.get("http://demo.guru99.com/v4/index.php");
	}
	
	@When("^title of login page is Guru99 Bank Manager HomePage$")
	public void title_of_login_page_is_Guru_Bank_Manager_HomePage()  {
	   
	   String title= driver.getTitle();
	   System.out.println(title);
	   Assert.assertEquals("Guru99 Bank Home Page", title);
	}
	
	
	 @Then("^user entered username and password$")
	 public void user_enters_username_and_password(DataTable credentials){
		 for(Map<String, String> data : credentials.asMaps(String.class,  String.class)) {
		 
		 driver.findElement(By.name("uid")).sendKeys(data.get("username"));
		 driver.findElement(By.name("password")).sendKeys(data.get("password"));
		 }
	 }
	
	@Then("^user click on login button$")
	public void user_click_on_login_button()  {
		driver.findElement(By.name("btnLogin")).click();
	    
	}
	
	
	@Given("^user is on manager home page$")
	public void user_is_on_manager_home_page() {
		String s = driver.getTitle();
		 Assert.assertEquals("Guru99 Bank Manager HomePage", s);
	    
	}

	@When("^title of the home page is Guru99 Bank Manager HomePage$")
	public void title_of_the_home_page_is_Guru_Bank_Manager_HomePage() {
		String s = driver.getTitle();
		 Assert.assertEquals("Guru99 Bank Manager HomePage", s);
	    
	}

	@Then("^mouse hover to contact and click New Customer$")
	public void mouse_hover_to_contact_and_click_New_Customer() {
		driver.findElement(By.xpath("//a[contains(text(),'New Customer')]")).click();
		String st = driver.getTitle();
		Assert.assertEquals("Guru99 Bank New Customer Entry Page", st);
		
	}

	@Then("^user enter customer name$")
	public void user_enter_customer_name(DataTable nam) {
		for(Map<String, String> data : nam.asMaps(String.class,  String.class)) {
			driver.findElement(By.xpath("//input[@name='name']")).sendKeys(data.get("name"));
		}
		
	}

	@Then("^user enter gender$")
	public void user_enter_gender() {
		driver.findElement(By.xpath("//tr[5]//td[2]//input[2]")).click();
		
	}

	@Then("^user enter date of birth$")
	public void user_enter_date_of_birth() {
		driver.findElement(By.xpath("//input[@id='dob']")).sendKeys("23");
		driver.findElement(By.xpath("//input[@id='dob']")).sendKeys("08");
		driver.findElement(By.xpath("//input[@id='dob']")).sendKeys("1989");
		
		
	}

	@Then("^user enter adderss and city and state and PIN and mobile and email and Password$")
	public void user_enter_adderss(DataTable mapData) {
		
		for(Map<String, String> data : mapData.asMaps(String.class,  String.class)) {
			
		
		driver.findElement(By.name("addr")).sendKeys(data.get("address"));
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys(data.get("city"));
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys(data.get("state"));
		driver.findElement(By.xpath("//input[@name='pinno']")).sendKeys(data.get("PIN"));
		driver.findElement(By.xpath("//input[@name='telephoneno']")).sendKeys(data.get("mobile"));
		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys(data.get("email"));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(data.get("Password"));
		}
	}

	@Then("^user enter submit$")
	public void user_enter_submit() {
		driver.findElement(By.xpath("//input[@name='sub']")).click();
		
	}
	
	@Then("^close the browser$")
	public void close_the_browser() {
		System.out.println("browser will be closed");
	}

}

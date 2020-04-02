/*package StepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;



public class ManagerPage {
	
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
	
	
	 @Then("^user entered \"(.*)\" and \"(.*)\"$")
	 public void user_enters_username_and_password(String username, String password){
		 driver.findElement(By.name("uid")).sendKeys(username);
		 driver.findElement(By.name("password")).sendKeys(password);
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

	@Then("^user enter customer \"(.*)\"$")
	public void user_enter_customer_name(String name) {
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys(name);
		
		
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

	@Then("^user enter \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	public void user_enter_adderss(String address, String city, String state, String PIN, int mobile, String email, String password) {
		driver.findElement(By.name("addr")).sendKeys(address);
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys(city);
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys(state);
		driver.findElement(By.xpath("//input[@name='pinno']")).sendKeys(PIN);
		driver.findElement(By.xpath("//input[@name='telephoneno']")).sendKeys(String.valueOf(mobile));
		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	}

	@Then("^user enter submit$")
	public void user_enter_submit() {
		driver.findElement(By.xpath("//input[@name='sub']")).click();
		
	}
	
	@Then("^close the browser$")
	public void close_the_browser() {
		driver.quit();
	}


	

}
*/
package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.addCustomerPage;
import PageObjects.loginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class steps extends Basesteps
{
	
	
	
	@Given("User Launch Chrome browser")
	public void user_Launch_Chrome_browser() 
	{
	   driver=new ChromeDriver();
	   lp=new loginPage(driver);
	}

	@When("User opens Url {string}")
	public void user_opens_Url(String url) 
	{
	   driver.get(url);
	}

	@When("User enters Email as {string} and password as {string}")
	public void user_enters_Email_as_and_password_as(String email, String passwd) {
	   
		lp.setUserName(email);
		lp.setPassword(passwd);
	}

	@When("Click on Login")
	public void click_on_Login() {
		lp.Clicklogin();
	   
	}

	@Then("Page Title should be {string}")
	public void page_Title_should_be(String title) 
	{
		if(driver.getPageSource().contains("Login was unsuccessful"))
		{
			driver.close();
			Assert.assertTrue(false);
		}else
		{
			Assert.assertEquals(title, driver.getTitle());
		}
	    
	}

	@When("User Click on Logout link")
	public void user_Click_on_Logout_link() throws InterruptedException 
	{
	   lp.ClickLogout();
	   Thread.sleep(2000);
	}

	
	
	
	@Then("User can view dashboard")
	public void user_can_view_dashboard() 
	{
		 acustPage=new addCustomerPage(driver);
		 Assert.assertEquals("Dashboard / nopCommerce administration", acustPage.GetPageTitle());
	    
	}

	@When("User click on customers menu")
	public void user_click_on_customers_menu() throws InterruptedException 
	{
		Thread.sleep(2000);
		acustPage.ClickoncustomersMENU();
	}

	@When("click on customers menu item")
	public void click_on_customers_menu_item() throws InterruptedException 
	{
		Thread.sleep(2000);
		acustPage.ClickonCustomerMenuItem();
	    
	}

	@When("click on add new button")
	public void click_on_add_new_button() throws InterruptedException 
	{
		acustPage.Clickonaddnew();
		Thread.sleep(2000);
	   
	}

	@Then("user can view add new customer page")
	public void user_can_view_add_new_customer_page() 
	{
	   
		Assert.assertEquals("Add a new customer / nopCommerce administration", acustPage.GetPageTitle());
		
	}

	@When("user enter customer info")
	public void user_enter_customer_info() 
	{
	  String email=ramdomestring()+"@gmail.com";
	  acustPage.Setemail(email);
	  acustPage.SetPasswd("test@123");
	  acustPage.SetFirstname("syed");
	  acustPage.SetLastname("althaf");
	  acustPage.SetGender("Male");
	  acustPage.Setdob("20/04/1992");
	  acustPage.SetCompanyName("pilog india pvt ltd");
	  acustPage.SetManagerofVendor("Vendor 1");
	  acustPage.SetAdminContent("this is for Testing ........");
	}

	@When("click on save button")
	public void click_on_save_button() throws InterruptedException 
	{
		acustPage.clickonsave();
		Thread.sleep(2000);
	   
	}
	

	@Then("user can view confirmation message {string}")
	public void user_can_view_confirmation_message(String message) 
	{
		Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains(message));
	    
	}
	
	@Then("close browser")
	public void close_browser() {
	   driver.close();
	}

	

}

package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class addCustomerPage {
	public WebDriver ldriver;
	
	
    public addCustomerPage(WebDriver rdriver)
    {
  	  ldriver=rdriver;
  	  PageFactory.initElements(rdriver, this);
    }
    
    By lnkcustomers=By.xpath("//a[@href='#']//p[contains(text(),'Customers')]");
    
    By lnkcustomerlist=By.xpath("//a[@href='/Admin/Customer/List']//p[contains(text(),'Customers')]");
    
    By Addnew=By.xpath("//a[@class='btn btn-primary']");
    
    By txtemail=By.xpath("//input[@id='Email']");
    
    By txtpasswd=By.xpath("//input[@id='Password']");
    
    By txtFirstname=By.xpath("//input[@id='FirstName']");
    
    By txtLastname=By.xpath("//input[@id='LastName']");
    
    By txtCustomerRoles=By.xpath("//span[@class='select2 select2-container select2-container--default select2-container--below select2-container--focus']//input[@role='searchbox']");

    By lititemAdministartors=By.xpath("//li[contains(text(),'Administrators')]");
    
    By litItemRegistered = By.xpath("//li[contains(text(),'Registered')]");
    
    By litItemGuests=By.xpath("//li[contains(text(),'Guests')]");
    
    By litItemVendors=By.xpath("//li[contains(text(),'Vendors')]");
    
   By DrpmgofVendor=By.xpath("//select[@id='VendorId']");
    
    By rdMalegender=By.xpath("//input[@id=\"Gender_Male\"]");
    
    By rdFemaleGender=By.xpath("//input[@id=\"Gender_Female\"]");
    
    By txtDob=By.xpath("//input[@id=\"DateOfBirth\"]");
    
    By txtCompanyName=By.xpath("//input[@id=\"Company\"]");
    
    By AdminContext=By.xpath("//textarea[@id=\"AdminComment\"]");
    
    By BtnSave=By.xpath("//button[@name=\"save\"]");
    
    public String GetPageTitle()
    {
    	return ldriver.getTitle();
    	
    }
    
    
    public void ClickoncustomersMENU()
    {
    	ldriver.findElement(lnkcustomers).click();
    }
    
    
    public void ClickonCustomerMenuItem()
    {
    	ldriver.findElement(lnkcustomerlist).click();
    }
    
    
    public void Clickonaddnew()
    {
    	ldriver.findElement(Addnew).click();
    }
    
    public void Setemail(String email)
    {
    	ldriver.findElement(txtemail).sendKeys(email);
    }
    
    public void SetPasswd(String pword)
    {
    	ldriver.findElement(txtpasswd).sendKeys(pword);
    }
    
    public void SetFirstname(String fname)
    {
    	ldriver.findElement(txtFirstname).sendKeys(fname);
    }
    
    public void SetLastname(String lname)
    {
    	ldriver.findElement(txtLastname).sendKeys(lname);
    }
    
   public void SetGender(String gender)
   {
	   if(gender.equals("Male"))
	   {
		   ldriver.findElement(rdMalegender).click();
	   }
	   else if(gender.equals("Female"))
	   {
		   ldriver.findElement(rdFemaleGender).click();
	   }
	   else
	   {
		   ldriver.findElement(rdMalegender).click();
	   }
   }
   
   public void SetManagerofVendor(String value)
   {
	   Select drp=new Select(ldriver.findElement(DrpmgofVendor));
	   drp.selectByVisibleText(value);
	   
   }
   
   public void Setdob(String dob)
   {
	   ldriver.findElement(txtDob).sendKeys(dob);
   }
   
   public void SetCompanyName(String comname)
   {
	   ldriver.findElement(txtCompanyName).sendKeys(comname);
   }
   
   public void SetAdminContent(String content)
   {
	  ldriver.findElement(AdminContext).sendKeys(content); 
   }
   
   public void clickonsave()
   {
	   ldriver.findElement(BtnSave).click();
   }
   
    
}

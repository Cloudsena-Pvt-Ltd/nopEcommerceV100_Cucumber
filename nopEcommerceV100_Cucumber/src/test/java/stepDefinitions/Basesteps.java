package stepDefinitions;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;

import PageObjects.addCustomerPage;
import PageObjects.loginPage;

public class Basesteps 
{
	public WebDriver driver;
	public loginPage lp;
	public addCustomerPage acustPage;

	
	public static String ramdomestring()
	{
		String genString1=RandomStringUtils.randomAlphabetic(5);
		return(genString1);
	}
}

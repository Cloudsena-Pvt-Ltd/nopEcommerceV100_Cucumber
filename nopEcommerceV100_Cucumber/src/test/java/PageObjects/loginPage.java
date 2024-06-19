package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	
	public WebDriver ldriver;
	
	
      public loginPage(WebDriver rdriver)
      {
    	  ldriver=rdriver;
    	  PageFactory.initElements(rdriver, this);
      }
      
      @FindBy(xpath = "//input[@id=\"Email\"]")
      WebElement txtEmail;
      
      @FindBy(xpath = "//input[@id=\"Password\"]")
      WebElement txtPasswd;
      
      @FindBy(xpath = "//button[normalize-space()=\"Log in\"]")
      WebElement btnLogin;
      
      @FindBy(xpath = "//a[normalize-space()=\"Logout\"]")
      WebElement lnkLogout;
      
      public void setUserName(String uname)
      {
    	  txtEmail.clear();
    	  txtEmail.sendKeys(uname);
      }
      
      
      public void setPassword(String passwd)
      {
    	  txtPasswd.clear();
    	  txtPasswd.sendKeys(passwd);
    	  
      }
      
      public void Clicklogin()
      {
    	  btnLogin.click();
    	  
      }
      
      public void ClickLogout()
      {
    	  lnkLogout.click();
      }
      
}

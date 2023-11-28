package PageObjectModel;

import javax.lang.model.element.Element;
import javax.security.auth.login.LoginException;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;

public class LoginPage {
	
	
	//store all WebElement on login page
	@FindBy(name = "username")private WebElement usnTB;
	@FindBy(name = "pwd")private WebElement paasTB;
	@FindBy(id  = "LoginButton")private WebElement loginButton;
	@FindBy(name = "remember")private WebElement keepMeLoggedInChekBoxElement;
	@FindBy(partialLinkText = "Actimind Inc.")private WebElement actimindLink;
	@FindBy(partialLinkText = "Lincense")private WebElement LicenseLink;
	
	//initialization
	public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
	
	}


	public WebElement getusnTB() {
		return usnTB;
	}


	public WebElement getPaasTB() {
		return paasTB;
	}



	public WebElement getLoginButton() {
		return loginButton;
	}



	public WebElement getKeepMeLoggedInChekBoxElement() {
		return keepMeLoggedInChekBoxElement;
	}



	public WebElement getActimindLink() {
		return actimindLink;
	}



	public WebElement getLicenseLink() {
		return LicenseLink;
	}
	
	//operational method
	public void voidLogin(String validusn,String validpass)
	{
	           
	        usnTB.sendKeys(validusn);
	        paasTB.sendKeys(validpass);
	        loginButton.click();
	         
		
	}      
	 public void InvoidLogin(String Invalidusn,String Invalidpass)
			{
		 usnTB.sendKeys(Invalidusn);
	     paasTB.sendKeys(Invalidpass);
	     loginButton.click();
	    
			}		
		
}

	
			
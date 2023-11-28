package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	
	//store the all the webelement
	@FindBy(xpath = "//div[text()='Time-Track']/following-sibling::div/img")private WebElement Time_Track_module;
	@FindBy(xpath = "//div[text()='Tasks']/following-sibling::img")private WebElement Task_module;
	@FindBy(xpath = "//div[text()='Reports']/following-sibling::div/img")private WebElement report_module;
	@FindBy(xpath = "//div[text()='Users']/following-sibling::div/img")private WebElement user_module;
	@FindBy(xpath = "//div[text()='Work Schedule']/following-sibling::div/img")private WebElement Work_Schedule_module;
	@FindBy(xpath = "//div[text()='setting']/following-sibling::div/img")private WebElement setting_module;
	@FindBy(partialLinkText = "Logout")private WebElement Logout_Link;
	
	//initialization
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getTime_Track_module() {
		return Time_Track_module;
	}

	public WebElement getTask_module() {
		return Task_module;
	}

	public WebElement getReport_module() {
		return report_module;
	}

	public WebElement getUser_module() {
		return user_module;
	}

	public WebElement getWork_Schedule_module() {
		return Work_Schedule_module;
	}

	public WebElement getSetting_module() {
		return setting_module;
	}

	public WebElement getLogout_Link() {
		return Logout_Link;
	}
	//operational method
	public void click_on_Time_Track_Module()
	{
     Time_Track_module.click();
	}
	public void click_on_Task_Module()
	{
		Task_module.click();
	}
	public void click_On_Report_Module()
	{
		report_module.click();
	}
	public void click_on_User_Module()
	{
		user_module.click();
	}
	public void click_On_Settin_Module()
	{
	setting_module.click();
	}
    public void click_on_Logout_Module()
	{
		Logout_Link.click();
	}
}

	
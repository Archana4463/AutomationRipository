package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TaskPage {
	@FindBy(partialLinkText = "Projects & Customers")
	private WebElement project_customer_sub_module;
	@FindBy(xpath = "//input[@value=\"Create New Customer\"]")
	private WebElement create_new_customer_button;
	@FindBy(xpath = "//input[@value=\"Create New project\"]")
	private WebElement create_new_project_button;

	@FindBy(name = "name")
	private WebElement customer_nameTB;
	@FindBy(name = "CreateCustomerSubmit")
	private WebElement CreateCustomer_Button;

	@FindBy(name = "CustomerId")
	private WebElement customer_name_DropDown;
	@FindBy(name = "name")
	private WebElement project_nameTB;
	@FindBy(name = "CreatProjectSubmit")
	private WebElement CreatProject_Button;

	// initilization
	public TaskPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	// utilizational

	public WebElement getProject_customer_sub_module() {
		return project_customer_sub_module;
	}

	public WebElement getCreate_new_customer_button() {
		return create_new_customer_button;
	}

	public WebElement getCreate_new_project_button() {
		return create_new_project_button;
	}

	public WebElement getCustomer_nameTB() {
		return customer_nameTB;
	}

	public WebElement getCreateCustomer_Button() {
		return CreateCustomer_Button;
	}

	public WebElement getCustomer_name_DropDown() {
		return customer_name_DropDown;
	}

	public WebElement getProject_nameTB() {
		return project_nameTB;
	}

	public WebElement getCreatProject_Button() {
		return CreatProject_Button;
	}
	
	//operational method
	public void createcustomer_createproject_method(String cust_name,String pro_name) throws InterruptedException
	{
		project_customer_sub_module.click();
		Thread.sleep(2000);
	    create_new_customer_button.click();
	    Thread.sleep(2000);
	    customer_nameTB.sendKeys(cust_name);
	    Thread.sleep(2000);
	    create_new_project_button.click();
	    Thread.sleep(2000);
	    Select sel = new Select(customer_name_DropDown);
	    sel.selectByVisibleText(cust_name);
	    Thread.sleep(2000);
	    project_nameTB.sendKeys(pro_name);
	    CreatProject_Button.click();
	  
	
	
	}
	

}

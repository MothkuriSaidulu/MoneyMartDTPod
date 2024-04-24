package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import actions.OnlineActions;
import driver.TestBase;



public class Pg_21_Refinance_dashboard extends OnlineActions {

	//WebDriver driver;
		public Pg_21_Refinance_dashboard(WebDriver driver) {
			super(driver);
			PageFactory.initElements(driver, this);
		}


	
		@FindBy(how=How.XPATH, using = "//div[@title='Email Loan Documents']")
		public static WebElement Custom_Dash_email;
	
		@FindBy(how=How.XPATH, using = "//div[@title='View Payment Schedule']")
		public static WebElement Custom_Dash_viewpayment_LoanCount_01;
	
		@FindBy(how=How.XPATH, using = "//button[normalize-space()='Make a Payment']")
		public static WebElement Custom_Dash_Make_a_payment_LoanCount_01;	
		
		@FindBy(how=How.XPATH, using = "//button[normalize-space()='Refinance']")
		public static WebElement btm_Refinacne_validation;
		
		
		
		
	public void refinancebutton_dashboard() throws Exception
	{
		
		
		TestBase.getDriver().navigate().refresh();
		Thread.sleep(4000);
		waitForElementToBeVisible(Custom_Dash_email, "email button");
		waitForElementToBeVisible(Custom_Dash_viewpayment_LoanCount_01, "View payment");
		waitForElementToBeVisible(Custom_Dash_Make_a_payment_LoanCount_01, "Make a payment button");
		waitForElementToBeVisible(btm_Refinacne_validation, "Refinance loan button");
		
		click(btm_Refinacne_validation,"Refinance loan");
		
		
		
					
	}
	
	
	}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import actions.OnlineActions;
import driver.TestBase;



public class Pg_16_Rescind extends OnlineActions {

	//WebDriver driver;
		public Pg_16_Rescind(WebDriver driver) {
			super(driver);
			PageFactory.initElements(driver, this);
		}


	
		@FindBy(how=How.XPATH, using = "//div[@class='mm-card__cardremove col custom_card_btn'][1]")
		public static WebElement Custom_Dash_Button1_LoanCount_01;
	
		@FindBy(how=How.XPATH, using = "//div[@class='mm-card__cardremove col custom_card_btn'][2]")
		public static WebElement Custom_Dash_Button2_LoanCount_01;
	
		@FindBy(how=How.XPATH, using = "//div[@class='mm-card__cardremove col custom_card_btn'][3]")
		public static WebElement Custom_Dash_Button3_LoanCount_01;	
		
		@FindBy(how=How.XPATH, using = "//h1[normalize-space()='Cancel Loan']")
		public static WebElement text_cancel_validation;
		//@FindBy(how=How.XPATH, using = "//div[@class='button-groups']//button/following::button") //Commented on 03-Jan-2024 Revised
		@FindBy(how=How.XPATH, using = "//button[text()='Agree & Continue']") //Added on 03-Jan-2024 Revised
		public static WebElement agree_cancel_Loan;
		
		//Added on 03-Jan-2024 Start Revised
		@FindBy(how=How.XPATH, using = "//button[text()='Continue']") 
		public static WebElement btn_Continue;
		//Added on 03-Jan-2024 End Revised
		
		@FindBy(how=How.XPATH, using = "//h1[normalize-space()='Loan Cancelled']")
		public static WebElement txt_cancelled;
		
		@FindBy(how=How.XPATH, using = "//a[normalize-space()='Back to Dashboard']")
		public static WebElement back_dashboard;
		
		@FindBy(how=How.XPATH, using = "//button[@class='mm-user-dash__cta__actions mm-btn mm-btn--primary mm-btn--loan mm-btn--block']")
		public static WebElement verify_IL_button;
		
		
		
	public void rescindloan() throws Exception
	{
		
		waitForElementToBeVisible(Custom_Dash_Button1_LoanCount_01, "email button");
		waitForElementToBeVisible(Custom_Dash_Button2_LoanCount_01, "Cancel button");
		waitForElementToBeVisible(Custom_Dash_Button3_LoanCount_01, "View payment button");
		TestBase.bindreport(currentGlobalScenarioName, "rescind details page");
		
		waitForElementToBeClickable(Custom_Dash_Button2_LoanCount_01, "WaitCancelLoan"); //Added on 02-Jan-2024 Revised
		click(Custom_Dash_Button2_LoanCount_01,"Cancel loan");
		waitForElementToBeVisible(text_cancel_validation, "CancelTextWait"); //Added on 02-Jan-2024 Revised
		VerifyText_For_PageCaption(text_cancel_validation, "Cancel Loan", "Basic Info Page, Hence Passed");
		
		//Added on 03-Jan-2024 Start Revised
		if(getMapData.get("Funding_Method").equalsIgnoreCase("Debit Card")) //Added if condition on 08-Jan-2024 Revised
		{
			waitForLoadingIconDisappearInDialog(TestBase.getDriver());
			TestBase.bindreport(currentGlobalScenarioName, "Cancel Loan page");
			waitForElementToBeClickable(btn_Continue, "WaitContinuebtn");
			click(btn_Continue, "clickContinue");
		}
		//Added on 03-Jan-2024 End Revised
		
		waitForElementToBeClickable(agree_cancel_Loan, "WaitAgreeAndCacel"); //Added on 02-Jan-2024 Revised
		TestBase.bindreport(currentGlobalScenarioName, "Agree and Cancel page");
		//click(agree_cancel_Loan,"Cancel loan"); //Commented on 03-Jan-2024
		mouseOverAndClick(getDriver(), agree_cancel_Loan, "Cancel loan"); //Added on 03-Jan-2024 Revised
		waitForElementToBeVisible(txt_cancelled, "CancelledTextWait"); //Added on 02-Jan-2024 Revised
		VerifyText_For_PageCaption(txt_cancelled, "Loan Cancelled", "Basic Info Page, Hence Passed");
		TestBase.bindreport(currentGlobalScenarioName, "rescind success details page");
		click(back_dashboard,"back to dashboard loan");
		
		waitForElementToBeVisible(verify_IL_button, "IL loan");
		
		System.out.println("*****************************");
		System.out.println("loan Cancelled successfully ");
		
					
	}
	
	
	}

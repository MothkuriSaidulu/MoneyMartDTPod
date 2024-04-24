package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import actions.OnlineActions;

public class Pg_12_LoanApprovedScreen extends OnlineActions {

	public Pg_12_LoanApprovedScreen(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}


	
	@FindBy (how=How.XPATH, using = "//div[@class='mm-congrats-header']")
	public static WebElement approved_valid;
	@FindBy (how=How.XPATH, using = "//button[@class='mm-nonav-btn mm-btn--lg mm-btn--primary fill']")
	public static WebElement next_Approvedscreen;
	@FindBy (how=How.XPATH, using = "//h2[contains(text(),'Congratulations you are approved for an installmen')]")
	public static WebElement LPP_protection_document_header_validation;
	
	@FindBy (how=How.XPATH, using = "//button[normalize-space()='Continue']")
	public static WebElement next_button;
	
	//@FindBy (how=How.XPATH, using = "//button[normalize-space()='Next']")
	//public static WebElement next_button;
	
		
	public void Approved_screen() throws Exception
	{
		
		
		//Get(denied_valid);
		Thread.sleep(2000);
		//VerifyText_For_PageCaption(approved_valid, "Congratulations!", "Basic Info Page, Hence Passed");
		
		//VerifyPlainText
		
		SoftVerifyTextOnly("Congratulations!", "Congratulations!", "Page text");
		
		waitForElementToBeClickable(next_Approvedscreen,"Process with LPP documenet loan");
		
		//VerifyText_For_PageCaption(approved_valid, "Verify amouont", "Basic Info Page, Hence Passed");
		
		
		
		Thread.sleep(5000);
		click(next_Approvedscreen,"click on next button in approved popup screen"); 
		
		VerifyText_For_PageCaption(LPP_protection_document_header_validation, "Congratulations you are approved for an installment loan", "Basic Info Page, Hence Passed");
		waitForElementToBeClickable(next_button,"Process with approved loan");
		click(next_button,"Clock on next button in approved screen");
		
		
	}
	public void Approved_screen_SPL() throws Exception
	{
		
		Thread.sleep(2000);
		VerifyText_For_PageCaption(approved_valid, "Congratulations!", "Basic Info Page, Hence Passed");
		waitForElementToBeClickable(next_Approvedscreen,"Process with LPP documenet loan");
		
		//VerifyText_For_PageCaption(approved_valid, "Verify amouont", "Basic Info Page, Hence Passed");
		
		
		
		Thread.sleep(5000);
		click(next_Approvedscreen,"click on next button in approved popup screen"); 
		
	}
	
}
	
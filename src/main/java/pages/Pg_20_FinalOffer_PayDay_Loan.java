package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import actions.OnlineActions;



public class Pg_20_FinalOffer_PayDay_Loan extends OnlineActions {

	//WebDriver driver;
		public Pg_20_FinalOffer_PayDay_Loan(WebDriver driver) {
			super(driver);
			PageFactory.initElements(driver, this);
		}


	
	@FindBy (how=How.XPATH, using = "(//h1[text()=\"Great news - you're approved!\"])")
	public static WebElement offer_head_txt;
	
//	@FindBy (how=How.XPATH, using = "//button[normalize-space()='Next']")
//	public static WebElement next_button;
	
	
	@FindBy (how=How.XPATH, using = "//button[normalize-space()='Continue']")
	public static WebElement next_button;
	 
	public void finaloffer() throws Exception
	{
		
		
		Thread.sleep(4000);
		waitForElementToBeVisible(offer_head_txt, "Offer header");
		
		VerifyText_For_PageCaption(offer_head_txt, "Great news - you're approved!", "approved page, Hence Passed");
		Thread.sleep(4000);
		click(next_button,"next button "); 
					
	}
	
	
	
	
	}

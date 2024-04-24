package pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import actions.OnlineActions;
import driver.TestBase;



public class Pg_14_Finaloffer_LPP_Yes_No extends OnlineActions {

	//WebDriver driver;
		public Pg_14_Finaloffer_LPP_Yes_No(WebDriver driver) {
			super(driver);
			PageFactory.initElements(driver, this);
		}

///added 11-july-2022
		//@FindBy (how=How.XPATH, using = "//div[text()='Loan Amount']//parent::div//descendant::div[2]//input")
		@FindBy (how=How.XPATH, using = "//*[@id=\"offer-form\"]/div[5]/div/div/div[2]/span[1]/div/input")//added 11-25-2022 by Madhu
		public static WebElement loan_amount;
		@FindBy (how=How.XPATH, using = "//button[@class='mm-nonav-btn mm-btn--lg mm-btn--primary fill']")
		public static WebElement continue_congradulations;
		
		@FindBy (how=How.XPATH, using = "//button[@type='button']")
		public static WebElement continue_after_congrates;
		
		///added 11-july-2022
	@FindBy (how=How.XPATH, using = "//form[@id='offer-form']//div//h1")
	public static WebElement offer_approved_validation;
	
	@FindBy (how=How.XPATH, using = "//div[contains(@class,'mm-form-field mmLoan')]//span[contains(@class,'mm-form-field__label')]")
	public static WebElement loanapprovedamount;
	
	@FindBy (how=How.XPATH, using = "//button[normalize-space()='Yes']")
	public static WebElement accept_LPP_Yes;
	
	@FindBy (how=How.XPATH, using = "//button[normalize-space()='No']")
	public static WebElement accept_LPP_No;
	
	//Added on 11-Dec-2023 Start
	@FindBy (how=How.XPATH, using = "//div[text()='*Loan Protection Plan']")
	public static WebElement caption_LPP;
	//Added on 11-Dec-2023 End
	
	@FindBy (how=How.XPATH, using = "//button[normalize-space()='Coverage through work']")
	public static WebElement LLP_coverage;
	
	@FindBy (how=How.XPATH, using = "//button[normalize-space()='Too expensive']")
	public static WebElement LLP_tooexpensive;
	
	@FindBy (how=How.XPATH, using = "//button[normalize-space()='Will not use']")
	public static WebElement LLP_willnotuse;
	
//	@FindBy (how=How.XPATH, using = "//button[normalize-space()='Next']")
//	public static WebElement next_button;
//	@FindBy (how=How.XPATH, using = "//button[normalize-space()='Next']")
//	public static List<WebElement> next_button_l;
	
	@FindBy (how=How.XPATH, using = "//button[normalize-space()='Continue']")
	public static WebElement next_button;
	
	@FindBy (how=How.XPATH, using = "//button[normalize-space()='Continue']")
	public static List<WebElement> next_button_l;
	
	
	public void finaloffer() throws Exception
	{
		continue_after_congrates.click();
		continue_after_congrates.click();
		
		
		VerifyText_For_PageCaption(offer_approved_validation, "Great news - you're approved!", "Basic Info Page, Hence Passed");
		
		String loanamount=loan_amount.getAttribute("Value");
		System.out.println("Loan amount:"+loanamount);
		//String str1=loanamount.substring(1);
		//System.out.println("Page name:::"+str1);
		/*String finalamount=str1;
		System.out.println(finalamount.replace(",", ""));
		TestBase.bindreport(currentGlobalScenarioName, "loam approved amount details page");
		int amount = Integer.parseInt(finalamount.replace(",", ""));
		if(amount>=14000)
		{
			Thread.sleep(9000);
			loan_amount.sendKeys(Keys.CONTROL + "a");
			loan_amount.sendKeys(Keys.DELETE);
			EnterText(loan_amount,"13000","Loan ammount");
		}
		*/
		if(getMapData.get("LPP").equalsIgnoreCase("Yes"))
			
		{
			click(accept_LPP_Yes,"LPP yes ");
		}
		else if(getMapData.get("LPP").equalsIgnoreCase("No"))
		{
			//Thread.sleep(5000); Commented on 11-dec-2023 Revised
			//click(accept_LPP_No,"LPP_no"); Commented on 11-dec-2023 Revised
			//Added on 11-Dec-2023 Start Revised
			scrollIntoView(caption_LPP); //Added on 10-July-2023 Revised
			Thread.sleep(4000); //Added on 10-July-2023 Revised
			//click(accept_LPP_No,"LPP_no"); //Commented on 11-July-2023 Revised
			mouseOverAndClick(getDriver(), accept_LPP_No, "accept_LPP_No"); //Added on 11-July-2023 Revised
			//Added on 11-Dec-2023 End Revised
			Thread.sleep(2000); //Changed on 11-dec-2023 from 8k to 2k Revised
			click(LLP_tooexpensive,"tooexpensive");
		}
		waitForElementToBeClickable(next_button,"Process with approved loan");
		
		if(next_button_l.size()>0)
		{
			click(next_button,"continue ");	
		}
		
					
	}
	
	//added on 8/10/2022 
	public void finaloffer_reloan() throws Exception
	{
		
		
		VerifyText_For_PageCaption(offer_approved_validation, "Great news - you're approved!", "Basic Info Page, Hence Passed");
		
		/*
		String loanamount=loan_amount.getAttribute("Value");
		System.out.println("Loan amount:"+loanamount);
		String str1=loanamount.substring(1);
		System.out.println("Page name:::"+str1);
		String finalamount=str1;
		System.out.println(finalamount.replace(",", ""));
		TestBase.bindreport(currentGlobalScenarioName, "loam approved amount details page");
		int amount = Integer.parseInt(finalamount.replace(",", ""));
		if(amount>=10000)
		{
			loan_amount.sendKeys(Keys.CONTROL + "a");
			loan_amount.sendKeys(Keys.DELETE);
			EnterText(loan_amount,"9000","Loan ammount");
		}
		*/
		if(getMapData.get("LPP").equalsIgnoreCase("Yes"))
			
		{
			click(accept_LPP_Yes,"LPP yes ");
		}
		else if(getMapData.get("LPP").equalsIgnoreCase("No"))
		{
			click(accept_LPP_No,"LPP_no");
			Thread.sleep(2000);
			click(LLP_tooexpensive,"tooexpensive");
		}
		
		TestBase.bindreport(currentGlobalScenarioName, "Lpp offer page");
		
		waitForElementToBeClickable(next_button,"Process with approved loan");
		
		if(next_button_l.size()>0)
		{
			click(next_button,"continue ");	
		}
		
		TestBase.bindreport(currentGlobalScenarioName, "next button");			
	}
	
	
	
	}

package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import actions.OnlineActions;



public class Pg_10_Payment extends OnlineActions {

	public Pg_10_Payment(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	//Add bank payment 

	@FindBy (how=How.XPATH, using = "//p[contains(normalize-space(),'Add Bank')]")
	public static WebElement Add_Bank;

	//New bank page

	@FindBy (how=How.NAME, using = "institutionNumber")
	public static WebElement Bank_InstituteNo;

	@FindBy (how=How.NAME, using = "transitNumber")
	public static WebElement Bank_TransitNo;

	@FindBy (how=How.XPATH, using = "//button[@class='mm-select__value']")
	public static WebElement AccountType;

	@FindBy (how=How.XPATH, using = "//button[@class='mm-dropdown__menu-item'][1]")
	public static WebElement AC_Type_Checking;

	@FindBy (how=How.XPATH, using = "//button[@class='mm-dropdown__menu-item'][2]")
	public static WebElement AC_Type_Savings;

	@FindBy (how=How.NAME, using = "accountNumber")
	public static WebElement AccountNumber;

	@FindBy (how=How.NAME, using = "confirmAccountNumber")
	public static WebElement ConfirmAccountNo;

	@FindBy (how=How.XPATH, using = "//button[normalize-space()='Save and Continue']")
	public static WebElement SaveAndClose;
	
	@FindBy (how=How.XPATH, using = "//div[normalize-space()='Direct Deposit']")
	public static WebElement validation_paymenttype_DD;
	@FindBy (how=How.XPATH, using = "//div[normalize-space()='BANK OF MONTREAL']")
	public static WebElement validation_bankdetails;
	
	@FindBy (how=How.XPATH, using = "//button[normalize-space()='Next']")
	public static WebElement next_movetodocumentscreen;
	
	
	
	@FindBy (how=How.XPATH, using = "//div[normalize-space()='ROYAL BANK OF CANADA']")
	public static WebElement txt_RoyalBank;
	
	@FindBy (how=How.XPATH, using = "//div[normalize-space()='BANK OF MONTREAL']")
	public static WebElement txt_BankOfMonteal;
	
	
	@FindBy (how=How.XPATH, using = "//div[@class='box-content-funding-et']/div/div[1]")
	public static List< WebElement> txt_Banktype_list;
	
	@FindBy (how=How.XPATH, using = "//div[@class='box-content-funding-et']/div/div[1]")
	public static  WebElement txt_Banktype;
	
	@FindBy (how=How.XPATH, using = "//span[normalize-space()='FlinksCapitalBank Checking x0010']")
	public static WebElement txt_FlinksBank1;
	
	@FindBy (how=How.XPATH, using = "//span[normalize-space()='FlinksCapitalBank Checking x0010']/preceding::span[1]")
	public static WebElement radio_FlinksBank1;
	
	@FindBy (how=How.XPATH, using = "//span[contains(normalize-space(),'FlinksCapitalBank')]")
	public static WebElement txt_FlinksBank;
	
	@FindBy (how=How.XPATH, using = "//span[contains(normalize-space(),'FlinksCapitalBank')]/preceding::span[1]")
	public static WebElement radio_FlinksBank2;
	
	@FindBy (how=How.XPATH, using = "//div[@class='mb-1 option-head' and contains(normalize-space(),'FlinksCapitalBank')]")
	public static WebElement radio_FlinksBank;
	
	@FindBy (how=How.XPATH, using = "//*[normalize-space()='FlinksCapitalBank']")
	public static WebElement txt_FlinksBank_withoutRadio;
	
	@FindBy (how=How.XPATH, using = "//button[normalize-space()='Sign Documents']")
	public static WebElement Sign_Docs1;
	
//	@FindBy (how=How.XPATH, using = "//button[@form='offer-form' and normalize-space()='Next']")
//	public static WebElement btn_Next;
	
	@FindBy (how=How.XPATH, using = "//button[@form='offer-form' and normalize-space()='Continue']")
	public static WebElement btn_Next;
	
	
/*
	public void Payment_AddBank() throws Exception
	{
//		TreeMap<String, String> getMapData = new TreeMap<String, String>();
//		getMapData  = Xls_Reader.getCellDataBasedOnRowValuefromTestData(TestBase.gettestCaseName(), TestBase.gettestCaseName()+TestBase.getEnvironment()+TestBase.getDevice()+TestBase.getOS1()+TestBase.getOSVersion()+TestBase.getBrowser()); //AddedPP 02-Apr-2019 // Updated method name on 06-MAY-2019 Commented on 13-MAY-2019

		click(Add_Bank,"Add bank");
		EnterText(Bank_InstituteNo, getMapData.get("bank_instituteNo"), "Bank institute number");
		EnterText(Bank_TransitNo, getMapData.get("bank_TransitNo"), "Bank transit number");
		click(AccountType,"Account Type");
		if(getMapData.get("bank_AccountType").equalsIgnoreCase("Savings"))
		{
			click(AC_Type_Savings,"Savings account");
		}
		else if(getMapData.get("bank_AccountType").equalsIgnoreCase("Checking"))
		{
			click(AC_Type_Checking,"Checking account");
		}
		EnterText(AccountNumber, getMapData.get("bank_AccountNo"), "Account Number");
		EnterText(ConfirmAccountNo, getMapData.get("bank_AccountNo"), "Confirm Account Number");
		click(SaveAndClose,"Save and cloContinuese");
		
		if(getMapData.get("bank_Name").equalsIgnoreCase("RoyalBank"))
		{
			waitForElementToBeVisible(txt_RoyalBank, "Royal Bank of India");
			click(txt_RoyalBank, "Royal Bank of India");
			click(btn_Next,"Next");
		}
		else if(getMapData.get("bank_Name").equalsIgnoreCase("BankOfMonteal"))
		{
			waitForElementToBeVisible(txt_BankOfMonteal, "monteal Bank of India");
			click(txt_BankOfMonteal, "Royal Bank of India");
			click(btn_Next,"Next");
			
		}
		
	}
	*/
	
	
	public void Payment_AddBank() throws Exception
	{
//		TreeMap<String, String> getMapData = new TreeMap<String, String>();
//		getMapData  = Xls_Reader.getCellDataBasedOnRowValuefromTestData(TestBase.gettestCaseName(), TestBase.gettestCaseName()+TestBase.getEnvironment()+TestBase.getDevice()+TestBase.getOS1()+TestBase.getOSVersion()+TestBase.getBrowser()); //AddedPP 02-Apr-2019 // Updated method name on 06-MAY-2019 Commented on 13-MAY-2019

		
		waitForElementToBeVisible(Add_Bank, "Add button");
		
		click(Add_Bank,"Add bank");
		EnterText(Bank_InstituteNo, getMapData.get("bank_instituteNo"), "Bank institute number");
		EnterText(Bank_TransitNo, getMapData.get("bank_TransitNo"), "Bank transit number");
		click(AccountType,"Account Type");
		if(getMapData.get("bank_AccountType").equalsIgnoreCase("Savings"))
		{
			click(AC_Type_Savings,"Savings account");
		}
		else if(getMapData.get("bank_AccountType").equalsIgnoreCase("Checking"))
		{
			click(AC_Type_Checking,"Checking account");
		}
		EnterText(AccountNumber, getMapData.get("bank_AccountNo"), "Account Number");
		EnterText(ConfirmAccountNo, getMapData.get("bank_AccountNo"), "Confirm Account Number");
		click(SaveAndClose,"Save and cloContinuese");
		
		
			waitForElementToBeVisible(txt_RoyalBank, "Royal Bank of India");
			click(txt_RoyalBank, "Royal Bank of India");
			click(btn_Next,"Next");
		
		
	}
	
	
	
	
	
	
	
	
	
	public void Payment_withFlinks() throws Exception
	{
		
		Thread.sleep(3000);
//		TreeMap<String, String> getMapData = new TreeMap<String, String>();
//		getMapData  = Xls_Reader.getCellDataBasedOnRowValuefromTestData(TestBase.gettestCaseName(), TestBase.gettestCaseName()+TestBase.getEnvironment()+TestBase.getDevice()+TestBase.getOS1()+TestBase.getOSVersion()+TestBase.getBrowser()); //AddedPP 02-Apr-2019 // Updated method name on 06-MAY-2019 Commented on 13-MAY-2019
//		loadingWait(Pg_CommonLocators.Loading,"Loading Div");
//		waitForElementToBeVisible(radio_FlinksBank, "Flinks Bank");
		//loadingWait(Pg_CommonLocators.Loading,"Loading Div");
		waitForElementToBeClickable(radio_FlinksBank, "WaitForFlinksBank"); //Added on 03-Jan-2024 Revised
		click(radio_FlinksBank,"Flinks bank");
		//loadingWait(Pg_CommonLocators.Loading,"Loading Div");
		waitForElementToBeClickable(btn_Next, "WaitNExt"); //Added on 03-Jan-2024 Revised
		click(btn_Next,"Next");
	}

	public void Payment_WOF_withFlinksBank() throws Exception
	{
//		TreeMap<String, String> getMapData = new TreeMap<String, String>();
//		getMapData  = Xls_Reader.getCellDataBasedOnRowValuefromTestData(TestBase.gettestCaseName(), TestBase.gettestCaseName()+TestBase.getEnvironment()+TestBase.getDevice()+TestBase.getOS1()+TestBase.getOSVersion()+TestBase.getBrowser()); //AddedPP 02-Apr-2019 // Updated method name on 06-MAY-2019 Commented on 13-MAY-2019
//		waitForElementToBeVisible(txt_FlinksBank_withoutRadio, "Flinks Bank");
		click(txt_FlinksBank_withoutRadio, "Flinks Bank");
		click(btn_Next,"Next");
	}
	public void Payment_Existing() throws Exception
	{
		//TreeMap<String, String> getMapData = new TreeMap<String, String>();
		//getMapData  = Xls_Reader.getCellDataBasedOnRowValuefromTestData(TestBase.gettestCaseName(), TestBase.gettestCaseName()+TestBase.getEnvironment()+TestBase.getDevice()+TestBase.getOS1()+TestBase.getOSVersion()+TestBase.getBrowser()); //AddedPP 02-Apr-2019 // Updated method name on 06-MAY-2019 Commented on 13-MAY-2019
		Thread.sleep(5000);
		 
		if (txt_Banktype_list.size()>0)  //added 15 july 2022
		{
			
		String bankMonteal=txt_Banktype.getText();
		System.out.println(bankMonteal);
		if(bankMonteal.equalsIgnoreCase("BANK OF MONTREAL"))
		{
			waitForElementToBeVisible(txt_BankOfMonteal, "BANK OF MONTREAL");
			click(txt_BankOfMonteal, "BANK OF MONTREAL");
			click(btn_Next,"Next");
		}
		
		else if (bankMonteal.equalsIgnoreCase("ROYAL BANK OF CANADA"))
		{
		
			waitForElementToBeVisible(txt_RoyalBank, "ROYAL BANK OF CANADA");
			click(txt_RoyalBank, "Royal Bank of India");
			click(btn_Next,"Next");
		}
		
		else
		{
		
			click(Add_Bank,"Add bank");
			EnterText(Bank_InstituteNo, getMapData.get("bank_instituteNo"), "Bank institute number");
			EnterText(Bank_TransitNo, getMapData.get("bank_TransitNo"), "Bank transit number");
			click(AccountType,"Account Type");
			if(getMapData.get("bank_AccountType").equalsIgnoreCase("Savings"))
			{
				click(AC_Type_Savings,"Savings account");
			}
			else if(getMapData.get("bank_AccountType").equalsIgnoreCase("Checking"))
			{
				click(AC_Type_Checking,"Checking account");
			}
			EnterText(AccountNumber, getMapData.get("bank_AccountNo"), "Account Number");
			EnterText(ConfirmAccountNo, getMapData.get("bank_AccountNo"), "Confirm Account Number");
			click(SaveAndClose,"Save and cloContinuese");
			waitForElementToBeVisible(txt_RoyalBank, "Royal Bank of India");
			click(txt_RoyalBank, "Royal Bank of India");
			click(btn_Next,"Next");
		}
		
		}
	}
	
}

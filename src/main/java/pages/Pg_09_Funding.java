package pages;

import java.util.HashSet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import actions.OnlineActions;
import driver.TestBase;


public class Pg_09_Funding extends OnlineActions {

	public Pg_09_Funding(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	// Funding method

	@FindBy(how = How.XPATH, using = "//div[@class='box-content-funding-dd']")
	public static WebElement radio_DirectDeposit;

	@FindBy(how = How.XPATH, using = "//div[@class='box-content-funding-et']")
	public static WebElement etransfer;

	//@FindBy(how = How.XPATH, using = "//button[normalize-space()='Next']")
	//public static WebElement next_button;
	
	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Continue']")
	public static WebElement next_button;

	@FindBy(how = How.XPATH, using = "//h1[normalize-space()='Perfect!']")
	public static WebElement txt_fundingpage;
	
	//Repay card xpaths
	
	@FindBy (how=How.XPATH, using = "//div[normalize-space()='Tell us how to give you your money.']")
	public static WebElement head_Step2Funding;
	
	@FindBy (how=How.XPATH, using = "//button[normalize-space()='+ Add Visa Debit Card']")
	public static WebElement Add_DebitCard;
	
	@FindBy (how=How.XPATH, using = "//iframe[@class='responsive-iframe']")
	public static WebElement iFrame;
	
	@FindBy(how=How.XPATH, using = "//input[@name='cardholder_name']")
	private static WebElement cardholder_Name;

	@FindBy(how=How.XPATH, using = "//input[@name='card_number']")
	private static WebElement cardNumber;

	@FindBy(how=How.XPATH, using = "//input[@name='card_cvc']")
	private static WebElement CardCVV;

	@FindBy(how=How.XPATH, using = "//select[@name='card_expiration_month']")
	private static WebElement dd_ExpireMonth;

	@FindBy(how=How.XPATH, using = "//select[@name='card_expiration_year']")
	private static WebElement dd_ExpireYear;

	@FindBy(how=How.XPATH, using = "//input[@name='address_street']")
	private static WebElement StreetAddress;

	@FindBy(how=How.XPATH, using = "//input[@name='address_zip']")
	private static WebElement ZipCode;

	@FindBy(how=How.XPATH, using = "//input[@name='StateorProvince']")
	private static WebElement StateProvince;

	@FindBy(how=How.XPATH, using = "//button[normalize-space()='Authorize']")
	private static WebElement btn_Authorize;
	
	@FindBy(how=How.XPATH, using = "//div[normalize-space()='Thank you for your authorization!']")
	private static WebElement txt_TanksforAuth;

	@FindBy(how=How.XPATH, using = "//h3[normalize-space()='Card added']")
	private static WebElement txt_CardAdded;

	@FindBy(how=How.XPATH, using = "//input[@type='checkbox']")
	private static WebElement Check_Debitcard_SaveforFuture;

	@FindBy(how=How.XPATH, using = "//button[normalize-space()='Continue']")
	private static WebElement btn_Continue;
	
	@FindBy(how=How.XPATH, using = "//button[normalize-space()='Close']")
	private static WebElement btn_close;
	
	@FindBy(how=How.XPATH, using = "//div[@class='funding-head-et'][normalize-space()='Card: #### #### #### 0004' or 'Card: #### #### #### 0134']")
	private static WebElement RepayCard;
	
	@FindBy(how=How.XPATH, using = "//div[@class='boxcard ']//div[@class='box-content-funding-et']")
	private static WebElement existing_repay;
	
	///  Add xpaths for change funding in jsy flow 04 25 revised start
	
		@FindBy(how = How.XPATH,using = "//div[text()=' Edit Funding Details']")
		WebElement edit_btm_funding;
		
		@FindBy(how = How.XPATH,using = "//p[text()='e-Transfer']/following::div[@class='et-funding']")
		WebElement edit_btm_etfunding;
		@FindBy(how = How.XPATH,using = "//p[text()='Direct Deposit']/following::div[@class='boxdd selected']")
		WebElement edit_btm_ddfunding;
		@FindBy(how = How.XPATH,using = "//div[@class='confirmBtn']/button[text()='Save']")
		WebElement edit_btm_savefunding;
		
		
		
		///  Add xpaths for change funding in jsy flow 04 25 revised end
	
	public void funding_existing_repay() throws Exception
	{
		Thread.sleep(3000);
		
		if(getMapData.get("Funding_Method").equalsIgnoreCase("Debit Card")||getMapData.get("Funding_Method").equalsIgnoreCase("Repay"))
		{
			waitForElementToBeVisible(existing_repay, "Existing repay card");
			click(existing_repay, "select the repay card");
		}
		else if(getMapData.get("Funding_Method").equalsIgnoreCase("Debit Card")||getMapData.get("Funding_Method").equalsIgnoreCase("Repay"))
		{
			waitForElementToBeVisible(Add_DebitCard, "Funding method as debit card");
			click(Add_DebitCard,"Add debit card");
			waitForElementToBeVisible(iFrame, "iFrame");
			TestBase.getDriver().switchTo().frame(iFrame);
			waitForElementToBeClickable(cardholder_Name, "Card holder name");
			EnterText(cardholder_Name, getMapData.get("input_CardHolderName"), "Card holder name");
			EnterText(cardNumber, getMapData.get("input_CardHolderNumber"), "Card number");
			EnterText(CardCVV, getMapData.get("input_CardHolderSecurityNumber"), "Card CVV");
			click(dd_ExpireMonth,"Expire month");
			SelectVisibleText(dd_ExpireMonth, getMapData.get("input_CardHolderExpMonth"), "Expire month");
			click(dd_ExpireYear,"Expire year");
			SelectVisibleText(dd_ExpireYear, getMapData.get("input_CardHolderExpYear"), "Expire year");
			EnterText(StreetAddress, getMapData.get("input_CardHolderBillingStreet"), "Street Address");
			EnterText(ZipCode, getMapData.get("input_CardHolderPostalCode"), "ZipCode");
			EnterText(StateProvince, getMapData.get("input_CardHolderProvince"), "Province");
			click(btn_Authorize,"Authorize button");
			waitForLoadingIconDisappearInDialog(TestBase.getDriver());
			TestBase.getDriver().switchTo().defaultContent();
//			waitForElementToBeVisible(txt_TanksforAuth, "Thanks for AUth text");			
			waitForElementToBeVisible(txt_CardAdded, "text card added");
			click(Check_Debitcard_SaveforFuture,"Save card for future");
			click(btn_close,"Close button");
			click(RepayCard,"Repay card");
			waitForLoadingIconDisappearInDialog(TestBase.getDriver());
//			waitForElementToBeVisible(txt_TestCard, "Debit card");
//			click(check_DebitCard,"Checkbox on debit card");

			Thread.sleep(2000);
		}
		click(next_button, "Next");
		Thread.sleep(3000);
	}
	
	  public void Page_Method() throws Exception 
	  { 
		  System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		  
		  
		  
		  System.out.println("Getting current page URL");
		  //Thread.sleep(12000); //commnet 25 july 2022
		  //String  strUrl = TestBase.getDriver().getCurrentUrl(); //commnet 25 july 2022
		  //System.out.println("Wait update the loan status in DB"+"URL:::"+strUrl);//commnet 25 july 2022
		  
		//Added on 25-July-2022 Start
		  HashSet<String> Url_Set = new HashSet<String>();
		  Url_Set.add("https://qac.moneymart.ca/loan-application/verification/info");
		  Url_Set.add("https://qac.moneymart.ca/loan-application/verification");
		  Url_Set.add("https://qac.moneymart.ca/loan-application/funding");
		  Url_Set.add("https://qac.moneymart.ca/loan-application/loan-protection");
	      String strUrl = TestBase.getDriver().getCurrentUrl(); 
	      System.out.println("Wait update the loan status in DB"+"URL:::"+strUrl);
	      
		  int i = 1;
	      while(!Url_Set.contains(strUrl))
		  {
			  System.out.println(TestBase.getDriver().getCurrentUrl());
			  System.out.println("WAITING................................");
			  Thread.sleep(5000); 
			  i = i + 1;
			  strUrl = TestBase.getDriver().getCurrentUrl();
			  if(i == 40) //Changed 30 from 24 on 08-Jan-2024 Revised Changed 40 from 30 on 17-Jan-2024 Revised 
			  {
				  break;
			  }
		  }
		  //strUrl = TestBase.getDriver().getCurrentUrl(); 
		  System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		//Added on 25-July-2022 End
	  
	  String loanprotection="loan-application/loan-protection"; String
	  phoneverification="loan-application/verification/info"; String
	  phoneverfication2= "loan-application/verification"; String
	  fundingselection="loan-application/funding";
	  
	  String str1=strUrl.substring(25); System.out.println("Page name:::"+str1);
	  
	  if(str1.equalsIgnoreCase(phoneverification)
	  ||str1.equalsIgnoreCase(phoneverfication2)) 
	  { Pg_11_PhoneOTP
	  obj_phoneverification=new Pg_11_PhoneOTP(TestBase.getDriver());
	  
	  String phone=obj_phoneverification.phonenumber_valid.getText();
	  obj_phoneverification.phone_verification_invalidopt(); 
	  TestBase.bindreport(currentGlobalScenarioName, "opt page");
		Funding_Method();
	  
	  }
	  else if(str1.equalsIgnoreCase(fundingselection)) 
	  { 
		  String  funding=txt_fundingpage.getText(); System.out.println("verify the text"+funding);
	  
		  
			Funding_Method();
		  
	  
	  
	  } else if(str1.equalsIgnoreCase(loanprotection)) { Pg_12_LoanApprovedScreen
	  obj_approved_screen = new Pg_12_LoanApprovedScreen(TestBase.getDriver());
	  obj_approved_screen.Approved_screen();
	  
	  }
	  
	  }
	  
	  //adding code for change funding in jsy flow 04 26 start revised
	  public void changefundingjsypage() throws Exception
	  {
		  System.out.println("Getting current page URL");
		  
		  
		  String strUrljsy = TestBase.getDriver().getCurrentUrl();
		  System.out.println("Getting current page URL::"+strUrljsy);
		  
		  Funding_Method_change();
	  }
	  
	//adding code for change funding in jsy flow 04 26 end revised
	  
	  public void changefunding() throws Exception 
	  { 
		  System.out.println("Getting current page URL");
		  //Thread.sleep(12000); //commnet 25 july 2022
		  //String  strUrl = TestBase.getDriver().getCurrentUrl(); //commnet 25 july 2022
		  //System.out.println("Wait update the loan status in DB"+"URL:::"+strUrl);//commnet 25 july 2022
		  
		//Added on 25-July-2022 Start
		  HashSet<String> Url_Set = new HashSet<String>();
		  Url_Set.add("https://qac.moneymart.ca/loan-application/verification/info");
		  Url_Set.add("https://qac.moneymart.ca/loan-application/verification");
		  Url_Set.add("https://qac.moneymart.ca/loan-application/funding");
		  Url_Set.add("https://qac.moneymart.ca/loan-application/loan-protection");
	      String strUrl = TestBase.getDriver().getCurrentUrl(); 
	      System.out.println("Wait update the loan status in DB"+"URL:::"+strUrl);
	      
		  int i = 1;
	      while(!Url_Set.contains(strUrl))
		  {
			  System.out.println(TestBase.getDriver().getCurrentUrl());
			  System.out.println("WAITING................................");
			  Thread.sleep(5000); 
			  i = i + 1;
			  strUrl = TestBase.getDriver().getCurrentUrl();
			  if(i == 24)
			  {
				  break;
			  }
		  }
		  //strUrl = TestBase.getDriver().getCurrentUrl(); 
		  System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		//Added on 25-July-2022 End
	  
	  String loanprotection="loan-application/loan-protection"; String
	  phoneverification="loan-application/verification/info"; String
	  phoneverfication2= "loan-application/verification"; String
	  fundingselection="loan-application/funding";
	  
	  String str1=strUrl.substring(25); System.out.println("Page name:::"+str1);
	  
	  if(str1.equalsIgnoreCase(phoneverification)
	  ||str1.equalsIgnoreCase(phoneverfication2)) 
	  { 
		  Pg_11_PhoneOTP  obj_phoneverification=new Pg_11_PhoneOTP(TestBase.getDriver());
	  
	  String phone=obj_phoneverification.phonenumber_valid.getText();
	  obj_phoneverification.phone_verification_SPL();
	 
		  Funding_Method_change();
	  
	  }
	  else if(str1.equalsIgnoreCase(fundingselection)) 
	  { 
		  String  funding=txt_fundingpage.getText(); System.out.println("verify the text"+funding);
	  
		  
			  Funding_Method_change();
		  
		
	  
	  
	  } 
	  else if(str1.equalsIgnoreCase(loanprotection)) 
	  { 
		  Pg_12_LoanApprovedScreen  obj_approved_screen = new Pg_12_LoanApprovedScreen(TestBase.getDriver());
	  obj_approved_screen.Approved_screen();
	  
	  }
	  
	  }
	  
	  public void phoneotppass() throws Exception 
	  { 
		  System.out.println("Getting current page URL");
		  //Thread.sleep(12000); //commnet 25 july 2022
		  //String  strUrl = TestBase.getDriver().getCurrentUrl(); //commnet 25 july 2022
		  //System.out.println("Wait update the loan status in DB"+"URL:::"+strUrl);//commnet 25 july 2022
		  
		//Added on 25-July-2022 Start
		  HashSet<String> Url_Set = new HashSet<String>();
		  Url_Set.add("https://qac.moneymart.ca/loan-application/verification/info");
		  Url_Set.add("https://qac.moneymart.ca/loan-application/verification");
		  Url_Set.add("https://qac.moneymart.ca/loan-application/funding");
		  Url_Set.add("https://qac.moneymart.ca/loan-application/loan-protection");
	      String strUrl = TestBase.getDriver().getCurrentUrl(); 
	      System.out.println("Wait update the loan status in DB"+"URL:::"+strUrl);
	      
		  int i = 1;
	      while(!Url_Set.contains(strUrl))
		  {
			  System.out.println(TestBase.getDriver().getCurrentUrl());
			  System.out.println("WAITING................................");
			  Thread.sleep(5000); 
			  i = i + 1;
			  strUrl = TestBase.getDriver().getCurrentUrl();
			  if(i == 24)
			  {
				  break;
			  }
		  }
		  //strUrl = TestBase.getDriver().getCurrentUrl(); 
		  System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		//Added on 25-July-2022 End
	  
	  String loanprotection="loan-application/loan-protection"; String
	  phoneverification="loan-application/verification/info"; String
	  phoneverfication2= "loan-application/verification"; String
	  fundingselection="loan-application/funding";
	  
	  String str1=strUrl.substring(25); System.out.println("Page name:::"+str1);
	  
	  if(str1.equalsIgnoreCase(phoneverification)	  ||str1.equalsIgnoreCase(phoneverfication2)) 
	  { 
		  Pg_11_PhoneOTP  obj_phoneverification=new Pg_11_PhoneOTP(TestBase.getDriver());
	  
	  String phone=obj_phoneverification.phonenumber_valid.getText();
	  obj_phoneverification.phone_verification(); 
	 
		//Funding_Method();
	  
	  
	  }
	  else if(str1.equalsIgnoreCase(fundingselection)) 
	  { 
		  String  funding=txt_fundingpage.getText(); System.out.println("verify the text"+funding);
	  
		 
			Funding_Method();
		  
	  
	  
	  } else if(str1.equalsIgnoreCase(loanprotection)) { Pg_12_LoanApprovedScreen
	  obj_approved_screen = new Pg_12_LoanApprovedScreen(TestBase.getDriver());
	  obj_approved_screen.Approved_screen();
	  
	  }
	  
	  }
	  
	  public void autofund() throws Exception 
	  { 
		  System.out.println("Getting current page URL");
		  //Thread.sleep(12000); //commnet 25 july 2022
		  //String  strUrl = TestBase.getDriver().getCurrentUrl(); //commnet 25 july 2022
		  //System.out.println("Wait update the loan status in DB"+"URL:::"+strUrl);//commnet 25 july 2022
		  
		//Added on 25-July-2022 Start
		  HashSet<String> Url_Set = new HashSet<String>();
		  Url_Set.add("https://qac.moneymart.ca/loan-application/verification/info");
		  Url_Set.add("https://qac.moneymart.ca/loan-application/verification");
		  Url_Set.add("https://qac.moneymart.ca/loan-application/funding");
		  Url_Set.add("https://qac.moneymart.ca/loan-application/loan-protection");
		  
	      String strUrl = TestBase.getDriver().getCurrentUrl(); 
	      //System.out.println("Wait update the loan status in DB"+"URL:::"+strUrl);
	      
		  int i = 1;
	      while(!Url_Set.contains(strUrl))
		  {
			  System.out.println(TestBase.getDriver().getCurrentUrl());
			  System.out.println("WAITING................................");
			  Thread.sleep(5000); 
			  i = i + 1;
			  strUrl = TestBase.getDriver().getCurrentUrl();
			  if(i == 24)
			  {
				  break;
			  }
		  }
		  //strUrl = TestBase.getDriver().getCurrentUrl(); 
		  System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		//Added on 25-July-2022 End
	  
	  String loanprotection="loan-application/loan-protection"; 
	  String  phoneverification="loan-application/verification/info"; 
	  String phoneverfication2= "loan-application/verification"; 
	  String  fundingselection="loan-application/funding";
	  
	  String str1=strUrl.substring(25); 
	  System.out.println("Page name:::"+str1);
	  
	  if(str1.equalsIgnoreCase(phoneverification)	  ||str1.equalsIgnoreCase(phoneverfication2)) 
	  { 
		  Pg_11_PhoneOTP  obj_phoneverification=new Pg_11_PhoneOTP(TestBase.getDriver());
	  
	  String phone=obj_phoneverification.phonenumber_valid.getText();
	  obj_phoneverification.phone_verification(); 
	  Pg_12_LoanApprovedScreen  obj_approved_screen = new Pg_12_LoanApprovedScreen(TestBase.getDriver());
	  obj_approved_screen.Approved_screen();
	  
	  }
	  else if(str1.equalsIgnoreCase(loanprotection)) 
	  { 
		  Pg_12_LoanApprovedScreen  obj_approved_screen = new Pg_12_LoanApprovedScreen(TestBase.getDriver());
		  obj_approved_screen.Approved_screen();
		  
		  }
	  else if(str1.equalsIgnoreCase(fundingselection)) 
	  { 
		  
	  System.out.println("Application goes to manual review");
	  System.out.println("Change the test data");
	  TestBase.getDriver().close();
	  
	  	} 
	  
	  }
	 
	  public void autofund_manualreview() throws Exception 
	  { 
		  System.out.println("Getting current page URL");
		  //Thread.sleep(12000); //commnet 25 july 2022
		  //String  strUrl = TestBase.getDriver().getCurrentUrl(); //commnet 25 july 2022
		  //System.out.println("Wait update the loan status in DB"+"URL:::"+strUrl);//commnet 25 july 2022
		  
		//Added on 25-July-2022 Start
		  HashSet<String> Url_Set = new HashSet<String>();
		  Url_Set.add("https://qac.moneymart.ca/loan-application/verification/info");
		  Url_Set.add("https://qac.moneymart.ca/loan-application/verification");
		  Url_Set.add("https://qac.moneymart.ca/loan-application/funding");
		  Url_Set.add("https://qac.moneymart.ca/loan-application/loan-protection");
		  
	      String strUrl = TestBase.getDriver().getCurrentUrl(); 
	      //System.out.println("Wait update the loan status in DB"+"URL:::"+strUrl);
	      
		  int i = 1;
	      while(!Url_Set.contains(strUrl))
		  {
			  System.out.println(TestBase.getDriver().getCurrentUrl());
			  System.out.println("WAITING................................");
			  Thread.sleep(5000); 
			  i = i + 1;
			  strUrl = TestBase.getDriver().getCurrentUrl();
			  if(i == 24)
			  {
				  break;
			  }
		  }
		  //strUrl = TestBase.getDriver().getCurrentUrl(); 
		  System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		//Added on 25-July-2022 End
	  
	  String loanprotection="loan-application/loan-protection"; 
	  String  phoneverification="loan-application/verification/info"; 
	  String phoneverfication2= "loan-application/verification"; 
	  String  fundingselection="loan-application/funding";
	  
	  String str1=strUrl.substring(25); 
	  System.out.println("Page name:::"+str1);
	  
	  if(str1.equalsIgnoreCase(phoneverification)	  ||str1.equalsIgnoreCase(phoneverfication2)) 
	  { 
		  Pg_11_PhoneOTP  obj_phoneverification=new Pg_11_PhoneOTP(TestBase.getDriver());
	  
	  String phone=obj_phoneverification.phonenumber_valid.getText();
	  obj_phoneverification.phone_verification(); 
	  Pg_12_LoanApprovedScreen  obj_approved_screen = new Pg_12_LoanApprovedScreen(TestBase.getDriver());
	  obj_approved_screen.Approved_screen();
	  
	  }
	  else if(str1.equalsIgnoreCase(loanprotection)) 
	  { 
		  Pg_12_LoanApprovedScreen  obj_approved_screen = new Pg_12_LoanApprovedScreen(TestBase.getDriver());
		  obj_approved_screen.Approved_screen();
		  
		  }
	  else if(str1.equalsIgnoreCase(fundingselection)) 
	  { 
		  
	  System.out.println("Application goes to manual review");
	
		  Pg_09_Funding obj_phone= new Pg_09_Funding(TestBase.getDriver());
			obj_phone.Funding_Method();
			
			Pg_10_Payment obj_payment = new Pg_10_Payment(TestBase.getDriver());

			obj_payment.Payment_AddBank();
			
			Thread.sleep(2000);
			
			Pg_06_ThankYou_DocumentUpload obj_DocumentUpload = new Pg_06_ThankYou_DocumentUpload(TestBase.getDriver());

			obj_DocumentUpload.Upload_Docs();
			
			Thread.sleep(2000);
			
			Pg_Databases obj_DB=new Pg_Databases(TestBase.getDriver());
			obj_DB.update_loanstatus(24);
			
			
			
		   
			
	  
	  	} 
	  
	  } 
	  
	  
	  
	  
	  
	  

	public void Funding_Method() throws Exception {
		Thread.sleep(10000);
		waitForElementToBeVisible(etransfer, "E-Transfer");
		
		/*
		 * if(getMapData.get("IL_User_Funding").equalsIgnoreCase("Optout")) {
		 */
		if (getMapData.get("Funding_Method").equalsIgnoreCase("E-Transfer")) {
			waitForElementToBeVisible(etransfer, "E-Transfer");
			click(etransfer, "E-Transfer");
		} 
		else if (getMapData.get("Funding_Method").equalsIgnoreCase("Direct Deposit")) 
		{
			Thread.sleep(3000);
			
			System.out.println("Wait for verifing funding type");
			
			waitForElementToBeVisible(radio_DirectDeposit, "Direct depost"); 
			
			Thread.sleep(3000);
			
			mouseOverAndClick(getDriver(), radio_DirectDeposit, "Direct depost");
			
			//click(getDriver(), radio_DirectDeposit, "Direct depost");
			
			click(radio_DirectDeposit, "direct");
			
			Thread.sleep(2000);
			
			waitForLoadingIconDisappearInDialog(TestBase.getDriver());

			// Actions actions = new Actions(driver);
			// actions.moveToElement(radio_DirectDeposit);
			// actions.click().build().perform();
			// click(radio_DirectDeposit,"Direct deposit");
			Thread.sleep(2000);
			waitForLoadingIconDisappearInDialog(TestBase.getDriver());
		}

		
		else if(getMapData.get("Funding_Method").equalsIgnoreCase("Debit Card")||getMapData.get("Funding_Method").equalsIgnoreCase("Repay"))
		{
			Thread.sleep(2000);
			waitForElementToBeVisible(Add_DebitCard, "Funding method as debit card");
			click(Add_DebitCard,"Add debit card");
			waitForElementToBeVisible(iFrame, "iFrame");
			TestBase.getDriver().switchTo().frame(iFrame);
			waitForElementToBeClickable(cardholder_Name, "Card holder name");
			EnterText(cardholder_Name, getMapData.get("input_CardHolderName"), "Card holder name");
			EnterText(cardNumber, getMapData.get("input_CardHolderNumber"), "Card number");
			EnterText(CardCVV, getMapData.get("input_CardHolderSecurityNumber"), "Card CVV");
			click(dd_ExpireMonth,"Expire month");
			SelectVisibleText(dd_ExpireMonth, getMapData.get("input_CardHolderExpMonth"), "Expire month");
			click(dd_ExpireYear,"Expire year");
			SelectVisibleText(dd_ExpireYear, getMapData.get("input_CardHolderExpYear"), "Expire year");
			EnterText(StreetAddress, getMapData.get("input_CardHolderBillingStreet"), "Street Address");
			EnterText(ZipCode, getMapData.get("input_CardHolderPostalCode"), "ZipCode");
			EnterText(StateProvince, getMapData.get("input_CardHolderProvince"), "Province");
			Thread.sleep(4000);
			waitForElementToBeClickable(btn_Authorize, "Authorize button");
			click(btn_Authorize,"Authorize button");
			waitForLoadingIconDisappearInDialog(TestBase.getDriver());
			TestBase.getDriver().switchTo().defaultContent();
//			waitForElementToBeVisible(txt_TanksforAuth, "Thanks for AUth text");			
			waitForElementToBeVisible(txt_CardAdded, "text card added");
			click(Check_Debitcard_SaveforFuture,"Save card for future");
			click(btn_close,"Close button");
			click(RepayCard,"Repay card");
			waitForLoadingIconDisappearInDialog(TestBase.getDriver());
//			waitForElementToBeVisible(txt_TestCard, "Debit card");
//			click(check_DebitCard,"Checkbox on debit card");

			Thread.sleep(2000);
			
			
		}
		TestBase.bindreport(currentGlobalScenarioName, "funding details page");
		// the below two lines is a temparory code for Issue in the application
		// click(btn_Back,"Back");
		// click(Pg_08_FinalOffer.btn_FundMyLoan,"Fund my loan button");

		click(next_button, "Next");
		//Thread.sleep(3000);

	}
	
	public void Funding_Method_change() throws Exception {
		//Thread.sleep(8000); Commented on 09-Jan-2024 Revised
		
		
		/*
		 * if(getMapData.get("IL_User_Funding").equalsIgnoreCase("Optout")) {
		 */
		
		if (getMapData.get("Funding_Method_change").equalsIgnoreCase("E-Transfer")) {
			waitForElementToBeClickable(edit_btm_funding, "Edit funding type");
			click(edit_btm_funding, "Edit funding button");
			//waitForElementToBeVisible(etransfer, "E-Transfer");
			waitForElementToBeVisible(edit_btm_etfunding, "E-Transfer");
			click(edit_btm_etfunding, "E-Transfer");
			Thread.sleep(2000);
			click(edit_btm_savefunding,"save funding type");
		} 
		else if (getMapData.get("Funding_Method_change").equalsIgnoreCase("Direct Deposit")) {
			Thread.sleep(1000);
			System.out.println("Verifying funding method");
			waitForElementToBeClickable(edit_btm_funding, "Edit funding type");
			click(edit_btm_funding, "Edit funding button");
			waitForElementToBeVisible(edit_btm_ddfunding, "Direct depost");
			mouseOverAndClick(getDriver(), edit_btm_ddfunding, "Direct depost");

			// Actions actions = new Actions(driver);
			// actions.moveToElement(radio_DirectDeposit);
			// actions.click().build().perform();
			// click(radio_DirectDeposit,"Direct deposit");
			Thread.sleep(2000);
			click(edit_btm_savefunding,"save funding type");
			waitForLoadingIconDisappearInDialog(TestBase.getDriver());
		}

		
		else if(getMapData.get("Funding_Method_change").equalsIgnoreCase("Debit Card")||getMapData.get("Funding_Method_change").equalsIgnoreCase("Repay"))
		{
			
			waitForElementToBeClickable(edit_btm_funding, "Edit funding type");
			click(edit_btm_funding, "Edit funding button");
			waitForElementToBeVisible(Add_DebitCard, "Funding method as debit card");
			click(Add_DebitCard,"Add debit card");
			waitForElementToBeVisible(iFrame, "iFrame");
			TestBase.getDriver().switchTo().frame(iFrame);
			waitForElementToBeClickable(cardholder_Name, "Card holder name");
			EnterText(cardholder_Name, getMapData.get("input_CardHolderName"), "Card holder name");
			EnterText(cardNumber, getMapData.get("input_CardHolderNumber"), "Card number");
			EnterText(CardCVV, getMapData.get("input_CardHolderSecurityNumber"), "Card CVV");
			click(dd_ExpireMonth,"Expire month");
			SelectVisibleText(dd_ExpireMonth, getMapData.get("input_CardHolderExpMonth"), "Expire month");
			click(dd_ExpireYear,"Expire year");
			SelectVisibleText(dd_ExpireYear, getMapData.get("input_CardHolderExpYear"), "Expire year");
			EnterText(StreetAddress, getMapData.get("input_CardHolderBillingStreet"), "Street Address");
			EnterText(ZipCode, getMapData.get("input_CardHolderPostalCode"), "ZipCode");
			EnterText(StateProvince, getMapData.get("input_CardHolderProvince"), "Province");
			click(btn_Authorize,"Authorize button");
			waitForLoadingIconDisappearInDialog(TestBase.getDriver());
			TestBase.getDriver().switchTo().defaultContent();
//			waitForElementToBeVisible(txt_TanksforAuth, "Thanks for AUth text");			
			waitForElementToBeVisible(txt_CardAdded, "text card added");
			click(Check_Debitcard_SaveforFuture,"Save card for future");
			click(btn_close,"Close button");
			click(RepayCard,"Repay card");
			waitForLoadingIconDisappearInDialog(TestBase.getDriver());
//			waitForElementToBeVisible(txt_TestCard, "Debit card");
//			click(check_DebitCard,"Checkbox on debit card");

			Thread.sleep(2000);
			Thread.sleep(2000);
			click(edit_btm_savefunding,"save funding type");
			
		}
		// the below two lines is a temparory code for Issue in the application
		// click(btn_Back,"Back");
		// click(Pg_08_FinalOffer.btn_FundMyLoan,"Fund my loan button");

		//click(next_button, "Next");
		Thread.sleep(3000);

	}
	
	//div[@class='boxcard ']//div[@class='box-content-funding-et']

	

}

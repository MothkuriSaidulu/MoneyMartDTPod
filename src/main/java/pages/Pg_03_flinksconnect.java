package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import actions.OnlineActions;
import driver.TestBase;



public class Pg_03_flinksconnect extends OnlineActions {

	//WebDriver driver;
		public Pg_03_flinksconnect(WebDriver driver) {
			super(driver);
			PageFactory.initElements(driver, this);
		}

//flinks xpath
		
		@FindBy (how=How.XPATH, using = "//button[normalize-space()='Continue']")
		public static WebElement Flinks_Continue;

		@FindBy (how=How.XPATH, using = "//div[contains(text(),'ROYAL BANK OF CANADA')]")
		public static WebElement FlinksConnectedText;
		@FindBy (how=How.XPATH, using = "//h1[normalize-space()='Verify Your Income']")
		public static WebElement txt_Flinks;

		@FindBy (how=How.XPATH, using = "//div[@id='express']//div[@class='box-content']")
		public static WebElement Flinks_Express;
		
		//@FindBy (how=How.XPATH, using = "//h2[text()='Instant Decision (Express) - Fastest Option']/following::label[@class='mm-radio input-Flinks']") Commented on 09-Jan2024 Revise
		@FindBy (how=How.XPATH, using = "//h2[text()='I want my money ']/following::label[@class='mm-radio input-Flinks']") //Added on 09-Jan2024 Revise
		public static WebElement Flinks_Express_jsy;

		@FindBy (how=How.XPATH, using = "//button[normalize-space()='Next']")
		public static WebElement btn_Next;
		
		@FindBy (how=How.XPATH, using = "//button[normalize-space()='Continue']")
		public static WebElement btn_Next_jsy;
		
			
		
		@FindBy (how=How.XPATH, using = "//div[@id='standard']//div[@class='box-content']")
		public static WebElement Flinks_Standard;
		
		@FindBy (how=How.XPATH, using = "//div[@id='standard']")
		public static WebElement Flinks_Standard_jsy;
		

		@FindBy (how=How.XPATH, using = "//a[normalize-space()=\"I don't use online/mobile banking\"]")
		public static WebElement Old_V2_btn_Idont_Agree;

		@FindBy (how=How.XPATH, using = "//a[normalize-space()=\"I don't use online/mobile banking\"]")
		public static WebElement Old_V1_btn_Idont_Agree;

		@FindBy (how=How.XPATH, using = "//iframe[@class='mm-iframe']")
		public static WebElement iFrame;

		@FindBy (how=How.XPATH, using = "//a[@title='Flinks Capital International']")
		public static WebElement Bank_FlinksCapital;

		@FindBy (how=How.ID, using = "username")
		public static WebElement flinks_UserName;

		@FindBy (how=How.ID, using = "password")
		public static WebElement flinks_Password;

		@FindBy (how=How.XPATH, using = "//input[@value='Submit']")
		public static WebElement btn_Submit;

		@FindBy (how=How.XPATH, using = "//td[contains(normalize-space(),'Answer to question')]/following-sibling::td[1]")
		public static WebElement Ans_Security_Que;
		
		@FindBy (how=How.XPATH, using = "//li[contains(text,'Answer to security question:')]")
		public static WebElement Ans_Security_Que_Old;

		@FindBy (how=How.NAME, using = "mfa-QuestionAndAnswer-0")
		public static WebElement txt_Securityque;

		@FindBy (how=How.XPATH, using = "//input[@value='Continue']")
		public static WebElement btn_Continue;

		@FindBy (how=How.XPATH, using = "//a[normalize-space()='Withdraw my consent to use Flinks']")
		public static WebElement link_WithdrawConsent;

		@FindBy (how=How.XPATH, using = "//a[@class='text-white']")
		public static WebElement link_WithdrawConsent1;
	
	@FindBy (how=How.XPATH, using = "//div[@id='standard']")
	public static WebElement non_flink_select;
	
	@FindBy (how=How.XPATH, using = "//button[@id='gs-accept']")
	public static WebElement next_button;
	
	//added on 8/10/2022
	
	@FindBy (how=How.XPATH, using = "(//span[@class='mm-radio__box'])[1]")
	public static WebElement flink_select;
	@FindBy (how=How.XPATH, using = "(//span[@class='mm-radio__box'])[2]")
	public static WebElement non_flink;
	
	@FindBy (how=How.XPATH, using = "//button[normalize-space()='Continue']")//28/11/22 by madhu
	//@FindBy (how=How.XPATH, using ="//button[normalize-space()='Continue']
	public static WebElement bttn_Next;
	
	@FindBy (how=How.XPATH, using = "//h1[normalize-space()='Thanks for choosing Express!']")
	public static WebElement page_Tittle;
	
	@FindBy (how=How.XPATH, using = "//div[normalize-space()='Flinks Capital']")
	public static WebElement Flinks_capital;
	
	
	
	//end  on 8/10/2022
	//Added on 10-Apr-2022 Start Revised
	 @FindBy (how=How.XPATH, using = "//h1[text()='Flinks Terms and Conditions']")
	 public static WebElement popup_Tittle;

	 @FindBy (how=How.XPATH, using = "//span[contains(text(),'I have read and agree to the Terms and Conditions for Flinks and consent to the Privacy Notice.')]")
	 public static WebElement checkBox_Agreeement;

	 @FindBy (how=How.XPATH, using = "//button[text()='Agree and Continue']")
	public static WebElement btn_AgreeAndContinue;
	 //Added on 10-Apr-2022 End Revised
	
	
	
	
	
	public void flink_select() throws Exception
	{
	
		waitForElementToBeClickable(non_flink_select, "flink option");
		click(non_flink_select,"Non-flink option"); 
		click(next_button,"next button "); 
					
	}
	
	public void flink_optin() throws Exception
	{
	
		waitForElementToBeClickable(flink_select, "flink option");
		
		TestBase.bindreport(currentGlobalScenarioName, "Flinks Option page");
		
		click(flink_select,"flink option"); 
		
		TestBase.bindreport(currentGlobalScenarioName, "Flinks Option page");
		
		movetoelement(bttn_Next);
		
		Thread.sleep(3000);
		
		click(bttn_Next,"next button "); 
					
	}
	
	//added 8/10/2022 
	public void flinks_standard() throws Exception
	{
		
		waitForElementToBeClickable(non_flink, "flink option");
		
		TestBase.bindreport(currentGlobalScenarioName, "Flinks Option page");
		
		click(non_flink,"Non-flink option"); 
		
		TestBase.bindreport(currentGlobalScenarioName, "Non flinks flow");
		
		click(bttn_Next,"next button "); 
					
	}
	
	
	//end
	
	public void Flinks(String LoanType) throws Exception
	{
		 
		Thread.sleep(8000);
		if((LoanType.equalsIgnoreCase("IL"))&&(getMapData.get("Current_Address_Province").equalsIgnoreCase("SK")))
		{
			PrintValueToReport("No flinks option for this province in IL", "Flinks option w.r.t Product");
			System.out.println("No Flinks");
		}
		else if((LoanType.equalsIgnoreCase("SPL"))&&(getMapData.get("Current_Address_Province").equalsIgnoreCase("SK")||getMapData.get("Current_Address_Province").equalsIgnoreCase("AB")))
		{
			PrintValueToReport("No flinks option for this province in SPL or EPP", "Flinks option w.r.t Product");
			System.out.println("No Flinks");
		}
		else
		{

			if(getMapData.get("User_Wants_Flinks_Optin_OR_Optout").equalsIgnoreCase("Optin"))
			{
				if(getMapData.get("User_New_OR_Existing_For_Flinks").equalsIgnoreCase("New"))
				{
					
					
					Flinks_Func();
				}
				else if(getMapData.get("User_New_OR_Existing_For_Flinks").equalsIgnoreCase("Existing"))
				{
					 
					waitForElementToBeClickable(Flinks_Standard,"Flinks Standard");
					 
					Thread.sleep(4000);
					click(Flinks_Express,"Continue with flinks optin");
					click(btn_Next,"Next");
				}
			}
			else if(getMapData.get("User_Wants_Flinks_Optin_OR_Optout").equalsIgnoreCase("Optout"))
			{
				if(getMapData.get("User_New_OR_Existing_For_Flinks").equalsIgnoreCase("New"))
				{
					
					waitForElementToBeVisible(txt_Flinks,"Text in flinks page");
					
					click(Flinks_Standard,"Flinks_Standard");
					click(btn_Next,"Next");

				}
				else if(getMapData.get("User_New_OR_Existing_For_Flinks").equalsIgnoreCase("Existing"))
				{
					;
					Thread.sleep(2000);
					waitForElementToBeVisible(Flinks_Standard,"With draw consent");
					
					click(Flinks_Standard,"Flinks Standard");
					click(btn_Next,"Next");
				}
			}
		}
	}
	
	
	//add on 04 26 start revised
	
	public void Flinks_jsy(String LoanType) throws Exception
	{
		 
		Thread.sleep(8000);
		if((LoanType.equalsIgnoreCase("IL"))&&(getMapData.get("Current_Address_Province").equalsIgnoreCase("SK")))
		{
			PrintValueToReport("No flinks option for this province in IL", "Flinks option w.r.t Product");
			System.out.println("No Flinks");
		}
		else if((LoanType.equalsIgnoreCase("SPL"))&&(getMapData.get("Current_Address_Province").equalsIgnoreCase("SK")||getMapData.get("Current_Address_Province").equalsIgnoreCase("AB")))
		{
			PrintValueToReport("No flinks option for this province in SPL or EPP", "Flinks option w.r.t Product");
			System.out.println("No Flinks");
		}
		else
		{

			if(getMapData.get("User_Wants_Flinks_Optin_OR_Optout").equalsIgnoreCase("Optin"))
			{
				if(getMapData.get("User_New_OR_Existing_For_Flinks").equalsIgnoreCase("New"))
				{
					
					
					Flinks_Func_jsy();
				}
				else 
				{
					 
					System.out.println("Unable to click on flinks option");
				}
			}
			else if(getMapData.get("User_Wants_Flinks_Optin_OR_Optout").equalsIgnoreCase("Optout"))
			{
				if(getMapData.get("User_New_OR_Existing_For_Flinks").equalsIgnoreCase("New"))
				{
					
					waitForElementToBeVisible(txt_Flinks,"Text in flinks page");
					
					click(Flinks_Standard_jsy,"Flinks_Standard");
					click(btn_Next_jsy,"Next");

				}
				else if(getMapData.get("User_New_OR_Existing_For_Flinks").equalsIgnoreCase("Existing"))
				{
					
					Thread.sleep(2000);
					waitForElementToBeVisible(Flinks_Standard,"With draw consent");
					
					click(Flinks_Standard_jsy,"Flinks Standard");
					click(btn_Next_jsy,"Next");
				}
			}
		}
	}
	
	
	//add on 04 26 end revised
	
	
	public static void Flinks_Func() throws Exception
	{
		waitForElementToBeVisible(txt_Flinks,"Text in flinks page");
		
		//String flinksText = txt_Flinks.getText();
		//System.out.println("Flinks text is "+flinksText);
		click(Flinks_Express,"Express - fastest option");
		
		//Added on 10-Apr-2023 Start Revised
		 flinks_popup_handle();
		 
		
		//click(btn_Next,"Next");
		
		//Added on 10-Apr-2023 End Revised
		waitForElementToBeVisible(iFrame, "iFrame for flinks page");
		//WebElement ifm = driver.findElement(By.xpath("//iframe[@class='mm-iframe']"));
		driver.TestBase.getDriver().switchTo().frame(iFrame);
		Thread.sleep(2000);
		click(Bank_FlinksCapital,"Capital bank");
		EnterText(flinks_UserName, getMapData.get("Flinks_UserName"), "Flinks username");
		EnterText(flinks_Password, getMapData.get("Flinks_Password"), "Flinks password");
		click(Flinks_Continue,"Continue button");
		waitForElementToBeVisible(Ans_Security_Que,"Security question page text");
		String seqtext = Ans_Security_Que.getText();
		//String seqtext1[]=seqtext.split(": ");
		//System.out.println("Answer to seq que is "+seqtext1[1]);
		EnterText(txt_Securityque, seqtext, "Answer to sec que");
		click(Flinks_Continue,"Continue button");
		driver.TestBase.getDriver().switchTo().defaultContent();
		
		
		Thread.sleep(1500);
		
	}
	
	//add on 04 26 start revised
	
	public static void Flinks_Func_jsy() throws Exception
	{
		waitForElementToBeVisible(txt_Flinks,"Text in flinks page");
		
		//String flinksText = txt_Flinks.getText();
		//System.out.println("Flinks text is "+flinksText);
		click(Flinks_Express_jsy,"Express - fastest option");
		
		//Added on 10-Apr-2023 Start Revised
		 flinks_popup_handle();
		 
		
		//click(btn_Next,"Next");
		
		//Added on 10-Apr-2023 End Revised
		waitForElementToBeVisible(iFrame, "iFrame for flinks page");
		//WebElement ifm = driver.findElement(By.xpath("//iframe[@class='mm-iframe']"));
		driver.TestBase.getDriver().switchTo().frame(iFrame);
		Thread.sleep(2000);
		click(Bank_FlinksCapital,"Capital bank");
		EnterText(flinks_UserName, getMapData.get("Flinks_UserName"), "Flinks username");
		EnterText(flinks_Password, getMapData.get("Flinks_Password"), "Flinks password");
		click(Flinks_Continue,"Continue button");
		waitForElementToBeVisible(Ans_Security_Que,"Security question page text");
		String seqtext = Ans_Security_Que.getText();
		//String seqtext1[]=seqtext.split(": ");
		//System.out.println("Answer to seq que is "+seqtext1[1]);
		EnterText(txt_Securityque, seqtext, "Answer to sec que");
		click(Flinks_Continue,"Continue button");
		driver.TestBase.getDriver().switchTo().defaultContent();
		
		
		Thread.sleep(1500);
		
	}
	
	//add on 04 26 end revised
	
	//Added on 10-Apr-2023 Start Revised 
	 public static void flinks_popup_handle() throws IOException
	 {
		 waitForElementToBeVisible(popup_Tittle, "FlinksTitle");
		 waitForElementToBeClickable(checkBox_Agreeement, "WaitCheckBoxClick");
		 click(checkBox_Agreeement, "ClkAgrCheck");
		 waitForElementToBeClickable(btn_AgreeAndContinue, "btnAgrContinue");
		 click(btn_AgreeAndContinue,"clkBtnAgrCont");
	 }
	 //Added on 10-Apr-2023 End Revised
	
	public static void Flinks_Func_refi() throws Exception
	{
		//waitForElementToBeVisible(txt_Flinks,"Text in flinks page");
		waitForElementToBeVisible(page_Tittle, "page tittle");
		//String flinksText = txt_Flinks.getText();
		//System.out.println("Flinks text is "+flinksText);
		//click(Flinks_Express,"Express - fastest option");
		//click(btn_Next,"Next");
		//waitForElementToBeVisible(iFrame, "iFrame for flinks page");
		//WebElement ifm = driver.findElement(By.xpath("//iframe[@class='mm-iframe']"));
		driver.TestBase.getDriver().switchTo().frame(iFrame);
		
		
		
		Thread.sleep(2000);
		
		click(Bank_FlinksCapital,"Capital bank");
		
		
		EnterText(flinks_UserName, getMapData.get("Flinks_UserName"), "Flinks username");
		EnterText(flinks_Password, getMapData.get("Flinks_Password"), "Flinks password");
		click(Flinks_Continue,"Continue button");
		waitForElementToBeVisible(Ans_Security_Que,"Security question page text");
		String seqtext = Ans_Security_Que.getText();
		//String seqtext1[]=seqtext.split(": ");
		//System.out.println("Answer to seq que is "+seqtext1[1]);
		EnterText(txt_Securityque, seqtext, "Answer to sec que");
		click(Flinks_Continue,"Continue button");
		driver.TestBase.getDriver().switchTo().defaultContent();
		
		
		Thread.sleep(1500);
		
	}
	
	
	
	
	
	
	
	public static void Flinks_Refi(String LoanType) throws Exception
	{
		
		Thread.sleep(10000);
		 
		if(getMapData.get("Current_Address_Province").equalsIgnoreCase("SK"))
		{
			PrintValueToReport("No flinks option for this province in IL", "Flinks option w.r.t Product");
			System.out.println("No Flinks");
		}
		else
		{

			if(getMapData.get("Refi_User_Wants_Flinks_Optin_OR_Optout").equalsIgnoreCase("Optin"))
			{
				if(getMapData.get("Refi_User_New_OR_Existing_For_Flinks").equalsIgnoreCase("New"))
				{
					Flinks_Func();
				}
				else if(getMapData.get("Refi_User_New_OR_Existing_For_Flinks").equalsIgnoreCase("Existingone"))
				{
					 
					waitForElementToBeClickable(Flinks_Standard,"Flinks Standard");
					 
					Thread.sleep(4000);
					click(Flinks_Express,"Continue with flinks optin");
					click(btn_Next,"Next");
				}
				else if(getMapData.get("Refi_User_New_OR_Existing_For_Flinks").equalsIgnoreCase("Existing"))
				{
					 Thread.sleep(3000);
					 Flinks_Func_refi();
				}
				
			}
			else if(getMapData.get("Refi_User_Wants_Flinks_Optin_OR_Optout").equalsIgnoreCase("Optout"))
			{
				if(getMapData.get("Refi_User_New_OR_Existing_For_Flinks").equalsIgnoreCase("New"))
				{
					waitForElementToBeVisible(txt_Flinks,"Text in flinks page");
					 
					click(Flinks_Standard,"Flinks Standard");
					click(btn_Next,"Next");
				}
				else if(getMapData.get("Refi_User_New_OR_Existing_For_Flinks").equalsIgnoreCase("Existing"))
				{
					 
					waitForElementToBeVisible(Flinks_Standard,"With draw consent");
					 
					click(Flinks_Standard,"Flinks Standard");
					click(btn_Next,"Next");
				}
			}
		}

	}
	}

package pages;

import java.io.IOException;
import java.util.List;

import org.apache.bcel.generic.Select;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import actions.OnlineActions;

import driver.TestBase;

public class Pg_02_PersonalInfo extends OnlineActions{

	//WebDriver driver;
	public Pg_02_PersonalInfo(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy (how=How.XPATH, using = "//*[@class='mm-select__value']")
	public static WebElement provincedropdown;


	@FindBy(how=How.NAME, using = "email")
	public static WebElement txt_Email;
	
	@FindBy (how=How.XPATH, using = "//button[normalize-space()='Yes']")
	public static WebElement Rent_Yes;
	
	@FindBy (how=How.XPATH, using = "//button[normalize-space()='No']")
	public static WebElement Rent_No;
	
	@FindBy (how=How.XPATH, using = "//div[contains(text(),'What is your share of rent?*')]/following::input[1]")
	public static WebElement Rent_Amount;
	
	@FindBy (how=How.XPATH, using = "//input[@name='address']")
	public static WebElement address;
	@FindBy (how=How.XPATH, using = "//button[normalize-space()='No']")  //button[normalize-space()='Yes']
	public static WebElement rent_no;
	
	@FindBy (how=How.XPATH, using = "//button[normalize-space()='Yes']")  
	public static WebElement rent_yes;
	//@FindBy (how=How.XPATH, using = "//div[contains(text(),'What is your share of rent?*')]/following::input[1]") //Commented on 16-Jan-2024 Revised  
	@FindBy (how=How.XPATH, using = "//div[contains(text(),'How much do you pay for rent?*')]/following::input[1]") //Added on 16-Jan-2024 Revised
	public static WebElement rent;
	
	@FindBy (how=How.XPATH, using = "//button[@Id='gs-accept']")
	public static WebElement next_page;
	
	@FindBy (how=How.XPATH, using = "//h1[normalize-space()='Welcome!']")
	public static WebElement Welcome_Valid;
	
	@FindBy (how=How.XPATH, using = "(//span[@class='mm-checkbox__box'])[1]")
	public static WebElement checkbox_one;
	
	/*@FindBy (how=How.XPATH, using = "//div[11]//label[1]//span[1]")
	public static WebElement checkbox_one;*/
	
	
	
	@FindBy (how=How.XPATH, using = "(//span[@class='mm-checkbox__box'])[2]")
	public static WebElement checkbox_two;
	@FindBy (how=How.XPATH, using = "//input[@id='sin']")
	public static WebElement sin;


	@FindBy (how=How.XPATH, using = "//div[normalize-space()='Confirm your Province of Residence*']")
	public static WebElement province_spl;
	
	@FindBy (how=How.XPATH, using = "//button[@class='mm-select__value']")
	public static WebElement select_dropdown;
	
	@FindBy (how=How.XPATH, using = "//div[@class='mm-dropdown__menu']//*")
	public static WebElement list_province;
	
	@FindBy (how=How.XPATH, using = "//button[normalize-space()='Ontario']")
	public static WebElement select_province_ON;
	
	@FindBy (how=How.XPATH, using = "//button[normalize-space()='Nova Scotia']")
	public static WebElement select_province_NS;
	
	
	@FindBy (how=How.XPATH, using = "//button[normalize-space()='Manitoba']")
	public static WebElement select_province_MB;
	
	
	@FindBy (how=How.XPATH, using = "//button[normalize-space()='British Columbia']")
	public static WebElement select_province_BC;
	
	@FindBy (how=How.XPATH, using = "//button[normalize-space()='Alberta']")
	public static WebElement select_province_AB;
	@FindBy (how=How.XPATH, using = "//button[normalize-space()='Agree and Continue']")
    public static List<WebElement> agreepopList;
	
	
	@FindBy (how=How.XPATH, using = "//button[normalize-space()='Agree and Continue']")
	public static WebElement agreepop;
	
	@FindBy (how=How.XPATH, using = "//input[@name='firstName']")
	public static WebElement first_name;
	@FindBy (how=How.XPATH, using = "//input[@name='lastName']")
	public static WebElement last_name;
	//button[normalize-space()='Agree and Continue']
	
	@FindBy (how=How.XPATH, using = "//input[@name='address']")
    public static WebElement txt_Address;
	
	@FindBy (how=How.XPATH, using = "(//div[@class='pcaautocomplete pcatext' and contains(@style,'top')]//div[@class='pca pcalist'])[2]//div[2]")
	public static WebElement btn_address;

	@FindBy (how=How.XPATH, using = "(//div[@class='pcaautocomplete pcatext' and contains(@style,'top')]//div[@class='pca pcalist'])[2]//div[1]")
	public static WebElement btn_addressAt1;
	
	@FindBy (how=How.XPATH, using = "(//div[@class='pcaautocomplete pcatext' and contains(@style,'top')]//div[@class='pca pcalist'])[2]")
    public static WebElement select_SecondAddressFroList1;
	//@FindBy (how=How.XPATH, using ="(//*[@name='address'])")

	
	
	
	
	public void Existing_IL_basic() throws Exception
	{
		
		VerifyText_For_PageCaption(Welcome_Valid, "Welcome!", "Basic Info Page, Hence Passed");
		movetoelement(rent_no);
		
		TestBase.bindreport(currentGlobalScenarioName, "profile details page");
		
		Thread.sleep(4000);
		
		if(getMapData.get("Rent_Yes_No").equalsIgnoreCase("Yes"))
		{
		click(rent_yes, "Rent select yes");
		Thread.sleep(2000);
		rent.sendKeys(Keys.CONTROL + "a");
		rent.sendKeys(Keys.DELETE);
		EnterText(rent, getMapData.get("Rent_Contribution") , "Rent amount" );
		
		
		}
	
		else if(getMapData.get("Rent_Yes_No").equalsIgnoreCase("No"))
		{
			
			
			click(rent_no,"Rent no");
		}
		
		
		if(!checkbox_one.isSelected())
		{
			
		
		click(checkbox_one, "check the checkbox");
		
		click(checkbox_two, "check the checkbox");
		}
		
		
		click(next_page,"Navigate to next page");
		
					
	}
	
	
	
	
	
	
	
	public void click_personlinfo() throws Exception
	{
		
		VerifyText_For_PageCaption(Welcome_Valid, "Welcome!", "Basic Info Page, Hence Passed");
		
	Thread.sleep(5000);
		
		click(select_dropdown,"select province list");
		//Thread.sleep(2000);
		
		if(getMapData.get("Current_Address_Province").equalsIgnoreCase("ON"))
		{
		
		click(select_province_ON,"Ontario");
		Thread.sleep(5000);
		
		  if(agreepopList.size() > 0)
		
				  
		  {
			waitForElementToBeClickable(agreepop, "Agree button passed");
			scrollIntoView(agreepop);
			  click(agreepop, "Agree agrement");
		  }
		}
		else if(getMapData.get("Current_Address_Province").equalsIgnoreCase("AB"))
		{
			click(select_province_AB, "AB");
		}
		else if(getMapData.get("Current_Address_Province").equalsIgnoreCase("BC"))
		{
			click(select_province_BC, "BC");
			if(agreepopList.size() > 0)
	        {
				click(agreepop, "Agree agrement");
			}
		}
		else if(getMapData.get("Current_Address_Province").equalsIgnoreCase("NS"))
		{
			click(select_province_NS, "NS");
		}
		else if(getMapData.get("Current_Address_Province").equalsIgnoreCase("MB"))
		{
			click(select_province_MB, "MB");
		}
		
		
		/* Commented on 03-Jan-2024 Start Revised - Not Mandatory hence commented
		waitForElementToBeVisible(sin, "SIN");
		Thread.sleep(5000);
		EnterText(sin, getMapData.get("SIN"), "SIN");
		Commented on 03-Jan-2024 End Revised
		*/
		
		movetoelement(rent_no);
		
		//waitForElementToBeVisible(address, "address");
		Thread.sleep(8000);
		//EnterText(email_id, getMapData.get("Email"), "emailid");
		
		selectProvinceAddressBasedOnInput_First_Address(getMapData.get("home_Address")); //Added on 08-July-2022
		
		
		
		/* Commented on 08-July-2022 Start
		Actions act = new Actions(TestBase.getDriver());
		EnterText(address, getMapData.get("home_Address"), "customer address");
		
		Thread.sleep(2000);
		
		act.sendKeys(Keys.DOWN).perform();
		
		act.sendKeys(Keys.ENTER).perform();
		 Commented on 08-July-2022 End
		*/
		
//		Actions act = new Actions(getDriver());
//		
//		act.sendKeys(Keys.DOWN).perform();
//		act.sendKeys(Keys.ENTER).perform();
		//address.sendKeys(Keys.ARROW_DOWN);
		//address.sendKeys(Keys.ENTER); 
		
		TestBase.bindreport(currentGlobalScenarioName, "profile details page");
		
		Thread.sleep(4000);
		
		if(getMapData.get("Rent_Yes_No").equalsIgnoreCase("Yes"))
		{
		click(rent_yes, "Rent select yes");
		Thread.sleep(2000);
		rent.sendKeys(Keys.CONTROL + "a");
		rent.sendKeys(Keys.DELETE);
		EnterText(rent, getMapData.get("Rent_Contribution") , "Rent amount" );
		
		
		}
	
		else if(getMapData.get("Rent_Yes_No").equalsIgnoreCase("No"))
		{
			
			
			click(rent_no,"Rent no");
		}
		
		//Thread.sleep(4000);
		
		
		//waitForElementToBeVisible(checkbox_one, "checkboxes");
		
		
		if(!checkbox_one.isSelected())
		{
			
		
		click(checkbox_one, "check the checkbox");
		
		click(checkbox_two, "check the checkbox");
		}
		
		
		click(next_page,"Navigate to next page");
		
					
	}
	
	public void addressprovince() throws Exception
	{
OnlineActions.SelectVisibleText(select_dropdown, "Ontario", "nameofprovince");
	}
	
	
	public void selectProvinceAddressBasedOnInput_Second_Address(String provinceAddressShortCut) throws IOException, InterruptedException 
	{
		waitForElementToBeClickable(txt_Address, "WaitAddress");
		EnterText(txt_Address, provinceAddressShortCut, "EnterShortCutAddress");
		waitForElementToBeVisible(select_SecondAddressFroList1, "secondAddress");
		Thread.sleep(3000); //Added for Visibility and Sync
		waitForElementToBeClickable(btn_address, "AddressWait");
		click(btn_address, "ClicksencondAddress");
		
	}
	
	public void selectProvinceAddressBasedOnInput_First_Address(String provinceAddressShortCut) throws IOException, InterruptedException 
	{
		waitForElementToBeClickable(txt_Address, "WaitAddress");
		EnterText(txt_Address, provinceAddressShortCut, "EnterShortCutAddress");
		Thread.sleep(2000); //Added on 18-July-2022
        Actions act = new Actions(getDriver()); //Added on 18-July-2022
        //act.sendKeys(Keys.CONTROL).perform(); //Added on 18-July-2022
        //act.sendKeys(Keys.END).perform(); //Added on 18-July-2022
        act.sendKeys(Keys.SPACE).perform(); //Added on 18-July-2022
        Thread.sleep(2000); //Added on 18-July-2022
		waitForElementToBeVisible(select_SecondAddressFroList1, "secondAddress");
		Thread.sleep(3000); //Added for Visibility and Sync
		waitForElementToBeClickable(btn_addressAt1, "AddressWait");
		click(btn_addressAt1, "ClicksencondAddress");
	}
	
	
	////added 2582022
	
	
	public void personalinfo_SPL_existing_flinks() throws Exception
	{
	
		VerifyText_For_PageCaption(Welcome_Valid, "Welcome!", "Basic Info Page, Hence Passed");
		
		VerifyText_For_PageCaption(province_spl, "Confirm your Province of Residence*", "Basic Info Page, Hence Passed");
		Thread.sleep(2000);
		
		click(select_dropdown,"select province list");
		//Thread.sleep(2000);
		
		if(getMapData.get("Current_Address_Province").equalsIgnoreCase("ON"))
		{
		
		click(select_province_ON,"Ontario");
		Thread.sleep(5000);
		
		  if(agreepopList.size() > 0)
		
				  
		  {
			waitForElementToBeClickable(agreepop, "Agree button passed");
			scrollIntoView(agreepop);
			  click(agreepop, "Agree agrement");
		  }
		}
		else if(getMapData.get("Current_Address_Province").equalsIgnoreCase("AB"))
		{
			click(select_province_AB, "AB");
		}
		else if(getMapData.get("Current_Address_Province").equalsIgnoreCase("BC"))
		{
			click(select_province_BC, "BC");
			if(agreepopList.size() > 0)
	        {
				click(agreepop, "Agree agrement");
			}
		}
		else if(getMapData.get("Current_Address_Province").equalsIgnoreCase("NS"))
		{
			click(select_province_NS, "NS");
		}
		else if(getMapData.get("Current_Address_Province").equalsIgnoreCase("MB"))
		{
			click(select_province_MB, "MB");
		}
		
		movetoelement(rent_yes);
		
		Thread.sleep(3000);
		
		if(getMapData.get("Rent_Yes_No").equalsIgnoreCase("Yes"))
		{
			click(rent_yes, "Rent select yes");
			Thread.sleep(2000);
			rent.sendKeys(Keys.CONTROL + "a");
			rent.sendKeys(Keys.DELETE);
			EnterText(rent, getMapData.get("Rentamount") , "Rent amount" );
			
		}
		else if(getMapData.get("Rent_Yes_No").equalsIgnoreCase("No"))
		{
			click(rent_yes, "Rent select yes");
			click(Rent_No,"Rent no");
		} 
		Thread.sleep(2000);
		if(!checkbox_one.isSelected())
		{
		click(checkbox_one, "check the checkbox");
		
		click(checkbox_two, "check the checkbox");
	
		
		}
		click(next_page,"Navigate to next page");
		
	}
	
	
	
	
	
	
	
	/////end
	
	
	public void personalinfo_SPL() throws Exception
	{
	
		VerifyText_For_PageCaption(Welcome_Valid, "Welcome!", "Basic Info Page, Hence Passed");
		
		VerifyText_For_PageCaption(province_spl, "Confirm your Province of Residence*", "Basic Info Page, Hence Passed");
		Thread.sleep(5000);
		
		click(select_dropdown,"select province list");
		//Thread.sleep(2000);
		
		if(getMapData.get("Current_Address_Province").equalsIgnoreCase("ON"))
		{
		
		click(select_province_ON,"Ontario");
		Thread.sleep(5000);
		
		  if(agreepopList.size() > 0)
		
				  
		  {
			waitForElementToBeClickable(agreepop, "Agree button passed");
			scrollIntoView(agreepop);
			  click(agreepop, "Agree agrement");
		  }
		}
		else if(getMapData.get("Current_Address_Province").equalsIgnoreCase("AB"))
		{
			click(select_province_AB, "AB");
		}
		else if(getMapData.get("Current_Address_Province").equalsIgnoreCase("BC"))
		{
			click(select_province_BC, "BC");
			if(agreepopList.size() > 0)
	        {
				click(agreepop, "Agree agrement");
			}
		}
		else if(getMapData.get("Current_Address_Province").equalsIgnoreCase("NS"))
		{
			click(select_province_NS, "NS");
		}
		else if(getMapData.get("Current_Address_Province").equalsIgnoreCase("MB"))
		{
			click(select_province_MB, "MB");
		}
		//Select province = new Select(list_province);
		
		//province.selectByValue("ON");
		
		// Select the option using the visible text
		//province.selectByVisibleText("Ontario");
		
		EnterText(sin, getMapData.get("SIN"), "SIN");
		
		waitForElementToBeVisible(address, "Caption");
		Thread.sleep(4000);
		//EnterText(email_id, getMapData.get("Email"), "emailid");
		selectProvinceAddressBasedOnInput_First_Address(getMapData.get("home_Address")); //Added on 08-July-2022
		
		/* Commented on 08-July-2022 Start
		Actions act = new Actions(TestBase.getDriver());
		EnterText(address, getMapData.get("home_Address"), "customer address");
		
		Thread.sleep(2000);
		
		act.sendKeys(Keys.DOWN).perform();
		
		act.sendKeys(Keys.ENTER).perform();
		 Commented on 08-July-2022 End
		*/  
		Thread.sleep(4000);
		
		if(getMapData.get("Rent_Yes_No").equalsIgnoreCase("Yes"))
		{
			click(rent_yes, "Rent select yes");
			Thread.sleep(2000);
			rent.sendKeys(Keys.CONTROL + "a");
			rent.sendKeys(Keys.DELETE);
			EnterText(rent, getMapData.get("Rentamount") , "Rent amount" );
			
		}
		else if(getMapData.get("Rent_Yes_No").equalsIgnoreCase("No"))
		{
			click(rent_yes, "Rent select yes");
			click(Rent_No,"Rent no");
		} 
		Thread.sleep(2000);
		if(!checkbox_one.isSelected())
		{
		click(checkbox_one, "check the checkbox");
		
		click(checkbox_two, "check the checkbox");
	
		
		}
		click(next_page,"Navigate to next page");
		
	}
	
	public void existing_profile_details() throws Exception
	{	//added 15 july 2022 start
		System.out.println("Verifing existing customer details and waiting time 2mints");
		//added 15 july 2022 end
		VerifyText_For_PageCaption(Welcome_Valid, "Welcome!", "Basic Info Page, Hence Passed");
		waitForElementToBeVisible(txt_Email,"text in email_id");
			ScrollToElement(txt_Email, "Email field");
			for(int i=1;i<20;i++)
			{
				String emailTxt = txt_Email.getAttribute("value");
				if(emailTxt.equalsIgnoreCase(getMapData.get("Email")))
				{
					System.out.println("User data prefilled in personal info page");
					break;
				}
				else
				{
					Thread.sleep(900);
				}
			}
			Thread.sleep(2000);
			if(getMapData.get("Rent_Yes_No").equalsIgnoreCase("Yes"))
			{
				click(rent_yes, "Rent select yes");
				Thread.sleep(2000);
				rent.sendKeys(Keys.CONTROL + "a");
				rent.sendKeys(Keys.DELETE);
				EnterText(rent, getMapData.get("Rent_Contribution") , "Rent amount" );
			}
			else if(getMapData.get("Rent_Yes_No").equalsIgnoreCase("No"))
			{
				click(rent_yes, "Rent select yes");
				click(Rent_No,"Rent no");
			}
		
			Thread.sleep(2000);
			click(checkbox_one, "check the checkbox");
			
			click(checkbox_two, "check the checkbox");
	
		click(next_page,"Navigate to next page");
		
	}
	public void existing_profile_Rent_downsell() throws Exception
	{	
		
		//added 15 july 2022 start
				System.out.println("Verifing existing customer details and waiting time 2mints");
				//added 15 july 2022 end
		VerifyText_For_PageCaption(Welcome_Valid, "Welcome!", "Basic Info Page, Hence Passed");
		waitForElementToBeVisible(txt_Email,"text in email_id");
			ScrollToElement(txt_Email, "Email field");
			for(int i=1;i<20;i++)
			{
				String emailTxt = txt_Email.getAttribute("value");
				if(emailTxt.equalsIgnoreCase(getMapData.get("Email")))
				{
					System.out.println("User data prefilled in personal info page");
					break;
				}
				else
				{
					Thread.sleep(900);
				}
			}
			Thread.sleep(2000);
			if(getMapData.get("Rent_Yes_No").equalsIgnoreCase("Yes"))
			{
				click(rent_yes, "Rent select yes");
				Thread.sleep(2000);
				rent.sendKeys(Keys.CONTROL + "a");
				rent.sendKeys(Keys.DELETE);
				EnterText(rent, getMapData.get("Rentamount") , "Rent amount" );
				
			}
			else if(getMapData.get("Rent_Yes_No").equalsIgnoreCase("No"))
			{
				click(rent_yes, "Rent select yes");
				click(Rent_No,"Rent no");
			}
		
			Thread.sleep(4000);
			click(checkbox_one, "check the checkbox");
			
			click(checkbox_two, "check the checkbox");
	
		click(next_page,"Navigate to next page");
		
	}
	public void existing_profile_details_spl() throws Exception
	{	
		
		//added 15 july 2022 start
				System.out.println("Verifing existing customer details and waiting time 2mints");
				//added 15 july 2022 end
		VerifyText_For_PageCaption(Welcome_Valid, "Welcome!", "Basic Info Page, Hence Passed");
		
		VerifyText_For_PageCaption(province_spl, "Confirm your Province of Residence*", "Basic Info Page, Hence Passed");
		Thread.sleep(2000);
		
		
		click(select_dropdown,"select province list");
		if(getMapData.get("Current_Address_Province").equalsIgnoreCase("ON"))
		{
		
		click(select_province_ON,"Ontario");
		if(agreepopList.size() > 0)
        {
			click(agreepop, "Agree agrement");
		}
		}
		else if(getMapData.get("Current_Address_Province").equalsIgnoreCase("AB"))
		{
			click(select_province_AB, "AB");
		}
		else if(getMapData.get("Current_Address_Province").equalsIgnoreCase("BC"))
		{
			click(select_province_BC, "BC");
			if(agreepopList.size() > 0)
	        {
				click(agreepop, "Agree agrement");
			}
		}
		else if(getMapData.get("Current_Address_Province").equalsIgnoreCase("NS"))
		{
			click(select_province_NS, "NS");
		}
		else if(getMapData.get("Current_Address_Province").equalsIgnoreCase("MB"))
		{
			click(select_province_MB, "MB");
		}
		
		
		//Added on 16-Jan-2024 Start Revised
		waitForElementToBeVisible(address, "Caption");
		Thread.sleep(4000);
		selectProvinceAddressBasedOnInput_First_Address(getMapData.get("home_Address")); //Added on 08-July-2022
		//Added on 16-Jan-2024 End Revised
		
		Thread.sleep(2000);
		waitForElementToBeVisible(txt_Email,"text in email_id");
			ScrollToElement(txt_Email, "Email field");
			for(int i=1;i<20;i++)
			{
				String emailTxt = txt_Email.getAttribute("value");
				if(emailTxt.equalsIgnoreCase(getMapData.get("Email")))
				{
					System.out.println("User data prefilled in personal info page");
					break;
				}
				else
				{
					Thread.sleep(900);
				}
			}
			Thread.sleep(2000);
			if(getMapData.get("Rent_Yes_No").equalsIgnoreCase("Yes"))
			{
				click(rent_yes, "Rent select yes");
				Thread.sleep(2000);
				rent.sendKeys(Keys.CONTROL + "a");
				rent.sendKeys(Keys.DELETE);
				//EnterText(rent, getMapData.get("Rentamount") , "Rent amount" );//Commented on 16-Jan-2024 Revised
				EnterText(rent, getMapData.get("Rent_Contribution") , "Rent amount" ); //Added on 16-Jan-2024 Revised
				
				
			}
			else if(getMapData.get("Rent_Yes_No").equalsIgnoreCase("No"))
			{
				click(rent_yes, "Rent select yes");
				
				click(Rent_No,"Rent no");
			}
		
		
			Thread.sleep(4000);
			click(checkbox_one, "check the checkbox");
			
			click(checkbox_two, "check the checkbox");
	
		click(next_page,"Navigate to next page");
		
	}
	
}

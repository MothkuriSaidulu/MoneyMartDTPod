package pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import actions.OnlineActions;
import driver.TestBase;




public class Pg_Reloan extends OnlineActions{

	WebDriver driver;
	public Pg_Reloan(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH,using = "//div[@class='its-super']")
	WebElement caption;
	
	@FindBy(how = How.XPATH,using = "//button[@class='jsy_button']")
	WebElement btn_jsycard;
	
	@FindBy(how = How.XPATH,using = "//button[text()='Reset']")
	WebElement btn_RESET;
	
	@FindBy(how = How.XPATH,using = "//b[normalize-space()='Record updated successfully.']")
	WebElement tex_msg;
	
	
	//existing employe 
	@FindBy (how=How.XPATH, using = "//input[@class='mm-input mm-gs-input']")
	public static WebElement employee_name;
	
	@FindBy (how=How.XPATH, using = "//input[@placeholder='XXX-XXX-XXXX']")
	public static WebElement employee_phone;
	
	@FindBy (how=How.XPATH, using = "//div[@class='mm-form-field mm-form-field--has-value']//button[@type='button']")
	public static WebElement how_to_paid;
	
	@FindBy (how=How.XPATH, using = "//button[normalize-space()='Same day every month']")
	public static WebElement pay_frequency;
	
	@FindBy (how=How.XPATH, using = "//div[6]//div[1]//div[2]//label[1]//div[1]//input[1]")
	public static WebElement Last_Pay_date;
	
	@FindBy (how=How.XPATH, using = "//div[7]//div[1]//div[2]//label[1]//div[1]//input[1]")
	public static WebElement Next_Pay_date;
	
	@FindBy (how=How.XPATH, using = "(//input[@class='mm-input'])[7]")
	public static WebElement Takehome_netpay;
	
	@FindBy (how=How.XPATH, using = "//button[normalize-space()='Confirm & Continue']")
	public static WebElement next_button;
	
	@FindBy (how=How.XPATH, using = "(//input[contains(@type,'text')])[2]")
	public static WebElement Lasttakehome_net;
	
	@FindBy (how=How.XPATH, using = "//div[@class='mm-form-field mm-form-field--has-value mm-gs-formfield']//select[@class='mm-select__native-input']//option]")
	public static WebElement employee_types;
	
	@FindBy (how=How.XPATH, using = "(//input[contains(@type,'text')])[2]")
	public static List<WebElement> List_txt_PreviousPay;
	
	//////////////////////////////////////////////////////////////////////
	
	@FindBy (how=How.XPATH, using = "//div[contains(text(),'Last pay date*')]/following::input[1]")
	public static WebElement txt_LastPayDay;

	@FindBy (how=How.XPATH, using = "//div[contains(text(),'Next pay date*')]/following::input[1]")
	public static WebElement txt_NextPayDay;

	@FindBy (how=How.XPATH, using = "//div[contains(text(),'Last take-home pay cheque amount*')]/following::input[1]")
	public static WebElement txt_LastNetPay;
	
	@FindBy (how=How.XPATH, using = "//div[contains(text(),'Employer*')]/following::input[1]")
	public static WebElement txt_Employer;
	
	
	@FindBy (how=How.XPATH, using = "//div[contains(text(),'Last take-home pay cheque amount*')]/following::input[1]")
	public static WebElement text_Lasttakehome;
	
	
	
	
	
	
	//////////////////////////////////////////////////////////////////////////////

	@FindBy (how=How.XPATH, using = "//input[contains(@type,'text')]")
	public static List<WebElement> List_txt_LastNetPay;
	
	@FindBy (how=How.XPATH, using = "//div[contains(text(),'Last take home pay cheque amount *')]/following::input[1]")
	public static WebElement txt_LastNetPayGetText;

	
	
	@FindBy (how=How.XPATH, using = "//button[normalize-space()='Full Time Employed']")
	public static WebElement full_typeemploye;
	
	@FindBy (how=How.XPATH, using = "//h1[normalize-space()='Any changes to your information?']")
	public static WebElement page_caption;
	
	
	@FindBy (how=How.XPATH, using = "//button[normalize-space()='No']")  //button[normalize-space()='Yes']
	public static WebElement rent_no;
	
	@FindBy (how=How.XPATH, using = "//button[normalize-space()='Yes']")  
	public static WebElement rent_yes;
	@FindBy (how=How.XPATH, using = "//div[contains(text(),'What is your share of rent?*')]/following::input[1]")  
	public static WebElement rent;
	
	//@FindBy(how = How.XPATH,using = "//a[normalize-space()='Sign Out']") //Commented on 17-Jan-2024 Revised 
	@FindBy(how = How.XPATH,using = "//div[text()='Sign Out']") //Added on 17-Jan-2024 Revised 
	
	WebElement sigout;
	
	
	
	public void IncomeDetails_WithFlinks() throws Exception
	{
		Thread.sleep(3000);
		
		waitForElementToBeVisible(page_caption, "page text");
		
		SoftVerifyTextOnly("Any changes to your information?", "Any changes to your information?", "Page text");
		
		TestBase.bindreport(currentGlobalScenarioName, "Existing cutomer employee details");
		
		movetoelement(rent_no);
		
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
		
		TestBase.bindreport(currentGlobalScenarioName, "Existing cutomer flinks details");
		
		System.out.println("************************");
		
		System.out.println(txt_Employer.getText());
		
		System.out.println(text_Lasttakehome.getText());
		
		System.out.println(txt_LastNetPay.getText());
		
		System.out.println(txt_LastNetPay.getText());
		
		System.out.println("************************");
		
		TestBase.bindreport(currentGlobalScenarioName, "Existing cutomer flinks details");
		
		movetoelement(next_button);
		
		click(next_button,"Next button page"); 
		
	}
	
	
	public void Choose_jsyCard() throws Exception
	{
		
		waitForElementToBeVisible(caption, "Caption");
		
		System.out.println("**********************************");
		
		System.out.println(caption.getText());
		
		System.out.println("**********************************");
		
		TestBase.bindreport(currentGlobalScenarioName, "jsy card");
		
		Thread.sleep(3000);
		
		waitForElementToBeClickable(btn_jsycard, "Jsy card");
		click(btn_jsycard, "Jsy card");
	
	 
	}
	
	public void existing_employee_details() throws Exception
	{
		
		
		waitForElementToBeVisible(page_caption, "page text");
		
		SoftVerifyTextOnly("Any changes to your information?", "Any changes to your information?", "Page text");
		
		TestBase.bindreport(currentGlobalScenarioName, "Existing cutomer employee details");
		
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
			Thread.sleep(6000);	
			click(rent_no,"Rent no");
		}
		
		Pg_04_Employerinfo obj_jsyrelon =new Pg_04_Employerinfo(TestBase.getDriver());
				obj_jsyrelon.existing_employee_details_jsy();
		
			
		
		click(next_button,"Next button page"); 
	}
	
	//add 0425 start revised
	
	public void existing_employee_flinks_changed_funding() throws Exception
	{
		waitForElementToBeVisible(page_caption, "page text");
		
		SoftVerifyTextOnly("Any changes to your information?", "Any changes to your information?", "Page text");
		
		TestBase.bindreport(currentGlobalScenarioName, "Existing cutomer employee details");
		
		
		//Thread.sleep(6000);	//Commented on 09-Jan-2024 Revised
		//Pg_04_Employerinfo obj_jsyrelon =new Pg_04_Employerinfo(TestBase.getDriver());
		//obj_jsyrelon.IncomeDetails_WithFlinks_jsy();
		
		
		if(getMapData.get("Rent_Yes_No").equalsIgnoreCase("Yes"))
		{
		waitForElementToBeClickable(rent_yes, "WaitYes"); //Added on 09-Jan-2024 Revised
		click(rent_yes, "Rent select yes");
		Thread.sleep(2000);
		rent.sendKeys(Keys.CONTROL + "a");
		rent.sendKeys(Keys.DELETE);
		EnterText(rent, getMapData.get("Rent_Contribution") , "Rent amount" );
		
		
		}
	
		else if(getMapData.get("Rent_Yes_No").equalsIgnoreCase("No"))
		{
			//Thread.sleep(6000);	//Commented on 09-Jan-2024 Revised
			waitForElementToBeClickable(rent_no, "WaitNo"); //Added on 09-Jan 2024 Revised
			click(rent_no,"Rent no");
		}
		
		Thread.sleep(6000);
		Pg_09_Funding obj_newrelon =new Pg_09_Funding(TestBase.getDriver());
		obj_newrelon.changefundingjsypage();
		//Thread.sleep(6000); //Commented on 09-Jan-2024 Revised
		waitForElementToBeClickable(next_button, "WaitNext"); //Added on 09-Jan 2024 Revised
		click(next_button,"Next button page"); 
		
	}
	
	public void existing_employee_changed_fundingtype_details() throws Exception
	{
		
		
		waitForElementToBeVisible(page_caption, "page text");
		
		SoftVerifyTextOnly("Any changes to your information?", "Any changes to your information?", "Page text");
		
		TestBase.bindreport(currentGlobalScenarioName, "Existing cutomer employee details");
		
		if(getMapData.get("Emp_Name").equalsIgnoreCase("N/A"))
		{

		}
		else
		{
			employee_name.sendKeys(Keys.CONTROL + "a");
			employee_name.sendKeys(Keys.DELETE);
			EnterText(employee_name,getMapData.get("Emp_Name"),"Emp name");
		}
		
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
			Thread.sleep(6000)		;	
			click(rent_no,"Rent no");
		}
		
		Lasttakehome_net.sendKeys(Keys.CONTROL + "a");
		Lasttakehome_net.sendKeys(Keys.DELETE);
		EnterText(Lasttakehome_net, getMapData.get("LastNetPay"), "net amount");
		
		Thread.sleep(4000);
		if(getMapData.get("Current_Address_Province").equalsIgnoreCase("ON")&&getMapData.get("Current_Address_Province").equalsIgnoreCase("MB"))
		{
        EnterText(Takehome_netpay, getMapData.get("PreviousMonthPay"), "PreviousMonthPay");
        
        TestBase.bindreport(currentGlobalScenarioName, "Existing cutomer employee details");
		}
		Pg_09_Funding obj_newrelon =new Pg_09_Funding(TestBase.getDriver());
		obj_newrelon.changefundingjsypage();
		Thread.sleep(6000);
		click(next_button,"Next button page"); 
	}
	
	//add 0425 end revised
	
	
	public void logout_screen() throws IOException, InterruptedException
	{
			Thread.sleep(2000);
			
			TestBase.bindreport(currentGlobalScenarioName, "user dashbord");
	
		waitForElementToBeClickable(sigout, "sigout");
		click(sigout, "sigout");

		
	}
	
	
	
}

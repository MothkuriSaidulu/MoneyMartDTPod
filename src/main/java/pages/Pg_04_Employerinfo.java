package pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import actions.OnlineActions;
import driver.TestBase;
import utils.UtilityMethods;


public class Pg_04_Employerinfo extends OnlineActions {

	public Pg_04_Employerinfo(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public static String Flinks_PrimaryIncome;
	public static String Flinks_Emp_Name;
//	public static String Flinks_DirectDeposit;
	public static String Flinks_PayFreq;
	public static String Flinks_LastPayDate;
	public static String Flinks_NextPayDate;
	public static String Flinks_LastPayAmount;
	public static String Flinks_LastMonthPayAmnt;
	
	//Get data from income details when flinks is Optin
	@FindBy (how=How.XPATH, using = "//div[contains(text(),'Employer*')]/following::input[1]")
	public static WebElement txt_EmpName;

		@FindBy (how=How.XPATH, using = "//div[normalize-space()='Your Employment Status*']/following::button[1]")
		
		//div[normalize-space()='Your Employment Status*']/following::button[1]
		public static WebElement getText_PrimaryIncome;

		@FindBy (how=How.XPATH, using = "//div[normalize-space()='How often are you paid? *']/following::button[1]")
		public static WebElement getText_PayFreq;

		@FindBy (how=How.XPATH, using = "//button[normalize-space()='Continue']")
		public static WebElement btn_Next;
	
	@FindBy (how=How.XPATH, using = "(//button[@type='button'])[1]")
	public static WebElement employee_type;
	
	@FindBy (how=How.XPATH, using = "//button[normalize-space()='Full Time Employed']")
	public static WebElement full_typeemploye;
	
	@FindBy (how=How.XPATH, using = "//button[normalize-space()='Full Time Employed']")
	public static WebElement dd_income_FullTime;

	@FindBy (how=How.XPATH, using = "//button[normalize-space()='Part Time Employed']")
	public static WebElement dd_income_PartTime;

	@FindBy (how=How.XPATH, using = "//button[normalize-space()='Pension']")
	public static WebElement dd_income_Pension;

	@FindBy (how=How.XPATH, using = "//button[normalize-space()='Canada Pension Plan (CPP)']")
	public static WebElement dd_income_CPP;

	@FindBy (how=How.XPATH, using = "//button[normalize-space()='Old Age Security (OAS)']")
	public static WebElement dd_income_OAS;
	
	@FindBy (how=How.XPATH, using = "//button[normalize-space()='Private Disability Insurance']")
	public static WebElement dd_income_PDI;
	
	@FindBy (how=How.XPATH, using = "//button[normalize-space()='Child Tax Benefits']")
	public static WebElement dd_income_CTB;

	@FindBy (how=How.XPATH, using = "//button[normalize-space()='Other']")
	public static WebElement dd_income_Other;
	
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
	
	@FindBy (how=How.XPATH, using = "(//input[@class='mm-input'])[1]")
	public static WebElement Last_Pay_dateone;
	
	@FindBy (how=How.XPATH, using = "(//input[@class='mm-input'])[2]")
	public static WebElement Next_Pay_dateone;
	

	
	
	@FindBy (how=How.XPATH, using = "//div[7]//div[1]//div[2]//label[1]//div[1]//input[1]")
	public static WebElement Next_Pay_date;
	
	//@FindBy (how=How.XPATH, using = "//input[@type='text']") //Commented on 16-Jan-2024 Revised
	@FindBy (how=How.XPATH, using = "//div[contains(text(),'Last take home pay cheque amount *')]//following::input[1]") //Added on 16-Jan-2024 Revised
	public static WebElement net_amount;
	
	@FindBy (how=How.XPATH, using = "//button[@id='gs-accept']")
	public static WebElement next_button;
	
	@FindBy (how=How.XPATH, using = "//div[text()='Take-home net pay for the month of March*']/following::input")
	public static WebElement pervious_netpay_jsy;
	
	@FindBy (how=How.XPATH, using = "//div[text()='Take-home net pay for the month of March*']/following::input")
	public static List<WebElement> pervious_netpay_jsyl;
	
	@FindBy (how=How.XPATH, using = "//div[text()='Last take-home pay cheque amount*']/following::input[1]")
	public static WebElement lasttake_netpay_jsy;
	
	
	//@FindBy (how=How.XPATH, using = "//label[@class='mm-form-field__label']/following::input[5]") //Commented on 16-Jan-2024 Revised
	@FindBy (how=How.XPATH, using = "//div[contains(text(),'Take-home for month')]//following::input[1]") //Commented on 16-Jan-2024 Revised
	
	public static WebElement pervious_netpay;
	
	@FindBy (how=How.XPATH, using = "//label[@class='mm-form-field__label']/following::input[5]")
	public static WebElement pervious_netpayone;
	
	@FindBy (how=How.XPATH, using = "//div[@class='mm-form-field mm-form-field--has-value mm-gs-formfield']//select[@class='mm-select__native-input']//option]")
	public static WebElement employee_types;
	@FindBy (how=How.XPATH, using = "//div[contains(text(),'Take-home for month')]/following::input[1]")
	public static List<WebElement> List_txt_PreviousPay;
	
	@FindBy (how=How.XPATH, using = "//div[contains(text(),'Last pay date *')]/following::input[1]")
	public static WebElement txt_LastPayDay;

	@FindBy (how=How.XPATH, using = "//div[contains(text(),'Next pay date *')]/following::input[1]")
	public static WebElement txt_NextPayDay;

	@FindBy (how=How.XPATH, using = "//div[contains(text(),'Last take home pay')]/following::input[1]")
	public static WebElement txt_LastNetPay;

	@FindBy (how=How.XPATH, using = "//input[contains(@type,'text')]")
	public static List<WebElement> List_txt_LastNetPay;
	
	@FindBy (how=How.XPATH, using = "//div[contains(text(),'Last take home pay cheque amount *')]/following::input[1]")
	public static WebElement txt_LastNetPayGetText;

	@FindBy (how=How.XPATH, using = "//div[contains(text(),'Take-home for month of ')]/following::input[1]")
	public static WebElement txt_PreviousPay;
	
	@FindBy (how=How.XPATH, using = "//input[@class='mm-input mm-gs-input']")
	public static WebElement input_Whopaysyou;
	

	@FindBy (how=How.XPATH, using = "//p[@class='mm-radio-group__title']")
	public static WebElement AddEmployer;
	
	@FindBy (how=How.XPATH, using = "(//button[@class='mm-select__value'])[3]")
	public static WebElement employee_drp_2ndincome;
	
	@FindBy (how=How.XPATH, using = "(//button[@class='mm-select__value'])[4]")
	public static WebElement paid_often_2ndincome;
	
	@FindBy (how=How.XPATH, using = "(//input[@class='mm-input mm-gs-input'])[2]")
	public static WebElement employee_name_2ndincome;
	
	@FindBy (how=How.XPATH, using = "(//input[@placeholder='XXX-XXX-XXXX'])[2]")
	public static WebElement phonenumber_2ndincome;
	
	@FindBy (how=How.XPATH, using = "(//input[@placeholder='YYYY/MM/DD'])[3]")
	public static WebElement LastPaydate_2ndincome;
	
	@FindBy (how=How.XPATH, using = "(//input[@placeholder='YYYY/MM/DD'])[4]")
	public static WebElement nextPaydate_2ndincome;
	
	@FindBy (how=How.XPATH, using = "(//input[@type='text'])[2]")
	public static WebElement take_home_2ndincome;
	
	@FindBy (how=How.XPATH, using = "(//div[contains(text(),'Take-home for month')]/following::input[1])[2]")
	public static WebElement txt_LastNetPayGetText_2ndincome;
	
	@FindBy (how=How.XPATH, using = "(//fieldset[contains(@class,'mm-fieldset')]//input[contains(@type,'text')])[2]")
	public static WebElement pervious_netpay_2ndincome;
	

	////Added second income
	
	@FindBy (how=How.XPATH, using = "//button[@class='mm-btn mm-btn--text mm-btn--lg financial-status__remove-source']")
	public static WebElement delete_icon;
	
	@FindBy (how=How.XPATH, using = "//div[@class='mm-dropdown__menu']")
	public static WebElement dropdown;

	
	////added 19/8/2022 Bhargavi
	
	
	
	////////added chandu
	
	@FindBy (how=How.XPATH, using = "(//button[@class='mm-select__value'])[3]")
    public static WebElement employedropdow_2ndincome;
    
    @FindBy (how=How.XPATH, using = "//p[@class='mm-radio-group__title']")
    public static WebElement add_newincome;
    
    @FindBy (how=How.XPATH, using = "(//button[@class='mm-dropdown__menu-item'])[2]")
    public static WebElement pp;
    
    @FindBy (how=How.XPATH, using = "(//button[@class='mm-dropdown__menu-item'])[2]")
    public static WebElement frequency;
    
    @FindBy (how=How.XPATH, using = "//h1[normalize-space()='Looking good!']")
    public static WebElement page_tittle;
    
    @FindBy (how=How.XPATH, using = "//button[@class='mm-select__value']")
    public static WebElement dropdow_emp;
    
  
    
    
    
    
    
    public void Employment_Status() throws Exception
	{
		
		Thread.sleep(3000);
		waitForElementToBeVisible(page_tittle,"Looking good!");
		Thread.sleep(1000);
		
		click(dropdow_emp,"dropdown"); 
		
		
		if(getMapData.get("Employment_Status").equalsIgnoreCase("Canada Pension Plan"))
		{
			click(dd_income_CPP,"Canada Pension Plan");
		} 
		else if (getMapData.get("Employment_Status").equalsIgnoreCase("Others"))
		{
			click(dd_income_Other,"others");
		}
		else if (getMapData.get("Employment_Status").equalsIgnoreCase("OAS"))
		{
			click(dd_income_OAS,"OAS");
		}
		
		else if (getMapData.get("Employment_Status").equalsIgnoreCase("PDI"))
		{
			click(dd_income_PDI,"PDI");
		}
		
		else if (getMapData.get("Employment_Status").equalsIgnoreCase("CTB"))
		{
			click(dd_income_CTB,"CTB");
		}

		else if (getMapData.get("Employment_Status").equalsIgnoreCase("Pension"))
		{
			click(dd_income_Pension,"Pension");
		}
		
		
		
		TestBase.bindreport(currentGlobalScenarioName, "employee details");
		
		movetoelement(next_button);
		
		waitForElementToBeVisible(next_button, "Next button page");
		
		click(next_button,"Next button page");
		
	}
	
	
	/////end
	
    public void next_button() throws IOException, InterruptedException
    {
    	TestBase.bindreport(currentGlobalScenarioName, "employee details page");
		
    	movetoelement(next_button);
    	
    	waitForElementToBeVisible(next_button, "Next button page");
		
		click(next_button,"Next button page"); 
    }
    
    
public void Employer_details_income() throws Exception
{
		
		Thread.sleep(3000);
		waitForElementToBeVisible(employee_type,"WaitVisibleOfemployeetype");
		Thread.sleep(1000);
		
		click(employee_type,"employee_type"); 
		
		
		if(getMapData.get("Income_source").equalsIgnoreCase("Full Time Employed"))
		{
			click(full_typeemploye,"Full time");
		} 
		else if (getMapData.get("Income_source").equalsIgnoreCase("Others"))
		{
			click(dd_income_Other,"others");
		}
		else if (getMapData.get("Income_source").equalsIgnoreCase("OAS"))
		{
			click(dd_income_OAS,"OAS");
		}
		
		else if (getMapData.get("Income_source").equalsIgnoreCase("PDI"))
		{
			click(dd_income_PDI,"PDI");
			Thread.sleep(1000);
			EnterText(input_Whopaysyou, getMapData.get("whopaysyou"),"inputtext");
		}
		
		else if (getMapData.get("Income_source").equalsIgnoreCase("CTB"))
		{
			click(dd_income_CTB,"CTB");
		}
		
		TestBase.bindreport(currentGlobalScenarioName, "employee details");
		
		EnterText(employee_name, getMapData.get("Emp_Name"), "employee name"); 
		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		
		EnterText(employee_phone, getMapData.get("Emp_Phonee"), "employee phone");
		
		System.out.println("Phone number done-----------");
		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		
		Thread.sleep(3000);
		
		click(how_to_paid,"how_to_paid list "); 
		
		click(pay_frequency,"Same day every month"); 
		
		click(Last_Pay_date,"Last Pay date"); 
		
		EnterText(Last_Pay_date, getMapData.get("LastPayDate"), "LastPayDate");
		
		click(Next_Pay_dateone,"Next Pay date"); 
		
		EnterText(Next_Pay_dateone, getMapData.get("NextPayDate"), "NextPayDate");
		
		EnterText(net_amount, getMapData.get("LastNetPay"), "net amount");
		
		TestBase.bindreport(currentGlobalScenarioName, "employee details page");
		
		if(List_txt_PreviousPay.size()>0)
		{
			EnterText(pervious_netpay, getMapData.get("PreviousMonthPay"), "PreviousMonthPay");
		}
	}
	
	
	
	
		//added
		public void Multiple_Employer_details_income() throws Exception
		{
	
			
			movetoelement(add_newincome);
	        
	        waitForElementToBeVisible(add_newincome, "Text");
	        
	     
	        click(add_newincome, "text");
	         
	        
	        movetoelement(employedropdow_2ndincome);
	        
	        
	        if (getMapData.get("employee_drp_2ndincome").equalsIgnoreCase("Others"))
			{
				System.out.println("no nedd to click drop down");
			}
	         
	        else
	         {
	        waitForElementToBeClickable(employedropdow_2ndincome, "text");
	        
	        click(employedropdow_2ndincome, "2nddrp");
	       
	         }
	        
		
		if(getMapData.get("Income_source").equalsIgnoreCase("Full Time Employed"))
		{
			click(full_typeemploye,"Full time");
		} 
		
		else if (getMapData.get("Income_source").equalsIgnoreCase("Others"))
		{
			
		}
		
		else if (getMapData.get("Income_source").equalsIgnoreCase("OAS"))
		{
			click(dd_income_OAS,"OAS");
		}
		
		else if (getMapData.get("Income_source").equalsIgnoreCase("PDI"))
		{
			click(dd_income_PDI,"PDI");
		}
		
		else if (getMapData.get("Income_source").equalsIgnoreCase("CTB"))
		{
			click(dd_income_CTB,"CTB");
		}
		
		else if (getMapData.get("Income_source").equalsIgnoreCase("Part Time Employed"))
		{
			 
			   waitForElementToBeClickable(pp, "pp");
		        
		        click(pp, "pp");
		}
		
		
		TestBase.bindreport(currentGlobalScenarioName, "employee details");
		
		waitForElementToBeVisible(employee_name_2ndincome, "test");
		
		EnterText(employee_name_2ndincome, getMapData.get("employee_name_2ndincome"), "employee name");
		
		EnterText(phonenumber_2ndincome, getMapData.get("phonenumber_2ndincome"), "employee phone");	
		
		click(how_to_paid,"how_to_paid list "); 
		
		click(pay_frequency,"Same day every month"); 
		
		click(LastPaydate_2ndincome,"Last Pay date"); 
		EnterText(LastPaydate_2ndincome, getMapData.get("LastPayDate"), "LastPayDate");
		
		click(nextPaydate_2ndincome,"Next Pay date"); 
		EnterText(nextPaydate_2ndincome, getMapData.get("NextPayDate"), "NextPayDate");
		EnterText(net_amount, getMapData.get("LastNetPay"), "net amount");
		TestBase.bindreport(currentGlobalScenarioName, "employee details page");
		
		if(List_txt_PreviousPay.size()>0)
		{
			EnterText(pervious_netpay, getMapData.get("PreviousMonthPay"), "PreviousMonthPay");
		}
		
		else
		{
		
		click(next_button,"Next button page"); 
		}
		click(next_button,"Next button page"); 
	}
		
		
	//////////End
		
		
		
		
		
		
		
		public void Employer_details_one() throws Exception
		{
			
			Thread.sleep(3000);
			waitForElementToBeVisible(employee_type,"WaitVisibleOfemployeetype");
			Thread.sleep(1000);
			
			click(employee_type,"employee_type"); 
			
			
			if(getMapData.get("Income_source").equalsIgnoreCase("Full Time Employed"))
			{
				click(full_typeemploye,"Full time");
			} 
			else if (getMapData.get("Income_source").equalsIgnoreCase("Others"))
			{
				click(dd_income_Other,"others");
			}
			else if (getMapData.get("Income_source").equalsIgnoreCase("OAS"))
			{
				click(dd_income_OAS,"OAS");
			}
			
			else if (getMapData.get("Income_source").equalsIgnoreCase("PDI"))
			{
				click(dd_income_PDI,"PDI");
			}
			
			else if (getMapData.get("Income_source").equalsIgnoreCase("CTB"))
			{
				click(dd_income_CTB,"CTB");
			}
			
			TestBase.bindreport(currentGlobalScenarioName, "employee details");
			
			EnterText(employee_name, getMapData.get("Emp_Name"), "employee name");
			
			EnterText(employee_phone, getMapData.get("Emp_Phone"), "employee phone");	
			
			click(how_to_paid,"how_to_paid list "); 
			
			click(pay_frequency,"Same day every month"); 
			
			click(Last_Pay_date,"Last Pay date"); 
			EnterText(Last_Pay_date, getMapData.get("LastPayDate"), "LastPayDate");
			
			click(Next_Pay_date,"Next Pay date"); 
			EnterText(Next_Pay_date, getMapData.get("NextPayDate"), "NextPayDate");
			EnterText(net_amount, getMapData.get("LastNetPay"), "net amount");
			TestBase.bindreport(currentGlobalScenarioName, "employee details page");
			
			if(List_txt_PreviousPay.size()>0)
			{
				EnterText(pervious_netpayone, getMapData.get("PreviousMonthPay"), "PreviousMonthPay");
			}
			
			
		}

	
	public void Employer_details() throws Exception
	{
		
		Thread.sleep(3000);
		waitForElementToBeVisible(employee_type,"WaitVisibleOfemployeetype");
		Thread.sleep(1000);
		
		click(employee_type,"employee_type"); 
		
		
		if(getMapData.get("Income_source").equalsIgnoreCase("Full Time Employed"))
		{
			click(full_typeemploye,"Full time");
		} 
		else if (getMapData.get("Income_source").equalsIgnoreCase("Others"))
		{
			click(dd_income_Other,"others");
		}
		else if (getMapData.get("Income_source").equalsIgnoreCase("OAS"))
		{
			click(dd_income_OAS,"OAS");
		}
		
		else if (getMapData.get("Income_source").equalsIgnoreCase("PDI"))
		{
			click(dd_income_PDI,"PDI");
		}
		
		else if (getMapData.get("Income_source").equalsIgnoreCase("CTB"))
		{
			click(dd_income_CTB,"CTB");
		}
		else if (getMapData.get("Income_source").equalsIgnoreCase("CPP"))
		{
			click(dd_income_CPP,"CPP");
		}
		
		TestBase.bindreport(currentGlobalScenarioName, "employee details");
		
		EnterText(employee_name, getMapData.get("Emp_Name"), "employee name");
		
		EnterText(employee_phone, getMapData.get("Emp_Phone"), "employee phone");	
		
		click(how_to_paid,"how_to_paid list "); 
		
		click(pay_frequency,"Same day every month"); 
		
		click(Last_Pay_date,"Last Pay date"); 
		EnterText(Last_Pay_date, getMapData.get("LastPayDate"), "LastPayDate");
		
		click(Next_Pay_date,"Next Pay date"); 
		EnterText(Next_Pay_date, getMapData.get("NextPayDate"), "NextPayDate");
		EnterText(net_amount, getMapData.get("LastNetPay"), "net amount");
		TestBase.bindreport(currentGlobalScenarioName, "employee details page");
		
		if(List_txt_PreviousPay.size()>0)
		{
			EnterText(pervious_netpay, getMapData.get("PreviousMonthPay"), "PreviousMonthPay");
		}
		
		else
		{
		
		click(next_button,"Next button page"); 
		}
		click(next_button,"Next button page"); 
	}
	
	public void existing_employee_details() throws Exception
	{
		
		
		if(getMapData.get("Emp_Name").equalsIgnoreCase("N/A"))
		{

		}
		else
		{
			waitForElementToBeVisible(employee_name, "WaitEmpName");//Added on 16-Jan-2024 Revise
			employee_name.sendKeys(Keys.CONTROL + "a");
			employee_name.sendKeys(Keys.DELETE);
			EnterText(employee_name,getMapData.get("Emp_Name"),"Emp name");
		}
		

		if(getMapData.get("Income_source").equalsIgnoreCase("Full Time Employed"))
		{
			click(full_typeemploye,"Full time");
		} 
		
		click(Last_Pay_date,"Last Pay date"); 
		//EnterText(Last_Pay_date, getMapData.get("LastPayDate"), "LastPayDate"); Commented on 02-Nov-2023 Revised
		String lastpaydate = UtilityMethods.addNumberOfDaystoDateyyyyMMdd(28, "BACK"); //Added on 02-Nov-2023 Revised
		EnterText(Last_Pay_date,lastpaydate , "LastPayDate"); //Added on 02-Nov-2023 Revised
		
		
		click(Next_Pay_date,"Next Pay date"); 
		//EnterText(Next_Pay_date, getMapData.get("NextPayDate"), "NextPayDate"); Commented on 02-Nov-2023 Revised
		String Nextpaydate = UtilityMethods.addNumberOfDaystoDateyyyyMMdd(5, "ADD"); //Added on 02-Nov-2023 Revised
		EnterText(Next_Pay_date, Nextpaydate, "NextPayDate"); //Added on 02-Nov-2023 Revised
		
		
		
		waitForElementToBeClickable(net_amount, "WaitAmount");//Added on 16-Jan-2024 Revise
		net_amount.sendKeys(Keys.CONTROL + "a");
		net_amount.sendKeys(Keys.DELETE);
		EnterText(net_amount, getMapData.get("LastNetPay"), "net amount");
		if(List_txt_PreviousPay.size()>0)
		{
			EnterText(pervious_netpay, getMapData.get("PreviousMonthPay"), "PreviousMonthPay");
		}
		
		else
		{
		
		click(next_button,"Next button page"); 
		}
		click(next_button,"Next button page"); 
	}
	
	//add 04 27 income details in jsy revised start
	
	public void existing_employee_details_jsy() throws Exception
	{
		
		
		if(getMapData.get("Emp_Name").equalsIgnoreCase("N/A"))
		{

		}
		else
		{
			employee_name.sendKeys(Keys.CONTROL + "a");
			employee_name.sendKeys(Keys.DELETE);
			EnterText(employee_name,getMapData.get("Emp_Name"),"Emp name");
		}
		

		if(getMapData.get("Income_source").equalsIgnoreCase("Full Time Employed"))
		{
			click(full_typeemploye,"Full time");
		} 
		lasttake_netpay_jsy.sendKeys(Keys.CONTROL + "a");
		lasttake_netpay_jsy.sendKeys(Keys.DELETE);
		EnterText(lasttake_netpay_jsy, getMapData.get("LastNetPay"), "net amount");
		
		if(pervious_netpay_jsyl.size()>0)
		{
			EnterText(pervious_netpay_jsy, getMapData.get("PreviousMonthPay"), "PreviousMonthPay");
		}
		
		
	}
	////add 04 27 income details in jsy revised end
	
	
	public void IncomeDetails_WithFlinks() throws Exception
	{
		Thread.sleep(3000);
		//comment 19 july 2022 start
		waitForElementToBeVisible(getText_PrimaryIncome, "Primary income");
		//comment 19 july 2022 start
		  //Flinks_PrimaryIncome =
		  //getText_PrimaryIncome.getAttribute(Flinks_PrimaryIncome);
		//comment 19 july 2022 end
		Thread.sleep(3000);
		  Flinks_PrimaryIncome =  getText_PrimaryIncome.getText();
		  
		  System.out.println("PrimaryIncome "+Flinks_PrimaryIncome);
		  waitForElementToBeVisible(txt_EmpName, "Emp Name"); 
	
		  Flinks_Emp_Name =  txt_EmpName.getAttribute("value");
		  System.out.println("Emp_Name "+Flinks_Emp_Name);
		  //comment 19 july 2022 end
		

		Flinks_PayFreq = getText_PayFreq.getText();
		System.out.println("payfrequency "+Flinks_PayFreq);
		Flinks_LastPayDate = txt_LastPayDay.getAttribute("Value");
		System.out.println("last paydate::"+Flinks_LastPayDate);
		Flinks_NextPayDate = txt_NextPayDay.getAttribute("Value");
		System.out.println("Next pay date::"+Flinks_NextPayDate);
		Flinks_LastPayAmount = txt_LastNetPayGetText.getAttribute("value");
		System.out.println("Last month payamount "+Flinks_LastPayAmount);
		if(List_txt_PreviousPay.size()>0)
		{
			Flinks_LastMonthPayAmnt = txt_PreviousPay.getAttribute("value");
			 System.out.println("Last month payamount "+Flinks_LastMonthPayAmnt);
		}
		
		click(btn_Next,"Next");
	}

	//add code 04 26 start revised
	
	public void IncomeDetails_WithFlinks_jsy() throws Exception
	{
		Thread.sleep(3000);
		//comment 19 july 2022 start
		//waitForElementToBeVisible(getText_PrimaryIncome, "Primary income");
		//comment 19 july 2022 start
		  //Flinks_PrimaryIncome =
		  //getText_PrimaryIncome.getAttribute(Flinks_PrimaryIncome);
		//comment 19 july 2022 end
		Thread.sleep(3000);
		  //Flinks_PrimaryIncome =  getText_PrimaryIncome.getText();
		  
		  //System.out.println("PrimaryIncome "+Flinks_PrimaryIncome);
		  waitForElementToBeVisible(txt_EmpName, "Emp Name"); 
	
		  Flinks_Emp_Name =  txt_EmpName.getAttribute("value");
		  System.out.println("Emp_Name "+Flinks_Emp_Name);
		  //comment 19 july 2022 end
		

		//Flinks_PayFreq = getText_PsayFreq.getText();
		//System.out.println("payfrequency "+Flinks_PayFreq);
		Flinks_LastPayDate = txt_LastPayDay.getAttribute("Value");
		System.out.println("last paydate::"+Flinks_LastPayDate);
		Flinks_NextPayDate = txt_NextPayDay.getAttribute("Value");
		System.out.println("Next pay date::"+Flinks_NextPayDate);
		Flinks_LastPayAmount = txt_LastNetPayGetText.getAttribute("value");
		System.out.println("Last month payamount "+Flinks_LastPayAmount);
		if(List_txt_PreviousPay.size()>0)
		{
			Flinks_LastMonthPayAmnt = txt_PreviousPay.getAttribute("value");
			 System.out.println("Last month payamount "+Flinks_LastMonthPayAmnt);
		}
		
		
	}
	//add code 04 26 end revised
	

	}

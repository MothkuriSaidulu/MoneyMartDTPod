package online.StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import driver.TestBase;
import pages.Pg_02_PersonalInfo;
import pages.Pg_03_flinksconnect;
import pages.Pg_04_Employerinfo;
import pages.Pg_09_Funding;

public class Flinks_Existing 
{
	
	@Given("^User provides basic information for spl existing flinks$")
	public void user_provides_basic_information_for_spl_existing_flinks() throws Throwable 
	{
	    
		Pg_02_PersonalInfo obj_flinks =new Pg_02_PersonalInfo(TestBase.getDriver());
		obj_flinks.personalinfo_SPL_existing_flinks();
		hooks.bindreport(hooks.scenario, "flinks data");
		
	}
	
	@When("^user select existing flinks option$")
	public void user_select_existing_flinks_option() throws Throwable 
	{
		Pg_03_flinksconnect obj_flink= new Pg_03_flinksconnect(TestBase.getDriver());
		obj_flink.Flinks("IL");
		hooks.takeScreenshotimage(TestBase.getDriver(), "Flinks");
	}

	@When("^customer choose Employment Status$")
	public void customer_choose_Employment_Status() throws Throwable 
	{
	    
		Pg_04_Employerinfo  obj_Employeedetails = new Pg_04_Employerinfo(TestBase.getDriver());

		obj_Employeedetails.Employment_Status();
		
		hooks.bindreport(hooks.scenario, "employee details ");
	}
	
	@When("^Verify the phone OTP and enter valid OTP for autofund or manual review$")
	public void verify_the_phone_OTP_and_enter_valid_OTP_for_autofund_or_manual_review() throws Throwable 
	{
		Pg_09_Funding obj_phone= new Pg_09_Funding(TestBase.getDriver());
		obj_phone.autofund_manualreview();
		hooks.bindreport(hooks.scenario, "Phone verification");
	}

	@When("^click on next button$")
	public void click_on_next_button() throws Throwable 
	{
	   Pg_04_Employerinfo obj_Employer =new Pg_04_Employerinfo(TestBase.getDriver());
	   obj_Employer.next_button();
	   hooks.bindreport(hooks.scenario, "Test");
	}
	
	@When("^User provides basic information for IL$")
	public void user_provides_basic_information_for_IL() throws Throwable 
	{
	    
		Pg_02_PersonalInfo  obj_PersonalInfo = new Pg_02_PersonalInfo(TestBase.getDriver());
		
		hooks.bindreport(hooks.scenario, " personal inforation");
		obj_PersonalInfo.Existing_IL_basic();
		
		hooks.bindreport(hooks.scenario, "Provides personal inforation");
		
		
	}

}

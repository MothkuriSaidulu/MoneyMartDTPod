package online.StepDefinitions;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver.TestBase;
import pages.Pg_03_flinksconnect;

import pages.Pg_10_Loginpage;
import pages.Pg_14_Finaloffer_LPP_Yes_No;
import pages.Pg_Reloan;

public class Reloan_refi_changes 
{
	
	@Then("^customer chooses IL Jsy card$")
	public void customer_chooses_IL_Json_card() throws Throwable 
	{
	   
		Pg_Reloan obj_newrelon =new Pg_Reloan(TestBase.getDriver());
		obj_newrelon.Choose_jsyCard();
		hooks.bindreport(hooks.scenario, "jsy card");
		
	}

	@Then("^select the without flinks option$")
	public void select_the_without_flinks_option() throws Throwable 
	{
	    
		Pg_03_flinksconnect obj_non_flinks=new Pg_03_flinksconnect(TestBase.getDriver());
		obj_non_flinks.flinks_standard();
		hooks.bindreport(hooks.scenario, "flinks standrads");
		
	}

	@Then("^Verify the reloan income information$")
	public void verify_the_reloan_income_information() throws Throwable 
	{
	   
		Pg_Reloan obj_newrelon =new Pg_Reloan(TestBase.getDriver());
		obj_newrelon.existing_employee_details();
		
		hooks.bindreport(hooks.scenario, "Employe details");
	}
	
	// add start 04 26 start revised
	
	
	@Then("^Verify the customer details and change the funding type$")
	public void Verify_the_customer_details_and_change_the_funding_type() throws Throwable 
	{
	   
		Pg_Reloan obj_newrelon =new Pg_Reloan(TestBase.getDriver());
		obj_newrelon.existing_employee_changed_fundingtype_details();
		
		hooks.bindreport(hooks.scenario, "Employe details");
	}
	
	@Then("^Verify the flinks income details and change the funding type$")
	public void Verify_the_flinks_income_details_and_change_the_funding_type() throws Throwable 
	{
	   
		Pg_Reloan obj_jsyinrelon =new Pg_Reloan(TestBase.getDriver());
		obj_jsyinrelon.existing_employee_flinks_changed_funding();
		
		hooks.bindreport(hooks.scenario, "Employe details");
	}
	
	
	
	//add end 04 26 end revised
	
	@When("^user should logout from online application$")
	public void user_should_logout_from_online_application() throws Throwable 
	{
		Pg_Reloan obj_newrelon =new Pg_Reloan(TestBase.getDriver());
		obj_newrelon.logout_screen();
	hooks.bindreport(hooks.scenario, "Logout page");
		
	}
	@Given("^User opens the chrome and launch online application$")
	public void user_opens_the_chrome_and_launch_online_application() throws Throwable 
	{
		TestBase.setupSelenium();
		TestBase.getDriver().get(TestBase.getPropertyValue("OnlineURL") );
	    System.out.println("Applcation launched successfully.............. ");
		
	}

	@When("^User login online Application$")
	public void user_login_online_Application() throws Throwable 
	{
	   
	    Pg_10_Loginpage obj_login=new Pg_10_Loginpage(TestBase.getDriver());
	    obj_login.sigin_application();
	    hooks.bindreport(hooks.scenario, "sigIn Application");
	}
	
	@When("^choose the LPP yes or no$")
	public void choose_the_LPP_yes_or_no() throws Throwable 
	{
		Pg_14_Finaloffer_LPP_Yes_No obj_finaloffer = new Pg_14_Finaloffer_LPP_Yes_No(TestBase.getDriver());
		obj_finaloffer.finaloffer_reloan();
		hooks.bindreport(hooks.scenario, "approval loan amount and lpp chooses");
		
	}
	@When("^select Flinks Optin option$")
	public void select_Flinks_Optin_option() throws Throwable 
	{
	    
		Pg_03_flinksconnect obj_non_flinks=new Pg_03_flinksconnect(TestBase.getDriver());
		obj_non_flinks.flink_optin();
		hooks.bindreport(hooks.scenario, "flinks standrads");
	}
	
	@When("^check the flinks income information$")
	public void check_the_flinks_income_information() throws Throwable 
	{
		Pg_Reloan obj_newrelon =new Pg_Reloan(TestBase.getDriver());
		obj_newrelon.IncomeDetails_WithFlinks();
	 hooks.bindreport(hooks.scenario, "links details page");
	}



}

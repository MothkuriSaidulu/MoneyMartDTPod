package online.StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import driver.TestBase;
import pages.Pg_01_Home;
import pages.Pg_01_OTP;
import pages.Pg_02_PersonalInfo;
import pages.Pg_03_flinksconnect;
import pages.Pg_04_Employerinfo;
import pages.Pg_05_picra_page;
import pages.Pg_06_NonFlinks_Denied;
import pages.Pg_07_deniedscreen;
import pages.Pg_08_Signup;

import pages.Pg_Databases;
import sqlUtils.MsSqlUtility;


public class ILLoandenied 
{

@Given("^user click on signup$")
public void user_click_on_signup() throws Throwable {
	
	TestBase.setupSelenium();
	
	Pg_01_Home obj_home = new Pg_01_Home(TestBase.getDriver());
	
	
	TestBase.getDriver().get(TestBase.getPropertyValue("OnlineURL"));
	obj_home.signup_home();
	
	hooks.bindreport(hooks.scenario, "homepage");
	
	obj_home.click_signup();
	
	hooks.bindreport(hooks.scenario, "singup");
}

//add on otp code 0516 may start revised
	@Given("^lunch otp url$")
	public void lunch_otp_url() throws Throwable {
		
		TestBase.setupSelenium();
		Pg_01_Home obj_home = new Pg_01_Home(TestBase.getDriver());
		
		
		TestBase.getDriver().get(TestBase.getPropertyValue("OTPURL"));	
		
		//hooks.bindreport(hooks.scenario, "homepage");
	}
	
	@Given("^Get otp$")
	public void Get_otp() throws Throwable{
		Pg_01_OTP obj_otp = new Pg_01_OTP(TestBase.getDriver());
		
		obj_otp.getOtp();
	}
	
	//add on otp code 0516 may end revised	

@Given("^verify the phonenumber threshold$")
public void verify_the_phonenumber_threshold() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Pg_Databases obj_DB=new Pg_Databases(TestBase.getDriver());
	obj_DB.update_phonenumber();
	
}
//added july 20 2022 start
@Given("^verify the email threshold$")
public void verify_the_email_threshold() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Pg_Databases obj_DB=new Pg_Databases(TestBase.getDriver());
	obj_DB.Update_emailid_threshold();
}
//added july 20 2022 end
//add on 05 17 start
@Given("^Verify the device velocity$")
public void Verify_the_device_velocity() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Pg_Databases obj_DBdevice=new Pg_Databases(TestBase.getDriver());
	obj_DBdevice.Update_device();
}

//Added on 01-Dec-2023 Revised start
@Given("^update device velocity for threshold$")
public void update_device_velocity_for_threshold() throws Throwable {
// Write code here that turns the phrase above into concrete actions
	Pg_Databases obj_DB=new Pg_Databases(TestBase.getDriver());
	obj_DB.update_device_velocity_for_threshold();
}
//Added on 01-Dec-2023 Revised end

//Added on 22-Nov-2023 Revised start
@Given("^update neuro id for automation approval$")
public void update_neuro_id_for_automation_approval() throws Throwable {
  // Write code here that turns the phrase above into concrete actions
	Pg_Databases obj_DB=new Pg_Databases(TestBase.getDriver());
	obj_DB.update_neuroid_for_automation_approve();
}
//Added on 22-Nov-2023 Revised end

@Given("^verify the bank velocity$")
public void verify_the_bank_velocity() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Pg_Databases obj_DBbank=new Pg_Databases(TestBase.getDriver());
	obj_DBbank.Update_bank();
}
// add on 05 17 end


@Given("^Verify the address threshold and update address$")
public void verify_the_address_threshold_and_update_address() throws Throwable {
	Pg_Databases obj_DB=new Pg_Databases(TestBase.getDriver());
	obj_DB.Update_Address_threshold();
}

@Given("^update address$")
public void update_address() throws Throwable {
	Pg_Databases obj_DB=new Pg_Databases(TestBase.getDriver());
	obj_DB.Update_Address();
}

@When("^Enter all details and create account$")
public void Enter_all_details_and_create_account() throws Throwable {
	Pg_08_Signup obj_sign = new Pg_08_Signup(TestBase.getDriver());
	
	hooks.bindreport(hooks.scenario, "signup");
	
	obj_sign.signup_customer();
	hooks.bindreport(hooks.scenario, "accountcreated");
	/*
	 * System.out.println(
	 * "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
	 * 
	 * System.out.println("Wait update the loan status in DB"); Thread.sleep(80000);
	 * 
	 * System.out.println(" updated the loan status in DB"); System.out.println(
	 * "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
	 */
	
}
@When("^Run the TU query$")
public void run_the_TU_query() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Pg_Databases obj_DB=new Pg_Databases(TestBase.getDriver());
	obj_DB.TUquery();
	
}
//add 0420 start revised
@When("^Run the SPL TU query$")
public void Run_the_SPL_TU_query() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Pg_Databases obj_DB=new Pg_Databases(TestBase.getDriver());
	obj_DB.TUSPLquery();
	
}
//add 0420 end revised
//add 0420 start revised
@When("^Run the TU query for UW$")
public void Run_the_TU_query_for_UW() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Pg_Databases obj_DB=new Pg_Databases(TestBase.getDriver());
	//obj_DB.TUquery();
	obj_DB.executeD1();
	
}
//add 0420 end revised
@When("^customer chooses IL loan$")
public void customer_chooses_IL_loan() throws Throwable {
	
	
	  System.out.println(
	  "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$"); // //
	  System.out.println("Wait update the loan status in DB"); //
	  Thread.sleep(5000); // //
	 
	 Pg_01_Home obj_db = new Pg_01_Home(TestBase.getDriver());
	
	
	obj_db.Dashboard_click_IL();
	
	Thread.sleep(5000);
	 System.out.println(" updated the loan status in DB"); 
	   System.out.println(
	  "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
	hooks.bindreport(hooks.scenario, "choses Loan");
}

	@When("^User provides basic information$")
	public void user_provides_basic_information() throws Throwable {
		
		Pg_02_PersonalInfo  obj_PersonalInfo = new Pg_02_PersonalInfo(TestBase.getDriver());
		
		hooks.bindreport(hooks.scenario, " personal inforation");
		System.out.println("Provides Personal information");
		obj_PersonalInfo.click_personlinfo();
		
		hooks.bindreport(hooks.scenario, "Provides personal inforation");
		
		
	}

	@When("^select the flink consent$")
	public void select_the_flink_consent() throws Throwable {
		
		Pg_03_flinksconnect  obj_FlinksScreen = new Pg_03_flinksconnect(TestBase.getDriver());
		
		//String flinks=  TestBase.getMapData.get("Loantype");
		obj_FlinksScreen.flink_select();
		//obj_FlinksScreen.Flinks(flinks);
		
		hooks.bindreport(hooks.scenario, "flinks page");
		
	}

	@When("^Provides income information$")
	public void provides_income_information() throws Throwable {
		
		Pg_04_Employerinfo  obj_Employeedetails = new Pg_04_Employerinfo(TestBase.getDriver());
			
		hooks.bindreport(hooks.scenario, "employee details ");

		obj_Employeedetails.Employer_details();
		
		hooks.bindreport(hooks.scenario, "income details");
		
	}
	@When("^User provide multiple income source$")
	public void user_provide_multiple_income_source() throws Throwable {
		Pg_04_Employerinfo  obj_Employeedetails = new Pg_04_Employerinfo(TestBase.getDriver());
		obj_Employeedetails.Employer_details_one();
		
		
		obj_Employeedetails.Multiple_Employer_details_income();
		
		//hooks.bindreport(hooks.scenario, "income details");   
	    
	}

	@When("^signed the picra and submit application$")
	public void signed_the_picra_and_submit_application() throws Throwable {
		Pg_05_picra_page  obj_PICRA = new Pg_05_picra_page(TestBase.getDriver());
		
		obj_PICRA.picra_details();
		
		hooks.bindreport(hooks.scenario, "submit page");
	}

//add on 04 26 start revised
	
	@When("^signed the picra and submit application and authentication$")
	public void signed_the_picra_and_submit_application_and_authentication() throws Throwable {
		Pg_05_picra_page  obj_PICRA = new Pg_05_picra_page(TestBase.getDriver());
		
		obj_PICRA.picra_details_autofund();
		
		hooks.bindreport(hooks.scenario, "submit page");
	}
	// add on 04 26 end revised
	
	@When("^loan decision screen$")
	public void loan_decision_screen() throws Throwable {
		
		Pg_07_deniedscreen  obj_dashboard= new Pg_07_deniedscreen(TestBase.getDriver());
		
		hooks.bindreport(hooks.scenario, " Before click on No-thank buton in loan denied screen");
		
		obj_dashboard.deniedscreen();
		hooks.bindreport(hooks.scenario, "Aefore click on No-thank buton in loan denied screen");
		
		
	}
	@When("^verify the DB validatioin$")
	public void verify_the_DB_validatioin() throws Throwable {
		
		Pg_Databases obj_DB=new Pg_Databases(TestBase.getDriver());
		obj_DB.dbvalidation();
		//System.out.println(obj_DB.);
	
	}
	
	@When("^verify loan is refer to store for apply$")
	public void verify_loan_is_refer_to_store_for_apply() throws Throwable {
		
		
		Pg_06_NonFlinks_Denied  obj_NonFlinks_Denied = new Pg_06_NonFlinks_Denied(TestBase.getDriver());
		obj_NonFlinks_Denied.verify_deniedMessage();
		
		hooks.bindreport(hooks.scenario, "submit page");
	}

}

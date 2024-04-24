package online.StepDefinitions;

import cucumber.api.java.en.Then;
import driver.TestBase;
import pages.Pg_002_SignInMoneyMartPage;
import pages.Pg_01_Home;
import pages.Pg_21_Refinance_dashboard;
import pages.Pg_Databases;

public class TC44_Refinance_Loan_flinks_out {
	
	@Then("^Run the TU query for refinance$")
	public void run_the_TU_query_for_refinance() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		Pg_Databases obj_DB=new Pg_Databases(TestBase.getDriver());
		obj_DB.TUquery_refi();
		
	}

	@Then("^sign the customer$")
	public void sign_the_customer() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		TestBase.setupSelenium();
		Pg_01_Home obj_home = new Pg_01_Home(TestBase.getDriver());
		
		
		TestBase.getDriver().get(TestBase.getPropertyValue("OnlineURL"));
		
		obj_home.signup_home();
		
		Pg_002_SignInMoneyMartPage obj_sign=new Pg_002_SignInMoneyMartPage(TestBase.getDriver());
		
		
		
		obj_sign.enterEmailPassword();
		obj_sign.clickSignIn();
		
		hooks.bindreport(hooks.scenario, "user login");
	}

	@Then("^select the refinance loan$")
	public void select_the_refinance_loan() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Pg_21_Refinance_dashboard obj_refi_btm=new Pg_21_Refinance_dashboard(TestBase.getDriver());
		hooks.bindreport(hooks.scenario, "refinance dashboard");
		obj_refi_btm.refinancebutton_dashboard();
		
		hooks.bindreport(hooks.scenario, "refinance dashboard");
	}

}

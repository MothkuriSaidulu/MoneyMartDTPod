package online.StepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver.TestBase;
import pages.Pg_17_Earlypayoff;
import pages.Pg_Databases;

public class TC33_Reloan {

	
	
	@Then("^Make a full payment$")
	public void make_a_full_payment() throws Throwable {
		
		Pg_17_Earlypayoff obj_payoff=new Pg_17_Earlypayoff(TestBase.getDriver());
		obj_payoff.Makepayoff();
		hooks.bindreport(hooks.scenario, "Makepayoff");
	    
	}
	
	//add 0423 start reviesed
	
	@Then("^update the loanstatus to closed$")
	public void update_the_loanstatus_to_closed() throws Throwable {
		
		Pg_Databases obj_DB=new Pg_Databases(TestBase.getDriver());
		obj_DB.update_loanstatusILSPL(4);
	    
	}
	
	//add 0423 end reviesed
	
	@When("^Backdate loan and get make a payment button$")
	public void backdate_loan_and_get_make_a_payment_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Pg_Databases obj_DB=new Pg_Databases(TestBase.getDriver());
		obj_DB.backdateloanformakepayment(12);
	}

	@Then("^Backdate loan (\\d+)days$")
	public void backdate_loan_days(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Pg_Databases obj_DB=new Pg_Databases(TestBase.getDriver());
		obj_DB.backdateloan(180);
	}
	@Then("^verify the DB validatioin for reloan$")
	public void verify_the_DB_validatioin_for_reloan() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Pg_Databases obj_DB=new Pg_Databases(TestBase.getDriver());
		obj_DB.dbvalidation_reloan_Refinance();
	}
}

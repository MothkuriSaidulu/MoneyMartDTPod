package online.StepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import driver.TestBase;
import pages.Pg_11_eSignDocs;
import pages.Pg_12_LoanApprovedScreen;

public class TC07_SPL_approved_Etransfer {

	
	@Then("^esing document SPL and back to dashboard$")
	public void esing_document_SPL_and_back_to_dashboard() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Pg_11_eSignDocs  obj_esign=new Pg_11_eSignDocs(TestBase.getDriver());
		
		obj_esign.Sign_Loan_Docs_SPL();
		
	    hooks.bindreport(hooks.scenario, "esign document");
	}
	@And("^Loan approval screen$")
	public void loan_approval_screen() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Pg_12_LoanApprovedScreen obj_approved_screen = new Pg_12_LoanApprovedScreen(TestBase.getDriver());
		obj_approved_screen.Approved_screen_SPL();
		
		hooks.bindreport(hooks.scenario, "Final offer");
	}
	
}

package online.StepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import driver.TestBase;
import pages.Pg_15_fundingPaymentConfirmation;

public class TC06_EPP_approved {

	
	
	@And("^funding and payment confirmation$")
	public void funding_and_payment_confirmation() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Pg_15_fundingPaymentConfirmation  obj_fundingcfm=new Pg_15_fundingPaymentConfirmation(TestBase.getDriver());
		Thread.sleep(3000);
		obj_fundingcfm.paymentconfirmation_DD();
		
	    hooks.bindreport(hooks.scenario, "fundingPaymentConfirmation");
	}
	
	@And("^funding and payment confirmation EPP$")
	public void funding_and_payment_confirmation_EPP() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Pg_15_fundingPaymentConfirmation  obj_fundingcfm=new Pg_15_fundingPaymentConfirmation(TestBase.getDriver());
		Thread.sleep(3000);
		obj_fundingcfm.fundingPaymentConfirmation();
		
	    hooks.bindreport(hooks.scenario, "fundingPaymentConfirmation");
	}
	
}

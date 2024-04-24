package online.StepDefinitions;

import cucumber.api.java.en.When;
import driver.TestBase;
import pages.Pg_06_ThankYou_DocumentUpload;
import pages.Pg_07_Dashboard;
import pages.Pg_09_Funding;
import pages.Pg_10_Payment;
import pages.Pg_11_PhoneOTP;
import pages.Pg_11_eSignDocs;
import pages.Pg_12_LoanApprovedScreen;
import pages.Pg_14_Finaloffer_LPP_Yes_No;
import pages.Pg_15_fundingPaymentConfirmation;
import pages.Pg_16_Rescind;
import pages.Pg_Databases;

public class TC01_ILLoanApproved_Review {
	
	
	
	@When("^verify the funding screen and chosses the funding type$")
	public void verify_the_funding_screen_and_chosses_the_funding_type() throws Throwable {
		Pg_09_Funding obj_funding = new Pg_09_Funding(TestBase.getDriver());
		//Pg_11_PhoneOTP obj_otp = new Pg_11_PhoneOTP(TestBase.getDriver());

		//obj_otp.phone_verification_invalidopt();
		Thread.sleep(3000);
		obj_funding.Page_Method();

		hooks.bindreport(hooks.scenario, "funding screen");
	}

	@When("^add the bank details$")
	public void add_the_bank_details() throws Throwable {
		Pg_10_Payment obj_payment = new Pg_10_Payment(TestBase.getDriver());

		obj_payment.Payment_AddBank();

		hooks.bindreport(hooks.scenario, "Bank details ");
	}

	@When("^upload document$")
	public void upload_document() throws Throwable {
		new Pg_06_ThankYou_DocumentUpload(TestBase.getDriver());

		Pg_06_ThankYou_DocumentUpload.Upload_Docs();
	hooks.bindreport(hooks.scenario, "uploaded documents");
	}
	
	@When("^verify the loan status and update loan status in DB$")
	public void verify_the_loan_status_and_update_loan_status_in_DB() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Pg_Databases obj_DB=new Pg_Databases(TestBase.getDriver());
		obj_DB.update_loanstatus(24);
	}

	@When("^click on Finalize and e-Sign Loan Documents$")
	public void click_on_Finalize_and_e_Sign_Loan_Documents() throws Throwable {
		new Pg_07_Dashboard(TestBase.getDriver());

		Thread.sleep(1000);
		Pg_07_Dashboard.click_esign();
		
		hooks.bindreport(hooks.scenario, "esign-document");
	}

	@When("^Verify the loan approved amount$")
	public void verify_the_loan_approved_amount() throws Throwable {
		Pg_12_LoanApprovedScreen obj_approved_screen = new Pg_12_LoanApprovedScreen(TestBase.getDriver());
		obj_approved_screen.Approved_screen();
		
		hooks.bindreport(hooks.scenario, "Final offer");
	}

	@When("^chosses the either LPP yes or no$")
	public void chosses_the_either_LPP_yes_or_no() throws Throwable {
		Pg_14_Finaloffer_LPP_Yes_No obj_finaloffer = new Pg_14_Finaloffer_LPP_Yes_No(TestBase.getDriver());
		obj_finaloffer.finaloffer();
		
		hooks.bindreport(hooks.scenario, "approval loan amount and lpp chooses");
	}

	@When("^bank details$")
	public void veirfy_the_funding_types_and_bank_details() throws Throwable {
		Pg_15_fundingPaymentConfirmation obj_fundingdetail = new Pg_15_fundingPaymentConfirmation(TestBase.getDriver());
		obj_fundingdetail.paymentconfirmation_DD();
		
		hooks.bindreport(hooks.scenario, "funding confirmation");
	}

	//add on 04 28 start revised
	@When("^continue in bank details$")
	public void continue_in_bank_details() throws Throwable {
		Pg_15_fundingPaymentConfirmation obj_fundingdetail = new Pg_15_fundingPaymentConfirmation(TestBase.getDriver());
		obj_fundingdetail.fundingPaymentConfirmation();
		
		hooks.bindreport(hooks.scenario, "funding confirmation");
	}
	//add on 04 28 start revised
	
	
	@When("^Verify the loan documents$")
	public void verify_the_loan_documents() throws Throwable {
		Pg_11_eSignDocs obj_esigndocs = new Pg_11_eSignDocs(TestBase.getDriver());
		obj_esigndocs.Sign_Loan_Docs();
		
		hooks.bindreport(hooks.scenario, "sign loan document screen");
	}
	
	//Added on 09-Jan-2024 Start Revised
	@When("^Verify the loan documents updated$")
	public void verify_the_loan_documents_updated() throws Throwable {
		Pg_11_eSignDocs obj_esigndocs = new Pg_11_eSignDocs(TestBase.getDriver());
		obj_esigndocs.Sign_Loan_Docs_updated();
		Thread.sleep(3000); //Added on 30-Nov-2022
		hooks.bindreport(hooks.scenario, "sign loan document screen");
	}
	//Added on 09-Jan-2024 End Revised

	@When("^verify the dasboard and rescind loan$")
	public void verify_the_dasboard_and_rescind_loan() throws Throwable {

		Pg_16_Rescind obj_dashboard_Cancelloan = new Pg_16_Rescind(TestBase.getDriver());
		
		hooks.bindreport(hooks.scenario, "resind dashboard screen");
		obj_dashboard_Cancelloan.rescindloan();
		
		hooks.bindreport(hooks.scenario, "dashoard screen");
	}
	@When("^verify the DB validatioin for rescind$")
	public void verify_the_DB_validatioin_for_rescind() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   Pg_Databases obj_DB=new Pg_Databases(TestBase.getDriver());
		obj_DB.dbvalidation_recind();	
		}

}
/*
 * @Given("^User click on signup in home page$") public void
 * user_click_on_signup_in_home_page() throws Throwable {
 * TestBase.setupSelenium(); Pg_01_Home obj_home = new
 * Pg_01_Home(TestBase.getDriver());
 * 
 * TestBase.getDriver().get(TestBase.getPropertyValue("OnlineURL"));
 * 
 * obj_home.click_IL_Home();
 * 
 * 
 * hooks.bindreport(hooks.scenario, "IL_Approved"); }
 * 
 * @When("^User given all details and created profile$") public void
 * user_given_all_details_and_created_profile() throws Throwable { // Write code
 * here that turns the phrase above into concrete actions
 * //Pg_002_SignInMoneyMartPage obj_singpage = new
 * Pg_002_SignInMoneyMartPage(TestBase.getDriver());
 * 
 * //obj_singpage.enterEmailPassword(); //obj_singpage.clickSignIn();
 * Pg_03_Personal_Info obj_personal=new
 * Pg_03_Personal_Info(TestBase.getDriver()); obj_personal.personalInfo();
 * hooks.bindreport(hooks.scenario, "IL_Approved");
 * 
 * }
 * 
 * 
 * @When("^User select installment loan in dashboard$") public void
 * user_select_installment_loan_in_dashboard() throws Throwable { // Write code
 * here that turns the phrase above into concrete actions
 * 
 * Pg_01_Home obj_dashboardIL = new Pg_01_Home(TestBase.getDriver());
 * 
 * obj_dashboardIL.Dashboard_click_IL();
 * 
 * hooks.bindreport(hooks.scenario, "IL_Approved");
 * 
 * }
 * 
 * @When("^verify the customer details and click on next$") public void
 * verify_the_customer_details_and_click_on_next() throws Throwable { // Write
 * code here that turns the phrase above into concrete actions
 * Pg_02_PersonalInfo obj_personalinfo = new
 * Pg_02_PersonalInfo(TestBase.getDriver());
 * 
 * obj_personalinfo.existing_profile_details();
 * 
 * hooks.bindreport(hooks.scenario, "IL_Approved"); }
 * 
 * 
 * @When("^user select the non-flinks$") public void
 * user_select_the_non_flinks() throws Throwable { // Write code here that turns
 * the phrase above into concrete actions Pg_03_flinksconnect obj_option=new
 * Pg_03_flinksconnect(TestBase.getDriver());
 * 
 * obj_option.flink_select(); hooks.bindreport(hooks.scenario, "IL_Approved"); }
 * 
 * @When("^Enter the employee details and click next$") public void
 * enter_the_employee_details_and_click_next() throws Throwable {
 * Pg_04_Employerinfo obj_employee= new
 * Pg_04_Employerinfo(TestBase.getDriver());
 * 
 * obj_employee.existing_employee_details();
 * 
 * hooks.bindreport(hooks.scenario, "IL_Approved"); }
 * 
 * @When("^verify the PICRA and submit application$") public void
 * verify_the_PICRA_and_submit_application() throws Throwable { Pg_05_picra_page
 * obj_PICRA= new Pg_05_picra_page(TestBase.getDriver());
 * 
 * obj_PICRA.picra_details();
 * 
 * hooks.bindreport(hooks.scenario, "IL_Approved");
 * 
 * 
 * }
 */

package online.TestRunner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;


@RunWith(driver.CustomRunner.class)

@CucumberOptions(features = {
		//C:\Online_MM\features
		
		//change the runnter file
	   //"C:\\MM\\Automation_Working\\DT_Online\\features_revised\\CAN_Online_TC01_IL_Review_new_flinks.feature",
	   //"C:\\MM\\Automation_Working\\DT_Online\\features_revised\\CAN_Online_TC15_IL_Review_void.feature",
	   
	  // "C:\\MM\\Automation_Working\\DT_Online\\features_revised\\CAN_Online_TC04_IL_autofund_Earlyoff.feature",
	   
	  // "C:\\MM\\Automation_Working\\DT_Online\\features_revised\\CAN_Online_TC26_IL_Refinance_flink_prove_data.feature",
	   
		//"C:\\MM\\Automation_Working\\DT_Online\\features_revised\\CAN_Online_OTP.feature",
		//--"C:\\MM\\Automation_Working\\DT_Online\\features_revised\\CAN_Online_TC01_IL_Review_new_flinks.feature",
	
	   
	  // "C:\\MM\\Automation_Working\\DT_Online\\features_revised\\CAN_Online_TC09_SPL_Denied.feature",
	   
	   ///"C:\\MM\\Automation_Working\\DT_Online\\features_revised\\CAN_Online_TC10_IL_Denied_new_flinks.feature",
		//"C:\\MM\\Automation_Working\\DT_Online\\features_revised\\CAN_Online_TC14_IL_reloan.feature",
		
		//"C:\\MM\\Automation_Working\\DT_Online\\features_revised\\CAN_Online_TC03_IL_Reloan_etransfer.feature",
		//"C:\\MM\\Automation_Working\\DT_Online\\features_revised\\CAN_Online_TC23_IL_reloan_LPP_Cancel.feature",
		//"C:\\Online_MM\\features\\CAN_Online_TC02_IL_autofund.feature",
		//"C:\\Online_MM\\features\\CAN_Online_TC03_IL_Existing_etransfer.feature",
		//"C:\\Online_MM\\features\\CAN_Online_TC04_IL_autofund_Earlyoff.feature"
		//"C:\\Online_MM\\features\\CAN_Online_TC05_EPP_approved.feature",
		//"C:\\Online_MM\\features\\CAN_Online_TC06_SPL_approved.feature",
		//"C:\\Online_MM\\features\\CAN_Online_TC07_SPL_Existing_Etransfer.feature",
		//"C:\\Online_MM\\features\\CAN_Online_TC08_EPP_Existing_Etransfer.feature",
		//"C:\\Online_MM\\features\\CAN_Online_TC10_IL_Denied.feature",
		//"C:\\Online_MM\\features\\CAN_Online_TC11_IL_Denied_SPL_Cross_Sell.feature",
		//"C:\\MM\\Online_MM\\features\\CAN_Online_TC12_IL_Denied_EPP_Cross_Sell.feature",
		//"C:\\Online_MM\\features\\CAN_Online_TC13_IL_Loan_Engaged.feature",
		//"C:\\Online_MM\\features\\CAN_Online_TC14_IL_reloan.feature",
		//"C:\\Online_MM\\features\\CAN_Online_TC15_SPL_IL_EsignPending.feature",
		//"C:\\Online_MM\\features\\CAN_Online_TC17_IL_Refinance_flink_out.feature",
		//"C:\\Online_MM\\features\\CAN_Online_TC18_IL_Refinance_flink_optout_Parent_flink_in.feature",
		//"C:\\MM\\Online_MM\\features\\CAN_Online_TC19_IL_Refinance_withdraw.feature",
		//"C:\\MM\\Online_MM\\features\\CAN_Online_TC20_IL_Refinance_autovoid.feature",
		//"C:\\Online_MM\\features\\CAN_Online_TC21_IL_Arrears_PAD_ON.feature",
		//"C:\\Online_MM\\features\\CAN_Online_TC22_IL_debt_PAD_ON.feature",
		//"C:\\Online_MM\\features\\CAN_Online_TC23_IL_reloan_LPP_Cancel.feature",
		//"C:\\Online_MM\\features\\CAN_Online_TC24_IL_review_crm_denied.feature",
		//"C:\\Online_MM\\features\\CAN_Online_TC26_IL_Refinance_flink_prove_data.feature",
		//"C:\\Online_MM\\features\\CAN_Online_TC27_SPL_flink_prove.feature",
		//"C:\\Online_MM\\features\\CAN_Online_TC28_IL_LPP_refund.feature",
		//"C:\\MM\\Online_MM\\features\\CAN_Online_TC29_IL_ OldAgeSecurity_loanapplication_should_be_Approved.feature",
		//"C:\\MM\\Online_MM\\features\\CAN_Online_TC30_IL_PrivateDisabilityInsurance_should_be_Denied.feature",
		//"C:\\MM\\Online_MM\\features\\CAN_Online_TC31_IL_ChildTaxBenifit_should_be_Denied.feature",
		//"C:\\MM\\Online_MM\\features\\CAN_Online_TC32_IL_MultipleIncomeSource.feature",
		//"C:\\MM\\Online_MM\\features\\CAN_Online_TC33_SPL_flink_CandaPensionPlan.feature",
		//"C:\\MM\\Online_MM\\features\\CAN_Online_TC34_SPL_ Flinks_VerifythesystemshoulddisplaytheincomesourcereceivedfromFlinksforWorkersCompensation.feature"
		//"C:\\MM\\Online_MM\\features\\CAN_Online_TC35_IL_flink_OAS.feature",
		//"C:\\MM\\Online_MM\\features\\CAN_Online_TC36_IL_flink_Pension.feature",
		//"C:\\MM\\Online_MM\\features\\CAN_Online_TC37_SPL_Nonflink_MIS.feature",
		//"C:\\MM\\Online_MM\\features\\CAN_Online_TC38_SPL_Nonflink_other.feature",
		//"C:\\MM\\Online_MM\\features\\CAN_Online_TC38_SPL_autofund_Earlyoff2.feature",
		//"C:\\MM\\Online_MM\\features\\CAN_Online_TC39_Refinance_NonFlinks_SK_province.feature",
		//"C:\\MM\\Online_MM\\features\\CAN_Online_TC40_IL_Approved_Datepicker.feature"
		
		//RE_VISIT - BY PP
		//"C:\\MM\\Provenir_Automation_Working\\DT_Online\\features_revised\\CAN_Online_TC01_IL_Review_new_flinks.feature",//--REVISED_@@@@
		//"C:\\MM\\Provenir_Automation_Working\\DT_Online\\features_revised\\CAN_Online_TC02_IL_autofund.feature", //--REVISED_@@@@
		//"C:\\MM\\Provenir_Automation_Working\\DT_Online\\features_revised\\CAN_Online_TC03_IL_Reloan_etransfer.feature", //--REVISED_TT
		//"C:\\MM\\Provenir_Automation_Working\\DT_Online\\features_revised\\CAN_Online_TC04_IL_autofund_Earlyoff.feature", //--REVISED_@@@@
		//"C:\\MM\\Provenir_Automation_Working\\DT_Online\\features_revised\\CAN_Online_TC10_IL_Denied_new_flinks.feature",--REVISED_@@@@
		//"C:\\MM\\Provenir_Automation_Working\\DT_Online\\features_revised\\CAN_Online_TC09_SPL_Denied_Approved.feature", --REVISED_@@@@
		//"C:\\MM\\Provenir_Automation_Working\\DT_Online\\features_revised\\CAN_Online_TC14_IL_reloan.feature", --REVISED_@@@@
		"C:\\MM\\Provenir_Automation_Working\\DT_Online\\features_revised\\CAN_Online_TC15_IL_Review_void.feature", //REAAAWIP
		
//glue = {"online.StepDefinitions.CentzLAFlow"},
//true and false
		
},
dryRun = false, 
glue = {"online.StepDefinitions"},
		plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json", "html:target/cucumber-report",
				"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html",
				"junit:target/cukes/junit.xml" }, monochrome = true)

public class Runner{
	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File("config/report.xml"));

	}
	
	

}


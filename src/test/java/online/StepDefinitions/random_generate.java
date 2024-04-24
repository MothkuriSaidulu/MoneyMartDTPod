package online.StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import driver.TestBase;
import pages.Pg_Generate_ramdom;
import pages.Pg_sin_generate;


public class random_generate  {


	@When("^Pre-requisite data generation for customer$")
	public void create_customerpre_requisite_data_generation() throws Throwable {
		Pg_Generate_ramdom obj_sign = new Pg_Generate_ramdom(TestBase.getDriver());
		
		
		obj_sign.preRequisiteDataGeneration();
		
	}
	@When("^Pre-requisite email and dob$")
	public void Prerequisite_email_and_dob() throws Throwable {
		Pg_Generate_ramdom obj_sign = new Pg_Generate_ramdom(TestBase.getDriver());
		
		
		obj_sign.preRequisiteDataGenerationemaildob();
		
	}
	

	@When("^Pre-requisite data load for customer$")
	public void create_customerpre_requisite_data_load() throws Throwable {
		Pg_Generate_ramdom obj_sign = new Pg_Generate_ramdom(TestBase.getDriver());
		
		
		obj_sign.preRequisiteDataLoad();
		
	}
	
	
	@Given("^Genareted sin$")
	public void genareted_sin() throws Throwable {
		
		TestBase.setupSelenium();
		Pg_sin_generate obj_sin = new Pg_sin_generate(TestBase.getDriver());
		
		TestBase.getDriver().get(TestBase.getPropertyValue("SIN_URL"));
		
		hooks.bindreport(hooks.scenario, "sin account");
		Thread.sleep(4000);
		
		obj_sin.sinGenerate();
		hooks.bindreport(hooks.scenario, "sin account");
		
		TestBase.getDriver().close();
		
		
	}
	
}

package online.StepDefinitions;

import cucumber.api.java.en.When;
import driver.TestBase;
import pages.Pg_04_Employerinfo;

public class New_Emp_details_otherlist 
{
	
	@When("^Proovides income information OAS$")
	public void proovides_income_information_OAS() throws Throwable 
	{
	    

		Pg_04_Employerinfo  obj_Employeedetails = new Pg_04_Employerinfo(TestBase.getDriver());
			
		hooks.bindreport(hooks.scenario, "employee details ");

		obj_Employeedetails.Employer_details_income();
		
		hooks.bindreport(hooks.scenario, "income details");
		
	}

}

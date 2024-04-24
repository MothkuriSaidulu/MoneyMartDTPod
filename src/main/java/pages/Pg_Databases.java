package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import actions.OnlineActions;
import sqlUtils.MsSqlUtility;
import utils.UtilityMethods;

public class Pg_Databases extends OnlineActions {

	public Pg_Databases(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public static String CandLoanId;
    public static String CandCustomerId;
    public static String CanLoanTypeID;
    public static String CanLoanStatusID;
	
	public static String LoanContractID;
	
	@FindBy(how=How.XPATH, using = "//strong[contains(normalize-space(),'Installment Loan | #')]")
	public static WebElement Loan_ContractID;
	
	public void TUquery() throws Exception
	{
		Thread.sleep(8000);
		MsSqlUtility.execute15000TUQuery(getMapData.get("eMail"));
		
	}
	//add 0420 start revised
	public void TUSPLquery() throws Exception
	{
		Thread.sleep(8000);
		MsSqlUtility.execute_SPL_TUQuery(getMapData.get("eMail"));

		
	}
	//add 0420 end revised
	//add 0424 start revised
	
	public void executeD1() throws Exception
	{
		Thread.sleep(8000);
		MsSqlUtility.executeD1(getMapData.get("eMail"));
	}
	//add 0424 end revised
	public void TUquery_refi() throws Exception
	{
		Thread.sleep(8000);
		MsSqlUtility.RefiTUQuery(getMapData.get("eMail"));
	}
	
	public void backdateloan(int days) throws Exception
	{
		Thread.sleep(8000);
		MsSqlUtility.executeBackDateLoan(getMapData.get("eMail"), days);
	}
	public void backdateloanformakepayment(int days) throws Exception
	{
		Thread.sleep(8000);
		MsSqlUtility.executeBackDateLoan(getMapData.get("eMail"), days);
	}
	public void backdateloanforreloan(int reloandays) throws Exception
	{
		Thread.sleep(8000);
		MsSqlUtility.executeBackDateLoan(getMapData.get("eMail"), reloandays);
	}
	public void update_phonenumber() throws Exception
	{
		Thread.sleep(8000);
		
		MsSqlUtility.Check_Update_Phone_Threshold(getMapData.get("Phone"), getMapData.get("eMail"));
		
	}
	public void Update_Address_threshold() throws Exception
	{
		Thread.sleep(11000);
		MsSqlUtility.Check_Update_Address_Threshold(getMapData.get("home_Address_DB"), getMapData.get("eMail"));
		Thread.sleep(8000);
	
	}
	
	//add 05 17 start
	
	public void Update_device() throws Exception
	{
		Thread.sleep(4000);
		MsSqlUtility.UpdateQuery_device_Velocity();  
	}
	
	//Added on 01-Dec-2023 Revised
			public void update_device_velocity_for_threshold() throws Exception
			{
				Thread.sleep(8000);
				
				MsSqlUtility.update_device_velocity( getMapData.get("eMail"));
				
			}
			//Added on 02-Dec-2023 Revised
			
			//Added on 22-Nov-2023 Revised
			public void update_neuroid_for_automation_approve() throws Exception
			{
				Thread.sleep(8000);
				
				MsSqlUtility.update_neuroid_for_automation_update( getMapData.get("eMail"));
				
			}
			//Added on 22-Nov-2023 Revised
	
	public void Update_bank() throws Exception
	{
		Thread.sleep(4000);
		MsSqlUtility.UpdateQuery_bank_Velocity();  
	}
	
	
	// add 05 17 end 
	
	public void Update_emailid_threshold() throws Exception
	{
		Thread.sleep(4000);
		MsSqlUtility.Check_email_Threshold(getMapData.get("eMail"));  
	}
	public void Update_Address() throws Exception
	{
		Thread.sleep(4000);
		MsSqlUtility.update_address(getMapData.get("home_Address_DB"));
	}
	
	public void dbvalidation() throws Exception
	{
		Thread.sleep(4000);
		//MsSqlUtility obj_DB=new MsSqlUtility();
		
		String LoanID = MsSqlUtility.getLoanId(getMapData.get("eMail"))+"";
		String LoanTypeID = MsSqlUtility.getLoanTypeId(getMapData.get("eMail"))+"";
		String CustomerId = MsSqlUtility.getCustomerId(getMapData.get("eMail"))+"";
		long LoanStatus=MsSqlUtility.getLoanStatusId(getMapData.get("eMail"));
		String LoanStatusID = Long.toString(LoanStatus);
		//HashMap<String, String> trans=MsSqlUtility.getLOANTRANSACTIONTable("history.twocard@yopmail.com");
	
		
		datatable.setCellDataForTestData_online(testCaseName, "LoanID", 1, LoanID);
		datatable.setCellDataForTestData_online(testCaseName, "LoanTypeID", 1, LoanTypeID);
		datatable.setCellDataForTestData_online(testCaseName, "CustomerId", 1, CustomerId);
		datatable.setCellDataForTestData_online(testCaseName, "LoanStatusID", 1, LoanStatusID);
		//datatable.setCellDataForTestData_online_DB(testCaseName, "LoanNote", 1, loannote);
		//datatable.setCellDataForTestData_online_DB1(testCaseName, "LoanTransaction", 1, trans);
		
		if(LoanStatusID.equalsIgnoreCase(getMapData.get("DB_LoanStatus_Denied")))
		{
			String results="loan deneid and Test case passed";
			datatable.setCellDataForTestData_online(testCaseName, "Result", 1, results);
		}   
		else if(LoanStatusID.equalsIgnoreCase(getMapData.get("DB_LoanStatus_funded")))
		{
			String results="loan funded and Test case passed";
			datatable.setCellDataForTestData_online(testCaseName, "Result", 1, results);
		}
		else if(LoanStatusID.equalsIgnoreCase(getMapData.get("DB_LoanStatus_etransfer")))
		{
			String results="loan etransfer funding and Test case passed";
			datatable.setCellDataForTestData_online(testCaseName, "Result", 1, results);
		}
		
		
		
		/*comment 24 july 2022 start
		 * int loanNoteSize =
		 * MsSqlUtility.getLOANNOTETable(getMapData.get("eMail")).size(); for(int
		 * i=0;i<loanNoteSize;i++) {
		 * 
		 * //loannote=MsSqlUtility.getLOANNOTETable(getMapData.get("eMail")).get(i)
		 * +"Loan note table row "+i;
		 * PrintValueToReport(MsSqlUtility.getLOANNOTETable(getMapData.get("eMail")).get
		 * (i),"Loan note table row "+i);
		 * 
		 * 
		 * 
		 * }comment 24 july 2022 end
		 */
		
	
	}
	
	public void dbvalidation_initilize_LoanDetails_Save_Excel() throws Exception
	{
		Thread.sleep(1000);
		CandLoanId = MsSqlUtility.getLoanId(getMapData.get("eMail"))+"";

		logLoanDetails.add("*********************** LOAN DETAILS *****************************");
		logLoanDetails.add("Loan Id : " + CandLoanId);
		
		CandCustomerId = MsSqlUtility.getCustomerId(getMapData.get("eMail"))+"";
		logLoanDetails.add("Customer Id : " + CandCustomerId);
		
		CanLoanTypeID = MsSqlUtility.getLoanTypeId(getMapData.get("eMail"))+"";
		logLoanDetails.add("Loan Type Id : " + CanLoanTypeID);
		
		
		long LoanStatus=MsSqlUtility.getLoanStatusId(getMapData.get("eMail"));
		CanLoanStatusID = Long.toString(LoanStatus);
		logLoanDetails.add("Loan Status Id : " + CanLoanStatusID);
		logLoanDetails.add("*********************** LOAN DETAILS *****************************");
		
		UtilityMethods.PBufferWriter(logLoanDetailsPath, logLoanDetails);;
		logLoanDetails.clear();
		
		datatable.setCellDataForTestData_online(testCaseName, "LoanID", 1, CandLoanId);
		datatable.setCellDataForTestData_online(testCaseName, "LoanTypeID", 1, CanLoanTypeID);
		datatable.setCellDataForTestData_online(testCaseName, "CustomerId", 1, CandCustomerId);
		datatable.setCellDataForTestData_online(testCaseName, "LoanStatus", 1, CanLoanStatusID);
	}
	
	public void dbvalidation_reloan_Refinance() throws Exception
	{
		Thread.sleep(10000);
		//MsSqlUtility obj_DB=new MsSqlUtility();
		
		String LoanID = MsSqlUtility.getLoanId(getMapData.get("eMail"))+"";
		String LoanTypeID = MsSqlUtility.getLoanTypeId(getMapData.get("eMail"))+"";
		String CustomerId = MsSqlUtility.getCustomerId(getMapData.get("eMail"))+"";
		long LoanStatus=MsSqlUtility.getLoanStatusId(getMapData.get("eMail"));
		String LoanStatusID = Long.toString(LoanStatus);

		datatable.setCellDataForTestData_online(testCaseName, "Child_loan_id", 1, LoanID);
		
		datatable.setCellDataForTestData_online(testCaseName, "LoanStatus", 1, LoanStatusID);
		
		if(LoanStatusID.equalsIgnoreCase(getMapData.get("DB_LoanStatus_Denied")))
		{
			String results="loan deneid and Test case passed";
			datatable.setCellDataForTestData_online(testCaseName, "Result", 1, results);
		}
		else if(LoanStatusID.equalsIgnoreCase(getMapData.get("DB_LoanStatus_funded")))
		{
			String results="loan funded and Test case passed";
			datatable.setCellDataForTestData_online(testCaseName, "Result", 1, results);
		}
		else if(LoanStatusID.equalsIgnoreCase(getMapData.get("DB_LoanStatus_etransfer")))
		{
			String results="loan etransfer funding and Test case passed";
			datatable.setCellDataForTestData_online(testCaseName, "Result", 1, results);
		}
		
		
		
		/* comment 24 july 2022 start
		 * int loanNoteSize =
		 * MsSqlUtility.getLOANNOTETable(getMapData.get("eMail")).size(); for(int
		 * i=0;i<loanNoteSize;i++) {
		 * 
		 * //loannote=MsSqlUtility.getLOANNOTETable(getMapData.get("eMail")).get(i)
		 * +"Loan note table row "+i;
		 * PrintValueToReport(MsSqlUtility.getLOANNOTETable(getMapData.get("eMail")).get
		 * (i),"Loan note table row "+i);
		 * 
		 * }comment 24 july 2022 end
		 */
		
		
	}
	
	public void dbvalidation_recind() throws Exception
	{
		Thread.sleep(10000);
		//MsSqlUtility obj_DB=new MsSqlUtility();
		
		String LoanID = MsSqlUtility.getLoanId(getMapData.get("eMail"))+"";
		String LoanTypeID = MsSqlUtility.getLoanTypeId(getMapData.get("eMail"))+"";
		String CustomerId = MsSqlUtility.getCustomerId(getMapData.get("eMail"))+"";
		long LoanStatus=MsSqlUtility.getLoanStatusId(getMapData.get("eMail"));
		String LoanStatusID = Long.toString(LoanStatus);
		
		datatable.setCellDataForTestData_online(testCaseName, "LoanStatusID", 1, LoanStatusID);
		if(LoanStatusID.equalsIgnoreCase(getMapData.get("DB_LoanStatus_rescind")))
		{
			String results="loan rescind and Test case passed";
			datatable.setCellDataForTestData_online(testCaseName, "Result", 1, results);
			VerifyPlainText("4", LoanStatusID, "loan rescind and Test case passed"); //Added on 03-Jan-2024 Revised
		}
		else if(LoanStatusID.equalsIgnoreCase(getMapData.get("DB_LoanStatus_funded")))
		{
			String results="loan funded and Test case passed";
			datatable.setCellDataForTestData_online(testCaseName, "Result", 1, results);
			VerifyPlainText("3", LoanStatusID, "loan funded and Test case passed"); //Added on 03-Jan-2024 Revised
		}
		else if(LoanStatusID.equalsIgnoreCase(getMapData.get("DB_LoanStatus_etransfer")))
		{
			String results="loan etransfer funding and Test case passed";
			datatable.setCellDataForTestData_online(testCaseName, "Result", 1, results);
			VerifyPlainText("21", LoanStatusID, "loan etransfer funding and Test case passed"); //Added on 03-Jan-2024 Revised
		}
		
		
		
		/*
		 * int loanNoteSize =
		 * MsSqlUtility.getLOANNOTETable(getMapData.get("eMail")).size(); for(int
		 * i=0;i<loanNoteSize;i++) {
		 * 
		 * //loannote=MsSqlUtility.getLOANNOTETable(getMapData.get("eMail")).get(i)
		 * +"Loan note table row "+i;
		 * PrintValueToReport(MsSqlUtility.getLOANNOTETable(getMapData.get("eMail")).get
		 * (i),"Loan note table row "+i);
		 * 
		 * }
		 */
		
	}
		public void update_loanstatus(int LoanStatus) throws Exception
		{
			Thread.sleep(4000);
			long LoanStatus_DB=MsSqlUtility.getLoanStatusId(getMapData.get("eMail"));
			String LoanStatusID = Long.toString(LoanStatus_DB);
			
			if (LoanStatusID.equalsIgnoreCase(getMapData.get("DB_LoanStatus_BeforeCRM")))
			{
			
			MsSqlUtility.UpdateLoanStatus(getMapData.get("eMail"), LoanStatus);
			}
			else
			{
				logLoanDetails.add("===Loan status===");
		        logLoanDetails.add(LoanStatusID);
		        logLoanDetails.add("===Loan status===");
			}
		}
		
		//add 0423 start revised
		
		public void update_loanstatusILSPL(int LoanStatus) throws Exception
		{
			Thread.sleep(4000);
			long LoanStatus_DB=MsSqlUtility.getLoanStatusId(getMapData.get("eMail"));
			String LoanStatusID = Long.toString(LoanStatus_DB);
			
			
			
			MsSqlUtility.UpdateLoanStatussplil(getMapData.get("eMail"), LoanStatus);
			
				logLoanDetails.add("===Loan status===");
		        logLoanDetails.add(LoanStatusID);
		        logLoanDetails.add("===Loan status===");
			
		}
		
		//add 0423 end revised
		
		public void Change_LoanContract_iD(int LoanNo) throws Exception
		{
			String LoanContractID=MsSqlUtility.getLoanContractID(getMapData.get("eMail"));
			//String LoanContractID = Double.toString(loancontract);
			System.out.println(LoanContractID);
			String[] loancont = LoanContractID.split("-");
			String p1 = loancont[0];
			String p2 = loancont[1];
			String p3 = loancont[2];
			String p4 = loancont[3];
			String loanContID;
			int p3_1 = Integer.parseInt(p3)-100;
			int p4_1 = Integer.parseInt(p4)+5+LoanNo;
			
			int length1 = String.valueOf(p3_1).length();
			int length2 = String.valueOf(p4_1).length();
			if(length1==6)
			{
				if(length2==2)
				{
					loanContID = p1+"-"+p2+"-"+p3_1+"-"+p4_1;
				}
				else
				{
					String p41_1 = "0"+p4_1;
					loanContID = p1+"-"+p2+"-"+p3_1+"-"+p41_1;
				}
				
			}
			else
			{
				if(length2==2)
				{
					String p31_1 = "0"+p3_1;
					loanContID = p1+"-"+p2+"-"+p31_1+"-"+p4_1;
				}
				else
				{
					String p31_1 = "0"+p3_1;
					String p41_1 = "0"+p4_1;
					loanContID = p1+"-"+p2+"-"+p31_1+"-"+p41_1;
				}
				
			}
			
			//Update loan-ContractID
			MsSqlUtility.UpdateLoanContractID(getMapData.get("eMail"),loanContID);
			PrintValueToReport("Loan contract id is changed from "+LoanContractID+" to "+loanContID+" for LoanID "+MsSqlUtility.getLoanId(getMapData.get("eMail")), "Loan contract id is changed");

		}
	
	}

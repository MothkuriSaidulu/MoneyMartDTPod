##Scenario: Test Case 102130: TC06_CAN_Online_IL_ Non Flinks_Verify, when employment status as "Child Tax Benefits" , loan application should be denied

Feature:CAN_Online_TC31_IL_ChildTaxBenifit_should_be_Denied

  @ILApprovedd
  Scenario: Online_New Customer_IL_Approved|TC31_IL_CTB_should_be_De
     Given Genareted sin
     Given user click on signup 
     And Pre-requisite data generation for customer
     And verify the email threshold
     When Enter all details and create account
     And verify the phonenumber threshold
     And Verify the address threshold and update address
     And Run the TU query
     And customer chooses IL loan
     And User provides basic information
     And select the flink consent
    ######################## And Provides income information
     And Proovides income information OAS
     And signed the picra and submit application
     ###log file
   And Initialize Loan Details and write to excel
    And log all the Loan details in logger for investigation
	  And log all the Note details in logger for investigation
	  And log all payment details in logger for investigation
    And log all Transaction details in logger for investigation
    And log all EFTLog details in logger for investigation
    And log all ETransferLog details in logger for investigation
    
    
   
   
    
   
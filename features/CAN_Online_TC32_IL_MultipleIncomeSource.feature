##Scenario: Test Case 102148: TC15_CAN_Online_IL_Non Flinks_Verify, when user selects multiple income source, the loan application should be Approved

Feature:CAN_Online_TC32_IL_MultipleIncomeSource.feature

  @ILApprovedd
  Scenario: Online_New Customer_IL_Approved|TC32_IL_MultipleIncomeSource
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
     #And Proovides income information OAS
    ## And Provides income information
      And User provide multiple income source
     And signed the picra and submit application
     ###log file
   And Initialize Loan Details and write to excel
    And log all the Loan details in logger for investigation
	  And log all the Note details in logger for investigation
	  And log all payment details in logger for investigation
    And log all Transaction details in logger for investigation
    And log all EFTLog details in logger for investigation
    And log all ETransferLog details in logger for investigation
    
    
   
   
    
   
##Scenario:  TS_10_Online_New_Customer_IL_denied 

Feature: Online_New Customer_IL_Deneid

  @ILApprovedd
  Scenario: Online_New Customer_IL_Approved|TC_10_ILLoandenied
    
     ##Given Genareted sin
     Given user click on signup 
     #And Pre-requisite data generation for customer
     And Pre-requisite email and dob
     And verify the email threshold
     And update device velocity for threshold
     And verify the bank velocity
     When Enter all details and create account
     And verify the phonenumber threshold
     And Verify the address threshold and update address
     #And Run the TU query
     And Run the TU query for UW
     And customer chooses IL loan
     And User provides basic information
     #And select the flink consent
      And select flink opt in
     #And Provides income information
     And check the flinks income details
     And update neuro id for automation approval
     And signed the picra and submit application
     Then Enter otp and validate
     And loan decision screen 
    And verify the DB validatioin
   
   
   ##log file
   And Initialize Loan Details and write to excel
    And log all the Loan details in logger for investigation
	  And log all the Note details in logger for investigation
	  And log all payment details in logger for investigation
    And log all Transaction details in logger for investigation
    And log all EFTLog details in logger for investigation
    And log all ETransferLog details in logger for investigation
    
    
   
   
    
   
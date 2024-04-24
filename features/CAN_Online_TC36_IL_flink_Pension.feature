##Scenario: Test Case 102044: TC02_CAN_Online_IL_ Flinks_Verify the system should display the income source received from Flinks for "Pension"
Feature: Test Case 102044: TC02_CAN_Online_IL_ Flinks_Verify the system should display the income source received from Flinks for "Pension"
  @ILApprovedd
  Scenario: Test Case 102044: TC02_CAN_Online_IL_ Flinks_Verify the system should display the income source received from Flinks for "Pension"|TC36_IL_flink_Pension
     Given User opens the chrome and launch online application
     When User login online Application
     And Run the TU query
     And customer chooses IL loan
     #And User provides basic information
     #And select the flink consent
     #And Provides income information
     And User provides basic information for IL
  	 And user select existing flinks option 
      And customer choose Employment Status
     And signed the picra and submit application
     And verify the funding screen and chosses the funding type
     And add the bank details
     And upload document
     And verify the loan status and update loan status in DB
     And click on Finalize and e-Sign Loan Documents 
    And Verify the loan approved amount
    And chosses the either LPP yes or no
     And bank details 
     And Verify the loan documents
     And verify the DB validatioin
    
    ##Rescind the Loan
    # And verify the dasboard and rescind loan
    # And verify the DB validatioin for rescind
   
   
   ###log file
   And Initialize Loan Details and write to excel
    And log all the Loan details in logger for investigation
	  And log all the Note details in logger for investigation
	  And log all payment details in logger for investigation
    And log all Transaction details in logger for investigation
    And log all EFTLog details in logger for investigation
    And log all ETransferLog details in logger for investigation
    
    
   
   
    
   
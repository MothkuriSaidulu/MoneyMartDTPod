##Scenario::Test case 60292: TS_13_Online_New_Customer_il_Denied
Feature: Online_Existing Customer_SPL_Credit Declined

  @SPLLoandenied
  Scenario: Online_Existing Customer_SPL_Credit Declined|TC_09_SPLLoandenied
    Given User opens the chrome and launch online application
    When User login online Application
  
   And customer chooses SPL loan
    And verify the existing customer details for SPL
   And select the flink consent 
   And Verify the  income information
    And update neuro id for automation approval
    And signed the picra and submit application
   #And  enter valid OTP
    Then Enter otp and validate

	 ##ReferTOStore
   And verify loan is refer to store for apply

   And verify the DB validatioin

	 ### BELOW THINGS NOT NEEDED FOR DECLINE FLOW HENCE COMMENED
   ###When select the funding types
   ###And verify the bank details 
   ###And upload document
   ###And verify the loan status and update loan status in DB
   ###And click on Finalize and e-Sign Loan Documents
   ###And Loan approval screen
   ###And Loan approved final offer
   ###And funding and payment confirmation
   ###And esing document SPL and back to dashboard 
  
    
   ###log file
   And Initialize Loan Details and write to excel
    And log all the Loan details in logger for investigation
	  And log all the Note details in logger for investigation
	  And log all payment details in logger for investigation
    And log all Transaction details in logger for investigation
    And log all EFTLog details in logger for investigation
    And log all ETransferLog details in logger for investigation
    
    
    

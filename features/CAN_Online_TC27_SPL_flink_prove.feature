
##Scenario:: Test case 52887: TC19_E2E_SPL_Flink opt in_Existing Customer_Verify customer loan gets Auto funded for an Active customer
Feature: Online_SPL loan flink opt in

  @SPLApproved
  Scenario: Online_SPL_loan_flink_opt_in|TC_27_SPL_prove
  Given Genareted sin
   Given User opens the chrome and launch online application
   When User login online Application
   And Run the TU query
    And Run the TU query
    And customer chooses SPL loan
    And User provides basic information for spl
    And select flink opt in
    And check the flinks income details
    And signed the picra and submit application
   And Verify the phone OTP and enter valid OTP for autofund
   #And Verify the loan approved amount
  And Loan approval screen
  And Loan approved final offer
   And select the funding types
   And Flinks bank details
  And esing document SPL and back to dashboard
  And verify the DB validatioin
  
   And Backdate loan and get make a payment button
   And make a SPL payment
   And Backdate loan and get make a payment button
   
   And update loan contract
   And customer chooses SPL loan
   And verify the existing customer details for SPL
   And Exising flink 
   And check the flinks income details
   And signed the picra and submit application
   And Verify the phone OTP and enter valid OTP for autofund  
   #And Verify the loan approved amount
   And Loan approval screen
  And Loan approved final offer
  And select the funding types
   And Flinks bank details
  And esing document SPL and back to dashboard
  And verify the DB validatioin
   
  ###log file
   And Initialize Loan Details and write to excel
    And log all the Loan details in logger for investigation
	  And log all the Note details in logger for investigation
	  And log all payment details in logger for investigation
    And log all Transaction details in logger for investigation
    And log all EFTLog details in logger for investigation
    And log all ETransferLog details in logger for investigation
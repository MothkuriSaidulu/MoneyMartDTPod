
##Test Case 102377: TC03_CAN_Online_SPL_ Flinks_Verify the system should display the income source received from Flinks for "Canada Pension Plan"
Feature: TC33_SPL_flink_CandaPensionPlan

  @SPLApproved
  Scenario: Online_SPL_loan_flink_opt_in|TC33_SPL_flink_CandaPensionPlan
  Given Genareted sin
  Given user click on signup customer
    And verify the phonenumber threshold
     And Verify the address threshold and update address
    When Create customer
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

##Scenario:Test Case 102377:TC03_CAN_Online_SPL_ Flinks_Verify the system should display the income source received from Flinks for "Canada Pension Plan"
Feature:CAN_Online_TC34_SPL_flink_WorkersCompensation.feature

  @SPLApproved
  Scenario: Online_SPL_loan_flink_opt_in|TC34_SPL_flink_WorkersCompensat
   Given User opens the chrome and launch online application
   When User login online Application
   And Run the TU query
    And customer chooses SPL loan 
    And User provides basic information for spl existing flinks
   And user select existing flinks option 
  # And customer choose Employment Status 
   And click on next button
    And signed the picra and submit application
   And Verify the phone OTP and enter valid OTP for autofund or manual review
    And click on Finalize and e-Sign Loan Documents
   And Loan approval screen
   And Loan approved final offer
   And funding and payment confirmation
 And esing document SPL and back to dashboard 
   
  ###log file
   And Initialize Loan Details and write to excel
    And log all the Loan details in logger for investigation
	  And log all the Note details in logger for investigation
	  And log all payment details in logger for investigation
    And log all Transaction details in logger for investigation
    And log all EFTLog details in logger for investigation
    And log all ETransferLog details in logger for investigation
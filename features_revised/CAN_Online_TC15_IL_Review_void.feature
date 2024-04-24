##Scenario: Test case 60316: TS_37_Online_new customer_IL &SPL Application in eSign Pending status & Review_auto void
Feature: Online_IL approved goes to review  and auto void

  @ILApproved
  Scenario: Online_IL review and auto void|TC_15_IL_Auto_void
    ###Given Genareted sin
     Given user click on signup 
     #And Pre-requisite data generation for customer
     And Pre-requisite email and dob
     And verify the email threshold
     And update device velocity for threshold
     And verify the bank velocity
     When Enter all details and create account
     And verify the phonenumber threshold
     And Verify the address threshold and update address
     And Run the TU query
     And customer chooses IL loan
     And User provides basic information
     #And select the flink consent
      And select flink opt in
     #And Provides income information
     And check the flinks income details
     And update neuro id for automation approval
     And signed the picra and submit application
     Then Enter otp and validate
     And verify the funding screen and chosses the funding type
      #And add the bank details
     And Flinks bank details
     And upload document
     And verify the DB validatioin
   And Back date IL & SPL loans 
   And  run the scheduler
    
    
   ###log file
   And Initialize Loan Details and write to excel
    And log all the Loan details in logger for investigation
	  And log all the Note details in logger for investigation
	  And log all payment details in logger for investigation
    And log all Transaction details in logger for investigation
    And log all EFTLog details in logger for investigation
    And log all ETransferLog details in logger for investigation
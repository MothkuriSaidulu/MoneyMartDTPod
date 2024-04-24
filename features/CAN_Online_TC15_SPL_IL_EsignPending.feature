##Scenario: Test case 60316: TS_37_Online_new customer_IL &SPL Application in eSign Pending status & Review_auto void
Feature: Online_SPL and IL Esing pending and auto void

  @SPLApproved
  Scenario: Online_SPL and IL Esing pending and auto void|TC_15_IL_SPL_Auto_void
    Given Genareted sin
    Given user click on signup customer
     And Pre-requisite data generation for customer
     And verify the phonenumber threshold
      And Verify the address threshold and update address
    When Create customer
     And Run the TU query
    And customer chooses IL loan
    And User provides basic information
    And select the flink consent
    And Provides income information
    And signed the picra and submit application
	  And verify the funding and chosses the funding type
   And add the bank details
   And upload document
   And verify the loan status and update loan status in DB
   And Verify the esign pending status 
   And Back date IL & SPL loans 
   And customer chooses SPL loan
    And verify the existing customer details for SPL
    And select the flink consent
    And Provides income information
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
   And Back date IL & SPL loans 
   #And  run the scheduler
    
    
   ###log file
   And Initialize Loan Details and write to excel
    And log all the Loan details in logger for investigation
	  And log all the Note details in logger for investigation
	  And log all payment details in logger for investigation
    And log all Transaction details in logger for investigation
    And log all EFTLog details in logger for investigation
    And log all ETransferLog details in logger for investigation
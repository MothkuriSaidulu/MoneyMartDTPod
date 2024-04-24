##Scenario::Test case 60292: TS_13_Online_New_Customer_il_Denied
Feature: Online_New Customer_SPL_Credit Declined

  @SPLLoandenied
  Scenario: Online_New Customer_SPL_Credit Declined|TC_09_SPLLoandenied
    Given Genareted sin
    Given user click on signup customer
     And Pre-requisite data generation for customer
    And verify the phonenumber threshold
    And Verify the address threshold and update address
    When Create customer
     And Run the TU query
    And customer chooses SPL loan
    And User provides basic information for spl
    And select the flink consent
    And Provides income information
    And signed the picra and submit application
   And loan decision screen  
   And verify the DB validatioin
    
   ###log file
   And Initialize Loan Details and write to excel
    And log all the Loan details in logger for investigation
	  And log all the Note details in logger for investigation
	  And log all payment details in logger for investigation
    And log all Transaction details in logger for investigation
    And log all EFTLog details in logger for investigation
    And log all ETransferLog details in logger for investigation
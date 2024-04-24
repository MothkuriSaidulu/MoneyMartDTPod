
##Scenario:: Test case 60295: TS_16_Online_New Customer_IL_Credit Declined
Feature: Online_New Customer_IL_Credit Declined

  @ILLoandenied
  Scenario: Online_New Customer_IL_Credit Declined|TC_10_ILLoandenied
    Given Genareted sin
    Given user click on signup 
     And Pre-requisite data generation for customer
    And verify the phonenumber threshold
     #And Verify the address threshold and update address
    When Enter all details and create account
   And Run the TU query
    And customer chooses IL loan
    And User provides basic information
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
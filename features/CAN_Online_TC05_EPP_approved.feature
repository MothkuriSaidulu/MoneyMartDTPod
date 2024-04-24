##scneario:: Test case 60285: TS_06_Online_New_Customer_EPP_Approved_EFT funding_Rescind & return Rescind transaction
Feature: Online_New Customer_EPP_Approved

  @EPPApproved
  Scenario: Online_New Customer_EPP_Approved|TC_05_EPP_Loan
  Given Genareted sin
   Given user click on signup customer
   And Pre-requisite data generation for customer
    And verify the phonenumber threshold
    And Verify the address threshold and update address
    When Create customer
     And Run the TU query
    And customer chooses SPL loan
    And User provides basic information for spl
    
    And Provides income information
    And signed the picra and submit application
  And  enter valid OTP
   #And select the funding types
    And add the bank details
   And upload document
    And verify the loan status and update loan status in DB
   Given User opens the chrome and launch online application
   When User login online Application 
   And click on Finalize and e-Sign Loan Documents
   And Loan approved final offer
   And funding and payment confirmation EPP 
   And esing document and back to dashboard 
   And verify the DB validatioin 
   And verify the dasboard and rescind loan
   And verify the DB validatioin for rescind
   
   ## Return rescind payment from storm
    ###log file
   And Initialize Loan Details and write to excel
    And log all the Loan details in logger for investigation
	  And log all the Note details in logger for investigation
	  And log all payment details in logger for investigation
    And log all Transaction details in logger for investigation
    And log all EFTLog details in logger for investigation
    And log all ETransferLog details in logger for investigation
   
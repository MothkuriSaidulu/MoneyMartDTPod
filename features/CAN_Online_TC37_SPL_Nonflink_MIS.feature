
##Scenario:: Test Case 102440: TC18_CAN_Online_SPL_Non Flinks_Verify, when user selects multiple income source, the loan application should be declined when income is invalid
Feature: Test Case 102440: TC18_CAN_Online_SPL_Non Flinks_Verify, when user selects multiple income source, the loan application should be declined when income is invalid

  @SPLApproved
  Scenario: Online_New Customer_SPL_Approved|TC37_SPL_Nonflink_MIS
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
     And User provide multiple income source
    And signed the picra and submit application
   And  enter valid OTP
   And select the funding types
    And add the bank details
   And upload document
    And verify the loan status and update loan status in DB
   #And sign the customer
   And click on Finalize and e-Sign Loan Documents
   And Loan approval screen
   And Loan approved final offer
   And funding and payment confirmation
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
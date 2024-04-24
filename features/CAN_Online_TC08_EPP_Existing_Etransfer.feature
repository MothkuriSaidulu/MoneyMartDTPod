##scenario: Test case 60291: TS_12_Online_Existing_Customer_EPP_Approved_E_Transfer_Paid early from online

Feature: Online_Existing Customer_EPP_Approved

  @EPPApproved
  Scenario: Online_Existing Customer_EPP_Approved|TC_08_Existing_EPP
    Given Genareted sin
   Given user click on signup customer
   And Pre-requisite data generation for customer
    And verify the phonenumber threshold
    #And Verify the address threshold and update address
   When Create customer
     And Run the TU query
    And customer chooses SPL loan
    And User provides basic information for spl
    And Provides income information
    And signed the picra and submit application
   And  enter valid OTP
  # And select the funding types
    And add the bank details
   And upload document
    And verify the loan status and update loan status in DB
   And click on Finalize and e-Sign Loan Documents
   # And Loan approval screen  no need
   And Loan approved final offer
   And funding and payment confirmation EPP 
 And esing document and back to dashboard  
   ##Back date the loan and make a payment
   And Backdate loan and get make a payment button
   And make a SPL payment
   And Backdate loan and get make a payment button
   ##update the loan contract
   And update loan contract
 
   ## completed
    And sign the customer
   
   And customer chooses SPL loan
    And verify the existing customer details for SPL
  
   And Provides income information
    And signed the picra and submit application
   #And  enter valid OTP  no need
    And change the funding types
 And add the bank details
     And upload document
    And verify the loan status and update loan status in DB
   And click on Finalize and e-Sign Loan Documents
    #And Loan approval screen  no need
   And Loan approved final offer
   And funding and payment confirmation EPP 
  And esing document and back to dashboard 
  
   
   #############
   ## Approved the loan from strom
    
   ###log file
   And Initialize Loan Details and write to excel
    And log all the Loan details in logger for investigation
	  And log all the Note details in logger for investigation
	  And log all payment details in logger for investigation
    And log all Transaction details in logger for investigation
    And log all EFTLog details in logger for investigation
    And log all ETransferLog details in logger for investigation
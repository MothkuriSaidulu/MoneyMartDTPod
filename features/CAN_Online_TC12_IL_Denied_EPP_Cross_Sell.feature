##Scenario:: Test case 60302: TS_23_Online_Existing Customer With out Fliks_IL_Cross-Sell_EPP_Approved
Feature: Online_Existing_EPP_Crosssell

  @ILLoandeniedEPPapproved
  Scenario: Online_Existing_EPP_Crosssell|TC_12_EPP_Cross_Sell
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
   And Verify the phone OTP and enter valid OTP for autofund
   And Verify the loan approved amount
   And chosses the either LPP yes or no
   And select the funding types
   And add the bank details
   And Verify the loan documents
  And verify the DB validatioin
  And Backdate loan and get make a payment button
   Then Make a full payment
   And Backdate loan 10days
   And customer chooses IL loan
   And existing customer details 
   And select the flink consent 
   And Verify the  income information
   And signed the picra and submit application
   And  enter valid OTP
   And verify the cross sell screen and continue PDL loan
   And signed the picra and submit application
   And verify the funding and chosses the funding type
   And verify the bank details
   And upload document
    And verify the loan status and update loan status in DB
   And click on Finalize and e-Sign Loan Documents 
  # And verify the bank details 
   #And upload document
   #And Verify the esign pending status
   And Loan approved final offer
   And bank details
   And esing document and back to dashboard
   And verify the DB validatioin
   
  
    
    
   ###log file
   And Initialize Loan Details and write to excel
    And log all the Loan details in logger for investigation
	  And log all the Note details in logger for investigation
	  And log all payment details in logger for investigation
    And log all Transaction details in logger for investigation
    And log all EFTLog details in logger for investigation
    And log all ETransferLog details in logger for investigation
##Scenario:: Test case 60310: TS_31_Online_Engaged Existing Customer_IL_e-Transfer_withdraw application in eSign pending status
Feature: Online_Engaged Customer_IL_Approved

  @ILApproved
  Scenario: Online_Engaged Customer_IL_Approved|TC_13_Existing_customer_IL
    
 #  Given Genareted sin
  # Given user click on signup customer
   # And Pre-requisite data generation for customer
   # And verify the phonenumber threshold
   #  And Verify the address threshold and update address
   # When Create customer
    # And Run the TU query
    
   Given User opens the chrome and launch online application
   When User login online Application 
    And customer chooses SPL loan
    And User provides basic information for spl
    And select the flink consent
    And Provides income information
    And signed the picra and submit application
   And  enter valid OTP
   And verify the funding and chosses the funding type
    And add the bank details
   And upload document
    And verify the loan status and update loan status in DB
   And click on Finalize and e-Sign Loan Documents
    And Loan approval screen
   And Loan approved final offer
   And funding and payment confirmation
 And esing document SPL and back to dashboard  
   ##Back date the loan and make a payment
   And Backdate loan and get make a payment button
   And make a SPL payment
   And Backdate loan and get make a payment button
   ##update the loan contract
   And update loan contract
   ## completed
   And customer chooses SPL loan
    And verify the existing customer details for SPL
   And select the flink consent 
   And Verify the  income information
    And signed the picra and submit application
   And  enter valid OTP
   And verify the funding and chosses the funding type 
    And verify the bank details 
     And upload document
    And verify the loan status and update loan status in DB
   And click on Finalize and e-Sign Loan Documents
    And Loan approval screen
   And Loan approved final offer
   And funding and payment confirmation
    And esing document SPL and back to dashboard 
   ##Back date the loan and make a payment
   And Backdate loan and get make a payment button
   And make a SPL payment
   And Backdate loan and get make a payment button
   And customer chooses IL loan
   And verify the existing customer details
   And select the flink consent 
   And Verify the  income information
   And signed the picra and submit application
   And Verify the phone OTP and enter valid OTP for autofund  
   #And Verify the loan approved amount
   And chosses the either LPP yes or no
   And change the funding types
   
   And back to  dashboard and verify the withdraw button
   And verify the DB validatioin for reloan
   And loan withdraw 
   And verify the DB validatioin for reloan
   
   
   
    
   ###log file
   And Initialize Loan Details and write to excel
    And log all the Loan details in logger for investigation
	  And log all the Note details in logger for investigation
	  And log all payment details in logger for investigation
    And log all Transaction details in logger for investigation
    And log all EFTLog details in logger for investigation
    And log all ETransferLog details in logger for investigation
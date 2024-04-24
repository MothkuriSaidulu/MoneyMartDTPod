##Scenario:: Test case 60332: TS_53_Refinance-Review status-Withdraw
Feature: Online_IL_Refinance loan and withdraw loan

  @ILRefinanceApproved
  Scenario: Online_IL_Refinance loan and withdraw loan|TC_19_Refinance_withdraw
    #Given Genareted sin
     #And Pre-requisite data generation for customer
   #And verify the phonenumber threshold
   ##And Verify the address threshold and update address
   #Given user click on signup customer
   #When Create customer
   #And Run the TU query
   #And customer chooses IL loan
   #And User provides basic information
   #And select the flink consent
   #And Provides income information
   #And signed the picra and submit application
   #And Verify the phone OTP and enter valid OTP for autofund
   ##And Verify the loan approved amount
   #And chosses the either LPP yes or no
   #And select the funding types
   #And add the bank details
  #And Verify the loan documents
  And verify the DB validatioin
  Then Make IL scheduler payments
  Then Run the TU query for refinance
  And update loan contract
  
  ##Refinance loan origiantion
 ##And sign the customer
  ##And select the refinance loan
  ##And verify the existing customer details
   ##And select the flink consent 
   ##And Verify the  income information
   Given User opens the chrome and launch online application
   When User login online Application 
   And customer chooses IL Jsy card 
   And select the without flinks option 
   And Verify the reloan income information 
   And signed the picra and submit application
   And Verify the phone OTP and enter valid OTP for autofund  
   ##And Verify the loan approved amount
   ##And chosses the either LPP yes or no
   And choose the LPP yes or no
  # And select the funding types
   And back to  dashboard and verify the withdraw button
   And verify the DB validatioin for reloan
   
   ##Withdraw loan
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
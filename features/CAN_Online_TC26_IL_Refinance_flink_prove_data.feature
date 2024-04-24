##Scenario:Test case 52677: TC37_E2E-IL-Refinance-Existing customer-Flinks opt in-Auto fund-Prove data with Fraud Flag
Feature: Online_IL_Refinance loan flink opt in

 @ILRefinanceApproved
  Scenario: Online_IL_Refinance_loan_flink_opt_in|TC_26_Refinance_prove
  
  #Given Genareted sin
    #And verify the phonenumber threshold
    ##And Verify the address threshold and update address
   #Given user click on signup customer
   #When Create customer
    #And Run the TU query
    #And customer chooses IL loan
    #And User provides basic information
    #And select flink opt in
    #And check the flinks income details
    #And signed the picra and submit application
   #And Verify the phone OTP and enter valid OTP for autofund
   ##And Verify the loan approved amount
   #And chosses the either LPP yes or no
   #And select the funding types
   #And Flinks bank details
   #And Verify the loan documents
  #And verify the DB validatioin
  #And update loan contract
 #Then Make IL scheduler payments
 #Then Run the TU query for refinance
 ## And update loan contract
  ##And sign the customer
 ## And select the refinance loan
 
  Given User opens the chrome and launch online application
   When User login online Application 
 And verify the existing customer details
 
 ##online Application 
  Given User opens the chrome and launch online application
   When User login online Application 
   And customer chooses IL Jsy card 
   And select Flinks Optin option 
   And Exising flink 
   #And check the flinks income details
   And check the flinks income information
   And signed the picra and submit application
   And Verify the phone OTP and enter valid OTP for autofund  
   #And Verify the loan approved amount
   And chosses the either LPP yes or no
   #And select the funding types
   #And Flinks bank details
   And Verify the loan documents
  And verify the DB validatioin
 
 ###log file
  And Initialize Loan Details and write to excel
  And log all the Loan details in logger for investigation
  And log all the Note details in logger for investigation
  And log all payment details in logger for investigation
    And log all Transaction details in logger for investigation
    And log all EFTLog details in logger for investigation
    And log all ETransferLog details in logger for investigation 
  

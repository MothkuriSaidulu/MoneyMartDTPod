##Scenario:: Test case 60329: TS_50_Refinance- Auto Fund- Parent loan option Flinks and Refinance loan with out Flinks Cancel/ Rescind_Automation
Feature: Online_IL_Refinance loan flink opt out and parent opt in

  @ILRefinanceApproved
  Scenario: Online_IL_Refinance_loan_flink_opt_out_and_parent_opt in|TC_18_Refinance
    #Given Genareted sin
    #And verify the phonenumber threshold
     ##And Verify the address threshold and update address
     #Given user click on signup customer
    #When Create customer
    #And Run the TU query
    #And customer chooses IL loan
   #And User provides basic information
   And select flink opt in
   #And check the flinks income details
  #And signed the picra and submit application
  #And Verify the phone OTP and enter valid OTP for autofund
 #And Verify the loan approved amount
  #And chosses the either LPP yes or no
  #And select the funding types
  #And Flinks bank details
   #And Verify the loan documents
   
      Given User opens the chrome and launch online application
   When User login online Application 
  #And verify the DB validatioin
  #And update loan contract
  #Then Make IL scheduler payments
  Then Run the TU query for refinance
  
  ##Refinance origination
  ##And sign the customer
 ## And select the refinance loan
  ##And verify the existing customer details
  ## And select the flink consent 
  ## And Verify the  income information
   
    Given User opens the chrome and launch online application
   When User login online Application 
   And verify the phonenumber threshold
   And customer chooses IL Jsy card 
   And select the without flinks option 
   And Verify the reloan income information 
   And signed the picra and submit application
   And Verify the phone OTP and enter valid OTP for autofund  
   #And Verify the loan approved amount
  # And chosses the either LPP yes or no
   And choose the LPP yes or no
   #And select the funding types
   #And Flinks bank details 
   And Verify the loan documents 
   And verify the DB validatioin for reloan
   
   ##Rescind loan
   And verify the dasboard and rescind loan
   And verify the DB validatioin for rescind
  
   ###log file
   And Initialize Loan Details and write to excel
    And log all the Loan details in logger for investigation
	  And log all the Note details in logger for investigation
	  And log all payment details in logger for investigation
    And log all Transaction details in logger for investigation
    And log all EFTLog details in logger for investigation
    And log all ETransferLog details in logger for investigation
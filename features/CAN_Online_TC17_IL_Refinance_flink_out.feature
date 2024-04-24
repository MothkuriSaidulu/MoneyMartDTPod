##Scenario:: Test case 60323: TS_44_existing customer_refinance_both Parent and Refinance loan with out Flinks
Feature: Online_IL_Refinance loan with flinks out

  @ILRefinanceApproved
  Scenario: Online_IL_Refinance_loan_with_flinks_out|TC_17_Refinanceloan 
    Given Genareted sin
    And Pre-requisite data generation for customer
    And verify the phonenumber threshold
  # And Verify the address threshold and update address
     Given user click on signup customer
    When Create customer
    And Run the TU query
    And customer chooses IL loan
    And User provides basic information
    And select the flink consent
    And Provides income information
    And signed the picra and submit application
     And verify the funding screen and chosses the funding type
     And add the bank details
     And upload document
     And verify the loan status and update loan status in DB
     And click on Finalize and e-Sign Loan Documents 
    And Verify the loan approved amount
    And chosses the either LPP yes or no
     And bank details 
     And Verify the loan documents
     And verify the DB validatioin
 
   
       #Given User opens the chrome and launch online application
   #When User login online Application 
   ##SQL
 #And verify the DB validatioin
 #Then Make IL scheduler payments
  #Then Run the TU query for refinance
 #And update loan contract

###Refi Online
   #Given User opens the chrome and launch online application
   #When User login online Application 
   #And verify the phonenumber threshold
   #And customer chooses IL Jsy card 
   #And select the without flinks option 
   #And Verify the reloan income information 
   #And signed the picra and submit application
   #And Verify the phone OTP and enter valid OTP for autofund  
   #And Verify the loan approved amount
   #And chosses the either LPP yes or no
   #And choose the LPP yes or no
   #And select the funding types
   #And verify the bank details 
   #And Verify the loan documents 
   #And verify the DB validatioin for reloan
  #
  
 ###log file
   And Initialize Loan Details and write to excel
    And log all the Loan details in logger for investigation
	  And log all the Note details in logger for investigation
	  And log all payment details in logger for investigation
    And log all Transaction details in logger for investigation
    And log all EFTLog details in logger for investigation
    And log all ETransferLog details in logger for investigation
##Scenario:: Test case 60332: TS_53_Refinance-Review status-Withdraw
Feature: Online_IL_Refinance loan and withdraw loan

  @ILRefinanceApproved
  Scenario: Online_IL_Refinance loan and withdraw loan|TC_19_Refinance_withdraw
  Given Genareted sin
     When user click on signup 
     #And Pre-requisite data generation for customer
     And Pre-requisite email and dob
     And verify the email threshold
     When Enter all details and create account
     And verify the phonenumber threshold
     And Verify the address threshold and update address
     And Run the TU query
     And customer chooses IL loan
     And User provides basic information
     #And select the flink consent
      And select flink opt in
     #And Provides income information
     And check the flinks income details
     And signed the picra and submit application
     And verify the funding screen and chosses the funding type
      #And add the bank details
     And Flinks bank details
     And upload document
      
     And verify the loan status and update loan status in DB
     
    And click on Finalize and e-Sign Loan Documents 
    And Verify the loan approved amount
    And chosses the either LPP yes or no
    And bank details 
    And Verify the loan documents
	
	 #Given User opens the chrome and launch online application
      #When User login online Application
      
    
     
   And update loan contract
  Then Make IL scheduler payments
   
 #Reloan_IL  
 
 
  	Given User opens the chrome and launch online application
    When User login online Application 
   And update loan contract
   And customer chooses IL Jsy card 
   And select the without flinks option 
   And Verify the reloan income information 
   And signed the picra and submit application
   #And verify the funding screen and chosses the funding type
   #And Flinks bank details
    And upload document
    
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
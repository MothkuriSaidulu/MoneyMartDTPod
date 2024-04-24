###Scenario:: Test case 67995: TS_60_Verify the PAD ON/off when loan in debt status
Feature: Online_IL_autofund_debt_PADON

  @ILApproved
  Scenario: Online_IL_autofund_debt_PADON|TC_22_debt_PadON
    
    
      Given Genareted sin
     Given user click on signup 
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
      
      #Given User opens the chrome and launch online application
      #When User login online Application
      
    
     
     And verify the loan status and update loan status in DB
     #Given User opens the chrome and launch online application
     #When User login online Application
     
    And click on Finalize and e-Sign Loan Documents 
    And Verify the loan approved amount
    And chosses the either LPP yes or no
    #And bank details 
    And continue in bank details
    And Verify the loan documents
    And verify the DB validatioin
    
   ## Rescind the Loan
     And verify the dasboard and rescind loan
     And verify the DB validatioin for rescind
   
   
   ##log file
   And Initialize Loan Details and write to excel
    And log all the Loan details in logger for investigation
	  And log all the Note details in logger for investigation
	  And log all payment details in logger for investigation
    And log all Transaction details in logger for investigation
    And log all EFTLog details in logger for investigation
    And log all ETransferLog details in logger for investigation
    
    
   
   
    
   
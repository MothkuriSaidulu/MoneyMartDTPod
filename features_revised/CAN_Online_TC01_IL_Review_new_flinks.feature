##Scenario: Test case 60279: TS_01_Online_New_Customer_IL_Review and Approved_EFT funding_Rescind.

Feature: Online_New Customer_IL_Approved

  @ILApprovedd
  Scenario: Online_New Customer_IL_Approved_RepayCard funding_rescind|TC_01_ILLoanApproved_Review
    
    
     ###Given Genareted sin
     Given user click on signup 
     #And Pre-requisite data generation for customer
     And Pre-requisite email and dob
     And verify the email threshold
     ####And Verify the device velocity
     And update device velocity for threshold
     And verify the bank velocity
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
     And update neuro id for automation approval
     And signed the picra and submit application
     Then Enter otp and validate
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
    
    
   
   
    
   
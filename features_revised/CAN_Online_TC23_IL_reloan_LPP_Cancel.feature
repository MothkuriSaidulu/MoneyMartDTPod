
##Scenario::Test case 67996: TS_61_Verify the Existing(Reloan) Customer IL Origination with LPP-Arrires Payment and cancel LPP
Feature: Online_existing_Reloan_IL_Approved_LPP_Cancel

  @ILreloanApproved
  Scenario: Online_existing_Reloan_IL_Approved_LPP_Cancel|TC_23_Reloan_LPP
 
     
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
    #And bank details 
    And bank details
    And Verify the loan documents
	
	 #Given User opens the chrome and launch online application
      #When User login online Application
      
    
     
   And Backdate loan and get make a payment button
  Then Make a full payment
 	#And user should logout from online application
 	
 	##SQLDB
 	And Backdate loan 180days 
 #Reloan_IL  
 
 
  Given User opens the chrome and launch online application
  When User login online Application 
   And update loan contract
   And customer chooses IL Jsy card 
   And select the without flinks option 
   And Verify the reloan income information 
   #And Verify the customer details and change the funding type
   #And select flink opt in
   #And select flink opt in jsy
   #And Verify the flinks income details and change the funding type
   And signed the picra and submit application
   #And signed the picra and submit application and authentication
   #And verify the funding screen and chosses the funding type
   #And Flinks bank details
    And upload document
    And verify the loan status and update loan status in DB
     And click on Finalize and e-Sign Loan Documents 
    And Verify the loan approved amount
   And chosses the either LPP yes or no
     #And bank details 
     And Verify the loan documents
    
   And verify the DB validatioin for reloan
    
    
   ###log file
   And Initialize Loan Details and write to excel
    And log all the Loan details in logger for investigation
	  And log all the Note details in logger for investigation
	  And log all payment details in logger for investigation
    And log all Transaction details in logger for investigation
    And log all EFTLog details in logger for investigation
    And log all ETransferLog details in logger for investigation
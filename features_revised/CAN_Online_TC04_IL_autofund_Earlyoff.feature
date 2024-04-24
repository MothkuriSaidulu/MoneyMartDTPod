#Scenario::Test case 60284: "TS_05_Online_Existing_Customer_IL_Approved_RepayCard on Funding screen and earlyPayoff from online
Feature: Online_IL_autofund_Repay_Earlyoff

  @ILreloanApproved
  Scenario: Online_IL_autofund_Repay_Earlyoff|TC_04_IL_autofund_earlyoff
 	
 	
 	###Given Genareted sin
     When user click on signup 
     #And Pre-requisite data generation for customer
     And Pre-requisite email and dob
     And verify the email threshold
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
      
     And verify the loan status and update loan status in DB
     
    And click on Finalize and e-Sign Loan Documents 
    And Verify the loan approved amount
 		And chosses the either LPP yes or no
     
     #And bank details 
    And continue in bank details
    And Verify the loan documents updated
	
	 #Given User opens the chrome and launch online application
    #When User login online Application
    # make a full payment
   And Backdate loan and get make a payment button
  Then Make a full payment
 	#And user should logout from online application
 	
 	##SQLDB
 	And Backdate loan 180days 
 		#Given User opens the chrome and launch online application
    #When User login online Application
    
   
 #Reloan_IL  
 
 
  #Given User opens the chrome and launch online application
  #When User login online Application 
   And update loan contract
   And customer chooses IL Jsy card 
   #And select the without flinks option 
   #And Verify the reloan income information 
   #And Verify the customer details and change the funding type
   #And select flink opt in
   And select flink opt in jsy
   And Verify the flinks income details and change the funding type
   #And signed the picra and submit application
   And signed the picra and submit application and authentication
   Then Enter otp and validate
   
   ##REVIEW
   #And verify the funding screen and chosses the funding type
   #And Flinks bank details
    #And upload document
    #And verify the loan status and update loan status in DB
     #And click on Finalize and e-Sign Loan Documents
     
   ##Auto FUND  
   And Verify the loan approved amount
   And chosses the either LPP yes or no
     #And bank details 
     And Verify the loan documents updated
    
   And verify the DB validatioin for reloan
   
   ### Make a full payment
  And Backdate loan and get make a payment button
  Then Make a full payment
    
    
   ###log file
   And Initialize Loan Details and write to excel
    And log all the Loan details in logger for investigation
	  And log all the Note details in logger for investigation
	  And log all payment details in logger for investigation
    And log all Transaction details in logger for investigation
    And log all EFTLog details in logger for investigation
    And log all ETransferLog details in logger for investigation
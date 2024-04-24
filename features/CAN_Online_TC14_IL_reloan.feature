##Scenario:: Test case 60312: TS_33_Online_ Existing Customer_Reloan_IL_EFT
Feature: Online_existing_Reloan_IL_Approved

  @ILreloanApproved
  Scenario: Online_existing_Reloan_IL_Approved|TC_14_Existing_ILReloan
  # Given Genareted sin
   #And Pre-requisite data generation for customer
  ## And verify the phonenumber threshold
   ##And Verify the address threshold and update address
   # Given user click on signup customer
   # When Create customer
    #And Run the TU query
    #And customer chooses IL loan
    #And User provides basic information
    #And select the flink consent
    #And Provides income information
    #And signed the picra and submit application
 # And verify the funding screen and chosses the funding type
  #   And add the bank details
   #  And upload document
    # And verify the loan status and update loan status in DB
     #And click on Finalize and e-Sign Loan Documents 
   # And Verify the loan approved amount
    #And chosses the either LPP yes or no
     #And bank details 
     #And Verify the loan documents
     #And verify the DB validatioin
   #And Backdate loan and get make a payment button
 #	Then Make a full payment
 	#And user should logout from online application
 	
 	##SQLDB
 	#And Backdate loan 180days
   
 #Reloan_IL  
   Given User opens the chrome and launch online application
   When User login online Application 
   And customer chooses IL Jsy card 
   And select the without flinks option 
   And Verify the reloan income information 
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
    
   And verify the DB validatioin for reloan
    
    
   ###log file
   And Initialize Loan Details and write to excel
    And log all the Loan details in logger for investigation
	  And log all the Note details in logger for investigation
	  And log all payment details in logger for investigation
    And log all Transaction details in logger for investigation
    And log all EFTLog details in logger for investigation
    And log all ETransferLog details in logger for investigation
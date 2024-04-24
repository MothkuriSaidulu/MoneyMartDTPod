
##scenario: Test Case 60310: TS_31_Online_Engaged Existing Customer_IL_e-Transfer_withdraw application in eSign pending status
Feature: Online_IL_existing_etransfer

  @ILApproved
  Scenario: Online_IL_existing_etransfer|TC_03_IL_existing
  Given Genareted sin
     Given user click on signup 
     And Pre-requisite data generation for customer
     And verify the email threshold
     When Enter all details and create account
     And verify the phonenumber threshold
   #  And Verify the address threshold and update address
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
    
    ##Rescind the Loan
    # And verify the dasboard and rescind loan
    # And verify the DB validatioin for rescind
   
   
   ###log file
   And Initialize Loan Details and write to excel
    And log all the Loan details in logger for investigation
	  And log all the Note details in logger for investigation
	  And log all payment details in logger for investigation
    And log all Transaction details in logger for investigation
    And log all EFTLog details in logger for investigation
    And log all ETransferLog details in logger for investigation
     
     
     
     
  # And Verify the phone OTP and enter valid OTP for autofund
     
   #And Verify the loan approved amount
   #And chosses the either LPP yes or no
   #And select the funding types
  
  #And add the bank details
   #And Verify the loan documents
  #And verify the DB validatioin
 # And verify the dasboard and rescind loan
  # And Backdate loan and get make a payment button
 # And customer chooses IL loan
  # And verify the existing customer details
   #And select the flink consent 
  # And Verify the  income information
   #And signed the picra and submit application
   
   #And Verify the phone OTP and enter valid OTP for autofund    comment aug 02 
   #And Verify the loan approved amount 
   
   
   ##   Manual flow steps added aug 02 2002 start
  #  And change the funding types
   #  And verify the bank details 
    #  And verify the loan status and update loan status in DB
     #And click on Finalize and e-Sign Loan Documents 
     #And Verify the loan approved amount
      ##   Manual flow steps added aug 02 2002 start
   #And chosses the either LPP yes or no
  # And change the funding types
   #And verify the bank details 
  #And Verify the loan documents 
   #And verify the DB validatioin for reloan
   
   ####
   # clikc on send email in core for etransfer password
   # approved the email from storm
    
    
    ###log file
   And Initialize Loan Details and write to excel
    And log all the Loan details in logger for investigation
	  And log all the Note details in logger for investigation
	  And log all payment details in logger for investigation
    And log all Transaction details in logger for investigation
    And log all EFTLog details in logger for investigation
    And log all ETransferLog details in logger for investigation
   
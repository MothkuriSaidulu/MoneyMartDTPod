#Scenario::Test case 60284: "TS_05_Online_Existing_Customer_IL_Approved_RepayCard on Funding screen and earlyPayoff from online
Feature: Online_IL_autofund_Repay_Earlyoff

  @ILApproved
  Scenario: Online_IL_autofund_Repay_Earlyoff|TC_04_IL_autofund_earlyoff
     Given Genareted sin
    Given user click on signup customer
    
     And Pre-requisite data generation for customer
    And verify the phonenumber threshold
    And Verify the address threshold and update address
    When Create customer
    And Run the TU query
    And customer chooses IL loan
    And User provides basic information
    And select the flink consent
    And Provides income information
    And signed the picra and submit application
   And Verify the phone OTP and enter valid OTP for autofund
   And Verify the loan approved amount
   And chosses the either LPP yes or no
   And select the funding types
   And add the bank details
   And Verify the loan documents
  And verify the DB validatioin
  And verify the funding screen and chosses the funding type
     And add the bank details
     And upload document
     And verify the loan status and update loan status in DB
     
     #  Given User opens the chrome and launch online application
  # When User login online Application 
     And click on Finalize and e-Sign Loan Documents 
    And Verify the loan approved amount
    And chosses the either LPP yes or no
     And bank details 
     And Verify the loan documents
     And verify the DB validatioin
     
     
   And Backdate loan 10days
   Then Make a full payment
   And verify the DB validatioin for reloan
  
    
   # #log file
   And Initialize Loan Details and write to excel
    And log all the Loan details in logger for investigation
	  And log all the Note details in logger for investigation
	  And log all payment details in logger for investigation
    And log all Transaction details in logger for investigation
    And log all EFTLog details in logger for investigation
    And log all ETransferLog details in logger for investigation
   
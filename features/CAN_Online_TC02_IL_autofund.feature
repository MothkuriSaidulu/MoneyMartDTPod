##Scenario:: Test case 60281: TS_02_Online_New_Customer_IL_Auto Funded after fruad hotlist approve_choose RepayCard funding
Feature: Online_IL_autofund_Repay

  @ILApproved
  Scenario: Online_IL_autofund_Repay|TC_02_IL_autofund
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
 #  And Verify the phone OTP and enter valid OTP for autofund
   #And Verify the loan approved amount
   #And chosses the either LPP yes or no
  # And select the funding types
  # And add the bank details
  # And Verify the loan documents
  #And verify the DB validatioin
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
    
    ###log file
   And Initialize Loan Details and write to excel
    And log all the Loan details in logger for investigation
	  And log all the Note details in logger for investigation
	  And log all payment details in logger for investigation
    And log all Transaction details in logger for investigation
    And log all EFTLog details in logger for investigation
    And log all ETransferLog details in logger for investigation
   
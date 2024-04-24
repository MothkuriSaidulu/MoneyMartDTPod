
##Scenario::Test case 67996: TS_61_Verify the Existing(Reloan) Customer IL Origination with LPP-Arrires Payment and cancel LPP
Feature: Online_existing_Reloan_IL_Approved_LPP_Cancel

  @ILreloanApproved
  Scenario: Online_existing_Reloan_IL_Approved_LPP_Cancel|TC_23_Reloan_LPP
   #Given Genareted sin
   Given user click on signup customer
    And Pre-requisite data generation for customer
    And verify the phonenumber threshold
    # And Verify the address threshold and update address
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
   And Backdate loan and get make a payment button
 	Then Make a full payment
   And Backdate loan 180days
   And customer chooses IL loan
   And verify the existing customer details
   And select the flink consent 
   And Verify the  income information
   And signed the picra and submit application
   And Verify the phone OTP and enter valid OTP for autofund  
   #And Verify the loan approved amount
   And chosses the either LPP yes or no
   And select the funding types
   And verify the bank details 
   And Verify the loan documents 
   And verify the DB validatioin for reloan
   
   And Make a LPP scheduler
    
    
   ###log file
   And Initialize Loan Details and write to excel
    And log all the Loan details in logger for investigation
	  And log all the Note details in logger for investigation
	  And log all payment details in logger for investigation
    And log all Transaction details in logger for investigation
    And log all EFTLog details in logger for investigation
    And log all ETransferLog details in logger for investigation
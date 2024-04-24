##Scenario::Test Case 60289: TS_10_Online_Existing_Customer_SPL_Approved_RepayCard on Final offer and Paid early from online_cool-off
Feature: CAN_Online_TC38_SPL_autofund_Earlyoff2

  @SPLApproved
  Scenario: Online_IL_autofund_Repay_Earlyoff|TC38_SPL_autofund_Earlyoff2
     Given Genareted sin
   Given user click on signup customer
    And Pre-requisite data generation for customer
    And verify the phonenumber threshold
    And Verify the address threshold and update address
    When Create customer
     And Run the TU query
    And customer chooses SPL loan
    And User provides basic information for spl
    And select the flink consent
    And Provides income information
    And signed the picra and submit application
   And  enter valid OTP
   And select the funding types
    And add the bank details
   And upload document
    And verify the loan status and update loan status in DB
   #And sign the customer
   And click on Finalize and e-Sign Loan Documents
   And Loan approval screen
   And Loan approved final offer
   And funding and payment confirmation
 And esing document SPL and back to dashboard 
     And verify the DB validatioin
  And verify the dasboard and rescind loan
   And Backdate loan 10days
   
   
   And update loan contract
   
   And customer chooses IL loan
   And verify the existing customer details
   And select the flink consent 
   And Verify the  income information
   And signed the picra and submit application
   #And Verify the phone OTP and enter valid OTP for autofund  
  # And Verify the loan approved amount
   #And chosses the either LPP yes or no
   # And change the funding types
   #And verify the bank details 
   #And Verify the loan documents
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
   And Backdate loan 10days
   Then Make a full payment
   And verify the DB validatioin for reloan
  
    
    ###log file
   And Initialize Loan Details and write to excel
    And log all the Loan details in logger for investigation
	  And log all the Note details in logger for investigation
	  And log all payment details in logger for investigation
    And log all Transaction details in logger for investigation
    And log all EFTLog details in logger for investigation
    And log all ETransferLog details in logger for investigation
   
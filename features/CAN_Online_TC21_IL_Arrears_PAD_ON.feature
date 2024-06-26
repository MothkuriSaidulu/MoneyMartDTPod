
##Scenario:: Test case 67994: TS_59_Verify the PAD ON/off when loan in arrears status
Feature: Online_IL_autofund_Arrears_PADON

  @ILApproved
  Scenario: Online_IL_autofund_Arrears_PADON|TC_21_Arrears_PadON
     Given Genareted sin
     Given user click on signup 
     And Pre-requisite data generation for customer
     And verify the email threshold
     When Enter all details and create account
     And verify the phonenumber threshold
     And Verify the address threshold and update address
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
    
     #######################
  ### Make a payment and return
  ##verify the arrears status in DB and EFT flag 
  ## verfiy the PAD ON/OFF button in UI 
   
   
   ###log file
   And Initialize Loan Details and write to excel
    And log all the Loan details in logger for investigation
	  And log all the Note details in logger for investigation
	  And log all payment details in logger for investigation
    And log all Transaction details in logger for investigation
    And log all EFTLog details in logger for investigation
    And log all ETransferLog details in logger for investigation
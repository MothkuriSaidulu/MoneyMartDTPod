
##Scenario:: Test case 75132: TS_63_Online_New Customer_IL_Manual review_Decline from CRM
Feature: Online_New Customer_IL_Review

  @ILApprovedd
  Scenario: Online_New Customer_IL_Review|TC_24_ILCRM_Review
     Given Genareted sin
     Given user click on signup 
      And Pre-requisite data generation for customer
     And verify the phonenumber threshold
      #And Verify the address threshold and update address
    When Enter all details and create account
    And Run the TU query
    And customer chooses IL loan
    And User provides basic information
    And select the flink consent
    And Provides income information
    And signed the picra and submit application
   And verify the funding screen and chosses the funding type
   And add the bank details
   And upload document
    And verify the DB validatioin
    
    ##########
    # Denied loan from crm
    #verify the UI and DB
  
   
   ###log file
   And Initialize Loan Details and write to excel
    And log all the Loan details in logger for investigation
	  And log all the Note details in logger for investigation
	  And log all payment details in logger for investigation
   
    
   
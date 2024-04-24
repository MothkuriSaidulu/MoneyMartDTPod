##Scenario: Online_Get_OTP.

Feature: Online_Get_OTP

  @ILApprovedd
  Scenario: Online_Get_OTP|TC_OTP
    
     Given lunch otp url 
     Then Get otp
     Then Enter otp and validate
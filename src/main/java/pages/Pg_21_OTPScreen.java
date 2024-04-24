package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import actions.OnlineActions;
import driver.TestBase;
import sqlUtils.MsSqlUtility;

public class Pg_21_OTPScreen extends OnlineActions{

	//WebDriver driver;
	public Pg_21_OTPScreen(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}


	
	//Home page	
	
	//a[normalize-space()='Loans']
	@FindBy (how=How.XPATH, using = "//h1[normalize-space()='Verify your mobile number']")
	public static WebElement otp_header;
	
	@FindBy (how=How.XPATH, using = "//button[normalize-space()='Send Verification Code']")
	public static WebElement otp_sent;
	
	
	@FindBy (how=How.XPATH, using = "//button[normalize-space()='Validate']")
	public static WebElement otp_validate;
	
	//input[1]
	
	public void TypeInField(String xpath, String value) throws InterruptedException{
	    String xpathFull="//input[1]";
		String val = value; 
	    WebElement element = getDriver().findElement(By.xpath(xpathFull));
	    element.clear();

	    for (int i = 0; i < val.length(); i++){
	    	 WebElement elementonebyonecharacter = getDriver().findElement(By.xpath(xpath+(i+1)+"]"));
	        char c = val.charAt(i);
	        String s = new StringBuilder().append(c).toString();
	        elementonebyonecharacter.sendKeys(s);
	        Thread.sleep(400);
	    }       
	}
	
	
	@FindBy (how=How.XPATH, using = "//input[1]")
	public static WebElement otp_input;

	public void enter_otp() throws Exception
	{
	
		VerifyText_For_PageCaption(otp_header, "Verify your mobile number", "Basic Info Page, Hence Passed");
		
		waitForElementToBeVisible(otp_sent, "WaitVisibleOfCallMe");
		if(otp_sent.isDisplayed()) {
		
		click(otp_sent,"call to opt");
		}
		
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println("enter vaild phone number ");
		Thread.sleep(5000);
		
		
		MsSqlUtility obj=new MsSqlUtility();
		obj.getDbConnection2();
		String opt=obj.getOnlineOTP( getMapData.get("eMail"));
		System.out.println("OTP number:: "+opt);
		
		//EnterText(otp_input, opt, "enter opt"); //Commented on 11-Dec-2023
		TypeInField("//input[", opt); //Added on 11-Dec-2023
		
		
		waitForElementToBeVisible(otp_validate, "WaitVisibleOfotpfailmessage");
		click(otp_validate,"verified phone number");
		//Thread.sleep(5000); Commented on 09-Jan-2024 Revised
	
}
}

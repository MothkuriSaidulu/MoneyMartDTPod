package pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import actions.OnlineActions;
import driver.TestBase;

public class Pg_01_OTP extends OnlineActions{

	//WebDriver driver;
	public Pg_01_OTP(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}


	
	//Home page	
	

	
	@FindBy (how=How.XPATH, using = "//h2[normalize-space()='+12267834990']")
	public static WebElement txt_phonenumber;
	
	
	@FindBy (how=How.XPATH, using = "//a[normalize-space()='Refresh to view latest SMS']")
	public static WebElement btm_refresh;
	
	@FindBy (how=How.XPATH, using = "//p[contains(text(),'MoneyMart - Use this 6-digit to verify you')]")
	public static WebElement msg_page;
	
	@FindBy (how=How.XPATH, using = "//p[contains(text(),'MoneyMart - Use this 6-digit to verify you')]")
	public static List<WebElement> list_msg_page;
	
	public void getOtp() throws Exception
	{
		Thread.sleep(3000);
		waitForElementToBeVisible(txt_phonenumber,"wait phone number load displayed");
		
		String phonenumber=txt_phonenumber.getText();
		
		System.out.println("phone number::"+phonenumber);
		
		Thread.sleep(2000);
		
		//waitForElementToBeVisible(btm_refresh,"click on refresh");
		
		TestBase.getDriver().navigate().refresh();
		
		//click(btm_refresh,"Cash Advance loan link");
		
		if(list_msg_page.size()>0)
		{
		String message=msg_page.getText();
		
		System.out.println("phone number::"+message);
		String str1=message.substring(0,6);
		//System.out.println("Page name:::"+str1);
		//String finalamount=str1;
		System.out.println(str1);
		
		datatable.setCellDataForTestData_online(testCaseName, "OTP", 1, str1);
		
		//int amount = Integer.parseInt(finalamount.replace(",", ""));
		
		
		}
		
		
}
}
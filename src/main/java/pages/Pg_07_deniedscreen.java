package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import actions.OnlineActions;
import driver.TestBase;

public class Pg_07_deniedscreen extends OnlineActions {

	public Pg_07_deniedscreen(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}


	
	@FindBy (how=How.XPATH, using = "//div[@class='text-bold font-size2-8 line-height-4 ml-1 mb-2']")
	public static WebElement denied_valid;
	@FindBy (how=How.XPATH, using = "//p[@class='mm-radio-group__title']")
	public static WebElement no_thanks;
	
	@FindBy (how=How.XPATH, using = "//i[@class='mm-icon mm-icon--person mm-header__user-icon']")
	public static WebElement profile_icon;
	
	@FindBy (how=How.XPATH, using = "//a[normalize-space()='Back to Dashboard']")
	public static WebElement dashboard;
	
	
	
	public void deniedscreen() throws Exception
	{
		Thread.sleep(10000);
		//String denied_msg=denied_valid.getText();
		//System.out.println(denied_msg);
			
		//VerifyText_For_PageCaption(denied_msg, "We're sorry, we can't approve your Installment Loan right now", "Basic Info Page, Hence Passed");
		//Thread.sleep(3000);
		TestBase.bindreport(currentGlobalScenarioName, "denial page");
		no_thanks.isDisplayed();
		waitForElementToBeClickable(no_thanks,"no thanks");
		
		click(no_thanks,"no thanks"); 
		
		//((JavascriptExecutor)getDriver()).executeScript("arguments[0].click();",no_thanks);
		
		//Actions actions = new Actions(getDriver());
	//actions.moveToElement(no_thanks).build().perform();
	//actions.click().build().perform();
		
		
		//click(profile_icon,"Click on profile icon in loan denied screen"); 
		
		//click(dashboard,"Click on dashboard  in loan denied screen"); 
		
//		waitForElementToBeClickable(no_thanks,"no thanks");
//		
//		Thread.sleep(5000);
////		click(no_thanks,"no thanks"); 
////		Thread.sleep(5000);
//		
//		Actions actions = new Actions(getDriver());
//		actions.moveToElement(no_thanks).click().build().perform();
//		
		
		// Assume driver is a valid WebDriver instance that
//		// has been properly instantiated elsewhere.
//		//WebElement element = denied_valid;
//		JavascriptExecutor executor = (JavascriptExecutor)getDriver();;
//		executor.executeScript("arguments[0].click();", denied_valid);    
//		//denied_valid.click();
	}
	
	
	}

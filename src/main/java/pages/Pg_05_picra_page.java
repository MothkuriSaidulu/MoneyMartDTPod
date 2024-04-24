package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import actions.OnlineActions;
import driver.TestBase;

public class Pg_05_picra_page extends OnlineActions {

	public Pg_05_picra_page(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}


	
	@FindBy (how=How.XPATH, using = "//span[@class='mm-checkbox__box']")
	public static WebElement PICRA_checkbox;
	
	@FindBy (how=How.XPATH, using = "//button[@id='gs-accept']")
	public static WebElement agree_button;
	
	@FindBy (how=How.XPATH, using = "//button[text()='Agree and Continue']")
	public static WebElement agreepop_button;
	@FindBy (how=How.XPATH, using = "//button[text()='Agree and Continue']")
	public static List<WebElement> agreepop_buttonlist;
	
	@FindBy (how=How.XPATH, using = "//div[text()='Thank you!']")
	public static List<WebElement> agreepop_thanspop;
	
	@FindBy (how=How.XPATH, using = "//div[text()='Thank you!']")
	public static WebElement agreepop_thankstxt;
	
	@FindBy (how=How.XPATH, using = "//div[text()='Your authentication was successful.']")
	public static WebElement agreepop_authenicationtxt;
	
	@FindBy (how=How.XPATH, using = "//button[text()='Continue Application']")
	public static WebElement button_continue;
	
	public void picra_details() throws Exception
	{
		
		//added 21 july 2022 start
		if (agreepop_buttonlist.size()>0)
		{
			click(agreepop_button,"agree button "); 
		}
		//added 21 july 2022 end
		click(PICRA_checkbox,"PICRA_checkbox"); 
		
		TestBase.bindreport(currentGlobalScenarioName, "picra details");
		
		click(agree_button,"agree button "); 
		
		Thread.sleep(8000);
		
		
		
		
	}
	//add on 04 26 start revised
	public void picra_details_autofund() throws Exception
	{
		
		//added 21 july 2022 start
		if (agreepop_buttonlist.size()>0)
		{
			click(agreepop_button,"agree button "); 
		}
		//added 21 july 2022 end
		click(PICRA_checkbox,"PICRA_checkbox"); 
		
		TestBase.bindreport(currentGlobalScenarioName, "picra details");
		
		click(agree_button,"agree button "); 
		
		Thread.sleep(8000);
		
		if(agreepop_thanspop.size()>0)
		{
		waitForElementToBeVisible(agreepop_thankstxt, "authentication message");	
		
		waitForElementToBeVisible(agreepop_authenicationtxt, "authentication message");
		
		click(button_continue, "continue in authentication pop-up message");
		}
		
	}
	//add on 04 26 end revised
	}

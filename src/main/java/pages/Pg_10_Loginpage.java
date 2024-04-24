package pages;

import java.util.List;
import java.util.TreeMap;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


import actions.OnlineActions;
import driver.TestBase;
import excelutils.Xls_Reader;
import utils.UtilityMethods;



public class Pg_10_Loginpage extends OnlineActions {

	public Pg_10_Loginpage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}


	//Set Password

	@FindBy (how=How.XPATH, using = "//span[@class='text underline']")
	public static WebElement sigin_link;
	
	@FindBy (how=How.XPATH, using = "//h1[normalize-space()='Sign in to Money Mart']")
	public static WebElement Caption_page;

	@FindBy (how=How.XPATH, using = "//input[@name='email']")
	public static WebElement Email_id;

	@FindBy (how=How.XPATH, using = "//input[@name='password']")
	public static WebElement Password;

	@FindBy (how=How.XPATH, using = "//button[normalize-space()='Sign In']")
	public static WebElement btn_sigin;
	
	//Reloan
	@FindBy (how=How.XPATH, using = "//h2[normalize-space()='Sign In']")
	public static WebElement text_caption;
	


	public void sigin_application() throws Exception
	{
		
		
		waitForElementToBeClickable(sigin_link, "Sing link");
		click(sigin_link, "Sing link");
		
		waitForElementToBeVisible(Caption_page, "Page text");
		
		EnterText(Email_id, getMapData.get("eMail"), "Email id");
		
		EnterText(Password, getMapData.get("Password"), "Password");
		
		
		waitForElementToBeClickable(btn_sigin, "sigin button");
		
		click(btn_sigin, "button");
		
	}

	public void sigin_application_reloan() throws Exception
	{
		
		

		waitForElementToBeVisible(text_caption, "text");
	
		
		EnterText(Password, getMapData.get("pwd"), "Password");
		
		
		waitForElementToBeClickable(btn_sigin, "sigin button");
		
		click(btn_sigin, "button");
		
	}
	
	

}

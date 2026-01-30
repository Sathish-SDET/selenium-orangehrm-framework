package tests;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import utils.TestListener;

@Listeners(TestListener.class) 
public class LoginTest extends BaseTest
{
	LoginPage loginPage;
	@BeforeMethod
	public void setupTest() throws InterruptedException
	{
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(5000);
		loginPage = new LoginPage(driver);
	}
	
//	@Test
//		public void openLoginPage() 
//		{
//			driver.get("https://opensource-demo.orangehrmlive.com/");	//To open the website																		
//		}
	
	@Test
	public void validLogin() 
	{
		loginPage.login("Admin", "admin123"); 						//Calling loginpage using LoginPage object to login 
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		wait.until(ExpectedConditions.urlContains("dashboard"));

		Assert.assertTrue(
		    driver.getCurrentUrl().contains("dashboard"),
		    "Dashboard page is not loaded"
		);
		//Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"), "Dashboard page is not loaded");
	}
	
	@Test
	public void invalidLogin() 
	{
		loginPage.login("Admin", "wrongpassword"); 					//Calling loginpage using LoginPage object to login with Invalid creds
		Assert.assertTrue(driver.getCurrentUrl().contains("auth"), "User should not be logged in"); 
	}
	
	@Test
	public void testFailure() throws InterruptedException
	{
		loginPage.login("Admin", "wrongpassword"); 					//Calling loginpage using LoginPage object to login with Invalid creds
		Assert.assertFalse(driver.getCurrentUrl().contains("dashboard"), "Forcing failure to test Screenshot"); 
	}
	
}

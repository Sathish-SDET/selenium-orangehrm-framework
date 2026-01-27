package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{
	WebDriver driver;
	
	//Locators
	By username = By.name("username");
	By password = By.name("password");
	By loginBtn = By.xpath("//button[@type='submit']");
	
	//Constructor
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//Actions
	public void enterusername(String user)
	{		driver.findElement(username).sendKeys(user); 	   }
	public void enterpassword(String pass)
	{		driver.findElement(password).sendKeys(pass); 	   }
	public void clickLogin()
	{		driver.findElement(loginBtn).click();	   }
	
	//Business Method
	public void login(String user, String pass)
	{
		enterusername(user);
		enterpassword(pass);
		clickLogin();
	}
	
	
	
}

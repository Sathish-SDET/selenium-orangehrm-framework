package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest 
{
	public WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		ChromeOptions options = new ChromeOptions(); // Below are the code to run in headless mode for CI
		options.addArguments("--headless=new");
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-dev-shm-usage");
		options.addArguments("--window-size=1920,1080");
		
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	
//	@AfterMethod
//	public void tearDown() 
//	{
//		driver.quit();
//	}

}

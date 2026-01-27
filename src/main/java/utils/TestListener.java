package utils;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import base.BaseTest;

public class TestListener implements ITestListener 
{
	@Override
	public void onTestFailure (ITestResult result)
	{	
		System.out.println(">> Test Failed. Taking Screenshot <<");
		WebDriver driver = ((BaseTest) result.getInstance()).driver;
		try 
		{
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src,new File("screenshots"+result.getName()+".png"));
		} 
		catch (Exception e)
		{
			e.printStackTrace();	
		}
	}
}

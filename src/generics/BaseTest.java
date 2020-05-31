package generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pom.POMActitimeLoginPage;

public class BaseTest 
{
	public WebDriver driver;
	
	@BeforeMethod
	public void openApp()
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com");
		
		POMActitimeLoginPage login = new POMActitimeLoginPage(driver);
		login.loginMethod();
		
	}
	
	@AfterMethod
	public void closeApp()
	{
		//driver.quit();
	}
	
	@BeforeClass
	public void startExecution()
	{
		Reporter.log(" execution started",true);
	}
	
	@AfterClass
	public void stopExecution()
	{
		Reporter.log(" execution stopped",true);
	}
}

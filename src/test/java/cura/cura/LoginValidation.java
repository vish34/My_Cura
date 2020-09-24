package cura.cura;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginValidation {
	
	WebDriver d;
	
	@BeforeClass
	@Parameters({"browser","url"})
	public void setUp(String browser, String url)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
			d = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "E:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			d = new FirefoxDriver();
		}
		
		d.get(url);
		d.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		d.manage().window().maximize();
	}
	
	@Test
	public void clickButton() throws InterruptedException
	{
		LoginPage lp = new LoginPage(d);
		lp.userName();
		lp.passWord();
		lp.loginButton();
		Thread.sleep(5000);
	}
	
	@AfterClass
	public void tearDown()
	{
		d.quit();
	}

}

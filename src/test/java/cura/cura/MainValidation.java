package cura.cura;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MainValidation {

WebDriver d;
	

	@BeforeMethod
	@Parameters({"browser","url"})
	public void setUp(String browser, String url)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
			d = new ChromeDriver();
			d.manage().window().maximize();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "E:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			d = new FirefoxDriver();
		}
		
		d.get(url);
		d.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		d.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		d.manage().window().maximize();
	}
	
	
	@Test(priority=1)
	public void appointButtonValidation()
	{
		MainPage mp1 = new MainPage(d);
		mp1.clickOnAppointmentButton();
		
		d.navigate().back();
		d.navigate().refresh();
	}
	
	
	@Test(priority=2)
	public void barsValidation()
	{
		MainPage mp1 = new MainPage(d);
		mp1.barClick();
		
		MainPage mp3 = new MainPage(d);
		mp3.barClick();
		
	}
	
	
	@Test(priority=3)
	public void linksValidation()
	{
		//Facebook link
				MainPage mp1 = new MainPage(d);
				mp1.faceBook();
				
				JavascriptExecutor js1 = (JavascriptExecutor)d;
				js1.executeScript("window.scrollBy(0,300)");
		
		//Twitter link
				MainPage mp2 = new MainPage(d);
				mp2.twitterLink();
				
				JavascriptExecutor js2 = (JavascriptExecutor)d;
				js2.executeScript("window.scrollBy(0,300)");
				
		//Football link
				MainPage mp3 = new MainPage(d);
				mp3.footBall();
				
				JavascriptExecutor js3 = (JavascriptExecutor)d;
				js3.executeScript("window.scrollBy(0,300)");
				
		//Email link
				MainPage mp4 = new MainPage(d);
				mp4.clickOnEmail();
	}
	
		
	@AfterMethod
	public void tearDown()
	{
		d.quit();
	}
	
}

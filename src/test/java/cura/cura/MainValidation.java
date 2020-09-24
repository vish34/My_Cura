package cura.cura;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MainValidation {

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
		MainPage mp1 = new MainPage(d);
		mp1.faceBook();
		
		JavascriptExecutor js1 = (JavascriptExecutor)d;
		js1.executeScript("window.scrollBy(0,300)");
		Thread.sleep(5000);
		
		MainPage mp2 = new MainPage(d);
		mp2.twitterLink();
		
		JavascriptExecutor js2 = (JavascriptExecutor)d;
		js2.executeScript("window.scrollBy(0,300)");
		Thread.sleep(5000);
		
		MainPage mp3 = new MainPage(d);
		mp3.footBall();
		
		JavascriptExecutor js3 = (JavascriptExecutor)d;
		js3.executeScript("window.scrollBy(0,300)");
		Thread.sleep(5000);
		
//		JavascriptExecutor js4 = (JavascriptExecutor)d;
//		js4.executeScript("window.scrollTo(300,0)");
//		Thread.sleep(5000);
		
		MainPage mp4 = new MainPage(d);
		mp4.scrollUp();
		Thread.sleep(5000);
		
		MainPage mp5 = new MainPage(d);
		mp5.barClick();
		Thread.sleep(5000);
		
		MainPage mp6 = new MainPage(d);
		mp6.barClick();
		Thread.sleep(5000);
		
		MainPage mp7 = new MainPage(d);
		mp7.appointButton();
		Thread.sleep(5000);

	}
	
	@AfterClass
	public void tearDown()
	{
		d.quit();
	}
}

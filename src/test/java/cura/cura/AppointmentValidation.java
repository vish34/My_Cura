package cura.cura;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AppointmentValidation {
	
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
		d.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		d.manage().window().maximize();
	}
	
	
	
	@Test
	public void appointmentValidations() throws InterruptedException
	{
//		Click on Make Appointment
		AppointmentPage ap = new AppointmentPage(d);
		ap.clickOnAppointmentButton();
		
		
//		Enter Login credentials
		ap.userName();
		ap.passWord();
		ap.loginButton();
	
		
//		Book your appointment
		WebElement facility = d.findElement(By.xpath("//select[@id=\"combo_facility\"]"));
		Select s = new Select(facility);
		s.selectByVisibleText("Seoul CURA Healthcare Center");
		
//		ap.selectFacility();
//		Thread.sleep(5000);
//		ap.selectOptions();
		
		ap.selectCheckBox();
		
		ap.selectRadioButton();
		
		ap.selectDate();
		
	}
	
	
	
	@AfterClass
	public void tearDown()
	{
		d.quit();
	}

}

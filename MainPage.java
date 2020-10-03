package com.cura.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.crm.qa.base.TestBase;

public class MainPage extends TestBase{

	@FindBy(xpath="//a [@id=\"btn-make-appointment\"]")
	 WebElement MakeAppointment;
	@FindBy(xpath="//a [@id=\"menu-toggle\"]")
	WebElement Bar;
	@FindBy(xpath="//a [@href=\"mailto:info@katalon.com\"]")
	WebElement Mail;
	@FindBy(xpath="//i[@class=\"fa fa-facebook fa-fw fa-3x\"]")
	WebElement Facebook;
	@FindBy(xpath="//i[@class=\"fa fa-twitter fa-fw fa-3x\"]")
	WebElement twitter;
	@FindBy(xpath="//i[@class=\"fa fa-dribbble fa-fw fa-3x\"]")
	WebElement Web;
	
	public MainPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

		// Initializing the Page Objects:
		public void HomePage() {
			PageFactory.initElements(driver, this);
		}
		
		public String verifyHomePageTitle(){
			return driver.getTitle();
		}
		
		public boolean MakeAppointment() {
			 return MakeAppointment.isDisplayed();
		}
		public boolean mail() {
			return Mail.isDisplayed();
		}
		public boolean bar() {
			return Bar.isDisplayed();
		}
		public boolean facebook() {
			return Facebook.isDisplayed();
		}
		
		public boolean twitter() {
			return twitter.isDisplayed();
		}
		public boolean Web() {
			return Web.isDisplayed();
		}
		
	
}

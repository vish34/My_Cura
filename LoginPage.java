package com.cura.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;

public class LoginPage extends TestBase{

	
	@FindBy(xpath="(//input [@type=\"text\"] )[3]")
     WebElement Username; 
	@FindBy (xpath= "//input[@type=\\\"password\\\"]")
	  WebElement Password;
	@FindBy(xpath= "//button [@id=\\\"btn-login\\\"]\"")
	 WebElement LoginButton;

	// Initializing the Page Objects:
			public void HomePage() {
				PageFactory.initElements(driver, this);
				}
				
				public HomePage login(String un, String pwd){
					Username.sendKeys(un);
					Password.sendKeys(pwd);
					LoginButton.click();
					    	JavascriptExecutor js = (JavascriptExecutor)driver;
					    	js.executeScript("arguments[0].click();", LoginButton);
					    	
					return new HomePage();	
			}
			

}

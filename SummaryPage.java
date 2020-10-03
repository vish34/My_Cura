package com.cura.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class SummaryPage extends TestBase {
	
	@FindBy(xpath= "//a[@class=\\\"btn btn-default\\\"]")
	WebElement GotoHomepage;
	
	
	// Initializing the Page Objects:
				public void HomePage() {
					PageFactory.initElements(driver, this);	
				}
				
				public void gotohomepage() {
					GotoHomepage.click();
				}

	
}

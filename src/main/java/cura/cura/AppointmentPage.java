package cura.cura;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AppointmentPage {
	
	WebDriver d;

	@FindBy(linkText="Make Appointment") private WebElement appointmentButton;
	
	
	public AppointmentPage(WebDriver d)
	{
		PageFactory.initElements(d, this);
	}
	
	
	public void appointButton()
	{
		appointmentButton.click();
	}
	
}

package cura.cura;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppointmentPage {
	
	WebDriver d;

	@FindBy(linkText="Make Appointment") private WebElement appointmentButton;
	
	@FindBy(xpath="//input[@id=\"txt-username\"]") private WebElement UN;
	
	@FindBy(xpath="//input[@id=\"txt-password\"]") private WebElement Pwd;
	
	@FindBy(xpath="//button[@id=\"btn-login\"]") private WebElement Login;
	
//	@FindBy(xpath="//select[@id=\"combo_facility\"]") private WebElement facility;
//	@FindBy(xpath="//option[text()=\"Seoul CURA Healthcare Center\"]") private WebElement option;
	@FindBy(xpath="//input[@id=\"chk_hospotal_readmission\"]") private WebElement checkBox;
	@FindBy(xpath="//input[@id=\"radio_program_none\"]") private WebElement radioButton;
	@FindBy(xpath="//input[@id=\"txt_visit_date\"]") private WebElement date;
	
	
	public AppointmentPage(WebDriver d)
	{
		PageFactory.initElements(d, this);
	}
	
	
	public void clickOnAppointmentButton()
	{
		appointmentButton.click();
	}
	
	public void userName()
	{
		UN.clear();
		UN.sendKeys("John Doe");
	}
	
	public void passWord()
	{
		Pwd.clear();
		Pwd.sendKeys("ThisIsNotAPassword");
	}
	
	public void loginButton()
	{
		Login.click();
	}
	
//	public void selectFacility()
//	{
//		facility.click();
//	}
//	
//	public void selectOptions()
//	{
//		option.click();
//	}
	
	public void selectCheckBox()
	{
		checkBox.click();
	}
	
	public void selectRadioButton()
	{
		radioButton.click();
	}
	
	public void selectDate()
	{
		date.click();
	}
	
}

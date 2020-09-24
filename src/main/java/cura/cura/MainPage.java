package cura.cura;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

	WebDriver d;
	
	@FindBy(xpath="//i[@class=\"fa fa-facebook fa-fw fa-3x\"]") private WebElement facebook;
	@FindBy(xpath="//i[@class=\"fa fa-twitter fa-fw fa-3x\"]") private WebElement twitter;
	@FindBy(xpath="//i[@class=\"fa fa-dribbble fa-fw fa-3x\"]") private WebElement football;
	
	@FindBy(xpath="//i[@class=\"fa fa-chevron-up fa-fw fa-1x\"]") private WebElement scroll;
	
	@FindBy(xpath="//i[@class=\"fa fa-bars\"]") private WebElement bars;

	@FindBy(linkText="Make Appointment") private WebElement appointmentButton;
	
	//Remaining link, inside bar home and login
	
	public MainPage(WebDriver d)
	{
		PageFactory.initElements(d, this);
	}
	
	public void faceBook()
	{
		facebook.click();
	}
	
	public void twitterLink()
	{
		twitter.click();
	}
	
	public void footBall()
	{
		football.click();
	}
	
	public void scrollUp()
	{
		scroll.click();
	}
	
	public void barClick()
	{
		bars.click();
	}
	
	public void appointButton()
	{
		appointmentButton.click();
	}
	
	
}

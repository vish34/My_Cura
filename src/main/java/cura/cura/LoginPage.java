package cura.cura;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver d;
	
	@FindBy(xpath="//input[@id=\"txt-username\"]") private WebElement UN;
	@FindBy(xpath="//input[@id=\"txt-password\"]") private WebElement Pwd;
	@FindBy(xpath="//button[@id=\"btn-login\"]") private WebElement Login;

	
	public LoginPage(WebDriver d)
	{
		PageFactory.initElements(d, this);
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

}

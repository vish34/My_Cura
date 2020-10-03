package com.cura.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class AppointmentPage extends TestBase {

	
	@FindBy(xpath= "//select[@id =\"combo_facility\"]")
	  WebElement Facility;
	@FindBy (xpath=" //option [@value =\\\"Tokyo CURA Healthcare Center\\\"]")
	  WebElement Options;
	@FindBy(xpath= " //input [@type =\\\"checkbox\\\"]")
	  WebElement CheckBox;
	@FindBy(xpath=" //label[@class=\\\"radio-inline\\\"]")
	  WebElement RadioButton ;
	@FindBy(xpath= " //input[@id=\\\"txt_visit_date\\\"]")
	  WebElement VisitDate;
	@FindBy (xpath= "//textarea[@id=\\\"txt_comment\\\"]")
	  WebElement Comment;
	@FindBy (xpath= " //button[@id=\\\"btn-book-appointment\\\"]")
	  WebElement BookAppointment;
	
	

	// Initializing the Page Objects:
			public void HomePage() {
				PageFactory.initElements(driver, this);
				}
				
			public void facility() {
				Select f = new Select(Facility);
				f.selectByValue("Tokyo CURA Healthcare Center");
				Facility.click();
			}
			
			public void checkbox() {
				CheckBox.click();
			}
			
			public void radiobtn() {
				RadioButton.click();
			}
			
			public void visitdate() {
				Select d = new Select(VisitDate);
			    d.selectByValue("29");
				VisitDate.click();
			}
	
		   public void comment() {
			   Comment.sendKeys("Jhon Deo appointment."); 
		   }
		   public void bookappointment() {
			   BookAppointment.click();
		   }
			
	
	
}




package com.selenium.objects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertAssin {
	
	WebDriver driver;
	
	@FindBy (xpath ="//button[@type=\"button\"]")
	WebElement Alert_CheckBox;
   
	public AlertAssin(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	public void ClickAlert() {
		Alert_CheckBox.click();
		
		 Alert alert = driver.switchTo().alert();
		    alert.accept();
	}
}

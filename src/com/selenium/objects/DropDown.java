package com.selenium.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DropDown {
	
	WebDriver driver;
	
	@FindBy(xpath ="//input[@type=\"checkbox\"]")
	WebElement Single_CheckBox;
	
	@FindBy(xpath ="//input[@value=\"check all\"]")
	WebElement CheckAll_CheckBox;
	
	public DropDown(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

	public void SelectDropDown() {
		
		Single_CheckBox.click();
		
		CheckAll_CheckBox.click();
		
	}
}

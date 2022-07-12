package com.selenium.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CheckBox {
	
	WebDriver driver;
	
	@FindBy(xpath ="//select[@id='select-demo']" )
	WebElement Select_SingleBox;
	
    @FindBy(xpath ="//select[@name=\"States\"]")
    WebElement Select_Multibox;
    
    @FindBy(xpath ="//button[@id='printMe']")
    WebElement Frist_Selected;
    
    @FindBy(xpath="//button[@id=\"printAll\"]")
    WebElement All_Selected;
    
    public CheckBox(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
    
    public void FillCheckBox() {
    	Select selectSingle = new Select(Select_SingleBox);
    	selectSingle.selectByVisibleText("Monday");		
    	
    	Select selectMulti = new Select(Select_Multibox); 
    	selectMulti.selectByVisibleText("California");
    	
    	Frist_Selected.click();
    	
    	Select selectMulti1 = new Select(Select_Multibox); 
    	selectMulti1.selectByVisibleText("Texas");
    	
    	All_Selected.click();
    	
    	
    	
    	
    }
}

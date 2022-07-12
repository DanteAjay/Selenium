package com.selenium.objects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InputFormSubmit {


	WebDriver driver;

	@FindBy(xpath = "//input[@id='name']")
	WebElement text_Name;

	@FindBy(xpath = "//input[@name='email']")
	WebElement text_Email;

	@FindBy(xpath = "//input[@name='password']")
	WebElement text_Password;

	@FindBy(xpath = "//input[@name='company']")
	WebElement text_Company;

	@FindBy(xpath = "//input[@name='website']")
	WebElement text_Website;

	@FindBy(xpath = "//select[@name='country']")
	WebElement list_Country;

	@FindBy(id = "inputCity")
	WebElement text_City;

	@FindBy(id = "inputAddress1")
	WebElement text_AddressOne;

	@FindBy(id = "inputAddress2")
	WebElement text_AddressTwo;

	@FindBy(id = "inputState")
	WebElement text_State;

	@FindBy(id = "inputZip")
	WebElement text_ZipCode;

	@FindBy(xpath = "//button[text()='Submit']")
	WebElement btn_Submit;

	@FindBy(xpath = "//p[@class='success-msg hidden']")
	WebElement label_SuccessMsg;

	public InputFormSubmit(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void fillInputForm() {
		//setValueForTextField(text_Name, "Name Java");
		text_Name.sendKeys("java");

		System.out.println(text_Name.getAttribute("value"));

		text_Email.sendKeys("java@email.com");
		text_Password.sendKeys("java123");
		text_Company.sendKeys("Java");
		text_Website.sendKeys("java.com");

		Select select = new Select(list_Country);
		select.selectByVisibleText("Argentina");

		text_City.sendKeys("city");
		text_AddressOne.sendKeys("Address one");
		text_AddressTwo.sendKeys("Address two");
		text_State.sendKeys("state");
		text_ZipCode.sendKeys("123456");

		btn_Submit.click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(label_SuccessMsg));

		System.out.println("Submitted the form Successfully");

		System.out.println(label_SuccessMsg.getText());


	}
}


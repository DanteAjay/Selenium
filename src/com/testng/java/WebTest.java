package com.testng.java;

import java.util.List;

import org.testng.annotations.Test;

import com.selenium.objects.AlertAssin;
import com.selenium.objects.CheckBox;
import com.selenium.objects.DropDown;
import com.selenium.objects.InputFormSubmit;

public class WebTest extends TestNGAnnotations{
	@Test
	public void one() {
		System.out.println("Udacity Test");
		driver.get("https://www.lambdatest.com/selenium-playground/javascript-alert-box-demo");	
		driver.manage().window().maximize(); 
		AlertAssin forms = new AlertAssin(driver);
		forms.ClickAlert();
	}
	/*@Test(dataProvider = "testData")
	public void displayTestdata(List<String> listFruits) {
		System.out.println(listFruits);
	}*/
}

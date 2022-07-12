package com.testng.java;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

public class TestNGAnnotations {
	WebDriver driver;

	@BeforeSuite
	public void beforeSuiteAnnotation() {
		//System.out.println("Before suite annotation");
		// Driver path is set in before suite, since driver path is constant for all @Test
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
	}


	@BeforeMethod
	public void beforeMethodAnnotation() {
		System.out.println("Before method annotation");
		//System.out.println("Before method Browser is " + browser);
		//System.out.println("New Chromer Driver is initalized");
		// Driver is initialized in before Method since each @Test need new driver
		driver = new ChromeDriver(); 

	}

	@AfterMethod
	public void afterMethodAnnotation() {
		System.out.println("After method annotation");
		//System.out.println("Driver Quit");
		//driver.quit(); // driver object deleted
	}

	/*@DataProvider(name = "testData")
	public Object[][] data() {
		Object [][] arr = new Object[3][1];

		List<String> list1 = new ArrayList<String>(); 
		list1.add("Mango");
		list1.add("Apple");
		list1.add("Banana");
		list1.add("Grapes");
		
		arr[0][0] = list1;

		// add a list in row 2
		List<String> list2 = new ArrayList<String>(); 
		list2.add("Pomo");
		list2.add("Kiwi");
		list2.add("Jack");
		list2.add("Mango");
		
		arr[1][0] = list2;
		
		List<String> list3 = new ArrayList<String>(); 
		list3.add("chrrey");
		list3.add("clipart");
		list3.add("watermelon");
		list3.add("wallpaper");
		
		arr[2][0] = list3;
		return arr;
	}*/

}

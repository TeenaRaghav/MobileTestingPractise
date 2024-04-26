package com.mobile.test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class MobileAutomation {
	static AndroidDriver<MobileElement>driver;
	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "emulator-5554");	
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "9");
		capabilities.setCapability("appPackage", "com.android.calculator2");
		capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");

		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		
		driver.findElement(By.id("com.android.calculator2:id/digit_9")).click();
	driver.findElement(By.id("com.android.calculator2:id/op_add")).click();
	driver.findElement(By.id("com.android.calculator2:id/digit_7")).click();
	driver.findElement(By.id("com.android.calculator2:id/eq")).click();

	

	}

}

package com.mobile.test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class MobileAutomation {
	static AndroidDriver<WebElement> driver;

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "emulator-5554");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "9");
		capabilities.setCapability("appPackage", "com.android.calculator2");
		capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");

//		File appDir = new File("C:\\Users\\teena\\eclipse-workspace\\MobileTesting\\Apps");
//		File newApp = new File(appDir ,"ApiDemos.apk");
//		capabilities.setCapability("app",newApp.getAbsolutePath());

		driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
//		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Accessibility\"]")).click();
//		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Animation\"]")).click();
//Numbers
//		driver.findElement(By.id("com.android.calculator2:id/digit_9")).click();
//		driver.findElement(By.id("com.android.calculator2:id/digit_7")).click();
//		driver.findElement(By.id("com.android.calculator2:id/digit_8")).click();
//		driver.findElement(By.id("com.android.calculator2:id/digit_5")).click();
//		driver.findElement(By.id("com.android.calculator2:id/digit_6")).click();
//		driver.findElement(By.id("com.android.calculator2:id/digit_4")).click();
//		driver.findElement(By.id("com.android.calculator2:id/digit_3")).click();
//		driver.findElement(By.id("com.android.calculator2:id/digit_2")).click();
		driver.findElement(By.id("com.android.calculator2:id/digit_1")).click();
		driver.findElement(By.id("com.android.calculator2:id/op_mul")).click();
		driver.findElement(By.id("com.android.calculator2:id/digit_0")).click();
//		driver.findElement(By.id("com.android.calculator2:id/dec_point")).click();

//operators
//		driver.findElement(By.id("com.android.calculator2:id/op_add")).click();
//		driver.findElement(By.id("com.android.calculator2:id/op_sub")).click();
//		driver.findElement(By.id("com.android.calculator2:id/op_div")).click();
//		driver.findElement(By.id("com.android.calculator2:id/del")).click();
		driver.findElement(By.id("com.android.calculator2:id/eq")).click();

//trigonometry functions
//		driver.findElement(By.id("com.android.calculator2:id/toggle_inv")).click();
//		driver.findElement(By.id("com.android.calculator2:id/toggle_mode")).click();
//		driver.findElement(By.id("com.android.calculator2:id/fun_sin")).click();
//		driver.findElement(By.id("com.android.calculator2:id/fun_cos")).click();
//		driver.findElement(By.id("com.android.calculator2:id/fun_tan")).click();
//		driver.findElement(By.id("com.android.calculator2:id/op_pct")).click();
//		driver.findElement(By.id("com.android.calculator2:id/fun_ln")).click();
//		driver.findElement(By.id("com.android.calculator2:id/fun_log")).click();
//		driver.findElement(By.id("com.android.calculator2:id/op_fact")).click();
//		driver.findElement(By.id("com.android.calculator2:id/op_pow")).click();
//		driver.findElement(By.id("com.android.calculator2:id/op_pow")).click();
//		driver.findElement(By.id("com.android.calculator2:id/const_e")).click();
//		driver.findElement(By.id("com.android.calculator2:id/lparen")).click();
//		driver.findElement(By.id("com.android.calculator2:id/op_sqrt")).click();

	}

}

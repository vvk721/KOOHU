package com.hrms.lib10;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

import com.hrms.utility10.Log;

public class General extends Global{
	public void openApplication() {
		driver =new FirefoxDriver();
		driver.navigate().to(url);
		System.out.println("Application opened");
		Reporter.log("Application opened");
		Log.info("Application Opened");
	}
	public void closeApplication() {
		driver.close();
		System.out.println("Application closed");
		Log.info("Application closed");
	}
	public void login() {
		driver.findElement(By.name(txt_loginname)).sendKeys(un);
		driver.findElement(By.name(txt_password)).sendKeys(pw);
		driver.findElement(By.name(btn_login)).click();
		System.out.println("login completed");
		Log.info("login completed");
	}
		public void logout() {
			driver.findElement(By.linkText(link_logout)).click();
			System.out.println("logout completed");
			Log.info("logout completed");
		}
		public void enterFrame() {
			driver.switchTo().frame(frame_empinfo);
			System.out.println("Entered into frame");
			Log.info("enter into frame");
		}
		public void exitFrame() {
			driver.switchTo().defaultContent();
			System.out.println("Exit from frame");
			Log.info("enter from frame");
		}
		public void addNewEmp() {
			driver.findElement(By.xpath(btn_Add)).click();
			driver.findElement(By.name(txt_efn)).sendKeys(efn);
			driver.findElement(By.name(txt_eln)).sendKeys(eln);
			driver.findElement(By.id(btn_save)).click();
			System.out.println("Adding new emp");
			Log.info("Adding new emp");
	}

	}


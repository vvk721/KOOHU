package com.hrms.testscripts10;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib10.General;

public class TC002 {

		//public static void main(String[] args) {
			// TODO Auto-generated method stub
	@Test
	public void tc002() {
		DOMConfigurator.configure("log4j.xml");
		General obj = new General();
		obj.openApplication();
		obj.login();
		obj.enterFrame();
		obj.addNewEmp();
		obj.exitFrame();
		obj.logout();
		obj.closeApplication();
		
	}
		}

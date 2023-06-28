package com.hrms.testscripts10;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib10.General;

public class TC001 {
		@Test
		public void tc001() {
			DOMConfigurator.configure("log4j.xml");
			General obj = new General();
			obj.openApplication();
			obj.login();
			obj.logout();
			obj.closeApplication();
		}
	}

package com.smattechqa.hooks;

import java.io.IOException;

import com.smarttechqa.basepage.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook extends BaseClass {

	@Before
	public static void initialize /* to open a browser*/() throws InterruptedException, IOException {
		BaseClass.setUp();
		
	}
	//tearDown will quit the borowser after each Scenario.
	@After
	public static void tearDown /* to close the browser*/() {
		driver.quit();// This is from BaseClass.
		
		
	}
	
	
}

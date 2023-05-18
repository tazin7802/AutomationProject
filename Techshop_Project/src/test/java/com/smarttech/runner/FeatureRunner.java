package com.smarttech.runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.smarttechqa.basepage.BaseClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"Features/"}, //  If any specific feature need testing add it after {"Feature/Login.feature"},
				glue = {"com.smarttechqa.stepdef", "com.smarttechqa.hooks"},
		plugin = {"pretty","json:target/cucumber.json"},
		dryRun =false,
		monochrome = true
		//tags = "@smoke"
		
		)
public class FeatureRunner  extends AbstractTestNGCucumberTests {

	@BeforeClass
	@Parameters("browserType")
	public static void beforeClass(@Optional("chrome") String browser)   {
		new BaseClass();
		BaseClass.initializeProperties();		
		BaseClass.property.setProperty("BrowserType", browser);
	}
	
	@AfterClass
	public static void afterClass() {
		
		
	}
	
	
}
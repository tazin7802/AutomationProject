package com.smarttech.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"Features/NegativeTestingLogin.feature"},
		glue = {"com.smarttechqa.stepdef", }, 
		plugin = {"pretty","json:target/cucumber.json"},
		dryRun =false,
		monochrome = true
		//tags = "@smoke"
		
		)
public class FeatureRunner  extends AbstractTestNGCucumberTests {

	
	
}
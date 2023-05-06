package com.smarttechqa.stepdef;

import java.io.IOException;

import org.openqa.selenium.By;

import com.smarttechqa.basepage.BaseClass;
import com.smarttechqa.utils.Utilities;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefination extends BaseClass {
	
	
	@Given("User open the browser")
	public void user_open_the_browser() throws InterruptedException, IOException {
    BaseClass.setUp();

	}

	@Given("user navigates to {string}")
	public void user_navigates_to(String string) {


	}

	@When("User click on the sign In button")
	public void user_click_on_the_sign_in_button() {


	}

	@When("User enters the email")
	public void user_enters_the_email() {
		driver.findElement(By.xpath("//*[@type='email']")).sendKeys("testuser@email.com"); //Sending the email address
		
	}

	@When("User enters the password")
	public void user_enters_the_password() {
		driver.findElement(By.id("password")).sendKeys("123456");

	}

	@When("User clicks on the login in  button")
	public void user_clicks_on_the_login_in_button() {
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();


	}

	@Then("The user is succesfully loged in and user name is displayed")
	public void the_user_is_succesfully_loged_in_and_user_name_is_displayed() {


	}

	@Then("User is navigated to home page")
	public void user_is_navigated_to_home_page() {


	}

	
	
	}

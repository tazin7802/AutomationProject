package com.smarttechqaB28.stepdef;

import java.io.IOException;

import org.openqa.selenium.By;

import com.smarttechqa.basepage.BaseClass;
import com.smarttechqa.utils.Utilities;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitionB28 extends BaseClass {


@Given("User opens the browser")
public void user_opens_the_browser() throws InterruptedException, IOException {
 BaseClass.setUp();

}

@Given("User navigates to {string}")
public void user_navigates_to(String string) {


}

@When("User clicks on the Sign In button")
public void user_clicks_on_the_sign_in_button() {
	driver.findElement(By.xpath("//a[@href='/login']")).click();

}

@When("User Enters the email")
public void user_enters_the_email() throws IOException {
	driver.findElement(By.xpath("//*[@type='email']")).sendKeys("testuser@email.com");
	Utilities.getHighLighter(driver.findElement(By.id("email")));// we have to refresh
	Utilities.takeScreenShot();//
}

@When("User Enters the password")
public void user_enters_the_password() {
	driver.findElement(By.id("password")).sendKeys("123456");

}

@When("User clicks on the login in button")
public void user_clicks_on_the_login_in_button() {
	driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();

}

@Then("The user is successfully logged in and username is displayed")
public void the_user_is_successfully_logged_in_and_username_is_displayed() throws InterruptedException {
	System.out.println("The title of the application is:" +driver.getTitle());
	//Thread.sleep(5000);
}

@Then("User is navigated to home page")
public void user_is_navigated_to_home_page() {


}


}

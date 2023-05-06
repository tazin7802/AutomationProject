package com.smarttechqa.basepage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.smarttechqa.utils.Utilities;

public class BaseClass {
	

	public static WebDriver driver;
	
	//public static WebDriver driver;// I am making it static, so it can access from other class.
	              // This is a static veritable; means inside the class, but outside the method.
	
	public static void setUp() throws InterruptedException, IOException {// throws added for unconditional wait
		// To open a browser
	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //need to take off the Webdriver, since made it static veriable.
	    driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();// This is how to delete cookies. We have to delete cookies before
		// starting the Automation.
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.get("https://www.smarttechqa.com/login");// The get() will take us to the URL of the application.
		//driver.findElement(By.xpath("//*[@type='email']")).sendKeys("testuser@email.com"); //Sending the email address. This code will move
		// to Step definition 
		
		//Thread.sleep(10000);
		//driver.navigate().back();// This takes to the previous page
		//driver.navigate().refresh();// This reffresh the page
		//driver.navigate().to("https://www.smarttechqa.com/login");// This will take to the URL. same as get();
		//driver.findElement(By.xpath("//a[@href='login']")).click();
		
		
		//driver.findElement(By.id("email")).sendKeys("testuser@email.com");
		//Utilities.getHighLighter(driver.findElement(By.id("email")));// we have to refresh
		//Utilities.takeScreenShot();// We have to code it in utility class and do this code in base class.
		
		//Thread.sleep(5000);
		//driver.findElement(By.id("password")).sendKeys("123456");//Sending the email address. This code will move
		// to Step definition 
		//driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();//Sending the email address. This code will move
		// to Step definition 
		//Utilities.takeScreenShot();
		//driver.findElement(By.cssSelector("#password")).sendKeys("123456");
		//driver.findElement (By.cssSelector(".password")).sendKeys("123456");
		// this is how to call for Explicit wait. make a explicit class in Utility class.
		//Thread.sleep(10000);// Unconditional wait use for finding bug
		//Utilities.getExplicitWait(driver.findElement(By.xpath("//button[@class='btn btn-primary']")), 0);
		//Thread.sleep(10000);
		//driver.findElement(By.name("q")).submit();
	    //driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();// this how to sign in
	    
	    
		//System.out.println("The title of the application is:" +driver.getTitle());//Sending the email address. This code will move
		// to Step definition 
		//driver.quit();
		//driver.findElement(By.linkText("Go Back")).click(); //this will take me back to the home page from the cart page
				//driver.findElement(By.partialLinkText("Go")).click();
		
		
	}
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		BaseClass.setUp();// This is how we call Static class
		System.out.println(" I love you");
		
	}

}

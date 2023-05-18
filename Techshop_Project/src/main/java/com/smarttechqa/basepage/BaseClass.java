package com.smarttechqa.basepage;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.smarttechqa.utils.Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	//Static variable are outside of methods and inside the class
		public static WebDriver driver;
		public static Properties property;
		public static Logger logger;
			
		public BaseClass() {
			logger = Logger.getLogger("Automation Testing");
			PropertyConfigurator.configure("src/test/resources/Log4j.properties");		
		} 

		public static void initializeProperties() {	
			
			try {
				property = new Properties();
				InputStream ip = new FileInputStream("src/test/resources/config.properties");
				property.load(ip);
			} catch (IOException error) {	
				error.printStackTrace();
				System.out.println("Can't find the file");		
			} catch (Exception error) {
				error.getMessage();
			} finally {
				System.out.println("This code will always run");
			}
		}
			
		public static void setUp(){
			if(property.getProperty("BrowserType").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			driver = new ChromeDriver();
			} else if (property.getProperty("BrowserType").equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			} else if (property.getProperty("BrowserType").equalsIgnoreCase("edge")) {
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
			}
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();	//This will delete user session information	
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.smarttechqa.com/"); //This goes the to URL of the application
			
	
}}//tazin
	
		
	
	
	
	
	
	
	

	
	
	
	//public static WebDriver driver;
	
	
	//public static WebDriver driver;// I am making it static, so it can access from other class.
	              // This is a static veritable; means inside the class, but outside the method.
	
	/*public static void setUp() /*throws InterruptedException, IOException *///{// throws added for unconditional wait
		// To open a browser
	//	WebDriverManager.chromedriver().setup();// so we don't have to update Chromedriver everytime.
	//	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	//	WebDriver driver = new ChromeDriver(); //need to take off the Webdriver, since made it static veriable.
	   // driver = new ChromeDriver();
	    
	  
	    
	    
		//driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();// This is how to delete cookies. We have to delete cookies before
		// driver.quit();
		// starting the Automation.
		//driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		//driver.get("https://www.smarttechqa.com");// The get() will take us to the URL of the application.
     	
		
		
		
		
		
		
		
		
		//driver.findElement(By.xpath("//a[@href='/login']")).click();// this will take us to the login & click.
		//driver.findElement(By.xpath("//*[@type='email']")).sendKeys("testuser@email.com"); //Sending the email address. This code will move
		//driver.findElement(By.id("password")).sendKeys("123456");
		
		//driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		//Utilities.getExplicitWait(driver.findElement(By.name("q")), 2);
		//driver.findElement(By.name("q")).sendKeys("iPhone");
		
		//driver.findElement(By.xpath("//button[@class='p-2 btn btn-outline-success']")).click();
		//System.out.println("The title of the application is:" +driver.getTitle());
		
		
		
		
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
		//Utilities.getExplicitWait(driver.findElement(By.name("q")), 10);
		//driver.findElement(By.name("q")).sendKeys("iPhone");// Sends keys to search for iphone.
	    //driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();// this how to sign in
	    
	    
		//System.out.println("The title of the application is:" +driver.getTitle());//Sending the email address. This code will move
		// to Step definition 
		//driver.quit();
		//driver.findElement(By.linkText("Go Back")).click(); //this will take me back to the home page from the cart page
				//driver.findElement(By.partialLinkText("Go")).click();
		
		
	//}
	
	//public static void main(String[] args) throws InterruptedException, IOException {
		
		//BaseClass.setUp();// This is how we call Static class
		//System.out.println(" I love you");
		
	



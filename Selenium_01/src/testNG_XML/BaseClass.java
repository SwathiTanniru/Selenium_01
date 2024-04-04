package testNG_XML;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	ChromeDriver driver;
	@BeforeSuite
	public void beforesuite() {
		Reporter.log("from before suite",true);
		Reporter.log("application is connected to server of database",true);
	}
	@BeforeTest
	public void beforetest() {
		Reporter.log("from before test",true);
		Reporter.log("application is connected to database",true);
	}
	@BeforeClass
	public void beforeclass() {
		Reporter.log("opening of browser",true);
		Reporter.log("from before class",true);
		Reporter.log("navigation to url");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
	}
	@BeforeMethod
	public void beforemethod() throws InterruptedException {
		Reporter.log("login to application",true);
		Reporter.log("Before method",true);
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("Email")).sendKeys("selenium4444@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("Password")).sendKeys("xyzabc");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[value=\"Log in\"]")).click();
	}
	@AfterTest
	public void aftertest() {
		Reporter.log("from after test",true);
		Reporter.log("application is connected to database",true);
	}
	@AfterSuite
	public void aftersuite() {
		Reporter.log("from after suite",true);
		Reporter.log("application is dis-connected to server of database",true);
	}
	@AfterMethod
	public void aftermethod() {
		Reporter.log("logout operation from application",true);
		Reporter.log("from after method",true);
		driver.findElement(By.linkText("Log out")).click();
	}
	@AfterClass
	public void afterclass() {
		Reporter.log("from after class",true);
		Reporter.log("check for closing of browser",true);
		driver.quit();
	}

}

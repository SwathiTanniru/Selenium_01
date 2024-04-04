package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithClassNameLocator {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/login");
	Thread.sleep(5000);
	driver.findElement(By.className("email")).sendKeys("selenium@gmail.com");
	Thread.sleep(4000);
	driver.findElement(By.className("password")).sendKeys("selenium@123");
	Thread.sleep(2000);
	driver.quit();
}
}

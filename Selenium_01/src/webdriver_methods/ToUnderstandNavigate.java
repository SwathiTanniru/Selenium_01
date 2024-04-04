package webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandNavigate {
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		System.out.println("First time:"+driver.getTitle());
		Thread.sleep(6000);
		driver.findElement(By.linkText("Log in")).click();
		System.out.println("after clicking login button:"+driver.getTitle());
		Thread.sleep(6000);
		driver.navigate().back();
		System.out.println("after performing back operation:"+driver.getTitle());
		Thread.sleep(6000);
		driver.navigate().forward();
		System.out.println("after performing forward action:"+driver.getTitle());
		Thread.sleep(6000);
		driver.navigate().refresh();
		System.out.println("after refreshing:"+driver.getTitle());
		Thread.sleep(6000);
		driver.navigate().to("https://www.skillrary.com/user/login");
		System.out.println("after using to method:"+driver.getCurrentUrl());
		Thread.sleep(6000);
		driver.quit();
		
	}

}

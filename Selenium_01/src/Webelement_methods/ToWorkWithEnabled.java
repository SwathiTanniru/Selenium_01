package Webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithEnabled {
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		
		WebElement login_btn = driver.findElement(By.xpath("//button[@type='submit']"));
		
		if(login_btn.isEnabled())
		{
			login_btn.click();
			System.out.println("its enabled");
			
		}else {
			System.out.println("not enabled");
	
		}
		Thread.sleep(4000);
		driver.quit();
	}

}

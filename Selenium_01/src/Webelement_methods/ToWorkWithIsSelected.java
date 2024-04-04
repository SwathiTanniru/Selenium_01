package Webelement_methods;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithIsSelected {
	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(4000);
		WebElement remember_check_box = driver.findElement(By.id("RememberMe"));
		System.out.println("")
	}

}

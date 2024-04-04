package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Attribute {
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://demowebshop.tricentis.com/register");
		Thread.sleep(4000);
		WebElement firstName_text_box = driver.findElement(By.id("FirstName"));
		firstName_text_box.sendKeys("Swathi");
		System.out.println("First name value is:"+firstName_text_box.getAttribute("value"));
		Thread.sleep(4000);
		WebElement lastName_text_box = driver.findElement(By.id("LastName"));
		lastName_text_box.sendKeys("Tanniru");
		System.out.println("Last Name value is:"+lastName_text_box.getAttribute("value"));
		Thread.sleep(4000);
		driver.quit();
	}

}

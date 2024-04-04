package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GiveNumber {
public static void main(String[] args) throws InterruptedException
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.dream11.com/");
	
	WebElement mobile_number = driver.findElement(By.id("regEmail"));
	mobile_number.sendKeys("909352647");
	
	Thread.sleep(4000);
	driver.quit();
}
}

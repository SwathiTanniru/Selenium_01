package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithPartialLinkTextLocator {
public static void main(String[] args) throws InterruptedException
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(5000);
	driver.findElement(By.partialLinkText("Computers")).click();
	Thread.sleep(5000);
	driver.quit();
}
}

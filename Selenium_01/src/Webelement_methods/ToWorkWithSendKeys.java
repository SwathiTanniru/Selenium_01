package Webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithSendKeys {
public static void main(String[] args) throws InterruptedException
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/register");
	Thread.sleep(3000);
	driver.findElement(By.id("small-searchterms")).sendKeys("a","b","c","d");
	Thread.sleep(6000);
	driver.quit();
}
}

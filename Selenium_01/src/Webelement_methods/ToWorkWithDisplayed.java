package Webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithDisplayed {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/");
		Thread.sleep(4000);

		WebElement sign_in_link = driver.findElement(By.partialLinkText("SIGN IN"));
		if(sign_in_link.isDisplayed()) {
			System.out.println("the application is opened in English Language");
		}
		else {
			System.out.println("Other Language");
		}
		Thread.sleep(4000);
		driver.quit();
	}
}

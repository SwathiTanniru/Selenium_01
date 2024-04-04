package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ToWorkWithDoubleClick {
public static void main(String[] args) throws InterruptedException
{
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapp.skillrary.com/product.php?product=testing");
	Thread.sleep(4000);
	
	WebElement plus_btn = driver.findElement(By.id("add"));
	WebElement minus_btn = driver.findElement(By.id("minus"));
	
	Actions act=new Actions(driver);
	act.doubleClick(plus_btn).perform();
	Thread.sleep(3000);
	act.doubleClick(minus_btn).perform();
	Thread.sleep(3000);
	driver.quit();
	
}
}

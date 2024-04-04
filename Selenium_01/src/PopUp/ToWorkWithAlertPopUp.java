package PopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithAlertPopUp {
public static void main(String[] args) throws InterruptedException
{
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.cssSelector("input[value=\"Search\"]")).click();
	Thread.sleep(5000);
	Alert a=driver.switchTo().alert();
	a.accept();
	Thread.sleep(5000);
	driver.quit();
}
}
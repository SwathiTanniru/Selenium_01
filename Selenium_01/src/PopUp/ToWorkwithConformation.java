package PopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkwithConformation {
public static void main(String[] args) throws InterruptedException
{
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://licindia.in/");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[text()='Close']")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("(//a[@title=\"Login to Customer Portal\"])[2]")).click();
Thread.sleep(5000);
Alert a=driver.switchTo().alert();
a.accept();
Thread.sleep(2000);
driver.quit();
}
}

package PopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WorkingWithPrompt {
public static void main(String[] args) throws InterruptedException
{
	EdgeDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://omayo.blogspot.com/");
	Thread.sleep(5000);
	driver.findElement(By.id("prompt")).click();
	Thread.sleep(5000);
	Alert a=driver.switchTo().alert();
	System.out.println(a.getText());
	a.sendKeys("Chetan");
	Thread.sleep(5000);
	a.accept();
	Thread.sleep(5000);
	driver.quit();
}
}

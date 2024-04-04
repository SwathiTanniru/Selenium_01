package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkwithFileDownload {
public static void main(String[] args) throws InterruptedException
{
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.oracle.com/java/technologies/downloads/");
	Thread.sleep(5000);
	driver.findElement(By.partialLinkText("https://download.oracle.com/java/21/latest/jdk-21_")).click();
	
	Thread.sleep(3000);
	driver.quit();
	

}
}

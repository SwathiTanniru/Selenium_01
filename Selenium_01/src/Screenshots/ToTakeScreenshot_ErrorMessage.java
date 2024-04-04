package Screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToTakeScreenshot_ErrorMessage {
public static void main(String[] args) throws InterruptedException, IOException
{
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//a[text()='Register']")).click();
	Thread.sleep(5000);
	driver.findElement(By.id("register-button")).click();
	Thread.sleep(5000);
	File source = driver.getScreenshotAs(OutputType.FILE);
	File destiny = new File("./Screenshots/PageSnap.png");
	FileHandler.copy(source, destiny);
	driver.quit();
}
}

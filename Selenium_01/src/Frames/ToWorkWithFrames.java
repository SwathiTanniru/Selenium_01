package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithFrames {
public static void main(String[] args) throws InterruptedException
{
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.dream11.com/");
	Thread.sleep(3000);
	WebElement frame_01=driver.findElement(By.cssSelector("iframe[id=))
}
}

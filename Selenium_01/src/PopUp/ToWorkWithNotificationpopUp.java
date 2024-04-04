package PopUp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithNotificationpopUp {
public static void main(String [] args) throws InterruptedException, AWTException
{
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://in.puma.com/in/en/collaborations ");
	Thread.sleep(5000);
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(5000);
	r.keyPress(KeyEvent.VK_ENTER);
	
	r.keyRelease(KeyEvent.VK_TAB);
	Thread.sleep(2000);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	Thread.sleep(5000);
	driver.quit();
	
	
	
}
}

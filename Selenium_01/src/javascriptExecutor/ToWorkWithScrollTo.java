package javascriptExecutor;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithScrollTo {
public static void main(String[] args) throws InterruptedException
{
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(3000);
	
	driver.executeScript("window.scrollTo(0,500);");
	Thread.sleep(3000);
	driver.executeScript("window.scrollTo(0,-400);");
	Thread.sleep(3000);
	driver.quit();
}
}

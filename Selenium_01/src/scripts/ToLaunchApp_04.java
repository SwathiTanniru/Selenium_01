package scripts;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToLaunchApp_04 {
@Test
public void launch_app() {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.tirabeauty.com/sections/makeup");
	driver.quit();
}
}

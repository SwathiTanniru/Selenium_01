package Simply;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class ToWorkWithDWS_Register {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/register");
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Register", "not landed to required page");
		WebElement female_btn = driver.findElement(By.id("gender-female"));
		female_btn.click();
		Assert.assertTrue(female_btn.isSelected(), "female radio button is already selected");
		WebElement fname = driver.findElement(By.id("FirstName"));
		fname.sendKeys("safa");
		Assert.assertEquals(fname.getAttribute("value"),"safa","first name is not same as expected");
		Thread.sleep(4000);
		driver.quit();

	}

}

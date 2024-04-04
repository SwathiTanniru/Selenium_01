package Simply;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class ToWorkWithDWS_Register_softAssert {
public static void main(String[] args) throws InterruptedException
{
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	SoftAssert sa=new SoftAssert();
	driver.get("https://demowebshop.tricentis.com/register");
	sa.assertEquals(driver.getTitle(),"Demo Web Shop. Register","not landed to required page");
	WebElement female_btn = driver.findElement(By.id("gender-female"));
	female_btn.click();
    sa.assertTrue(female_btn.isSelected(), "female radio button is already selected");
    WebElement fname = driver.findElement(By.id("FirstName"));
	fname.sendKeys("safa");
	sa.assertEquals(fname.getAttribute("value"),"safa","first name is not same as expected");
	Thread.sleep(4000);
	sa.assertAll();
	driver.quit();

}
}

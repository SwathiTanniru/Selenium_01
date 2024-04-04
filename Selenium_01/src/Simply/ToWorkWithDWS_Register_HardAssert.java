package Simply;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ToWorkWithDWS_Register_HardAssert {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/login");
        //System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Login","not landed to required page");
        WebElement email = driver.findElement(By.id("Email"));
    	email.sendKeys("selenium4444@gmail.com");
    	Assert.assertEquals(email.getAttribute("value"),"selenium4444@gmail.com","Verify email id");
    	WebElement rem_btn = driver.findElement(By.id("RememberMe"));
    	rem_btn.click();
    	Assert.assertFalse(rem_btn.isSelected(), "Remember me button is already selected");;
        driver.quit();

}
}

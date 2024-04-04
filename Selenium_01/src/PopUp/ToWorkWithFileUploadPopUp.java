package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithFileUploadPopUp {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://resume.naukri.com/cv-submission");
		Thread.sleep(3000);
		
		driver.findElement(By.id("infile")).sendKeys("C:\\Users\\skira\\OneDrive\\CV\\Swathi CV\\Malaysia\\GIS\\Swathi Kiran Tanniru CV.pdf");
		
		Thread.sleep(4000);
		
		driver.quit();
		
	}

}

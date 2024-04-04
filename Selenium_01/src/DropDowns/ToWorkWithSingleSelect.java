package DropDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToWorkWithSingleSelect {
public static void main(String[] args) throws InterruptedException
{
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://omayo.blogspot.com/ ");
	Thread.sleep(4000);
	WebElement multi_select_list=driver.findElement(By.id("multiselect1"));
	
	Select list=new Select(multi_select_list);
	list.selectByIndex(3);
	Thread.sleep(4000);
	list.selectByValue("volvox");
	Thread.sleep(4000);
	list.selectByVisibleText("Hyundai");
Thread.sleep(4000);
driver.quit();
}

}

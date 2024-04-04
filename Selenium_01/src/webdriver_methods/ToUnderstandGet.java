package webdriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandGet {
	public static void main(String[] args) {
		ChromeDriver d1=new ChromeDriver();
		d1.get("https://www.amazon.com/amazonprime");
		String title=d1.getTitle();
		System.out.println(title);
	}

}

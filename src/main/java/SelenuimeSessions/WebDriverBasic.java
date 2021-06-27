package SelenuimeSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasic {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenuim\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("shawon_faruk@yahoo.com");
		driver.findElement(By.id("pass")).sendKeys("Usa521151@zf");
		driver.findElement(By.name("login")).click();
		
		//driver.get("https://www.google.com/");
		
		//String title = driver.getTitle();
				//System.out.println(title);
				
				//if (title.equals("Google")) {
					//System.out.println("correct title");
				//}
			//	else {
					//System.out.println("incorrect title");
				//}
				//System.out.println(driver.getCurrentUrl());
				//System.out.println(driver.getPageSource());
				
				//driver.quit();
				
					
		
	}
	

}

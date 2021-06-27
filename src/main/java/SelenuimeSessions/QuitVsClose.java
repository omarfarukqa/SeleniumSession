package SelenuimeSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsClose {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenuim\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		String title = driver.getTitle();
		System.out.println(title);
		
		driver.quit();//close the browser
		//driver.close();//close the browser
		
		//driver = new ChromeDriver();
		//driver.get("https://google.com");
		System.out.println(driver.getTitle());
	}

}

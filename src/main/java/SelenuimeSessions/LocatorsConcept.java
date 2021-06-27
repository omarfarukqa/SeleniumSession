package SelenuimeSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		//create webelement (By id, name, xpath, css) --> perform actions(click, sendKeys, gettext)
		//HTML DOM: Document Object Model
		//1. id
				//1st:
//				driver.findElement(By.id("Form_submitForm_FirstName")).sendKeys("testing");
//				driver.findElement(By.id("Form_submitForm_LastName")).sendKeys("selenium");
				//driver.findElement(By.linkText("Register")).click();
				
				//2nd:
//				WebElement firstName = driver.findElement(By.id("Form_submitForm_FirstName"));
//				WebElement lastName = driver.findElement(By.id("Form_submitForm_LastName"));
		//
//				firstName.sendKeys("testing");
//				lastName.sendKeys("selenium");
				
				//3rd:
				//By locators:
//				By firsName = By.id("Form_submitForm_FirstName");
//				By lastName = By.id("Form_submitForm_LastName");
//				
//				driver.findElement(firsName).sendKeys("testing");
//				driver.findElement(lastName).sendKeys("selenium");
		
		
	}

}

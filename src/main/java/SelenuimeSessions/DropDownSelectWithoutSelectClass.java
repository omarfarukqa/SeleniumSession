package SelenuimeSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownSelectWithoutSelectClass {

	static WebDriver driver;

	public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By industry = By.id("Form_submitForm_Industry");
		By country = By.id("Form_submitForm_Country");
		List <WebElement>indusList
		=driver.findElements(By.xpath("//select[@id='Form_submitForm_Industry']/option"));
		
		
		
		
		
	}

}

package SelenuimeSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryDropDownHandle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException  {
        WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		Thread.sleep(2000);
		driver.findElement(By.id("justAnInputBox")).click();
		Thread.sleep(2000);
		
		//By choices = By.cssSelector(".comboTreeItemTitle");
		
		
	}
	
	public static void selectchoice(By locator, String value) {
		List <WebElement> choiceList = 
				driver.findElements(By.cssSelector(".comboTreeItemTitle"));
		for(int i =0; i<choiceList.size();i++) {
			String text = choiceList.get(i).getText();
			System.out.println(text);
			if(text.equals("choice 1")) {
				choiceList.get(i).click();
				break;
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

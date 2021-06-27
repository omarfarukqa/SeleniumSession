package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpiceJet_MoveElement {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException  {
        WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		WebElement content = driver.findElement(By.id("ctl00_HyperLinkLogin"));
		
		Actions act = new Actions (driver);
		
		act.moveToElement(content).perform();
		Thread.sleep(2000);
		
		WebElement memberLogin = 
driver.findElement(By.cssSelector("#smoothmenu1 > ul > li.li-login.float-right.tabres > ul > li:nth-child(2) > ul > li:nth-child(1) > a"));
		act.moveToElement(memberLogin).perform();
		Thread.sleep(2000);
		memberLogin.click();
	
	}

}

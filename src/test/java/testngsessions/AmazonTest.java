package testngsessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTest {
	
	public WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/");
	}
	
	@Test(priority = 1)
	public void title() {
		String title = driver.getTitle();
		System.out.println("page tiltle is:" +title);
		Assert.assertEquals(title, "Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
		
	}
	@Test (priority = 2)
	public void searchTest() {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("macbook");
		driver.findElement(By.id("twotabsearchtextbox")).submit();
		//boolean flag = driver.findElement(By.xpath("//span[contains(text(),'macbook pro')])[1]")).isDisplayed();
		//Assert.assertTrue(flag);
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://www.amazon.com/s?k=macbook&ref=nb_sb_noss_1");
	}
	
	
	
	
	
	
	
	
	@AfterTest
	public void tearDown() {
		driver.quit();
		
	}

}

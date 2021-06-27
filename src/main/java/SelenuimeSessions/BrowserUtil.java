package SelenuimeSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {

	public WebDriver driver;

	/**
	 * this method will initialize the driver on the basis of given browser name
	 * 
	 * @param browserName
	 * @return this will return the driver
	 */
	public WebDriver initDriver(String browserName) {
		System.out.println("browser name is : " + browserName);

		switch (browserName.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;

		default:
			System.out.println("Browser not found...Please pass the right browser name...");
			break;
		}

		return driver;

	}

	public void lauchUrl(String url) {
		if (url == null)
			return;
		if (url.isEmpty())
			return;
		driver.get(url);
	}

	public String getPageTitle() {
		return driver.getTitle();
	}

	public String getPageUrl() {
		return driver.getCurrentUrl();
	}

	public void closeBrowser() {
		driver.close();
	}

	public void quitBrowser() {
		driver.quit();

	}

}

package testPackage;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestOnly {
	
	@Test
	public void testOnly() {
		WebDriverManager.chromedriver()
		.version("2.40")
		.setup();
		//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "/Drivers/chromedriver");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("–no-sandbox");
		options.addArguments("–disable-dev-shm-usage");
		
		
		options.addArguments("--test-type");
		options.addArguments("--disable-extentions");
		
		options.setExperimentalOption("useAutomationExtension", false);
		
		
		
		WebDriver driver= new ChromeDriver(options);
		
		
	

		
		driver.get("https://www.google.com/");
		System.out.println("success");
	}

}

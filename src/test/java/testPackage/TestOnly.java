package testPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestOnly {
	
	@Test
	public void testOnly() {
		WebDriverManager.chromedriver()
		.version("2.40")
		.setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("–no-sandbox");
		options.addArguments("–disable-dev-shm-usage");
		//options.setExperimentalOptions(“useAutomationExtension”, false);
		options.setExperimentalOption("useAutomationExtension", false);

		WebDriver driver= new ChromeDriver(options);
		driver.get("https://www.google.com/");
		System.out.println("success");
	}

}

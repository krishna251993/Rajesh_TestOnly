package testPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestOnly {
	
	@Test
	public void testOnly() {
		WebDriverManager.chromedriver()
		.version("2.40")
		.setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println("success");
	}

}

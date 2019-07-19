package testPackage;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestOnly {
	
	@Test
	public void testOnly() {
		//WebDriverManager.chromedriver()
		//.version("2.40")
		//.setup();
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "/Drivers/chromedriver");
		/*
		ChromeOptions options = new ChromeOptions();
		options.addArguments("–no-sandbox");
		options.addArguments("–disable-dev-shm-usage");
		

		//options.setExperimentalOptions(“useAutomationExtension”, false);
		options.setExperimentalOption("useAutomationExtension", false);
		*/
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_setting.popups", 2);
		//chromePrefs.put("download.default_directory", downloadFilepath);
		ChromeOptions options= new ChromeOptions();
		
		HashMap<String, Object> chromeOptionsMap=new HashMap<String , Object>();
		//options.setBinary(DRIVER_PATH+CHROME_FILE);
		options.setExperimentalOption("prefs", chromePrefs);
		options.addArguments("--test-type");
		options.addArguments("--disable-extentions");
		
		
		
		DesiredCapabilities desiredcapablities=DesiredCapabilities.chrome();
		desiredcapablities.setCapability(ChromeOptions.CAPABILITY, chromeOptionsMap);
		desiredcapablities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		desiredcapablities.setCapability(ChromeOptions.CAPABILITY, options);
		
		WebDriver driver= new ChromeDriver(desiredcapablities);
	

		//WebDriver driver= new ChromeDriver(options);
		driver.get("https://www.google.com/");
		//System.out.println("success");
	}

}

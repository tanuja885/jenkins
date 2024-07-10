package jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Parameterized {
	
	public void testNg() {
		System.out.println("##################This is xmls file####################");
		System.out.println("*******************This is xml file********************2");
	}
	
	WebDriver driver;
	
	public void setup() {
		if (System.getProperty("browser").equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		}
	
		else if (System.getProperty("browser").equalsIgnoreCase("firefox")){
			driver = new FirefoxDriver();
			
		}
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();	
	}
	
	public void closerBrowser() {
		driver.quit();
	}

}

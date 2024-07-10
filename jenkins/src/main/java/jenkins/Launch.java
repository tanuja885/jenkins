package jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Launch {

	@Test
	public void login() {
		System.out.println("**************************hello***************************************************** ");	
		
		WebDriver driver = new ChromeDriver();
		  driver.get("https://www.facebook.com/"); driver.manage().window().maximize();
		 
	}
}

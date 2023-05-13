package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserTest {

	//public static void main(String[] args) {
	
	@Test
	public void browserTest() {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//driver.findElementByXPath("//ol[@id='selectable']/li[2]").click();


		
	}

}

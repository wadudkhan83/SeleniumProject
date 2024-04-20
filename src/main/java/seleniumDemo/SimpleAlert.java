package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\khan\\Documents\\QA Class note\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//load/open URL
	    // driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.get("http://leaftaps.com/opentaps/control/login");
		    
		//driver.getTitle();
		System.out.println(driver.getTitle());
		
		driver.manage().window().maximize();
		
		//Implicitly wait
  		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//Click on Submit btn
  		driver.findElementById("searchBtn").click();
  		
  		//Move your control to Alert window from main window
  		String simpleAlert = driver.switchTo().alert().getText();
  		System.out.println(simpleAlert);
  		
  		//Click on OK btn
  		driver.switchTo().alert().accept();
  		

	}

}

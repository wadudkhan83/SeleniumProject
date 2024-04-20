package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert_Confirmation {

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
  		
  	//Enter username as Demosalesmanager
		driver.findElementById("username").sendKeys("DemoSalesManager");
		
		//Enter password
		driver.findElementById("password").sendKeys("crmsfa");
		
		//Click Login button
		driver.findElementByClassName("decorativeSubmit").click();
		
		//Click CRM/SFA link
		driver.findElementByLinkText("CRM/SFA").click();
		
		//Click Leads link
		driver.findElementByLinkText("Leads").click();
		
		//click on Merge leads link
		driver.findElementByLinkText("Merge Leads").click();
		
		//click on Merge link
		driver.findElementByLinkText("Merge").click();
		
		//Move your control to Alert window from main window
		String conAlert = driver.switchTo().alert().getText();
		System.out.println(conAlert);
		
		//Cancel Alert
		//driver.switchTo().alert().dismiss();
		driver.switchTo().alert().accept();

	}

}

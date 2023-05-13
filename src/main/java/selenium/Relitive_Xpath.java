package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Relitive_Xpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
				
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Attribute base Xpath
		driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager");
		
		//Partial Attribute base Xpath
		driver.findElementByXPath("//input[contains(@name,'PASS')]").sendKeys("crmsfa");
		
		driver.findElementByXPath("//input[contains(@class,'decorative')]").click();
		
		//Link Text (Direct Locator)
		driver.findElementByLinkText("CRM/SFA").click();
		
		//Text Base Xpath
		driver.findElementByXPath("//a[text()='Create Lead']").click();
		
		//Partial Text Base Xpath
		driver.findElementByXPath("//a[contains(text(),'Find')]").click();
		
		//Collections Xpath: (index mendatory)
		driver.findElementByXPath("(//div[@class='x-grid3-row    x-grid3-row-alt']/table)[3]").click();
		
		

	}

}

package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\khan\\Documents\\QA Class note\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		// driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.get("http://leaftaps.com/opentaps/control/login");
		//driver.getTitle();
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		//Click create lead link
		driver.findElementByLinkText("Create Lead").click();
		//enter company name
		driver.findElementById("createLeadForm_companyName").sendKeys("ABC");
		//Enter FirstName
		driver.findElementById("createLeadForm_firstName").sendKeys("Hema");
		//Enter lastName
		driver.findElementById("createLeadForm_lastName").sendKeys("Mali");
		//Drop-down -source
		//Choose 'Website' from Source drop-down
		WebElement src = driver.findElementById("createLeadForm_dataSourceId");
		//Create object of select class and pass variable
		Select dd = new Select (src);
		

	}

}

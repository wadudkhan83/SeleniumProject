package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrouserTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\khan\\Documents\\QA Class note\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//load URL
		driver.navigate().to("http://leaftaps.com/opentaps/control/login");
		System.out.println("navigate application");
		
		//Maximize window
		driver.manage().window().maximize();
		System.out.println("manage screen");
		//Implicitly wait 
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Enter username as Demosalesmanager
		driver.findElementById("username").sendKeys("DemoSalesManager");
		System.out.println("element");
		
		//Enter password as crmsfa
		driver.findElementById("password").sendKeys("crmsfa");
		System.out.println("id");
		
		
		//Click Login button
		driver.findElementByClassName("decorativeSubmit").click();
		System.out.println("class name");
				
		
		//Get Title of the page
		driver.getTitle();
		System.out.println("get title");
		
		//Click CRM/SFA link
		driver.findElementByLinkText("CRM/SFA").click();
				
		//Click Leads link
		driver.findElementByLinkText("Leads").click();
				
		//click Create Lead link
		driver.findElementByLinkText("Create Lead").click();
				
		//enter company name
		driver.findElementById("createLeadForm_companyName").sendKeys("ABC");
				
		//Enter FirstName
		driver.findElementById("createLeadForm_firstName").sendKeys("Hema");
		
		//Enter lastName
		driver.findElementById("createLeadForm_lastName").sendKeys("Mali");
		
		//enter Title
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Mr");
		//enter description
		driver.findElementById("createLeadForm_description").sendKeys("It is a training Software");
		
		//Enter Revenue
		
		//click CreateLead btn
		driver.findElementByName("submitButton").click();
		
		//Get title
		System.out.println(driver.getTitle());
		
		//Close browser
		driver.close();
			

	}

}

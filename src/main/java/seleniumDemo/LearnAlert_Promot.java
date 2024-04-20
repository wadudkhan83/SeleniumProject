package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert_Promot {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\khan\\Documents\\QA Class note\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		System.out.println(driver.getTitle());
		
		//Maximize window
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		//click on JS Prompt
				driver.findElementByXPath("//button[text()='Click for JS Prompt']").click();

				//Move your control to Alert window from main window - way-1
				String promptAlert = driver.switchTo().alert().getText();
				System.out.println(promptAlert);
				
				driver.switchTo().alert().sendKeys("I am a robot");

				//Accept Alert
				driver.switchTo().alert().accept();

				//Move your control to Alert window from main window - way-2 (using Alert Class)
				/*Alert promptAlert1 = driver.switchTo().alert();
				promptAlert1.getText();
				System.out.println(promptAlert1.getText());
				
				Thread.sleep(3000);
				//Type text into the box
				promptAlert1.sendKeys("I am a Human");
				
				//Click on OK
				promptAlert1.accept();*/
		

	}

}

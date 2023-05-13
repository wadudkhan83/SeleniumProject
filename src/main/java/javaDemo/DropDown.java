package javaDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DropDown {

	public static void main(String[] args){
		
System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

    //Load URL

   WebDriver Driver= new ChromeDriver(); 
	
	driver.get("http://leaftaps.com/opentaps");

	}

}

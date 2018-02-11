package demoofjenkins;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Jenkins {

	@Test
	public static void main()  {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		try{
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			//Thread.sleep(10000);
			//driver.findElementByXPath("//input[@id='email']").sendKeys("dinakaranvm@gmail.com");
			System.out.println(driver.getTitle());
			driver.quit();
			
			/*driver.findElementByXPath("//input[contains(@id,'pass')]").sendKeys("Myfacebook");
			driver.findElementByXPath("//input[contains(@value,'Log In')]").click();*/
			
			
			
		  }
		catch (Exception e){
			
			System.out.println(" Exception here");
		}
		
	}

}

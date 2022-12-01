package testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	 public static WebDriver getdriver() {
		 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 
		 

		 /*driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"t");
		 try {
			 Thread.sleep(500);
			 driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"w");
		 }catch(Exception e) {
			 System.out.println(e);
		 }
			 */
		 
		 

		 return driver;

		 

		  

}
}
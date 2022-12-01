package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AiubTesting {

	public static void main(String[] args) throws InterruptedException {
		 FileReaderDemo fr = new FileReaderDemo("C:\\Users\\tusha\\eclipse-workspace\\testing\\aiublogin.txt");
			String username=fr.getData(0)[0];
			String password=fr.getData(0)[1];
		   
	         WebDriver driver=Base.getdriver();
	            driver.get("https://portal.aiub.edu/");
	            
	            //WebElement element=driver.findElement(By.id("username"));
	           
	      
	          // element.click();
	           
	            // for clicking any object



	          WebElement element=driver.findElement(By.id("username"));
	            element.sendKeys(username);



	        driver.findElement(By.id("password")).sendKeys(password);
	        driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[4]/button")).click();





	        WebElement header=driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-00000000-0000-0000-0000-000000000000\"]/ul[2]/li/p/text()"));
	         String header_text= header.getText();
	          
	         if(header_text.equals("Welcome")) {
	             System.out.println("Admin Login test Successful");
	         }
	         else {
	             System.out.println("Admin Login test Failed");
	         }
	         //Thread.sleep(5000);
	         //driver.quit();
	         

	   }     



	
		// TODO Auto-generated method stub

	}



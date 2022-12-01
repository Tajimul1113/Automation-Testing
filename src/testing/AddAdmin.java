package testing;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
public class AddAdmin {
public static void main(String[] args) throws InterruptedException {
		   FileReaderDemo fr2 = new FileReaderDemo("C:\\Users\\tusha\\eclipse-workspace\\testing\\addadmin.txt");
		   String username2=fr2.getData(0)[0];
		   String password2=fr2.getData(0)[1];
	   

		   WebDriver driver=Base.getdriver();
		   driver.get("http://localhost/wt/Final%20Project/View/");
		    
		
		
		   WebElement element=driver.findElement(By.xpath("/html/body/ul/li[5]/a"));
		   element.click();
		    // for clicking any object
		  

		   element=driver.findElement(By.id("uname"));
		   element.sendKeys(username2);

		   driver.findElement(By.id("password")).sendKeys(password2);
		   driver.findElement(By.id("submit")).click();



		   WebElement header=driver.findElement(By.xpath("/html/body/ul/li[1]/a"));
		   String header_text= header.getText();
		  
		   if(header_text.equals("Logout")) {
			   
			 System.out.println("Add Admin test Successful");
		 }
		 else {
			 
			 System.out.println("Add Admin test Failed");
		 }
		 
		// for logout xpath(/html/body/ul/li[1]/a)
		    FileReaderDemo fr1 = new FileReaderDemo("C:\\Users\\tusha\\eclipse-workspace\\testing\\addadmin1.txt");
			String username1=fr1.getData(0)[0];
			String password1=fr1.getData(0)[1];
			String email1=fr1.getData(0)[2];
			
		   

		 
		 
		   WebElement element1=driver.findElement(By.xpath("/html/body/ul/li[7]/a"));
		   element1.click();
		   element1=driver.findElement(By.id("uname"));
		   element1.sendKeys(username1);
		   element1=driver.findElement(By.id("password"));
		   element1.sendKeys(password1);
		   element1=driver.findElement(By.id("email"));
		   element1.sendKeys(email1);
		   driver.findElement(By.id("submit")).click();
		   Thread.sleep(5000);
           
		   driver.quit();
		
		

		 
		
		 

	}
	
	

}


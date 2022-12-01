package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class DeleteUser {

	public static void main(String[] args) throws InterruptedException {
		FileReaderDemo fr = new FileReaderDemo("C:\\Users\\tusha\\eclipse-workspace\\testing\\deleteuser.txt");
		String username=fr.getData(0)[0];
		String password=fr.getData(0)[1];
		WebDriver driver=Base.getdriver();
	    driver.get("http://localhost/wt/Final%20Project/View/");
	    
	    WebElement element=driver.findElement(By.xpath("/html/body/ul/li[5]/a"));
	   element.click();
	    // for clicking any object

	    element=driver.findElement(By.id("uname"));
	    element.sendKeys(username);

	 driver.findElement(By.id("password")).sendKeys(password);
	 driver.findElement(By.id("submit")).click();



	 WebElement header=driver.findElement(By.xpath("/html/body/ul/li[1]/a"));
	 String header_text= header.getText();
	 if(header_text.equals("Logout")) {
		 System.out.println("Delete user Successful");
	 }
	 else {
		 System.out.println("Delete user Failed");
	 }
	 
	// for logout xpath(/html/body/ul/li[1]/a)
	 
	 
	 WebElement element1=driver.findElement(By.xpath("/html/body/ul/li[4]/a"));
	 element1.click();

	 WebElement element2=driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[6]/img"));
	 element2.click();
	 Thread.sleep(5000);
     driver.quit();
	}

}

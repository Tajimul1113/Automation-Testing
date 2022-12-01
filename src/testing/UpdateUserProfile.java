package testing;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UpdateUserProfile {

	public static void main(String[] args) throws InterruptedException {
		FileReaderDemo fr = new FileReaderDemo("C:\\Users\\tusha\\eclipse-workspace\\testing\\updateuserprofile.txt");
		String username=fr.getData(0)[0];
		String password=fr.getData(0)[1];
	   
	    WebDriver driver=Base.getdriver();
	    driver.get("http://localhost/wt/Final%20Project/View/");
	    
	    WebElement element=driver.findElement(By.xpath("/html/body/ul/li[4]"));
	   element.click();
	    // for clicking any object

	    element=driver.findElement(By.id("uname"));
	    element.sendKeys(username);

	 driver.findElement(By.id("password")).sendKeys(password);
	 driver.findElement(By.id("submit")).click();


	 WebElement header=driver.findElement(By.xpath("/html/body/ul/li[1]/a"));
	 String header_text= header.getText();
	  
	 if(header_text.equals("Logout")) {
		 System.out.println("User update Successful");
	 }
	 else {
		 System.out.println("User update test Failed");
	 }
	 FileReaderDemo fr1 = new FileReaderDemo("C:\\Users\\tusha\\eclipse-workspace\\testing\\updateuserprofile1.txt");
		String username1=fr1.getData(0)[0];
		String password1=fr1.getData(0)[1];
		String email1=fr1.getData(0)[2];
		String phone1=fr1.getData(0)[3];
		String Address1=fr1.getData(0)[4];
	   
	 WebElement element1=driver.findElement(By.xpath("/html/body/ul/li[4]/a"));
	 element1.click();
	 //Name
	 element1=driver.findElement(By.xpath("/html/body/div/div/div/form/table/tbody/tr[1]/td[2]/input"));
	 element1.clear();
	 element1.sendKeys(username1);
	 //Password
	 element1=driver.findElement(By.xpath("/html/body/div/div/div/form/table/tbody/tr[2]/td[2]/input"));
	 element1.clear();
	 element1.sendKeys(password1);
	 //Mail
	 element1=driver.findElement(By.xpath("/html/body/div/div/div/form/table/tbody/tr[3]/td[2]/input"));
	 element1.clear();
	 element1.sendKeys(email1);
	 //Phone Number
	 element1=driver.findElement(By.xpath("/html/body/div/div/div/form/table/tbody/tr[4]/td[2]/input"));
	 element1.clear();
	 element1.sendKeys(phone1);
	// element1=driver.findElement(By.xpath("/html/body/div/div/div/form/table/tbody/tr[5]/td[2]/input"));
	// element1.sendKeys("Dhaka");
	 element1=driver.findElement(By.name("Address"));
	 element1.clear();
	 element1.sendKeys(Address1);
	 Thread.sleep(5000);
     driver.quit();
	 //driver.findElement(By.xpath("/html/body/div/div/div/form/input")).click();
	 
	 ///html/body/div/div/div/form/input   ------Update Xpath
	 
	}
	

}

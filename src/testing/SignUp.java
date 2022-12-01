package testing;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUp {
	
	

	public static void main(String[] args) throws InterruptedException {
		FileReaderDemo fr = new FileReaderDemo("C:\\Users\\tusha\\eclipse-workspace\\testing\\signup.txt");
		String name=fr.getData(0)[0];
		String userid=fr.getData(0)[1];
		String password=fr.getData(0)[2];
		String email=fr.getData(0)[3];
		String phone=fr.getData(0)[4];
		String dob=fr.getData(0)[5];
		String address=fr.getData(0)[6];
	   
	    WebDriver driver=Base.getdriver();
	    driver.get("http://localhost/wt/Final%20Project/View/Home.php");
	    
	    WebElement element1=driver.findElement(By.xpath("/html/body/ul/li[6]/a"));
	    element1.click();
	    
	    
	    element1=driver.findElement(By.id("name"));
	    element1.sendKeys(name);
	    element1=driver.findElement(By.id("uname"));
	    element1.sendKeys(userid);
	    element1=driver.findElement(By.id("password"));
	    element1.sendKeys(password);
	    element1=driver.findElement(By.id("email"));
	    element1.sendKeys(email);
	    element1=driver.findElement(By.id("phone"));
	    element1.sendKeys(phone);
	    element1=driver.findElement(By.id("dob"));
	    element1.sendKeys(dob);
	    element1=driver.findElement(By.id("address"));
	    element1.sendKeys(address);
	    
	    
	    //element1=driver.findElement(By.xpath("/html/body/div/div/div/form/div[8]/div/div/input[1]")).click();
	    //element1.sendKeys("1");
	    driver.findElement(By.xpath("/html/body/div/div/div/form/div[8]/div/div/input[1]")).click();
	    driver.findElement(By.id("button")).click();
	    
	    
		 WebElement header=driver.findElement(By.xpath("/html/body/div/div/div/h3"));
		 String header_text= header.getText();
		  
		 if(header_text.equals("User Registration Form")) {
			 System.out.println("Sign Up test Successful");
		 }
		 else {
			 System.out.println("Sign Up test Failed");
		 }
		 Thread.sleep(5000);
         driver.quit();

	}

}

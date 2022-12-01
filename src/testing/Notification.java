package testing;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

	public class Notification {

	        public static void main(String[] args) throws InterruptedException {
	    	FileReaderDemo fr = new FileReaderDemo("C:\\Users\\tusha\\eclipse-workspace\\testing\\notification.txt");
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
	        	
		    System.out.println("Admin Login test Successful");
	 }
	        else {
		    System.out.println("Admin Login test Failed");
	 }
	        WebElement element1=driver.findElement(By.xpath(" /html/body/ul/li[2]/a"));
	        element1.click();
	        FileReaderDemo fr1 = new FileReaderDemo("C:\\Users\\tusha\\eclipse-workspace\\testing\\notification1.txt");
		    String date=fr1.getData(0)[0];
		    String time=fr1.getData(0)[1];
		    String notify=fr1.getData(0)[2];

	        element1=driver.findElement(By.id("date"));
	        element1.sendKeys(date);
	        element1=driver.findElement(By.id("time"));
	        element1.sendKeys(time);
	        element1=driver.findElement(By.id("notify"));
	        element1.sendKeys(notify);

	 //driver.findElement(By.id("signupSubmit")).click();
	        driver.findElement(By.name("submit")).click();
	 
	 
	        WebElement header1=driver.findElement(By.className("text-success"));
	        String header_text1= header1.getText();
	  
	        if(header_text1.equals("Notification Posted Successfully")) 
	        {
		    System.out.println("Notification Test successful");
	 }
	        else {
		 
		    System.out.println("Notification Test Failed");
	 }
	        Thread.sleep(5000);
            driver.quit();

	}
	}


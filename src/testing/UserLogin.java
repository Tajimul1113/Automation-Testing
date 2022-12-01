package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class UserLogin {



   public static void main(String[] args) throws InterruptedException {
	   FileReaderDemo fr = new FileReaderDemo("C:\\Users\\tusha\\eclipse-workspace\\testing\\userlogin.txt");
		String username=fr.getData(0)[0];
		String password=fr.getData(0)[1];
	   
         WebDriver driver=Base.getdriver();
            driver.get("http://localhost/wt/Final%20Project/View/UserLogin.php");
            
            WebElement element=driver.findElement(By.xpath("/html/body/ul/li[4]/a"));
           
      
           element.click();
           
            // for clicking any object



          element=driver.findElement(By.id("uname"));
            element.sendKeys(username);



        driver.findElement(By.id("password")).sendKeys(password);
         driver.findElement(By.id("submit")).click();





        WebElement header=driver.findElement(By.xpath("/html/body/ul/li[1]/a"));
         String header_text= header.getText();
          
         if(header_text.equals("Logout")) {
             System.out.println("User Login test Successful");
         }
         else {
             System.out.println("User Login test Failed");
         }
         Thread.sleep(5000);
         driver.quit();
         

   }     



}
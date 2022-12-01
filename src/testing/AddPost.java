package testing;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddPost {
	@Test
	

    public static void main(String[] args) throws InterruptedException {
    	

                WebDriver driver=Base.getdriver();
                driver.get("http://localhost/wt/Final%20Project/View/");
    
                WebElement element=driver.findElement(By.xpath("/html/body/ul/li[4]"));
                element.click();
    // for clicking any object

                element=driver.findElement(By.id("uname"));
                element.sendKeys("Tajimul");

                driver.findElement(By.id("password")).sendKeys("123#aaa");
                driver.findElement(By.id("submit")).click();


                WebElement header=driver.findElement(By.xpath("/html/body/ul/li[1]/a"));
                String header_text= header.getText();
  
                if(header_text.equals("Logout")) {
                	
	            System.out.println("Login test Successful");
	            System.out.println("Product Added Successful");
                }
                else {
                	
	            System.out.println("Login test Failed");
                }

 
 
                WebElement element1=driver.findElement(By.xpath("/html/body/ul/li[7]/a"));
                element1.click();
                element1=driver.findElement(By.id("productN"));
                element1.sendKeys("Iphone12");
                element1=driver.findElement(By.id("catagory"));
                element1.sendKeys("Mobile");
                element1=driver.findElement(By.id("price"));
                element1.sendKeys("75000");
                element1=driver.findElement(By.id("description"));
                element1.sendKeys("Brand New, Quality Smart phone");
                element1=driver.findElement(By.id("quantity"));
                element1.sendKeys("1");
                element1=driver.findElement(By.id("sdate"));
                element1.sendKeys("07/25/2022");
                element1=driver.findElement(By.id("edate"));
                element1.sendKeys("07/26/2022");
                driver.findElement(By.id("signupSubmit")).click();
                Thread.sleep(5000);
                driver.quit();
 
 


}
}

	
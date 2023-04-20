package Basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	
	public static void main (String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/sign%20up");
		driver.manage().window().maximize();
		
Thread.sleep(500);
		
		WebElement create=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/a"));
		create.click();
		
		
		WebElement firstname=driver.findElement(By.name("firstname"));
	    firstname.sendKeys("abcd");
	    WebElement lastname=driver.findElement(By.name("lastname"));
	    lastname.sendKeys("abcd");
	    
	    WebElement mobile=driver.findElement(By.name("reg_email__"));
	    mobile.sendKeys("12345678");
	    
	    WebElement password=driver.findElement(By.name("reg_passwd__"));
	    password.sendKeys("1234");
	    
	    WebElement month=driver.findElement(By.id("month"));
	    Select m1=new Select(month);
	     m1.selectByVisibleText("Dec");
	     
	     
	     List<WebElement> m2= m1.getOptions();
	     
	     System.out.println(m2.size());
	     
	     for (int i=0; i<m2.size(); i++)
	    	 
	     {
	    	 String m3=m2.get(i).getText();
	    	 System.out.println(m3);
	    	 m2.get(i).click();
	    	
	    	 
	     }
	     
	 
	  
		  driver.close();
		  driver.quit();
	    
		
		
		
		
	}

}

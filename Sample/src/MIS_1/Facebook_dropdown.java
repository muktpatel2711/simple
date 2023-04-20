package MIS_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_dropdown {
	
	public static void main(String[] args) throws InterruptedException {

	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/sign%20up");
	Thread.sleep(1000);
	
	WebElement  cre =driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/a"));
	cre.click();
	
	Thread.sleep(1000);
	
	WebElement day=driver.findElement(By.id("month"));
	
	Select dr=new Select(day);
	
	dr.selectByVisibleText("Jul");
	
	
	List<WebElement> d1=dr.getOptions();
	
	System.out.println(d1.size());
	
	
	for(int i=0; i< d1.size(); i++)
	{
		
		String tax = d1.get(i).getText();
	    System.out.println(tax);
	    d1.get(i).click();
		
	}
	
	WebElement month=driver.findElement(By.id("day"));
	
	Select dr1=new Select(month);
	dr1.selectByVisibleText("11");
	
	List<WebElement> dr2=dr1.getOptions();
	
	System.out.println(dr2.size());
	
  for(int y=0; y< dr2.size(); y++)
  {
	  String t=dr2.get(y).getText();
	  System.out.println(t);
	  dr2.get(y).click();
	  
  }
	  
	 WebElement year=driver.findElement(By.id("year"));
	 
	 Select year1=new Select(year);
	 year1.selectByVisibleText("2000");
	 System.out.println(year1);
	 
	 List<WebElement> year2=year1.getOptions();
	 System.out.println(year2.size());
	 
	 for(int a=0; a<year2.size(); a++)
		 
	 {
		 String t1=year2.get(a).getText();
		 System.out.println(t1);
		 year2.get(a).click();
		 
		 
	 }
  
	


	}
}



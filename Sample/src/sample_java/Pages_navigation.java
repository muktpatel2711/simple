package sample_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pages_navigation {

	public static void main(String[] args)  {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.yahoo.com/");
		
	
		
		//driver.findElement(By.xpath("//*[@id=\"ybarAccountProfile\"]/a")).click();
		
		//driver.navigate().back();
		driver.navigate().refresh();
		
		//System.out.println("Back done");
		System.out.println("Refresh done");
		
		
		
		
		driver.close();

	}

}

package sample_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://dev-mis.baps.dev/");
		driver.manage().window().maximize();
		
		driver.get("https://www.cheapoair.com/");
		
		WebElement radio=driver.findElement(By.xpath("//input[@name='tripType']"));
		
		
		
		{
			
			System.out.println(radio.getSize());
		}
		
		
		

	}

}

package sample_java;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Image {
	
	
		
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			
			driver.get("https://www.baps.org/home.aspx");
			
			WebElement image=driver.findElement(By.xpath("//*[@id=\"owl-slider90113\"]/div[1]/div/div[3]/div/a/img"));
			
			Actions action=new Actions(driver);
			
			action.contextClick(image).build().perform();
			
			
			action.sendKeys(Keys.CONTROL,"V").build().perform();
			
			
			
			

	}

}

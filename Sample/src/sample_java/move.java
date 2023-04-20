package sample_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class move {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();

		driver.get("https://ksrtc.in/oprs-web/");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		Actions move=new Actions(driver);
		
		WebElement from=driver.findElement(By.id("fromPlaceName"));
		move.moveToElement(from).sendKeys("india").build().perform();
		
		
		
		
		

	}

}

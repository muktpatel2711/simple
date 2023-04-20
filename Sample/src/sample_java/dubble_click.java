package sample_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dubble_click {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		Actions act=new Actions(driver);
		
		WebElement order=driver.findElement(By.xpath("//a[@id='nav-orders']"));
		
		
		
		act.doubleClick(order).build().perform();
		
		
		

	}

}

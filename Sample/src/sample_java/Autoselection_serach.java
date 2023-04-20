package sample_java;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autoselection_serach {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
	
		driver.manage().window().maximize();
		
		WebElement from=driver.findElement(By.xpath("//span[text()='From']"));
		from.click();

		WebElement ser=driver.findElement(By.xpath("//input[@placeholder='From']"));
		Thread.sleep(1000);
		ser.sendKeys("Sydney");
		Thread.sleep(1000);
		ser.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		ser.sendKeys(Keys.ENTER);
		

	}

}

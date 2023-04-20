package sample_java;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Photo_shop {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		WebElement src=driver.findElement(By.name("q"));
		src.sendKeys("Youtube doenloader free");
		src.sendKeys(Keys.ENTER);
		
		
		WebElement link=driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/a/h3"));
		link.click();
		
		
		
		
	}

}

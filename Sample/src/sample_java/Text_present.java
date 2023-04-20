package sample_java;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Text_present {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/ref=nav_logo");
		
		Thread.sleep(1000);
		
	WebElement src=driver.findElement(By.id("twotabsearchtextbox"));
	 src.sendKeys("addidas man shoes");
	 src.sendKeys(Keys.ENTER);
	 
	 JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,2000)");
		
		
	WebElement add=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[13]/div/div/div/div/div[2]/div[2]/h2/a/span"));
	add.click();
	
	if(driver.getPageSource().contains("Visit"))
	
	{
		
		System.out.println("pass");
	}
	else
{
		
		System.out.println("fail");
	}
		
	//WebElement image=driver.findElement(By.xpath("//*[@id=\"variation_color_name\"]/ul"));
	 
	
	
	
	
	
	driver.close();
	driver.quit();
	 
	 

	}

}

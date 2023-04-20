package sample_java;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class image_save {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.baps.org/home.aspx");
		
		driver.manage().window().maximize();
		
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)");
		
		Thread.sleep(1000);
		
		WebElement a=driver.findElement(By.xpath("//*[@id=\"ctl01_mainContent_ctl02_rptlist_ctl02_Panel1\"]/a/span[2]"));
		a.click();
		
		Thread.sleep(1000);
		
		WebElement b=driver.findElement(By.xpath("//*[@id=\"26558\"]/img"));
		b.click();
		
		Thread.sleep(1000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,41000)");
		
		WebElement c=driver.findElement(By.xpath("//*[@id=\"520460\"]/img"));
	
		c.click();
		 
	
		
		Actions action=new Actions(driver);
		action.contextClick(c).build().perform();
		action.sendKeys(Keys.ENTER);
		
		
		
		
		
		
	 
		

	
		
		
	}

}

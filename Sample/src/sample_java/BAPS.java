package sample_java;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BAPS {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.baps.org/");
	
		driver.manage().window().maximize();
		
		WebElement news=driver.findElement(By.xpath("//a[@href='/news']"));
		
		Thread.sleep(1000);
     Actions mouse=new Actions(driver);
		
     mouse.doubleClick(news).perform();
     
     WebElement link=driver.findElement(By.xpath("//a[@href='/News/2023/Pramukh-Swami-Maharaj-Smruti-Mandir-Murti-Pratishtha-Mahotsav-23025.aspx']"));
 
    
     Thread.sleep(1000);
     Actions du=new Actions(driver);
     //du.contextClick(link).build().perform();
     Thread.sleep(1000);
    // du.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER);
     link.click();
     
     JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,5000)");
		
		
		WebElement photo=driver.findElement(By.xpath("//*[@id=\"26610\"]/img"));
		
		photo.click();
       
		WebElement grid=driver.findElement(By.id("imggv"));
		grid.click();
		
	}

}

package MIS_1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Download_file {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		WebElement search=driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));

		search.sendKeys("Youtube downloader free");
		search.sendKeys(Keys.ENTER);
		 Thread.sleep(1000);
		 
		 WebElement down=driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/a/h3"));
		  down.click();
		  
		  WebElement past=driver.findElement(By.xpath("//*[@id=\"video_url\"]"));
		  past.sendKeys("https://youtu.be/UFaLTZ68Xz4");
		  
		  WebElement act=driver.findElement(By.xpath("//*[@id=\"search\"]/form/div"));
		  act.click();
		  

	}

}

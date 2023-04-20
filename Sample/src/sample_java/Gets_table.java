package sample_java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Gets_table {
	
public static void main(String[] args) throws InterruptedException {
	
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www2.asx.com.au/markets/trade-our-cash-market/equity-market-prices");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		
		//driver.switchTo().alert().accept();
		
		//Thread.sleep(1000);
		//WebElement ele=driver.findElement(By.xpath("//*[@id=\"home_top_twenty\"]/div/div[1]/div/div[1]/table"));
		//driver.switchTo().frame(ele);
		
		//List<WebElement> row =driver.findElements(By.xpath("//*[@id=\"home_top_twenty\"]/div/div[1]/div/div[1]/table/tr"));
		//System.out.println(row.size());

}
}


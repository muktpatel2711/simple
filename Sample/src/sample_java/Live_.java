package sample_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Live_ {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://live.psm100.org/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement live=driver.findElement(By.xpath("//*[@id=\"post-42\"]/div/div/div/div/div[2]/div/div/div/div[2]/div/div/iframe"));
		live.click();
		
		
		
		String tx=live.getText();
		
		System.out.println(tx);
		
		//driver.close();
		
	}

}

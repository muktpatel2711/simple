package sample_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class uploaded_file {

	public static void main(String[] args) throws InterruptedException {
		
				WebDriver driver=new ChromeDriver();
				driver.get("https://jpg2png.com/");
				
				driver.manage().window().maximize();
				
				Actions act=new Actions(driver);
				
				WebElement file=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/label"));
				
				act.moveToElement(file).perform();
				
				Thread.sleep(1000);
				
				file.sendKeys("/Users/mukund/Desktop/");
				

	}

}

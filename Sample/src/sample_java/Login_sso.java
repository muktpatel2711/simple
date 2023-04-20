package sample_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_sso {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://dev-mis.baps.dev/");
		
		
		WebElement btn=driver.findElement(By.xpath("/html/body/app-root/baps-ui-home/div/div[2]/div[2]/div/div[3]/form/input[3]"));
		btn.click();
		WebElement username=driver.findElement(By.id("userName"));
		WebElement password=driver.findElement(By.name("password"));
		WebElement submit=driver.findElement(By.xpath("//*[@id=\"partial\"]/form/div[2]/button"));
		
		String taxt=driver.getTitle();
		
		
		{
			
			System.out.println(taxt);
		}
		
		
		username.sendKeys("5515296319");
		Thread.sleep(1000);
		password.sendKeys("Mysatsang@2711");
		Thread.sleep(1000);
		submit.click();
		Thread.sleep(1000);
		driver.close();
		

	}

}

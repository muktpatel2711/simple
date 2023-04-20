package sample_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();

		driver.get("https://ksrtc.in/oprs-web/");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"bookingsForm\"]/div[1]/div/div[2]/div[3]/button")).click();
		String tax=driver.switchTo().alert().getText();
		System.out.println(tax);
		
		if(tax.contentEquals("Please select start place."))
			
		{
			
			driver.switchTo().alert().accept();
			System.out.println("Correct Alert appeared");
		}
		else
		{
			
			System.out.println("Incorrect Alert appeared");
		}
	}

}

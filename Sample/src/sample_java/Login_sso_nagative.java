package sample_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_sso_nagative {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://dev-mis.baps.dev/");
		
		
		WebElement btn=driver.findElement(By.xpath("/html/body/app-root/baps-ui-home/div/div[2]/div[2]/div/div[3]/form/input[3]"));
		btn.click();
		WebElement username=driver.findElement(By.id("userName"));
		WebElement password=driver.findElement(By.name("password"));
		WebElement submit=driver.findElement(By.xpath("//*[@id=\"partial\"]/form/div[2]/button"));
		
		
		WebElement  act=driver.findElement(By.xpath("//*[@id=\"partial\"]/form/div[1]/div[3]/ul/li"));
		
		String verify=act.getText();
		{
			System.out.println(verify);
		}
		
		if (verify.contains("User not found."))
				
				{
			System.out.println("pass");
			
				}
		else
			
		{
			
			System.out.println("Fail");
		}
			
				
		
		

		

		
		
		
	
		username.sendKeys("5515296313");
		Thread.sleep(1000);
		password.sendKeys("Mysatsang@2711");
		Thread.sleep(1000);
		submit.click();
		Thread.sleep(1000);
		driver.close();

	}

}

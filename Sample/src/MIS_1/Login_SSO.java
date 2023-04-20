package MIS_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Login_SSO {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://dev-mis.baps.dev");
		driver.manage().window().maximize();
		

		
		WebElement sso=driver.findElement(By.xpath("/html/body/app-root/baps-ui-home/div/div[2]/div[2]/div/div[3]/form/input[3]"));
		sso.click();
		
		WebElement username=driver.findElement(By.name("userName"));
		WebElement password=driver.findElement(By.name("password"));
		WebElement submit=driver.findElement(By.xpath("//*[@id=\"partial\"]/form/div[2]/button"));
		
		username.sendKeys("5515296319");
		password.sendKeys("Mysatsang@2711");
		submit.click();
		
		driver.getTitle();
		
		String at="BAPS SSO";
		
		String et=driver.getTitle();
		
		if(at.contentEquals(et))
			
		{
			System.out.println("SSO-Fail");
			
		}
		else 
		
		{
			
			System.out.println("SSO-Pass");
			
		}
		
		Thread.sleep(1000);
		
		WebElement Position=driver.findElement(By.xpath("/html/body/app-root/baps-ui-login-home/div[2]/div/div/div[2]/div/div/span[4]/button"));
		Position.click();
		
	//	Thread.sleep(1000);
		
		Actions btn=new Actions(driver);
		
		WebElement log=driver.findElement(By.xpath("/html/body/app-root/app-dashboard/app-header/header/div[2]/div[3]/div/div[2]/button[2]/i"));
		
		btn.moveToElement(log).build().perform();
	}

}

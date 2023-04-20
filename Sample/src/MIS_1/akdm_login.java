package MIS_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class akdm_login {


	public static void main(String[] args) throws InterruptedException {
		
			WebDriver driver=new ChromeDriver();
			driver.get("https://akshardhamseva.org/");
		
			driver.manage().window().maximize();
			
			WebElement login=driver.findElement(By.xpath("//button[@label='Login with BAPS SSO']"));
			login.click();
			
			WebElement username=driver.findElement(By.name("userName"));
			username.sendKeys("5515296319");
			WebElement password=driver.findElement(By.name("password"));
			password.sendKeys("Satsang@2711");
			WebElement sign=driver.findElement(By.xpath("//button[@class='btn btn-primary btn-submit']"));
			sign.click();
			
			Thread.sleep(1000);
			
			/*WebElement seva=driver.findElement(By.xpath("//a[@href='/akdm/assigned-seva']"));
			seva.click();
			
			Thread.sleep(1000);
			
			WebElement name=driver.findElement(By.xpath("//*[@id=\"pr_id_5-table\"]/tbody/tr[1]"));
			String er=name.getText();
			
			System.out.println(er);
			
			String tx="Bhaktiswarupdas Sadhu 7323958137";
			
			if(er.equals(tx))
			{
				System.out.println("true");
				
			}
			else
			{
				System.out.println("false");
			}*/
			
			
			WebElement invi=driver.findElement(By.xpath("//a[@href='/akdm/seva-invitation']"));
			invi.click();
			
	
			
			WebElement day=driver.findElement(By.xpath("/html/body/app-root/app-akdm/div/div[3]/div/app-seva-invitation/div/div/p-card/div/div[1]/div/div[2]"));
			day.click();
			
			
			

	}

}

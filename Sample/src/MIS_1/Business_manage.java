package MIS_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Business_manage {

	
		
		
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.get("https://dev-mis.baps.dev/dashboard");
			driver.manage().window().maximize();
			

			
			WebElement sso=driver.findElement(By.xpath("/html/body/app-root/baps-ui-home/div/div[2]/div[2]/div/div[3]/form/input[3]"));
			sso.click();
			
			WebElement username=driver.findElement(By.name("userName"));
			WebElement password=driver.findElement(By.name("password"));
			WebElement submit=driver.findElement(By.xpath("//*[@id=\"partial\"]/form/div[2]/button"));
			
			username.sendKeys("5515296319");
			password.sendKeys("Mysatsang@2711");
			submit.click();
			
			
			
			Thread.sleep(1000);
			
			WebElement Position=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
			Position.click();
			
			Thread.sleep(1000);
			
			WebElement mb=driver.findElement(By.xpath("//*[@id=\"mainmenu\"]/div/perfect-scrollbar/div/div[1]/ul/li[5]/a/span"));
			mb.click();
			
			Thread.sleep(1000);
			
			//WebElement sb=driver.findElement(By.xpath("//*[@id=\"managepersonmenu\"]/ul/li[1]/a"));
			//sb.click();
			//WebElement sb=driver.findElement(By.linkText("/manage-business/search-business"));
			
			Thread.sleep(1000);
			
			//WebElement ab=driver.findElement(By.id("addnewlink"));
			//ab.click();
			
			//driver.close();
			//driver.quit();
			
		

	}

}

package MIS_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SSO_Reset {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://dev-mis.baps.dev/");
		

		
		WebElement sso=driver.findElement(By.xpath("/html/body/app-root/baps-ui-home/div/div[2]/div[2]/div/div[3]/form/input[3]"));
		sso.click();
		
		WebElement reset=driver.findElement(By.id("homeForgetPassword"));
		 reset.click();
		 
		 WebElement email=driver.findElement(By.name("userName"));
		 email.sendKeys("5515296319");
		 
		 WebElement resetlink=driver.findElement(By.id("btnSendCode"));
		 
		 resetlink.click();
		 
		 Thread.sleep(1000);
		 
		 WebElement c=driver.findElement(By.xpath("//*[@id=\"txtCode\"]"));
		 c.sendKeys("154012");
		 
		 WebElement pass=driver.findElement(By.name("password"));
		 pass.sendKeys("Mysatsang@2711");
		 
		 WebElement confpass=driver.findElement(By.name("password"));
		 confpass.sendKeys("Mysatsang@2711");
		 
		 if(driver.getPageSource().contains("Password must meet the following requirements:"))
		 
		 {
			 
			 System.out.println("Reset pages");
			 
		 }
		 
		 else {
			 

			 System.out.println("Reset pages is not");
		 }
		
		 
		 WebElement re=driver.findElement(By.xpath("//*[@id=\"btnResetPassword\"]"));
		 re.click();
	
		driver.close();

	}

}

package MIS_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_SSO_Nagative {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://dev-mis.baps.dev/");
		
		WebElement sso=driver.findElement(By.xpath("/html/body/app-root/baps-ui-home/div/div[2]/div[2]/div/div[3]/form/input[3]"));
		sso.click();
		
		WebElement username=driver.findElement(By.name("userName"));
		WebElement password=driver.findElement(By.name("password"));
		WebElement submit=driver.findElement(By.xpath("//*[@id=\"partial\"]/form/div[2]/button"));
		
		username.sendKeys("5515296317");
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
		
		
		
		driver.close();

	}



}

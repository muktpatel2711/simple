package MIS_1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class copy_pas {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://dev-mis.baps.dev");
		driver.manage().window().maximize();
		

		
		WebElement sso=driver.findElement(By.xpath("/html/body/app-root/baps-ui-home/div/div[2]/div[2]/div/div[3]/form/input[3]"));
		sso.click();
		
		
		
		Actions act=new Actions(driver);
		
		WebElement username=driver.findElement(By.name("userName"));
		WebElement password=driver.findElement(By.name("password"));
	     username.sendKeys("muktpatel@2711");
	     Thread.sleep(1000);
	     act.click(username)
	     .keyDown(org.openqa.selenium.Keys.CONTROL)
	     .sendKeys("a")
	     .sendKeys("c")
	     .keyUp(org.openqa.selenium.Keys.CONTROL)
	     .click(password)
	     .keyDown(org.openqa.selenium.Keys.CONTROL)
	     .sendKeys("v")
	     .keyUp(org.openqa.selenium.Keys.CONTROL)
	     .build().perform();
	  
		
		
		
		
		
		
		
		
		
		
		
	}

}

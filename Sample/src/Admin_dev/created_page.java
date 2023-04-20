package Admin_dev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class created_page {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://dev.baps.dev/mysatsang-admin/");
		
		Thread.sleep(500);
		
		created_page ln=new created_page();
		
		ln.login();
		

		WebElement username=driver.findElement(By.name("userName"));
		username.sendKeys("5515296319");
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("Mysatsang@2711");
		WebElement sign=driver.findElement(By.xpath("//*[@id=\"partial\"]/form/div[2]/button"));
		sign.click();
 
	}
	
	public void login() {
		WebElement click=driver.findElement(By.name("submit"));
		click.click();
		
	}

}

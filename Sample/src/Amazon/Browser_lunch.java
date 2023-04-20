package Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_lunch {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
	
		driver.manage().window().maximize();
		

		
		driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
		
		
		driver.close();

	}

}

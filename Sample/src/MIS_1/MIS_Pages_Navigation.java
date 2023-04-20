package MIS_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MIS_Pages_Navigation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://dev-mis.baps.dev/");
		

		
		WebElement sso=driver.findElement(By.xpath("/html/body/app-root/baps-ui-home/div/div[2]/div[2]/div/div[3]/form/input[3]"));
		sso.click();
		
		Thread.sleep(1000);
	
		driver.navigate().back();
		
		driver.navigate().refresh();
		
		//driver.close();

	}

}

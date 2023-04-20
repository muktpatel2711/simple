package Amazon;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class IF {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.baps.org/");
		driver.manage().window().maximize();

		
		
		WebElement  a=driver.findElement(By.xpath("//*[@id=\"owl-slider90113\"]/div[1]/div/div[3]/div/a/div"));
		
		String taxe= a.getText();
		
		 
		 
		 if(taxe.contentEquals(""))
		 {
			 
			 System.out.println(true);
		 }
		 else {
			 
			 System.out.println(false);
			 
		 }
		
		
		
		
		
		
		
	}

}

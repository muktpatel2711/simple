package MIS_1;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Alart_accept {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.baps.org/");
		

		
		
		String tax=driver.switchTo().alert().getText();
		
		if(tax.contentEquals("This site uses cookies. Read how we use them, in our privacy policy"))
		
		{
		driver.switchTo().alert().accept();
	
		System.out.println("valid");
		}
		else
		{
			System.out.println("invalid");
		}
		
		
	
	}

}

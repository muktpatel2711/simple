package sample_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drop_drage {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		WebElement drop=driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(drop);
		
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement dr=driver.findElement(By.id("droppable"));
		Actions frame=new Actions(driver);
		frame.dragAndDrop(drag, dr).perform();
	}

}



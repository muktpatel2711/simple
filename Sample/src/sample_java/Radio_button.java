package sample_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_button {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.airindia.in/");
	
		driver.manage().window().maximize();
		
		WebElement si=driver.findElement(By.xpath("//*[@id=\"home\"]/div[2]/div/div[2]"));
		si.getSize();
		
		System.out.println(si.getSize());


	}

}

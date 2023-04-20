package sample_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_uploaded {

	

		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://tools.picsart.com/convert/jpg-to-png/?utm_source=google&utm_medium=ppc&utm_campaign=19074626560&adgroupid=147791221870&utm_term=jpg%20to%20png%20converter%20online&gclid=Cj0KCQiA_P6dBhD1ARIsAAGI7HA6wW9Xwx0jWcynL3huwIMqgRWfhCOjxmD-3TaqkV37YJRXBWiDD4caAsAJEALw_wcB");
			 
			 WebElement image=driver.findElement(By.xpath("//*[@id=\"__next\"]/section[1]/article/div[2]/button/span"));
			 
			 image.click();
			 Thread.sleep(1000);
			 image.sendKeys("//Users//mukund//Desktop//mukund/02_Robbinsville_iPSM100_2022.jpeg");

	}

}

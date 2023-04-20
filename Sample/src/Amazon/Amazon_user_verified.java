package Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_user_verified {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
	
		driver.manage().window().maximize();
		
		WebElement p=driver.findElement(By.id("glow-ingress-line1"));
		String tx=p.getText();
		
		System.out.println(tx);
		
		WebElement today=driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[3]"));
		
		today.click();
		
		WebElement live=driver.findElement(By.xpath("//*[@id=\"live-flagship-root\"]/div/div[2]/div[2];"));
	live.getSize();
		
		System.out.println(live.getSize());
		

	}

}



//*[@id="live-flagship-root"]/div/div[2]/div[2];
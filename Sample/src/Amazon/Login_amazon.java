package Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_amazon {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
	
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
		
	
		WebElement username=driver.findElement(By.id("ap_email"));
		WebElement submit=driver.findElement(By.id("continue"));
		
		username.sendKeys("5515296319");
		submit.click();
		WebElement password=driver.findElement(By.id("ap_password"));
	password.sendKeys("Mysatsang@2711");
	WebElement sign=driver.findElement(By.id("signInSubmit"));
	sign.click();
	
	
	WebElement otp=driver.findElement(By.id("auth-mfa-otpcode"));
	otp.sendKeys("");
	
	

	WebElement su=driver.findElement(By.id("auth-signin-button"));
	su.click();
		
		driver.close();
	
	}

}

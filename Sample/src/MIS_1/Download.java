package MIS_1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Download {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://us.baps.store/");
		driver.manage().window().maximize();
		
		

		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1000)");
		
		Thread.sleep(1000);
		
		WebElement select=driver.findElement(By.xpath("//*[@id=\"new_product\"]/div/div/div[1]/div/div[9]/div/div/div[1]/div[1]/a/img"));
		
		select.click();
		
		Thread.sleep(1000);
		
		WebElement color=driver.findElement(By.xpath("//*[@id='option-label-carsticker_color-289-item-529']"));
		
		color.click();
		
		
		Thread.sleep(1000);
		
		WebElement add=driver.findElement(By.id("product-addtocart-button"));
		
		add.click();
		
		Thread.sleep(1000);
		
		String al=add.getText();
	
		if(al.contentEquals("GO TO CHECKOUT"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
			
		}
		
		Thread.sleep(1000);
		
		driver.navigate().back();
		
		Thread.sleep(1000);
				
		
		WebElement cart=driver.findElement(By.xpath("//*[@id=\"store.menu\"]/nav/div[2]/a"));
		
		cart.click();
		
		
		WebElement go=driver.findElement(By.xpath("//*[@id=\"top-cart-btn-checkout\"]"));
		
		go.click();
		
		Thread.sleep(1000);
		
		
		driver.findElement(By.name("username")).sendKeys("muktpatel2711@gmail.com");
		driver.findElement(By.name("firstname")).sendKeys("mukund");
		driver.findElement(By.name("lastname")).sendKeys("patel");
		
		
		
		
	

	}

}



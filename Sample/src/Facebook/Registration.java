package Facebook;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/sign%20up");
		
		Thread.sleep(500);
		
		WebElement create=driver.findElement(By.xpath("//a[@href='/r.php?r=101']"));
		create.click();
		
		WebElement name=driver.findElement(By.name("firstname"));
		name.sendKeys("Mukt");
		WebElement last=driver.findElement(By.name("lastname"));
		last.sendKeys("patel");
		WebElement mobile=driver.findElement(By.name("reg_email__"));
		mobile.sendKeys("1234567890");
		WebElement pass=driver.findElement(By.name("reg_passwd__"));
		pass.sendKeys("abcd");
		
		WebElement month=driver.findElement(By.id("month"));
		Select m1=new Select(month);
		//m1.selectByVisibleText("Dec");
		//month.getText();
		//System.out.println(month.getText());
		
		
		List<WebElement> m2=m1.getOptions();
		System.out.println(m2.size());
		
		for(int i=0; i<m2.size(); i++)
		{
			String m3=m2.get(i).getText();
			System.out.println(m3);
			m2.get(i).click();
				
		}
		
		Thread.sleep(500);
		
		WebElement day=driver.findElement(By.id("day"));
		Select d1=new Select(day);
		
		List<WebElement> d2=d1.getOptions();
		System.out.println(d2.size());
		
		for(int y=0; y<d2.size(); y++)
		{
			String d3=d2.get(y).getText();
			System.out.println(d3);
			d2.get(y).click();
				
		}
		
Thread.sleep(500);
		
		WebElement year=driver.findElement(By.id("year"));
		Select y1=new Select(year);
		
		List<WebElement> y2=y1.getOptions();
		System.out.println(y2.size());
		

		for(int z=0; z<y2.size(); z++)
		{
			String y3=y2.get(z).getText();
			System.out.println(y3);
			y2.get(z).click();
			
				
		}
		
		
		
		
		driver.close();
		driver.quit();
		

	}

}

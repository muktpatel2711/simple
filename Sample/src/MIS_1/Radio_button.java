package MIS_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Radio_button {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/sign%20up");
		Thread.sleep(1000);
		
		WebElement  cre =driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/a"));
		cre.click();
		
		WebElement first=driver.findElement(By.name("firstname"));
		first.sendKeys("Aman");
		WebElement last=driver.findElement(By.name("lastname"));
		last.sendKeys("patel");
		WebElement email=driver.findElement(By.name("reg_email__"));
		email.sendKeys("111111111");
		
		
		WebElement phone=driver.findElement(By.name("reg_passwd__"));
		phone.sendKeys("abcd@gmail.com");
		
		
		
		
		
		WebElement day=driver.findElement(By.id("day"));
		//day.click();
		
		Select d1= new Select(day);
		//d1.selectByIndex(2);
		//selectByVisibleText("2");
		d1.selectByValue("2");
		
		
	List<WebElement> dd=d1.getOptions();
		
	
	System.out.println(dd.size());
	
	for(int i=0; i< dd.size(); i++)
	{
		
		String tax = dd.get(i).getText();
	    System.out.println(tax);
	    dd.get(i).click();
		
	}
	
	Thread.sleep(1000);
		
		WebElement month=driver.findElement(By.id("month"));
		
		Select d2=new Select(month);
		d2.selectByVisibleText("Feb");
		
		List<WebElement> mm=d2.getOptions();
		System.out.println(mm.size());
		
		for(int y=0; y<mm.size(); ++y)
			
		{
			
		String m1=mm.get(y).getText();
		System.out.println(m1);
		mm.get(y).click();
			
		}
		
		Thread.sleep(1000);
		
		WebElement year=driver.findElement(By.id("year"));
		
	Select d3=new Select(year);
	
	d3.selectByVisibleText("2020");
	
	List<WebElement> yy=d3.getOptions();
	System.out.println(yy.size());
	
	for(int z=0; z<yy.size(); ++z)
		
	{
		
		String y1= yy.get(z).getTagName();
		System.out.println(y1);
		yy.get(z).click();
	}
		
		//Thread.sleep(1000);
		
		List<WebElement> gender=driver.findElements(By.name("sex"));
		int cnt=gender.size();
		
		System.out.println(cnt);
	
		for(int a=0; a<cnt; ++a)
			
		{
			String sel= gender.get(a).getTagName();
			
			System.out.println(sel);
			
			gender.get(a).click();
			
			
		}
			
		
	WebElement custom=driver.findElement(By.name("preferred_pronoun"));
	
		Select d4=new Select(custom);
		
		
		List<WebElement> d5=d4.getOptions();
		
		System.out.println(d5.size());
		
		for(int b=0; b<d5.size(); ++b)
		
		{
			
			String s1=d5.get(b).getTagName();
			System.out.println(s1);
			d5.get(b).click();
		}
		
		 
		
		
	
		

		
	
		
		//driver.close();
		
		
	}
}


 
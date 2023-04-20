package sample_java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First_case {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver",File.separator + "Users" + File.separator + "mukund"+File.separator + "Downloads" + File.separator + "chromedriver");
		//System.setProperty("webdriver.chrome.driver","//Users//mukund//Downloads//chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://dev-mis.baps.dev/");
	}

}

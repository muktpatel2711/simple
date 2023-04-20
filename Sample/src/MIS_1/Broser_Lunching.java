package MIS_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broser_Lunching {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://dev-mis.baps.dev/");
		driver.close();

	}

}

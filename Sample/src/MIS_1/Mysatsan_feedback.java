package MIS_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mysatsan_feedback {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://app.slack.com/client/T031T6C1CKT/C04GABTL84A/rimeto_profile/U04877SD8KD");
	
		driver.manage().window().maximize();
	}

}

package appium;

import java.io.File;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class LunchmySatsang {

	public static void main(String[] args) {
		

		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"sdk_gphone64_arm64");
		cap.setCapability(MobileCapabilityType.UDID,"sdk_gphone64_arm64");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13");
		cap.setCapability(MobileCapabilityType.APP, new File("/Users/mukund/Desktop/c1f5d756-63b2-400f-8775-bea86fd0f71c.apk").getAbsolutePath());
		
		
		AndroidDriver<WebElement> driver= new 
			
	
		
		
		
	}
	}



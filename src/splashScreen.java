import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;

public class splashScreen extends base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//xp ath syntax: //tagname[@attribute=value]
		//driver.findElementByXPath("//android.widget.Button[@text='Next']").click();
		/*
		 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 * driver.findElementByXPath("//android.widget.Button[@text='Next']").click();
		 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 * driver.findElementByXPath("//android.widget.Button[@text='Get Started']").
		 * click();
		 */
		TouchAction t = new TouchAction(driver);
		//longpress, on element for 1 sec ten release
		t.longPress(longPressOptions().)
	}
}
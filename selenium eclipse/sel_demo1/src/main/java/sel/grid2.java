package sel;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class grid2 {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities desiredCapabilities=new DesiredCapabilities();
		URL url=new URL("http://10.0.0.62:4444");
		desiredCapabilities.setBrowserName(BrowserType.CHROME);
		desiredCapabilities.setPlatform(Platform.WINDOWS);
		WebDriver driver=new RemoteWebDriver(url,desiredCapabilities);
		driver.manage().window().maximize();
		driver.get("http://google.com");
		Thread.sleep(10000);
		driver.quit();
		
	}
}

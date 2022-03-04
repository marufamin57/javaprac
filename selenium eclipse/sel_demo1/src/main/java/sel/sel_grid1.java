package sel;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class sel_grid1 {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		String node= "http://10.0.0.62:4444";
		String url="http://google.com";
		DesiredCapabilities desiredCapabilities1 = new DesiredCapabilities();
		desiredCapabilities1.setBrowserName("chrome");
		WebDriver driver = new RemoteWebDriver(new URL(node),desiredCapabilities1);
		
		driver.get(url);
		Thread.sleep(10000);
		
		WebElement search= driver.findElement(By.name("q"));
		search.sendKeys("amazon");
		search.sendKeys(Keys.ENTER);
		Thread.sleep(10000);
		driver.close();
		driver.quit();
		
	}
}

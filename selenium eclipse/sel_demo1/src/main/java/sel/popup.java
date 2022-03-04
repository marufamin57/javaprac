package sel;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\maruf\\Desktop\\lab\\library\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();;
	Thread.sleep(1000);
	driver.get("https://demoqa.com/browser-windows");
	driver.findElement(By.id("messageWindowButton")).click();
	Thread.sleep(2000);
	String mainwindow= driver.getWindowHandle();
	Set<String> window= driver.getWindowHandles();
	Iterator<String> iterable= window.iterator();
	
	while (iterable.hasNext()) {
		iterable.next();
		String popup= driver.getWindowHandle();
		if (!popup.equals(mainwindow)) {
			driver.switchTo().window(popup);
			String text= driver.getPageSource();
			Thread.sleep(2000);
			System.out.println(text);
			driver.close();
		} 
		
	}
	driver.switchTo().window(mainwindow);
	String text= driver.getPageSource();
	System.out.println(text);
	driver.quit();
}
}

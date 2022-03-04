package sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class sel1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\maruf\\Downloads\\msedgedriver.exe");

//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\maruf\\Desktop\\lab\\library\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
		WebDriver driver =new EdgeDriver();
		driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://google.com");
//		String text= driver.getPageSource();
//		System.out.println(text);
		Thread.sleep(3000);
		WebElement search= driver.findElement(By.name("q"));
		search.sendKeys("amazon");
		search.sendKeys(Keys.ENTER);
//		driver.get("http://yahoo.com");
		Thread.sleep(3000);;
		WebElement amazon= driver.findElement(By.xpath("//h3[text()='Amazon.com. Spend less. Smile more.']"));
		amazon.click();
		Thread.sleep(3000);
		driver.close();
	}
}

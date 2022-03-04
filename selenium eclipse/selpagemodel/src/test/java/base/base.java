package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class base {
	
	public static WebDriver driver;
	
	public static void start(String browser) {
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\maruf\\Desktop\\lab\\library\\chromedriver.exe");
			driver=new ChromeDriver();
		}else if (browser.equals("edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\maruf\\Downloads\\msedgedriver.exe");

			driver= new EdgeDriver();
		}else {
			System.out.println("please correct browser name");
		}
	}
	
	public static void close(){
		
		if (driver !=null) {
			driver.quit();
		}
		
	}
	
	

}

package sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class robot {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\maruf\\Desktop\\lab\\library\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	}
}

package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
    public static WebDriver browser;

    public void start(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\maruf\\Desktop\\lab\\library\\chromedriver.exe");
        browser = new ChromeDriver();
        browser.get("http://google.com");
    }
    public void close(){
        browser.close();
    }
}

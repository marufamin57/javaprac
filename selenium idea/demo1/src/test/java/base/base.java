package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
    public static WebDriver browser;
    String url= "http://google.com";
    public void start() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\maruf\\Desktop\\lab\\library\\chromedriver.exe");
        browser = new ChromeDriver();
        browser.get(url);
        browser.manage().window().maximize();
        Thread.sleep(3000);

    }
    public void close(){
        browser.close();
    }
}

package pargraphmining;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Mining {
	
	public void getparagraph(String url) throws InterruptedException, IOException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\maruf\\Desktop\\lab\\library\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get(url);
		PrintWriter write = new PrintWriter(new FileWriter(driver.getTitle()+".txt"));
        write.flush();
		List<WebElement> ele = driver.findElements(By.tagName("p"));
		for (WebElement z : ele) {
            String st=z.getText();
            write.append(st);
            write.append("\n");
        }
		Thread.sleep(3000);
		driver.close();
		write.close();
		
	}
	public static void main(String[] args) throws InterruptedException, IOException {
		Mining mining=new Mining();
		mining.getparagraph("https://en.wikipedia.org/wiki/Donald_Trump");
	}
}

package sel;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class action {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\maruf\\Desktop\\lab\\library\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//		driver.get("https://jqueryui.com/droppable/");
//		driver.switchTo().frame(0);
//		WebElement source =driver.findElement(By.id("draggable"));
//		WebElement target =driver.findElement(By.id("droppable"));
		Actions action= new Actions(driver);
//		action.dragAndDrop(source, target).build().perform();
//		Thread.sleep(3000);
//		System.out.println(target.getText());
		driver.get("https://jqueryui.com/slider/#slider-vertical");
		driver.switchTo().frame(0);
		WebElement value= driver.findElement(By.id("amount"));
		Thread.sleep(3000);
		try {
			
			System.out.println(value.getAttribute("value"));
			WebElement slider= driver.findElement(By.xpath("//*[@id=\"slider-vertical\"]/span"));
			action.dragAndDropBy(slider, 0, 2*60).build().perform();
			Thread.sleep(3000);
			System.out.println(value.getAttribute("value"));
		} catch (Exception e) {
			// TODO: handle exception
		}
		
//		Action action2= (Action) 
		
		driver.quit();
	}
}

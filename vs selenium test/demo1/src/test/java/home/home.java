package home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.base;

public class home extends base {
    // base base = new base();
   public WebElement getTitle(){
        return browser.findElement(By.xpath("/html/head/title"));
    }
}

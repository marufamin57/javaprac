package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */
public class AppTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\maruf\\Desktop\\lab\\library\\chromedriver.exe");
        WebDriver browser= new ChromeDriver();
        browser.get("http://google.com");
        String title=browser.findElement(By.tagName("input")).getAttribute("aria-label");
        System.out.println("title  "+title);
        browser.close();
    }
}

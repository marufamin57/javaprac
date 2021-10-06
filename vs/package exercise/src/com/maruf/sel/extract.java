package com.maruf.sel;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class extract {
    public static void main(String[] args) throws InterruptedException, IOException {
        PrintWriter write = new PrintWriter(new FileWriter("genereted.txt"));
        write.flush();
        System.setProperty("webdriver.chrome.driver","C:\\Users\\maruf\\Desktop\\lab\\library\\chromedriver.exe");
        WebDriver d=new ChromeDriver();
        d.get("https://en.wikipedia.org/wiki/Java_(programming_language)");
        List<WebElement> q=d.findElements(By.tagName("p"));
        for (WebElement z : q) {
            String st=z.getText();
            write.append(st);
            write.append("\n");
        }
        Thread.sleep(5000);
        d.close();
        write.close();

    }
}

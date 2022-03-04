package test;


import base.base;
import pages.home;

public class test1 extends base {
	
	
	public static void main(String[] args) throws InterruptedException {
		String browser="chrome";
		start(browser);
		driver.manage().window().maximize();;
		driver.get("http://amazon.com");
		home h= new home(driver);
		h.setsearchkey("sony xm4");
		h.presssearchbutton();
		Thread.sleep(3000);
		close();
	}
}

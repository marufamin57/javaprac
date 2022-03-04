package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.base;

public class home {
	WebDriver driver;
	
	public home(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id =  "twotabsearchtextbox")
	WebElement searchbox;
	
	public void setsearchkey(String s) {
		searchbox.sendKeys(s);
	}
	@FindBy(id= "nav-search-submit-button")
	WebElement searchbutton;
	public void presssearchbutton() {
		searchbutton.click();
	}
}

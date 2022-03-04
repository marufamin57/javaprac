package testng_demo1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test1 {
	@BeforeSuite
	public void bf() {
		System.out.println(" before suit");
	}

	@BeforeClass
	public void bc() {
		System.out.println(" before class");
	}

	@BeforeMethod
	public void bm() {
		System.out.println(" before method");
	}
	@BeforeTest
	public void bt() {
		System.out.println(" before test");
	}
	@Test(priority = 2)
	public void test() {
		System.out.println("testing");
	}
	@AfterSuite
	public void af() {
		System.out.println(" after suit");
	}

	@AfterClass
	public void ac() {
		System.out.println(" after class");
	}

	@AfterMethod
	public void am() {
		System.out.println(" after method");
	}
	@AfterTest
	public void at() {
		System.out.println(" after test");
	}
	@Test(priority = 1)
	public void test2() {
		System.out.println("testing 2");
	}
}

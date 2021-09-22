package test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.cucumber.java.Before;

public class t1 {
@BeforeMethod
public void start() {
	System.out.println("start");
}
@AfterMethod
public void finish() {
	System.out.println("finish");
}
@Test
public void test1() {
	System.out.println("test 1");
	assertEquals(5, 5);
}
@Test
public void test2() {
	System.out.println("test 2");
	assertEquals(4, 4);
}
}

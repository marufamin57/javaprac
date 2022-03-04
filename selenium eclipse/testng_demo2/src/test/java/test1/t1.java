package test1;



import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class t1 {
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
	@Test(priority = 2,dependsOnGroups = "a",groups = {"b","c"})
	public void test() {
		System.out.println("testing 1");
	}
	@Test(priority = 1,groups = "a")
	public void test2() {
		System.out.println("testing 2");
//		Assert.fail();
	}
	@Test(priority = 3,groups = "a")
	public void test3() {
		System.out.println("testing 3");
//		Assert.fail();
	}
	@Test(groups = "c",invocationCount = 5)
	public void test4() {
		System.out.println("testing 4");
	}
	@Test(timeOut = 1000)
	public void test5() throws InterruptedException {
//		while (true) {
//			System.out.println("testing 5");
//			Thread.sleep(1000);
//			break;
//		}
		}
		@Test(expectedExceptions = ArithmeticException.class)
		public void test6(){
			System.out.println("testing 6");
			System.out.println(4/0);
		}
		@Test
		public void test7(){
			System.out.println("testing 7");
//			assertEquals(4, 4,"not matched dfghj");
			Assert.fail();
		}
	
	}

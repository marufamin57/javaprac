package parameter_demo;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Vector;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

class p1 {
	@Parameters({ "str1" })
	@Test
	public void t1(String str1) {
		System.out.println(str1);
	}

	@Parameters({ "sum", "str1" })
	@Test
	public void t2(int sum, String str1) {
		System.out.println(sum);
		System.out.println(str1);
	}

	@Test
	public void t3() {
		try {
			FileInputStream fileInputStream = new FileInputStream("a.properties");
			Properties properties = new Properties();
			properties.load(fileInputStream);
			System.out.println(properties.getProperty("name"));
			System.out.println(properties.getProperty("id"));
			fileInputStream.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();0 
		}
	}

	@SuppressWarnings("deprecation")
	@DataProvider(name = "test")
	public Object[][] createdata() {
		
		return new Object[][] { { "a", new Integer(1) }, { "b", new Integer(4) } };
	
	}

	@Test(dataProvider = "test")
	public void t4(String s,Integer l) {
		System.out.println(s+"  "+l);
//		System.out.println(l);
	}
	@DataProvider(name = "test1")
	public Iterator<Data> createdata1() {
		
		Vector<Data> vector=new Vector<Data>();
		
		vector.add(new Data("a", 1));
		vector.add(new Data("b", 1001));
		Iterator<Data> iterator=vector.iterator();
		return iterator;
	}
		
		@Test(dataProvider = "test1")
		public void t5(Data l) {
			
			System.out.println(l.getname());
			System.out.println(l.getid());
		} 
	
}
class Data{
	private String name;
	private int id;
	public Data(String name,int id) {
		this.id=id;
		this.name=name;
	}
	String getname() {
		return name;
	}
	int getid() {
		return id;
	}
}

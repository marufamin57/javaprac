package exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class test {
	public static void main(String[] args) throws marufException{
		try {
			send.share(-20, "444");
		} 
		catch (IllegalAccessException e) {
			System.out.println("avoid exception");
//			throw e;
//			e.printStackTrace();
		}
		catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println("avoid 2nd exception");
		}catch (IllegalArgumentException e) {
			System.out.println("i cannot be negative");
			System.out.println(e);
		}catch (marufException e) {
			// TODO: handle exception
			System.out.println("maruf");
			System.out.println(e);
		}finally {
			System.out.println("completed try catch");
		}
		System.out.println("after");
//		try {
//			System.out.println(1/0);
//		} catch (ArithmeticException e) {
//			// TODO: handle exception
//			System.err.println("dividing by zero");
//		}
		
	}
}

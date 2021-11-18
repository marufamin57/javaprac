package exception;

import interfaceprac.int1;

public class assertprac {
	public static void main(String[] args)
	   {
	      int age = 10;
	      assert age >= 18 : "Cannot Vote";
//	      assert(4,4);
	      System.out.println("The voter's age is " + age);
	   }
}

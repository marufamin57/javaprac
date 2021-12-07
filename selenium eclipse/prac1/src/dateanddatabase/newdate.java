package dateanddatabase;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

import interfaceprac.int1;

public class newdate {
	public static void main(String[] args) {
		thisdemo n=new thisdemo(45);
		n.print(n);
		LocalDate time= LocalDate.now();
		System.out.println(time);
		LocalDateTime time1= LocalDateTime.of(2000, Month.MAY, 25, 0, 0);
		System.out.println(time1);
		LocalDate q= LocalDate.of(2000, 5, 20).plusMonths(8).minusDays(8);
		System.out.println(q);
		LocalDate q1= LocalDate.parse("1111-11-11");
		System.out.println(q1);
	}
}

class thisdemo{
	int id;
	public thisdemo(int id) {
		// TODO Auto-generated constructor stub
		this.id=id;
		
	}
	void print(thisdemo z) {
		test(this);
	}
	void test(thisdemo z) {
		System.out.println("accessing this "+id);
	}
}

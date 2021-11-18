package nestedclass;

public class anonymous {
public static void main(String[] args) {
	int z= new fool(400,"789000") {
		int go() {
			return q1.length();
		}
	}.go(); //because q1 is local variable in fool class
	System.out.println(z);
	qwe q=new qwe() {
		public void zxc() {
			System.out.println("123456");
		}
	};
	q.zxc();
}
}
interface qwe{
	void zxc();
}
class fool{
	int q= 0;
	String q1;
	fool(int q, String q1){
		this.q=q;
		this.q1=q1;
	}
}

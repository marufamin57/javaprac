package enumdemo;
public enum demoenum1 {
	A(12){
		public boolean isbigger(int z) {
			if(z>a) {
				return true;
			}else {
				return false;
			}
		}
	},
	B(50){
		public boolean isbigger(int z) {
			if(z>a) {
				return true;
			}else {
				return false;
			}
		}
	},
	C(300){
		public boolean isbigger(int z) {
			if(z>a) {
				return true;
			}else {
				return false;
			}
		}
	};
	public abstract boolean isbigger(int z);
	 private demoenum1(int i) {
		this.a=i;
	}
	 protected int a;
	 public int get() {
		 return a;
	 }
	public static void main(String[] args) {
		System.out.println(demoenum1.A.get());
		System.out.println(demoenum1.A.isbigger(20));
		for (demoenum1 string : demoenum1.values()) {
			System.out.println(string.get());
			System.out.println(string.isbigger(100));
		}
	}
}

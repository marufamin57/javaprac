package classes;


public class add_numbers {
	private double sumdouble = 0;
	private int sumint = 0;
	private double[] q1;
	private int[] q2;
	
	public add_numbers(double... z) {
		for (int i = 0; i < z.length; i++) {
			this.q1[i]=z[i];
		}
	}

	public add_numbers(int... z) {
		for (int i = 0; i < z.length; i++) {
			this.q2[i]=z[i];
		}
	}


	public int getintsum() {
		for (int i = 0; i < q2.length; i++) {
			sumint=sumint+q2[i];
		}
		return sumint;
	}
	public double getdoublesum() {
		for (int i = 0; i < q1.length; i++) {
			sumdouble=sumdouble+q1[i];
		}
		return sumdouble;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
}

package Complex;

public class Complex {
	private double x;
	private double y;

	public Complex(double x, double y) {
		this.x = x;
		this.y = y;
	}

	static {
		System.out.println("complex number created");
	}
	public Complex conj() {
		return new Complex(x,-y);
	}
	public double arg() {
		return Math.atan(y/x);
	}
	public Complex div(double c) {
		return this.multiplication((1/c), 0);
	}
	public Complex div(double x,double y ) {
		return this.multiplication(x,-y).div(x*x+y*y);
	}
	public Complex div(Complex c) {
		return this.multiplication(c.conj()).div(c.modulus()*c.modulus());
	}
	public Complex multiplication(double x, double y) {
		Complex temp = new Complex(this.x*x-this.y*y,this.x*y+this.y*x);
		return temp;
	}

	public Complex multiplication(Complex c) {
		Complex temp = new Complex(this.x*c.x-this.y*c.y,this.x*c.y+this.y*c.x);
		return temp;
	}
	public Complex multiplication(Double c) {
		Complex temp = this.multiplication(c, 0);
		return temp;
	}

	public double modulus() {
		return Math.sqrt(x * x + y * y);

	}

	public Complex subtraction(double x, double y) {
		return this.addition(-x, -y);
	}

	public Complex subtraction(Complex c) {
		return this.addition(-c.x, -c.y);
	}
	public Complex subtraction(double c) {
		return this.addition(-c, 0);
	}
	public Complex addition(double c) {
		return this.addition(c, 0);
	}
	public Complex addition(double x, double y) {
		return new Complex(this.x+x, this.y+y);
	}

	public Complex addition(Complex c) {
		return new Complex(this.x+c.x, this.y+c.y);
	}

	public void print() {
		if (y < 0) {
			System.out.println("" + x + y + "i");
		}
		else if (y > 0) {
			System.out.println("" + x + "+" + y + "i");
		} 
		else {
			System.out.println("" + x);
		}

	}
}

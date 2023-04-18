package study11_1;

//class MtMath <---------------Calculator
interface Calculator {
	public double oper(double x, double y);
}

class MyMath implements Calculator{
	public double oper(double x, double y) {
		return x+y;
	}
}

public class ClassMain2 {
	
	public static void main(String[] args) {
		Calculator c1 = new MyMath();
		double res = c1.oper(3.0, 7.0);
		System.out.println(res);
		
		Calculator c2 = new Calculator() {
			public double oper(double x, double y) {
				return x*y;
			}
		};
		System.out.println(c2.oper(3.0, 7.0));
		
		Calculator c3 = new Calculator() {
			public double oper(double x, double y) {
				return Math.pow(x, y);
			}
		};
		System.out.println(c3.oper(3.0, 7.0));
	
	}
}


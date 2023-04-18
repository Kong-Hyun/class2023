package study11;

abstract class AbstractClass{
	int a = 10, b = 20;
	abstract int sum(int a);
}

class NormalClass{
	int a = 10, b = 20;
	int sum(int c) {
		return a+b+c;
	}
	
}


public class ClassMain {
	
	public static void main(String[] args) {
		NormalClass nor = new NormalClass();
		System.out.println(nor.sum(10));
		
		//익명클래스를 사용하여 추상클래스를 객채화
		AbstractClass Abs = new AbstractClass() {
			int c = 30;
			int sum(int a) {
				return this.a+b+a+c;
			}
			
		};
		System.out.println(Abs.sum(15));
		//익명클래스를 사용하여 일반 클래스도 객체화 할 수 있다.
		NormalClass nor2 = new NormalClass() {
			int d = 40;
			int sum(int c) {
				return a+b+c+d;
			}
		};
		System.out.println(nor2.sum(40));
		
		
		//System.out.println(안에 익명클래스를 사용하여 바로 결과값을 출력 할 수 있다.);
		System.out.println(new NormalClass().sum(10));
		System.out.println(new NormalClass() {
			int d = 40;
			int sum(int c) {
				return a+b+c+d;
			}
		}.sum(100));
		
	}

}

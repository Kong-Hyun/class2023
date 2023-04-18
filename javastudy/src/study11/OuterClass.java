package study11;

public class OuterClass {
	//inner class 내부 클래스
	class Inner {
		int a = 100;
		static int con = 100;
		final static int CON = 100;
	}
	//static inner class 정적 내부 클래스
	static class StaticInner{
		int a = 200;
		static int con = 200;
	}
	void method() {
		//Local inner class 지역클래스
		class LocalInner{
			int a = 300;
			static int con = 300;
			final static int CON = 300;
			public void displayNum() {
				System.out.println("a:" + a);
				System.out.println("con:" + con);
				System.out.println("CON:" + CON);
			}
		}
		LocalInner loc = new LocalInner();
		loc.displayNum();
	}
	
	
	public static void main(String[] args) {
		System.out.println(Inner.CON);
		System.out.println(Inner.con);
		//System.out.println(Inner.a);  int a는 객체선언을 하지않으면 사용할 수 없음
		//Inner in = new Inner(); 내부클래스는 직접 개체생성 불가능
		//OuterClass.Inner out2 = new OuterClass.Inner(); 불가능
		OuterClass out = new OuterClass();
		OuterClass.Inner outIn = out.new Inner();
		System.out.println(outIn.a);
		
		
		System.out.println(StaticInner.con);
		//System.out.println(StaticInner.a);
		OuterClass.StaticInner outSin = new OuterClass.StaticInner();
		System.out.println(outSin.a);
		
		//System.out.println(LocalInner.con);
		out.method();
	}

}

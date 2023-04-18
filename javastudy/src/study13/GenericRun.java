package study13;

/*
 * Generic(제너릭)
 * 1. 컴파일 타입 체크
 * 2. 형변환이 불필요
 * 3. 코드 재사용성이 유리
 * T-type E-element K-key V-value N-number
 */

//제너릭 클래스 생성
class GenericClass<T> {
	//제너릭 타입 변수
	private T dataType; 
	//제너릭 매개변수
	void setDataType(T dateType) { 
		this.dataType = dateType;
	}
	//제너릭 타입 반환
	T getDataType() { 
		return dataType;
	}
	//제너릭 메서드
	//static을 입력하여야 메모리가 할당되어 메서드 출력이 가능해짐.
	static <V> V genericMethod1(V value) {
		return value;
	}
	<T> T genericMethod2(T value) {
		return value;
	}
}
class GenericClass2<K,V> {
	private K first;
	private V second;
	
	//제너릭 매개변수
	void set(K first,V second) { 
		this.first = first;
		this.second = second;
	}
	K getFirst() {
		return first;
	}
	V getSecond() {
		return second;
	}
}

public class GenericRun {
	public static void main(String[] args) {
		GenericClass<String> a = new GenericClass<>();
		GenericClass<Integer> b = new GenericClass<>();
		GenericClass<Double> c = new GenericClass<>();
		a.setDataType("10");
		b.setDataType(10);
		c.setDataType(1.1111);
		System.out.println(a.getDataType());
		System.out.println(a.getDataType().getClass().getName());
		System.out.println(b.getDataType());
		System.out.println(b.getDataType().getClass().getName());
		System.out.println(c.getDataType());
		System.out.println(c.getDataType().getClass().getName());
		System.out.printf("\n");//줄바꿈
		
		GenericClass2<String, Integer> d = new GenericClass2<>();
		d.set("반장 호진이의 IQ", 170);
		System.out.println(d.getFirst());
		System.out.println(d.getSecond());
		System.out.println(d.getFirst().getClass().getName() + "\n" +d.getSecond().getClass().getName());
		System.out.printf("\n");//줄바꿈
		
		//generic method
		System.out.println(a.genericMethod2(3));
		System.out.println(a.genericMethod2("문자열"));
		System.out.println(a.genericMethod2(b));
		
		
		//static을 입력하여야 메모리가 할당되어 메서드 출력이 가능해짐.
		System.out.println(GenericClass.genericMethod1("정적"));
		
	}
	
	
	
	
}

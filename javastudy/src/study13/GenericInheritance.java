package study13;

class Parents<T> {
	private T t;
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
}

class FirstChild<T> extends Parents<T> {
	
}
class SecondChild<T, V> extends Parents<T> {
	private V v;
	public V getV() {
		return v;
	}
	public void setV(V v) {
		this.v = v;
	}
}
//제너릭 메서드 상속
class Sup{
	<T extends Number> void testMethod(T t) {
		System.out.println(t);
	}
}
class Under extends Sup {
	
}

public class GenericInheritance {
	
	public static void main(String[] args) {
		Parents<String> parents = new Parents<>();
		parents.setT("Parents generic class");
		System.out.println(parents.getT());
		
		FirstChild<String> fchild = new FirstChild<>();
		fchild.setT("First child 제너릭 클래스를 상속받은 제너릭 클래스");
		System.out.println(fchild.getT());
		
		SecondChild<String, Double> schild = new SecondChild<>();
		schild.setT("Second child 제너릭 클래스를 상속받은 제너릭 클래스");
		schild.setV(3.14);
		System.out.printf("%s : %.3f %n",schild.getT() , schild.getV());
		
		
		//제너릭 메서드 상속
		Sup s = new Sup();
		s.testMethod(10);
		s.<Integer>testMethod(10);
		s.<Double>testMethod(34.12);
		Under u = new Under();
		u.testMethod(10);
		u.<Integer>testMethod(10);
		u.<Double>testMethod(11.4);
		
		
	}

}

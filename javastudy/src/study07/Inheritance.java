package study07;

class Parent{
	int age;
	String name;
	public Parent() {
		name = "부모님";
		System.out.println("Parent() run");
	}
	public Parent(int age, String name) {
		this.age = age;
		this.name = name;
		System.out.println("Parent(param) run");
	}
	public void showInfo() {
		System.out.println("이름 : "+ name + "/ 나이 : "+age);
	}
}

class Child extends Parent{
	String name = "아이";
	public Child() {		
		System.out.println("Child() run");
	}
	public Child(int age, String name) {
//		super(age,name);
		this.age = age;
		this.name = name;
		System.out.println("Child(param) run");
	}
	//showInfo override
	@Override //어노테이션 annotation
	public void showInfo() {
		System.out.println("이름 : "+ name + "("  + age + ")");
	}
	public void showInfo(int age, String name) {
		System.out.println("이름 : "+ name + "("  + age + ")");
	}
}

public class Inheritance {

	public static void main(String[] args) {
		Child c = new Child(28,"호진");
		c.showInfo();
		c.showInfo(28, "반장호진");
		
		Child c1 = new Child();
		System.out.println(c1.name);
		c1.showInfo();
		Parent p = new Child();
		System.out.println(p.name+"\n");
		
	}

}

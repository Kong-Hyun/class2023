package study07;

class Animal{
	String name;
	public void setName(String name) {
		this.name = name;
	}
	void sleep() {
		System.out.println("zzz");
	}
	void sleep(int h) {
		
	}
}
class Dog extends Animal{
	void sleep() {
		System.out.println("그르렁 그르렁");
	}
}
class Cat extends Animal{
	void sleep() {
		System.out.println("갸르릉 갸르릉");
	}
	
}
class Human extends Animal{
	void sleep() {
		System.out.println(name + "드르르러르럴러렁 쿨쿨");
	}
}
class PetDog extends Dog{
	PetDog(){}
	PetDog(String name){
		this.setName(name);
	}
	@Override //annotation
	void sleep() {
		System.out.println(name + "는 골골 집에서 잡니다.");
	}
	//overloading
	void sleep(int hours) {
		System.out.println(name+"는 "+hours+"시간동안 잘 잡니다.");
	}
	
}
public class AnimalRun {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.setName("멍멍이");
		System.out.println(dog.name);
		dog.sleep();
		
		Cat cat = new Cat();
		cat.setName("야옹이");
		System.out.println(cat.name);
		cat.sleep();
		
		Human human = new Human();
		human.setName("호진");
		System.out.println(human.name);
		human.sleep();
		
		PetDog pDog = new PetDog();
		pDog.setName("해피");
		System.out.println(pDog.name);
		pDog.sleep();
		pDog.sleep(30);
		
		//자식 클래스의 객체는 부모 클래스의 자료형으로 사용가능(is-a 관계)
		Animal dog2 = new Dog(); //Dog is a Animal
		dog2.setName("멍멍멍이");
		System.out.println(dog2.name);
		dog2.sleep();
		
		
		//오류 Dog animal = (Dog)new Animal(); //Animal is a Dog
		
		Dog dog3 = new PetDog("해피");//(setName)
		dog3.sleep();
		dog3.sleep(3);
	}

}

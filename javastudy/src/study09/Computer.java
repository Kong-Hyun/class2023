package study09;

public abstract class Computer {
	Computer(){
		System.out.println("computer");
	}
	public void display() {}
	//실행문 or abstract 입력 public void typing();
	public abstract void typing();//추상메서드
	
	public void turnOn() {
		System.out.println("전원켜기");
	}
	public void turnOff() {
		System.out.println("전원끄기");
	}
}

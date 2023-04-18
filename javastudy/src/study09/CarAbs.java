package study09;


//abstract 추상 메서드
public abstract class CarAbs {
	public abstract void drive();
	public abstract void stop();
	public abstract void turnOn();
	public abstract void turnOff();
	
	//템플릿 메서드
	//동작을 미리 정리
	final public void run() {
		turnOn();
		drive();
		stop();
		turnOff();
	}
}
 
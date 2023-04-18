package study02_1;

import study02.Car;

public class CarTest {

	public static void main(String[] args) {
		Car c = new Car();
		// c.carNum 사용불가 // Car에서 private 접근불가
		// int speed = c.speed;	// default 다른 패키지에서 접근불가
		// c.getSpeed();	// protected 다른 패키지에서 접근불가
		c.getCarNum();	// public 다른 패키지에서도 접근가능

	}

}

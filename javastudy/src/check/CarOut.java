package check;

import study07.Car;

public class CarOut {
	public void carMethod() {
		//study07.Car c = new Car();
		Car c = new Car();
		//c.carNum(); private는 외부클래스에서 접근 불가능
		//int speed = c.speed; //default
		//c.getSpeed(); //protected
		c.getcarNum();		
		
	}

}

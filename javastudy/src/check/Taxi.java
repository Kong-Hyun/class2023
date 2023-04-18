package check;

import study07.Car;

public class Taxi extends Car {
	Taxi(){
		super();
		//this.carNum(); private는 외부클래스에서 접근 불가능
		//int speed = this.speed; //default
		this.getSpeed();
		this.getcarNum();
	}

}

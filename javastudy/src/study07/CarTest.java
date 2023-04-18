package study07;

public class CarTest {

	public static void main(String[] args) {
		Car c = new Car();
		//c.carNum(); private는 외부클래스에서 접근 불가능
		int speed = c.speed;
		c.getSpeed(); //protected
		c.getcarNum(); //public

	}

}

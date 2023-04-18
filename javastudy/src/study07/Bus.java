package study07;

public class Bus extends Car{
	
	public static void main(String[] args) {
		Bus b = new Bus();
		//b.carNum(); private는 외부클래스에서 접근 불가능
		int speed = b.speed;
		b.getSpeed();//protected
		b.getcarNum();//public
		
	}

}

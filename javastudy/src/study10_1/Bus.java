package study10_1;

public class Bus extends Trans {
	
	private int busNumber; //버스번호
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int money) {
		passengerCount++;
		income += money;
		System.out.println("버스 이용");
	}
	
	@Override
	public void showInfo() {
		System.out.println("==================================");
		System.out.println(busNumber + "번 Bus");
		System.out.println("탑승자수 : " + passengerCount);
		System.out.println("총 수익 : " + income);
		System.out.println("==================================");
	}
	
	

}
